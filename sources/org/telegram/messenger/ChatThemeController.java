package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import com.google.android.exoplayer2.RendererCapabilities;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.messenger.wallpaper.WallpaperGiftPatternPosition;
import org.telegram.messenger.wallpaper.pgm.PGMImage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.ChatBackgroundDrawable;

public class ChatThemeController extends BaseController {
    public static final int THEME_LIST_WITH_DEFAULT = 1;
    public static final int THEME_LIST_WITH_EMOJI = 2;
    public static final int THEME_LIST_WITH_GIFTS = 4;
    public static volatile DispatchQueue chatThemeQueue = new DispatchQueue("chatThemeQueue");
    private static final ChatThemeController[] instances = new ChatThemeController[4];
    private final Map<String, EmojiThemes> allChatGiftThemes;
    private List<EmojiThemes> allChatThemes;
    private final LongSparseArray<ThemeKey> dialogEmoticonsMap;
    private final ThemeList giftsThemeList;
    private volatile long lastReloadTimeMs;
    private final long reloadTimeoutMs;
    private final HashMap<Long, Bitmap> themeIdWallpaperThumbMap;
    private volatile long themesHash;
    private final Map<String, Long> usedGiftThemesBySlug;
    private final Map<Long, String> usedGiftThemesByUsers;

    public static class ThemeList {
        private boolean completed;
        private long hash;
        private long lastReloadTimeMs;
        private String offset;
        private List<EmojiThemes> themes;

        private ThemeList() {
        }
    }

    private ChatThemeController(int i) {
        super(i);
        this.reloadTimeoutMs = 7200000L;
        this.themeIdWallpaperThumbMap = new HashMap<>();
        this.allChatGiftThemes = new HashMap();
        this.giftsThemeList = new ThemeList();
        this.dialogEmoticonsMap = new LongSparseArray<>();
        this.usedGiftThemesByUsers = new HashMap();
        this.usedGiftThemesBySlug = new HashMap();
        init();
    }

    public static boolean equals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if (wallPaper != null && wallPaper2 != null) {
            String str = wallPaper.uploadingImage;
            if (str != null) {
                return TextUtils.equals(wallPaper2.uploadingImage, str);
            }
            if (wallPaper.id == wallPaper2.id && TextUtils.equals(ChatBackgroundDrawable.hash(wallPaper.settings), ChatBackgroundDrawable.hash(wallPaper2.settings)) && TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2))) {
                return true;
            }
        }
        return false;
    }

    private List<EmojiThemes> getAllChatThemesFromPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i2, "")));
            try {
                TLRPC.TL_theme tL_themeTLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (tL_themeTLdeserialize != null) {
                    arrayList.add(new EmojiThemes(this.currentAccount, tL_themeTLdeserialize));
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return arrayList;
    }

    private SharedPreferences getEmojiSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_emoji", 0);
    }

    public static ChatThemeController getInstance(int i) {
        ChatThemeController chatThemeController;
        ChatThemeController[] chatThemeControllerArr = instances;
        ChatThemeController chatThemeController2 = chatThemeControllerArr[i];
        if (chatThemeController2 != null) {
            return chatThemeController2;
        }
        synchronized (ChatThemeController.class) {
            try {
                chatThemeController = chatThemeControllerArr[i];
                if (chatThemeController == null) {
                    chatThemeController = new ChatThemeController(i);
                    chatThemeControllerArr[i] = chatThemeController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return chatThemeController;
    }

    private File getPatternFile(long j) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        Locale locale = Locale.US;
        return new File(filesDirFixed, j + "_" + this.themesHash + ".jpg");
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    private void getWallpaperBitmap(long j, ResultCallback<Bitmap> resultCallback) {
        if (this.themesHash == 0) {
            resultCallback.onComplete(null);
        } else {
            chatThemeQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(14, getPatternFile(j), resultCallback));
        }
    }

    public static String getWallpaperEmoticon(TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            return null;
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return (wallPaperSettings == null || TextUtils.isEmpty(wallPaperSettings.emoticon)) ? "" : wallPaper.settings.emoticon;
    }

    private void init() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        try {
            this.themesHash = sharedPreferences.getLong("hash", 0L);
            this.lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.allChatThemes = getAllChatThemesFromPrefs();
        getMessagesStorage().loadGiftChatTheme(new Emoji$$ExternalSyntheticLambda3(this, 1));
        preloadSticker("❌");
        if (this.allChatThemes.isEmpty()) {
            return;
        }
        Iterator<EmojiThemes> it = this.allChatThemes.iterator();
        while (it.hasNext()) {
            preloadSticker(it.next().emoji);
        }
    }

    public static boolean isNotEmoticonWallpaper(TLRPC.WallPaper wallPaper) {
        String wallpaperEmoticon = getWallpaperEmoticon(wallPaper);
        return wallpaperEmoticon != null && wallpaperEmoticon.length() == 0;
    }

    public static void lambda$clearWallpaper$15(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$getWallpaperBitmap$7(File file, ResultCallback resultCallback) {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = file.exists() ? BitmapFactory.decodeFile(file.getAbsolutePath()) : null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (resultCallback != null) {
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(15, resultCallback, bitmapDecodeFile));
        }
    }

    public void lambda$init$0(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it.next();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, new EmojiThemes(this.currentAccount, tL_chatThemeUniqueGift));
            }
        }
    }

    public static void lambda$loadWallpaperBitmap$9(Utilities.Callback callback, Bitmap bitmap) {
        if (bitmap != null) {
            callback.run(new WallpaperBitmapHolder(bitmap));
        } else {
            callback.run(null);
        }
    }

    public static void lambda$loadWallpaperPatternBitmap$11(File file, Utilities.Callback callback) throws Throwable {
        ArrayList arrayList;
        Bitmap bitmap;
        ArrayList arrayList2;
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                    try {
                        ArrayList arrayList3 = new ArrayList(1);
                        try {
                            bitmap = PGMImage.read(gZIPInputStream, arrayList3);
                            try {
                                int size = arrayList3.size();
                                arrayList = null;
                                int i = 0;
                                while (i < size) {
                                    try {
                                        Object obj = arrayList3.get(i);
                                        i++;
                                        String str = (String) obj;
                                        if (str.startsWith("patterns = ")) {
                                            byte[] bArrHexToBytes = Utilities.hexToBytes(str.substring(11));
                                            int length = bArrHexToBytes.length / 52;
                                            SerializedData serializedData = new SerializedData(bArrHexToBytes);
                                            arrayList2 = new ArrayList(length);
                                            for (int i2 = 0; i2 < length; i2++) {
                                                try {
                                                    arrayList2.add(WallpaperGiftPatternPosition.deserialize(serializedData));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    try {
                                                        try {
                                                            gZIPInputStream.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        throw th;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        arrayList = arrayList2;
                                                        try {
                                                            fileInputStream.close();
                                                        } catch (Throwable th4) {
                                                            th.addSuppressed(th4);
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                            serializedData.cleanup();
                                            arrayList = arrayList2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        arrayList2 = arrayList;
                                        gZIPInputStream.close();
                                        throw th;
                                    }
                                }
                                try {
                                    gZIPInputStream.close();
                                    fileInputStream.close();
                                    AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(18, callback, bitmap != null ? new WallpaperBitmapHolder(bitmap, 1, arrayList) : null));
                                } catch (Throwable th6) {
                                    th = th6;
                                    fileInputStream.close();
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                arrayList = null;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            bitmap = null;
                            arrayList2 = null;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        bitmap = null;
                        arrayList = null;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    bitmap = null;
                    arrayList = null;
                }
            } catch (Exception e) {
                e = e;
                bitmap = null;
                arrayList = null;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(18, callback, bitmap != null ? new WallpaperBitmapHolder(bitmap, 1, arrayList) : null));
        }
    }

    public void lambda$preloadAllWallpaperThumbs$5(Pair pair) {
        if (pair != null) {
            this.themeIdWallpaperThumbMap.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    public void lambda$processUpdate$13(long j, TLRPC.UserFull userFull) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
    }

    public void lambda$processUpdate$14(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, chatFull, 0, bool, bool);
    }

    public void lambda$requestAllChatThemes$2(List list, ResultCallback resultCallback, boolean z) {
        this.allChatThemes = new ArrayList(list);
        resultCallback.onComplete(getEmojiThemes((z ? 1 : 0) | 2));
    }

    public void lambda$requestAllChatThemes$3(ResultCallback resultCallback, boolean z, TL_account.Themes themes, TLRPC.TL_error tL_error) {
        Object allChatThemesFromPrefs;
        boolean z2 = true;
        if (!(themes instanceof TL_account.TL_themes)) {
            if (themes instanceof TL_account.TL_themesNotModified) {
                allChatThemesFromPrefs = getAllChatThemesFromPrefs();
            } else {
                AndroidUtilities.runOnUIThread(new ChatThemeController$$ExternalSyntheticLambda0(resultCallback, tL_error, 0));
                allChatThemesFromPrefs = null;
            }
            if (z2) {
            }
            AndroidUtilities.runOnUIThread(new CacheFetcher$$ExternalSyntheticLambda0(this, allChatThemesFromPrefs, resultCallback, z, 3));
        }
        TL_account.TL_themes tL_themes = (TL_account.TL_themes) themes;
        this.themesHash = tL_themes.hash;
        this.lastReloadTimeMs = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.clear();
        editorEdit.putLong("hash", this.themesHash);
        editorEdit.putLong("lastReload", this.lastReloadTimeMs);
        editorEdit.putInt("count", tL_themes.themes.size());
        ArrayList arrayList = new ArrayList(tL_themes.themes.size());
        for (int i = 0; i < tL_themes.themes.size(); i++) {
            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i);
            Emoji.preloadEmoji(tL_theme.emoticon);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            editorEdit.putString("theme_" + i, Utilities.bytesToHex(serializedData.toByteArray()));
            EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, tL_theme);
            emojiThemes.loadWallpaperThumb(0, null);
            emojiThemes.loadWallpaperThumb(1, null);
            emojiThemes.loadWallpaper(0, null);
            emojiThemes.loadWallpaper(1, null);
            arrayList.add(emojiThemes);
        }
        editorEdit.apply();
        allChatThemesFromPrefs = arrayList;
        z2 = false;
        if (z2) {
            AndroidUtilities.runOnUIThread(new CacheFetcher$$ExternalSyntheticLambda0(this, allChatThemesFromPrefs, resultCallback, z, 3));
        }
    }

    public void lambda$requestNextChatThemes$19(TL_account.Tl_chatThemes tl_chatThemes, List list, List list2, ResultCallback resultCallback) {
        this.giftsThemeList.offset = tl_chatThemes.next_offset;
        this.giftsThemeList.hash = tl_chatThemes.hash;
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        if (this.giftsThemeList.themes == null) {
            this.giftsThemeList.themes = new ArrayList(list);
        } else {
            this.giftsThemeList.themes.addAll(list);
        }
        if (TextUtils.isEmpty(tl_chatThemes.next_offset)) {
            this.giftsThemeList.completed = true;
        }
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            EmojiThemes emojiThemes = (EmojiThemes) it.next();
            Map<String, EmojiThemes> map = this.allChatGiftThemes;
            ThemeKey themeKey = emojiThemes.key;
            if (themeKey != null && (str = themeKey.giftSlug) == null) {
                str = themeKey.emoticon;
            }
            map.put(str, emojiThemes);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it2.next();
            setGiftThemeUser(tL_chatThemeUniqueGift.gift.slug, DialogObject.getPeerDialogId(tL_chatThemeUniqueGift.gift.theme_peer));
        }
        resultCallback.onComplete(null);
    }

    public void lambda$requestNextChatThemes$20(ResultCallback resultCallback) {
        this.giftsThemeList.lastReloadTimeMs = System.currentTimeMillis();
        this.giftsThemeList.completed = true;
        resultCallback.onComplete(null);
    }

    public void lambda$requestNextChatThemes$21(ResultCallback resultCallback, TL_account.ChatThemes chatThemes, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new ChatThemeController$$ExternalSyntheticLambda0(resultCallback, tL_error, 1));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!(chatThemes instanceof TL_account.Tl_chatThemes)) {
            if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(19, this, resultCallback));
                return;
            }
            return;
        }
        TL_account.Tl_chatThemes tl_chatThemes = (TL_account.Tl_chatThemes) chatThemes;
        getMessagesStorage().putGiftChatThemes(tl_chatThemes.themes);
        getMessagesStorage().putUsersAndChats(tl_chatThemes.users, tl_chatThemes.chats, true, true);
        getMessagesController().putUsers(tl_chatThemes.users, false);
        getMessagesController().putChats(tl_chatThemes.chats, false);
        ArrayList<TLRPC.ChatTheme> arrayList2 = tl_chatThemes.themes;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            TLRPC.ChatTheme chatTheme = arrayList2.get(i);
            i++;
            TLRPC.ChatTheme chatTheme2 = chatTheme;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i2));
            emojiThemes.loadWallpaperThumb(0, null);
            emojiThemes.loadWallpaperThumb(1, null);
            emojiThemes.loadWallpaper(0, null);
            emojiThemes.loadWallpaper(1, null);
            arrayList3.add(emojiThemes);
        }
        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda84((Object) this, (Object) tl_chatThemes, arrayList3, arrayList, (Object) resultCallback, 4));
    }

    public static void lambda$saveWallpaperBitmap$8(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$saveWallpaperPatternBitmap$12(File file, List list, Bitmap bitmap) {
        List listSingletonList;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                if (list != null) {
                    try {
                        if (list.isEmpty()) {
                            listSingletonList = null;
                        } else {
                            SerializedData serializedData = new SerializedData(list.size() * 52);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                WallpaperGiftPatternPosition wallpaperGiftPatternPosition = (WallpaperGiftPatternPosition) it.next();
                                RectF rectF = wallpaperGiftPatternPosition.rect;
                                serializedData.writeFloat(rectF.left);
                                serializedData.writeFloat(rectF.top);
                                serializedData.writeFloat(rectF.width());
                                serializedData.writeFloat(rectF.height());
                                float[] fArr = new float[9];
                                wallpaperGiftPatternPosition.matrix.getValues(fArr);
                                for (int i = 0; i < 9; i++) {
                                    serializedData.writeFloat(fArr[i]);
                                }
                            }
                            listSingletonList = Collections.singletonList("patterns = " + Utilities.bytesToHex(serializedData.toByteArray()));
                            serializedData.cleanup();
                        }
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    listSingletonList = null;
                }
                if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                    PGMImage.write(bitmap, gZIPOutputStream, listSingletonList);
                } else {
                    Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
                    PGMImage.write(bitmapExtractAlpha, gZIPOutputStream, listSingletonList);
                    bitmapExtractAlpha.recycle();
                }
                gZIPOutputStream.close();
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$setDialogTheme$4(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$setWallpaperToPeer$16(TLObject tLObject, long j, boolean z, String str, Runnable runnable) throws FileNotFoundException {
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
                userFull = null;
            }
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            for (int i = 0; i < updates.updates.size(); i++) {
                if (updates.updates.get(i) instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i)).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        if (!z) {
                            break;
                        }
                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str;
                        if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                        }
                        if (userFull == null) {
                            if (chatFull == null) {
                                break;
                            }
                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                            chatFull.wallpaper = wallPaper2;
                            chatFull.flags2 |= 128;
                            saveChatWallpaper(j, wallPaper2);
                            getMessagesStorage().updateChatInfo(chatFull, false);
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                            int i2 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
                            break;
                        }
                        TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                        userFull.wallpaper = wallPaper3;
                        userFull.flags |= 16777216;
                        saveChatWallpaper(j, wallPaper3);
                        getMessagesStorage().updateUserInfo(userFull, false);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                        break;
                    }
                }
            }
            MessagesController.getInstance(this.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
            if (runnable != null) {
                runnable.run();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpaperSettedToUser, new Object[0]);
        }
    }

    public void lambda$setWallpaperToPeer$17(long j, boolean z, String str, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TopicsController$$ExternalSyntheticLambda17(this, tLObject, j, z, str, runnable));
    }

    private void loadWallpaperPatternBitmap(long j, Utilities.Callback<WallpaperBitmapHolder> callback) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(17, new File(filesDirFixed, RendererCapabilities.CC.m(j, "pattern_", ".pgm.gz")), callback));
    }

    private void preloadSticker(String str) {
        new ImageReceiver().setImage(ImageLocation.getForDocument(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str)), "50_50", null, null, null, 0);
        Emoji.preloadEmoji(str);
    }

    private void requestNextChatThemes(ResultCallback<Void> resultCallback) {
        if (this.giftsThemeList.hash != 0) {
            long unused = this.giftsThemeList.lastReloadTimeMs;
        }
        boolean z = System.currentTimeMillis() - this.giftsThemeList.lastReloadTimeMs > 7200000;
        if (this.giftsThemeList.themes == null || !this.giftsThemeList.completed || z) {
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            tl_getUniqueGiftChatThemes.offset = this.giftsThemeList.offset;
            tl_getUniqueGiftChatThemes.hash = this.giftsThemeList.hash;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new ChatThemeController$$ExternalSyntheticLambda9(0, this, resultCallback));
        }
    }

    private void saveWallpaperBitmap(Bitmap bitmap, long j) {
        chatThemeQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(20, getPatternFile(j), bitmap));
    }

    private void saveWallpaperPatternBitmap(Bitmap bitmap, List<WallpaperGiftPatternPosition> list, long j) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda0(new File(filesDirFixed, RendererCapabilities.CC.m(j, "pattern_", ".pgm.gz")), list, bitmap, 12));
    }

    private void setGiftThemeUser(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            String strRemove = this.usedGiftThemesByUsers.remove(Long.valueOf(j));
            if (strRemove != null) {
                this.usedGiftThemesBySlug.remove(strRemove);
                return;
            }
            return;
        }
        if (j == 0) {
            Long lRemove = this.usedGiftThemesBySlug.remove(str);
            if (lRemove != null) {
                this.usedGiftThemesByUsers.remove(lRemove);
                return;
            }
            return;
        }
        String strPut = this.usedGiftThemesByUsers.put(Long.valueOf(j), str);
        Long lPut = this.usedGiftThemesBySlug.put(str, Long.valueOf(j));
        if (strPut != null && !TextUtils.equals(str, strPut)) {
            this.usedGiftThemesBySlug.remove(strPut);
        }
        if (lPut == null || lPut.longValue() == j) {
            return;
        }
        this.usedGiftThemesByUsers.remove(lPut);
    }

    public static boolean wallpaperEquals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.id == wallPaper2.id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
            }
            if (wallPaper.id == wallPaper2.id) {
                return true;
            }
        }
        return false;
    }

    public void clearCache() {
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        getSharedPreferences().edit().clear().apply();
    }

    public void clearWallpaper(long j, boolean z) {
        clearWallpaper(j, z, false);
    }

    public void clearWallpaperImages() {
    }

    public void clearWallpaperThumbImages() {
        this.themeIdWallpaperThumbMap.clear();
    }

    public EmojiThemes getDialogTheme(long j) {
        ThemeKey themeKey;
        ThemeKey themeKey2 = this.dialogEmoticonsMap.get(j);
        if (themeKey2 == null) {
            String string = getEmojiSharedPreferences().getString("chatTheme_" + this.currentAccount + "_" + j, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    themeKey = new ThemeKey(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    themeKey = new ThemeKey(string.substring(9), null);
                } else if (TextUtils.isEmpty(string)) {
                    themeKey2 = null;
                } else {
                    themeKey = new ThemeKey(string, null);
                }
                themeKey2 = themeKey;
            } else {
                themeKey2 = null;
            }
            this.dialogEmoticonsMap.put(j, themeKey2);
        }
        return getTheme(themeKey2);
    }

    public TLRPC.WallPaper getDialogWallpaper(long j) {
        if (j >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
            if (userFull != null) {
                return userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                return chatFull.wallpaper;
            }
        }
        String string = getEmojiSharedPreferences().getString("chatWallpaper_" + this.currentAccount + "_" + j, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return null;
    }

    public List<EmojiThemes> getEmojiThemes(int i) {
        List<EmojiThemes> list;
        boolean zHasFlag = TLObject.hasFlag(i, 1);
        boolean zHasFlag2 = TLObject.hasFlag(i, 2);
        boolean zHasFlag3 = TLObject.hasFlag(i, 4);
        ArrayList arrayList = new ArrayList();
        if (zHasFlag3 && this.giftsThemeList.themes != null) {
            arrayList.addAll(this.giftsThemeList.themes);
        }
        if (zHasFlag2 && (list = this.allChatThemes) != null) {
            arrayList.addAll(list);
        }
        int i2 = 0;
        if (zHasFlag && (arrayList.isEmpty() || !((EmojiThemes) arrayList.get(0)).showAsDefaultStub)) {
            EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount);
            emojiThemes.emoji = "❌";
            emojiThemes.key = new ThemeKey("❌", null);
            emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("❌");
            emojiThemes.showAsDefaultStub = true;
            EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
            themeItem.themeInfo = EmojiThemes.getDefaultThemeInfo(true);
            ArrayList arrayList2 = emojiThemes.items;
            arrayList2.add(themeItem);
            EmojiThemes.ThemeItem themeItem2 = new EmojiThemes.ThemeItem();
            themeItem2.themeInfo = EmojiThemes.getDefaultThemeInfo(false);
            arrayList2.add(themeItem2);
            arrayList.add(0, emojiThemes);
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((EmojiThemes) obj).initColors();
        }
        return arrayList;
    }

    public long getGiftThemeUser(String str) {
        Long l = this.usedGiftThemesBySlug.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public EmojiThemes getTheme(ThemeKey themeKey) {
        if (themeKey == null) {
            return null;
        }
        String str = themeKey.giftSlug;
        if (!TextUtils.isEmpty(str)) {
            return this.allChatGiftThemes.get(str);
        }
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            if (themeKey.equals(emojiThemes.key)) {
                return emojiThemes;
            }
        }
        return null;
    }

    public Bitmap getWallpaperThumbBitmap(long j) {
        return this.themeIdWallpaperThumbMap.get(Long.valueOf(j));
    }

    public boolean isAllThemesFullyLoaded() {
        List<EmojiThemes> list;
        return (!isGiftThemesFullyLoaded() || (list = this.allChatThemes) == null || list.isEmpty()) ? false : true;
    }

    public boolean isGiftThemesFullyLoaded() {
        return this.giftsThemeList.completed;
    }

    public void loadNextChatThemes(ResultCallback<Void> resultCallback) {
        requestNextChatThemes(resultCallback);
    }

    public void loadWallpaperBitmap(long j, int i, Utilities.Callback<WallpaperBitmapHolder> callback) {
        if (i == 0) {
            getWallpaperBitmap(j, new BillingController$$ExternalSyntheticLambda0(callback, 2));
        } else if (i == 1) {
            loadWallpaperPatternBitmap(j, callback);
        }
    }

    public void preloadAllWallpaperImages(boolean z) {
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            long themeId = ((EmojiThemes.ThemeItem) emojiThemes.items.get(z ? 1 : 0)).getThemeId();
            if (themeId != 0 && !getPatternFile(themeId).exists()) {
                emojiThemes.loadWallpaper(z ? 1 : 0, null);
            }
        }
    }

    public void preloadAllWallpaperThumbs(boolean z) {
        for (EmojiThemes emojiThemes : this.allChatThemes) {
            long themeId = ((EmojiThemes.ThemeItem) emojiThemes.items.get(z ? 1 : 0)).getThemeId();
            if (themeId != 0 && !this.themeIdWallpaperThumbMap.containsKey(Long.valueOf(themeId))) {
                emojiThemes.loadWallpaperThumb(z ? 1 : 0, new BillingController$$ExternalSyntheticLambda0(this, 3));
            }
        }
    }

    public void processUpdate(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-DialogObject.getPeerDialogId(tL_updatePeerWallpaper.peer));
            if (chatFull == null || wallpaperEquals(chatFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j = -chatFull.id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                chatFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                chatFull.flags2 |= 128;
            } else {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
            }
            getMessagesStorage().updateChatInfo(chatFull, false);
            saveChatWallpaper(j, chatFull.wallpaper);
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(16, this, chatFull));
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(tL_updatePeerWallpaper.peer.user_id);
        if (userFull == null || wallpaperEquals(userFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j2 = userFull.id;
        if ((tL_updatePeerWallpaper.flags & 1) != 0) {
            userFull.wallpaper_overridden = tL_updatePeerWallpaper.wallpaper_overridden;
            userFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
            userFull.flags |= 16777216;
        } else {
            userFull.wallpaper_overridden = false;
            userFull.wallpaper = null;
            userFull.flags &= -16777217;
        }
        getMessagesStorage().updateUserInfo(userFull, false);
        saveChatWallpaper(j2, userFull.wallpaper);
        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda11(this, j2, userFull, 4));
    }

    public void putThemeIfNeeded(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            if (this.allChatGiftThemes.containsKey(tL_chatThemeUniqueGift.gift.slug)) {
                return;
            }
            EmojiThemes emojiThemes = new EmojiThemes(this.currentAccount, tL_chatThemeUniqueGift);
            emojiThemes.initColors();
            this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, emojiThemes);
            getMessagesStorage().putGiftChatTheme(chatTheme);
        }
    }

    public void requestAllChatThemes(final ResultCallback<List<EmojiThemes>> resultCallback, final boolean z) {
        if (this.themesHash == 0 || this.lastReloadTimeMs == 0) {
            init();
        }
        boolean z2 = System.currentTimeMillis() - this.lastReloadTimeMs > 7200000;
        List<EmojiThemes> list = this.allChatThemes;
        if (list == null || list.isEmpty() || z2) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.themesHash;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(getchatthemes, new ChatThemeController$$ExternalSyntheticLambda8(dispatchQueue), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$requestAllChatThemes$3(resultCallback, z, (TL_account.Themes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        List<EmojiThemes> list2 = this.allChatThemes;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(getEmojiThemes((z ? 1 : 0) | 2));
    }

    public void requestChatTheme(final ThemeKey themeKey, final ResultCallback<EmojiThemes> resultCallback) {
        if (themeKey != null) {
            boolean zIsEmpty = TextUtils.isEmpty(themeKey.emoticon);
            String str = themeKey.giftSlug;
            if (!zIsEmpty || !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str)) {
                    requestAllChatThemes(new ResultCallback<List<EmojiThemes>>() {
                        @Override
                        public final void onError(Throwable th) {
                            ResultCallback.CC.$default$onError(this, th);
                        }

                        @Override
                        public void onComplete(List<EmojiThemes> list) {
                            for (EmojiThemes emojiThemes : list) {
                                if (themeKey.equals(emojiThemes.key)) {
                                    emojiThemes.initColors();
                                    resultCallback.onComplete(emojiThemes);
                                    return;
                                }
                            }
                            resultCallback.onComplete(null);
                        }

                        @Override
                        public void onError(TLRPC.TL_error tL_error) {
                            resultCallback.onComplete(null);
                        }
                    }, false);
                    return;
                }
                EmojiThemes emojiThemes = this.allChatGiftThemes.get(str);
                if (emojiThemes == null) {
                    resultCallback.onComplete(null);
                    return;
                } else {
                    emojiThemes.initColors();
                    resultCallback.onComplete(emojiThemes);
                    return;
                }
            }
        }
        resultCallback.onComplete(null);
    }

    public void saveChatWallpaper(long j, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            getEmojiSharedPreferences().edit().remove("chatWallpaper_" + this.currentAccount + "_" + j).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        getEmojiSharedPreferences().edit().putString("chatWallpaper_" + this.currentAccount + "_" + j, strBytesToHex).apply();
    }

    public void setDialogTheme(long j, TLRPC.ChatTheme chatTheme, boolean z) {
        setDialogTheme(j, ThemeKey.of(chatTheme), chatTheme, z);
    }

    public int setWallpaperToPeer(long j, String str, Theme.OverrideWallpaperInfo overrideWallpaperInfo, MessageObject messageObject, Runnable runnable) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper;
        boolean z;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper2 = new TLRPC.TL_messages_setChatWallPaper();
        if (j >= 0) {
            tL_messages_setChatWallPaper2.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        } else {
            tL_messages_setChatWallPaper2.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
        }
        tL_messages_setChatWallPaper2.for_both = overrideWallpaperInfo.forBoth;
        if (messageObject == null || !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = MessagesController.getInputWallpaper(overrideWallpaperInfo);
            z = true;
        } else {
            tL_messages_setChatWallPaper2.flags |= 2;
            tL_messages_setChatWallPaper2.id = messageObject.getId();
            TLRPC.WallPaper wallPaper = null;
            if (j >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageObject.messageOwner.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.id = wallPaper2.id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
            tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
            tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
            tL_wallPaperSettings.background_color = overrideWallpaperInfo.color;
            tL_wallPaperSettings.second_background_color = overrideWallpaperInfo.gradientColor1;
            tL_wallPaperSettings.third_background_color = overrideWallpaperInfo.gradientColor2;
            tL_wallPaperSettings.fourth_background_color = overrideWallpaperInfo.gradientColor3;
            tL_wallPaperSettings.rotation = overrideWallpaperInfo.rotation;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            tL_messages_setChatWallPaper = tL_messages_setChatWallPaper2;
            tL_wallPaper2.id = wallPaper3.id;
            tL_wallPaper2.document = wallPaper3.document;
            int i = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i | 4;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
            } else if (chatFull != null) {
                chatFull.wallpaper = tL_wallPaper2;
                chatFull.flags2 |= 128;
                getMessagesStorage().updateChatInfo(chatFull, false);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i2 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
            }
            if (runnable != null) {
                runnable.run();
            }
            z = false;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = MessagesController.getWallpaperSetting(overrideWallpaperInfo);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new TopicsController$$ExternalSyntheticLambda7(this, j, z, str, runnable));
    }

    public void clearWallpaper(long j, boolean z, boolean z2) {
        int i = 2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
            tL_messages_setChatWallPaper.revert = z2;
            if (!z2) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
                if (userFull != null) {
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
                saveChatWallpaper(j, null);
                if (z) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
                }
            }
        } else {
            long j2 = -j;
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j2);
            if (chatFull != null) {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            saveChatWallpaper(j, null);
            if (z) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i2 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, chatFull, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new FileRefController$$ExternalSyntheticLambda11(i));
    }

    public void saveWallpaperBitmap(WallpaperBitmapHolder wallpaperBitmapHolder, long j) {
        Bitmap bitmap = wallpaperBitmapHolder.bitmap;
        int i = wallpaperBitmapHolder.mode;
        if (i == 0) {
            saveWallpaperBitmap(bitmap, j);
        } else if (i == 1) {
            saveWallpaperPatternBitmap(bitmap, wallpaperBitmapHolder.giftPatternPositions, j);
        }
    }

    public void setDialogTheme(long j, ThemeKey themeKey) {
        setDialogTheme(j, themeKey, null, true);
    }

    private void setDialogTheme(long j, ThemeKey themeKey, TLRPC.ChatTheme chatTheme, boolean z) {
        String strConcat;
        String str;
        TLRPC.InputChatTheme tl_inputChatThemeEmpty;
        if (ThemeKey.equals(this.dialogEmoticonsMap.get(j), themeKey)) {
            return;
        }
        if (themeKey == null) {
            this.dialogEmoticonsMap.delete(j);
        } else {
            this.dialogEmoticonsMap.put(j, themeKey);
        }
        setGiftThemeUser(themeKey != null ? themeKey.giftSlug : null, j);
        if (j >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j);
            if (userFull != null && (themeKey == null || ((TextUtils.isEmpty(themeKey.emoticon) && TextUtils.isEmpty(themeKey.giftSlug)) || chatTheme != null))) {
                userFull.theme = chatTheme;
                getMessagesStorage().updateUserInfo(userFull, true);
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j);
            if (chatFull != null) {
                chatFull.theme_emoticon = themeKey != null ? themeKey.emoticon : null;
                getMessagesStorage().updateChatInfo(chatFull, true);
            }
        }
        SharedPreferences.Editor editorEdit = getEmojiSharedPreferences().edit();
        String str2 = "chatTheme_" + this.currentAccount + "_" + j;
        if (themeKey == null) {
            strConcat = null;
        } else {
            String str3 = themeKey.giftSlug;
            if (str3 != null) {
                strConcat = "gift_".concat(str3);
            } else {
                String str4 = themeKey.emoticon;
                if (str4 != null) {
                    strConcat = "emoticon_".concat(str4);
                } else {
                    strConcat = null;
                }
            }
        }
        editorEdit.putString(str2, strConcat).apply();
        if (z) {
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (themeKey != null) {
                String str5 = themeKey.emoticon;
                if (!TextUtils.isEmpty(str5)) {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str5;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                } else if (themeKey != null) {
                    str = themeKey.giftSlug;
                    if (!TextUtils.isEmpty(str)) {
                        TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift = new TLRPC.Tl_inputChatThemeUniqueGift();
                        tl_inputChatThemeUniqueGift.slug = str;
                        tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift;
                    } else {
                        tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
                    }
                } else {
                    tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
                }
            } else if (themeKey != null) {
                str = themeKey.giftSlug;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.Tl_inputChatThemeUniqueGift tl_inputChatThemeUniqueGift2 = new TLRPC.Tl_inputChatThemeUniqueGift();
                    tl_inputChatThemeUniqueGift2.slug = str;
                    tl_inputChatThemeEmpty = tl_inputChatThemeUniqueGift2;
                } else {
                    tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
                }
            } else {
                tl_inputChatThemeEmpty = new TLRPC.Tl_inputChatThemeEmpty();
            }
            tL_messages_setChatTheme.theme = tl_inputChatThemeEmpty;
            tL_messages_setChatTheme.peer = getMessagesController().getInputPeer(j);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new AiTonesController$$ExternalSyntheticLambda1(this, 2));
        }
    }
}
