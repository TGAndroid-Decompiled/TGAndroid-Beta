package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.un;

public class ChatThemeController extends BaseController {
    public static final int THEME_LIST_WITH_DEFAULT = 1;
    public static final int THEME_LIST_WITH_EMOJI = 2;
    public static final int THEME_LIST_WITH_GIFTS = 4;
    public static volatile DispatchQueue chatThemeQueue = new DispatchQueue("chatThemeQueue");
    private static final ChatThemeController[] instances = new ChatThemeController[4];
    private final Map<String, org.telegram.ui.ActionBar.b4> allChatGiftThemes;
    private List<org.telegram.ui.ActionBar.b4> allChatThemes;
    private final LongSparseArray<of.b> dialogEmoticonsMap;
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
        private List<org.telegram.ui.ActionBar.b4> themes;

        private ThemeList() {
        }
    }

    private ChatThemeController(int i10) {
        super(i10);
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
            if (wallPaper.f22532id == wallPaper2.f22532id && TextUtils.equals(un.e(wallPaper.settings), un.e(wallPaper2.settings)) && TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2))) {
                return true;
            }
        }
        return false;
    }

    private List<org.telegram.ui.ActionBar.b4> getAllChatThemesFromPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                TLRPC.TL_theme tL_themeTLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (tL_themeTLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.b4(this.currentAccount, tL_themeTLdeserialize));
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

    public static ChatThemeController getInstance(int i10) {
        ChatThemeController chatThemeController;
        ChatThemeController[] chatThemeControllerArr = instances;
        ChatThemeController chatThemeController2 = chatThemeControllerArr[i10];
        if (chatThemeController2 != null) {
            return chatThemeController2;
        }
        synchronized (ChatThemeController.class) {
            try {
                chatThemeController = chatThemeControllerArr[i10];
                if (chatThemeController == null) {
                    chatThemeController = new ChatThemeController(i10);
                    chatThemeControllerArr[i10] = chatThemeController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return chatThemeController;
    }

    private File getPatternFile(long j10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        Locale locale = Locale.US;
        return new File(filesDirFixed, j10 + "_" + this.themesHash + ".jpg");
    }

    private SharedPreferences getSharedPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    private void getWallpaperBitmap(long j10, ResultCallback<Bitmap> resultCallback) {
        if (this.themesHash == 0) {
            resultCallback.onComplete(null);
        } else {
            chatThemeQueue.postRunnable(new e3(14, getPatternFile(j10), resultCallback));
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.allChatThemes = getAllChatThemesFromPrefs();
        getMessagesStorage().loadGiftChatTheme(new z0(this, 0));
        preloadSticker("❌");
        if (this.allChatThemes.isEmpty()) {
            return;
        }
        Iterator<org.telegram.ui.ActionBar.b4> it = this.allChatThemes.iterator();
        while (it.hasNext()) {
            preloadSticker(it.next().f22783e);
        }
    }

    public static boolean isNotEmoticonWallpaper(TLRPC.WallPaper wallPaper) {
        String wallpaperEmoticon = getWallpaperEmoticon(wallPaper);
        return wallpaperEmoticon != null && wallpaperEmoticon.length() == 0;
    }

    public static void lambda$getWallpaperBitmap$7(File file, ResultCallback resultCallback) {
        Bitmap bitmapDecodeFile = null;
        try {
            if (file.exists()) {
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (resultCallback != null) {
            AndroidUtilities.runOnUIThread(new e3(15, resultCallback, bitmapDecodeFile));
        }
    }

    public void lambda$init$0(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it.next();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.b4(this.currentAccount, tL_chatThemeUniqueGift));
            }
        }
    }

    public static void lambda$loadWallpaperBitmap$9(Utilities.Callback callback, Bitmap bitmap) {
        if (bitmap != null) {
            callback.run(new mf.a(bitmap, 0, null));
        } else {
            callback.run(null);
        }
    }

    public static void lambda$loadWallpaperPatternBitmap$11(File file, Utilities.Callback callback) throws Throwable {
        Bitmap bitmapD;
        ArrayList arrayList;
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList2 = new ArrayList(1);
                            bitmapD = h7.a0.d(gZIPInputStream, arrayList2);
                            try {
                                int size = arrayList2.size();
                                arrayList = null;
                                int i10 = 0;
                                while (i10 < size) {
                                    try {
                                        Object obj = arrayList2.get(i10);
                                        i10++;
                                        String str = (String) obj;
                                        if (str.startsWith("patterns = ")) {
                                            byte[] bArrHexToBytes = Utilities.hexToBytes(str.substring(11));
                                            int length = bArrHexToBytes.length / 52;
                                            SerializedData serializedData = new SerializedData(bArrHexToBytes);
                                            ArrayList arrayList3 = new ArrayList(length);
                                            for (int i11 = 0; i11 < length; i11++) {
                                                try {
                                                    arrayList3.add(mf.c.a(serializedData));
                                                } catch (Throwable th) {
                                                    th = th;
                                                    arrayList = arrayList3;
                                                    try {
                                                        gZIPInputStream.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            }
                                            serializedData.cleanup();
                                            arrayList = arrayList3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                gZIPInputStream.close();
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th = th4;
                                arrayList = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bitmapD = null;
                            arrayList = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        try {
                            fileInputStream.close();
                        } catch (Throwable th7) {
                            th.addSuppressed(th7);
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    bitmapD = null;
                    arrayList = null;
                    fileInputStream.close();
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
            }
        } catch (Exception e10) {
            e = e10;
            bitmapD = null;
            arrayList = null;
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new e3(18, callback, bitmapD != null ? new mf.a(bitmapD, 1, arrayList) : null));
    }

    public void lambda$preloadAllWallpaperThumbs$5(Pair pair) {
        if (pair != null) {
            this.themeIdWallpaperThumbMap.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    public void lambda$processUpdate$13(long j10, TLRPC.UserFull userFull) {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
    }

    public void lambda$processUpdate$14(TLRPC.ChatFull chatFull) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, chatFull, 0, bool, bool);
    }

    public void lambda$requestAllChatThemes$2(List list, ResultCallback resultCallback, boolean z10) {
        this.allChatThemes = new ArrayList(list);
        resultCallback.onComplete(getEmojiThemes((z10 ? 1 : 0) | 2));
    }

    public void lambda$requestAllChatThemes$3(ResultCallback resultCallback, boolean z10, TL_account.Themes themes, TLRPC.TL_error tL_error) {
        Object allChatThemesFromPrefs;
        boolean z11 = true;
        if (!(themes instanceof TL_account.TL_themes)) {
            if (themes instanceof TL_account.TL_themesNotModified) {
                allChatThemesFromPrefs = getAllChatThemesFromPrefs();
            } else {
                AndroidUtilities.runOnUIThread(new y0(resultCallback, tL_error, 0));
                allChatThemesFromPrefs = null;
            }
            if (z11) {
            }
            AndroidUtilities.runOnUIThread(new qj(this, allChatThemesFromPrefs, resultCallback, z10, 3));
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
        for (int i10 = 0; i10 < tL_themes.themes.size(); i10++) {
            TLRPC.TL_theme tL_theme = tL_themes.themes.get(i10);
            Emoji.preloadEmoji(tL_theme.emoticon);
            SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
            tL_theme.serializeToStream(serializedData);
            editorEdit.putString("theme_" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
            org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount, tL_theme);
            b4Var.p(0, null);
            b4Var.p(1, null);
            b4Var.o(0, null);
            b4Var.o(1, null);
            arrayList.add(b4Var);
        }
        editorEdit.apply();
        allChatThemesFromPrefs = arrayList;
        z11 = false;
        if (z11) {
            AndroidUtilities.runOnUIThread(new qj(this, allChatThemesFromPrefs, resultCallback, z10, 3));
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
            org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) it.next();
            Map<String, org.telegram.ui.ActionBar.b4> map = this.allChatGiftThemes;
            of.b bVar = b4Var.f22782c;
            if (bVar != null && (str = bVar.f19442b) == null) {
                str = bVar.f19441a;
            }
            map.put(str, b4Var);
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
            AndroidUtilities.runOnUIThread(new y0(resultCallback, tL_error, 1));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!(chatThemes instanceof TL_account.Tl_chatThemes)) {
            if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
                AndroidUtilities.runOnUIThread(new e3(19, this, resultCallback));
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.ChatTheme chatTheme = arrayList2.get(i10);
            i10++;
            TLRPC.ChatTheme chatTheme2 = chatTheme;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                arrayList.add((TLRPC.TL_chatThemeUniqueGift) chatTheme2);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i11));
            b4Var.p(0, null);
            b4Var.p(1, null);
            b4Var.o(0, null);
            b4Var.o(1, null);
            arrayList3.add(b4Var);
        }
        AndroidUtilities.runOnUIThread(new c5(this, tl_chatThemes, arrayList3, arrayList, resultCallback, 3));
    }

    public static void lambda$saveWallpaperBitmap$8(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e9) {
            FileLog.e(e9);
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
                                mf.c cVar = (mf.c) it.next();
                                RectF rectF = cVar.f18040a;
                                serializedData.writeFloat(rectF.left);
                                serializedData.writeFloat(rectF.top);
                                serializedData.writeFloat(rectF.width());
                                serializedData.writeFloat(rectF.height());
                                float[] fArr = new float[9];
                                cVar.f18041b.getValues(fArr);
                                for (int i10 = 0; i10 < 9; i10++) {
                                    serializedData.writeFloat(fArr[i10]);
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
                    h7.a0.e(bitmap, gZIPOutputStream, listSingletonList);
                } else {
                    Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
                    h7.a0.e(bitmapExtractAlpha, gZIPOutputStream, listSingletonList);
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$setDialogTheme$4(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$setWallpaperToPeer$16(TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) throws FileNotFoundException {
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        String str2;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            TLRPC.WallPaper wallPaper = null;
            if (j10 >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j10);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j10);
                userFull = null;
            }
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
            for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        if (!z10) {
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
                            saveChatWallpaper(j10, wallPaper2);
                            getMessagesStorage().updateChatInfo(chatFull, false);
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                            int i11 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, chatFull, 0, bool, bool);
                            break;
                        }
                        TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                        userFull.wallpaper = wallPaper3;
                        userFull.flags |= 16777216;
                        saveChatWallpaper(j10, wallPaper3);
                        getMessagesStorage().updateUserInfo(userFull, false);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
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

    public void lambda$setWallpaperToPeer$17(long j10, boolean z10, String str, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new jd(this, tLObject, j10, z10, str, runnable));
    }

    private void loadWallpaperPatternBitmap(long j10, Utilities.Callback<mf.a> callback) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new e3(17, new File(filesDirFixed, com.google.android.recaptcha.internal.a.m(j10, "pattern_", ".pgm.gz")), callback));
    }

    private void preloadSticker(String str) {
        new ImageReceiver().setImage(ImageLocation.getForDocument(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str)), "50_50", null, null, null, 0);
        Emoji.preloadEmoji(str);
    }

    private void requestNextChatThemes(ResultCallback<Void> resultCallback) {
        if (this.giftsThemeList.hash != 0) {
            long unused = this.giftsThemeList.lastReloadTimeMs;
        }
        boolean z10 = System.currentTimeMillis() - this.giftsThemeList.lastReloadTimeMs > 7200000;
        if (this.giftsThemeList.themes == null || !this.giftsThemeList.completed || z10) {
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            tl_getUniqueGiftChatThemes.offset = this.giftsThemeList.offset;
            tl_getUniqueGiftChatThemes.hash = this.giftsThemeList.hash;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new b1(dispatchQueue), new c1(0, this, resultCallback));
        }
    }

    private void saveWallpaperBitmap(Bitmap bitmap, long j10) {
        chatThemeQueue.postRunnable(new e3(20, getPatternFile(j10), bitmap));
    }

    private void saveWallpaperPatternBitmap(Bitmap bitmap, List<mf.c> list, long j10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new f0(new File(filesDirFixed, com.google.android.recaptcha.internal.a.m(j10, "pattern_", ".pgm.gz")), list, bitmap, 11));
    }

    private void setGiftThemeUser(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            String strRemove = this.usedGiftThemesByUsers.remove(Long.valueOf(j10));
            if (strRemove != null) {
                this.usedGiftThemesBySlug.remove(strRemove);
                return;
            }
            return;
        }
        if (j10 == 0) {
            Long lRemove = this.usedGiftThemesBySlug.remove(str);
            if (lRemove != null) {
                this.usedGiftThemesByUsers.remove(lRemove);
                return;
            }
            return;
        }
        String strPut = this.usedGiftThemesByUsers.put(Long.valueOf(j10), str);
        Long lPut = this.usedGiftThemesBySlug.put(str, Long.valueOf(j10));
        if (strPut != null && !TextUtils.equals(str, strPut)) {
            this.usedGiftThemesBySlug.remove(strPut);
        }
        if (lPut == null || lPut.longValue() == j10) {
            return;
        }
        this.usedGiftThemesByUsers.remove(lPut);
    }

    public static boolean wallpaperEquals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            return wallPaper.f22532id == wallPaper2.f22532id;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
            }
            if (wallPaper.f22532id == wallPaper2.f22532id) {
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

    public void clearWallpaper(long j10, boolean z10) {
        clearWallpaper(j10, z10, false);
    }

    public void clearWallpaperThumbImages() {
        this.themeIdWallpaperThumbMap.clear();
    }

    public org.telegram.ui.ActionBar.b4 getDialogTheme(long j10) {
        of.b bVar;
        of.b bVar2 = this.dialogEmoticonsMap.get(j10);
        if (bVar2 == null) {
            String string = getEmojiSharedPreferences().getString("chatTheme_" + this.currentAccount + "_" + j10, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new of.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new of.b(string.substring(9), null);
                } else if (TextUtils.isEmpty(string)) {
                    bVar2 = null;
                } else {
                    bVar = new of.b(string, null);
                }
                bVar2 = bVar;
            } else {
                bVar2 = null;
            }
            this.dialogEmoticonsMap.put(j10, bVar2);
        }
        return getTheme(bVar2);
    }

    public TLRPC.WallPaper getDialogWallpaper(long j10) {
        if (j10 >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
            if (userFull != null) {
                return userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null) {
                return chatFull.wallpaper;
            }
        }
        String string = getEmojiSharedPreferences().getString("chatWallpaper_" + this.currentAccount + "_" + j10, null);
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

    public List<org.telegram.ui.ActionBar.b4> getEmojiThemes(int i10) {
        List<org.telegram.ui.ActionBar.b4> list;
        boolean zHasFlag = TLObject.hasFlag(i10, 1);
        boolean zHasFlag2 = TLObject.hasFlag(i10, 2);
        boolean zHasFlag3 = TLObject.hasFlag(i10, 4);
        ArrayList arrayList = new ArrayList();
        if (zHasFlag3 && this.giftsThemeList.themes != null) {
            arrayList.addAll(this.giftsThemeList.themes);
        }
        if (zHasFlag2 && (list = this.allChatThemes) != null) {
            arrayList.addAll(list);
        }
        int i11 = 0;
        if (zHasFlag && (arrayList.isEmpty() || !((org.telegram.ui.ActionBar.b4) arrayList.get(0)).f22780a)) {
            org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
            b4Var.f22783e = "❌";
            b4Var.f22782c = of.b.d("❌");
            b4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            b4Var.f22780a = true;
            org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
            a4Var.f22710a = org.telegram.ui.ActionBar.b4.e(true);
            b4Var.f22784f.add(a4Var);
            org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
            a4Var2.f22710a = org.telegram.ui.ActionBar.b4.e(false);
            b4Var.f22784f.add(a4Var2);
            arrayList.add(0, b4Var);
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.b4) obj).l();
        }
        return arrayList;
    }

    public long getGiftThemeUser(String str) {
        Long l10 = this.usedGiftThemesBySlug.get(str);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public org.telegram.ui.ActionBar.b4 getTheme(of.b bVar) {
        if (bVar == null) {
            return null;
        }
        String str = bVar.f19442b;
        if (!TextUtils.isEmpty(str)) {
            return this.allChatGiftThemes.get(str);
        }
        for (org.telegram.ui.ActionBar.b4 b4Var : this.allChatThemes) {
            if (bVar.equals(b4Var.f22782c)) {
                return b4Var;
            }
        }
        return null;
    }

    public Bitmap getWallpaperThumbBitmap(long j10) {
        return this.themeIdWallpaperThumbMap.get(Long.valueOf(j10));
    }

    public boolean isAllThemesFullyLoaded() {
        List<org.telegram.ui.ActionBar.b4> list;
        return (!isGiftThemesFullyLoaded() || (list = this.allChatThemes) == null || list.isEmpty()) ? false : true;
    }

    public boolean isGiftThemesFullyLoaded() {
        return this.giftsThemeList.completed;
    }

    public void loadNextChatThemes(ResultCallback<Void> resultCallback) {
        requestNextChatThemes(resultCallback);
    }

    public void loadWallpaperBitmap(long j10, int i10, Utilities.Callback<mf.a> callback) {
        if (i10 == 0) {
            getWallpaperBitmap(j10, new d(callback, 2));
        } else if (i10 == 1) {
            loadWallpaperPatternBitmap(j10, callback);
        }
    }

    public void preloadAllWallpaperImages(boolean z10) {
        for (org.telegram.ui.ActionBar.b4 b4Var : this.allChatThemes) {
            long jI = b4Var.i(z10 ? 1 : 0);
            if (jI != 0 && !getPatternFile(jI).exists()) {
                b4Var.o(z10 ? 1 : 0, null);
            }
        }
    }

    public void preloadAllWallpaperThumbs(boolean z10) {
        for (org.telegram.ui.ActionBar.b4 b4Var : this.allChatThemes) {
            long jI = b4Var.i(z10 ? 1 : 0);
            if (jI != 0 && !this.themeIdWallpaperThumbMap.containsKey(Long.valueOf(jI))) {
                b4Var.p(z10 ? 1 : 0, new d(this, 3));
            }
        }
    }

    public void processUpdate(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (!(tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser)) {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-DialogObject.getPeerDialogId(tL_updatePeerWallpaper.peer));
            if (chatFull == null || wallpaperEquals(chatFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                return;
            }
            long j10 = -chatFull.f22381id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                chatFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                chatFull.flags2 |= 128;
            } else {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
            }
            getMessagesStorage().updateChatInfo(chatFull, false);
            saveChatWallpaper(j10, chatFull.wallpaper);
            AndroidUtilities.runOnUIThread(new e3(16, this, chatFull));
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(tL_updatePeerWallpaper.peer.user_id);
        if (userFull == null || wallpaperEquals(userFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            return;
        }
        long j11 = userFull.f22528id;
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
        saveChatWallpaper(j11, userFull.wallpaper);
        AndroidUtilities.runOnUIThread(new c4(this, j11, userFull, 3));
    }

    public void putThemeIfNeeded(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            if (this.allChatGiftThemes.containsKey(tL_chatThemeUniqueGift.gift.slug)) {
                return;
            }
            org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount, tL_chatThemeUniqueGift);
            b4Var.l();
            this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, b4Var);
            getMessagesStorage().putGiftChatTheme(chatTheme);
        }
    }

    public void requestAllChatThemes(final ResultCallback<List<org.telegram.ui.ActionBar.b4>> resultCallback, final boolean z10) {
        if (this.themesHash == 0 || this.lastReloadTimeMs == 0) {
            init();
        }
        boolean z11 = System.currentTimeMillis() - this.lastReloadTimeMs > 7200000;
        List<org.telegram.ui.ActionBar.b4> list = this.allChatThemes;
        if (list == null || list.isEmpty() || z11) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.themesHash;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(getchatthemes, new b1(dispatchQueue), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f19654a.lambda$requestAllChatThemes$3(resultCallback, z10, (TL_account.Themes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        List<org.telegram.ui.ActionBar.b4> list2 = this.allChatThemes;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        resultCallback.onComplete(getEmojiThemes((z10 ? 1 : 0) | 2));
    }

    public void requestChatTheme(final of.b bVar, final ResultCallback<org.telegram.ui.ActionBar.b4> resultCallback) {
        if (bVar != null) {
            String str = bVar.f19442b;
            if (!bVar.b()) {
                if (TextUtils.isEmpty(str)) {
                    requestAllChatThemes(new ResultCallback<List<org.telegram.ui.ActionBar.b4>>() {
                        @Override
                        public final void onError(Throwable th) {
                            org.telegram.tgnet.k.a(this, th);
                        }

                        @Override
                        public void onComplete(List<org.telegram.ui.ActionBar.b4> list) {
                            for (org.telegram.ui.ActionBar.b4 b4Var : list) {
                                if (bVar.equals(b4Var.f22782c)) {
                                    b4Var.l();
                                    resultCallback.onComplete(b4Var);
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
                org.telegram.ui.ActionBar.b4 b4Var = this.allChatGiftThemes.get(str);
                if (b4Var == null) {
                    resultCallback.onComplete(null);
                    return;
                } else {
                    b4Var.l();
                    resultCallback.onComplete(b4Var);
                    return;
                }
            }
        }
        resultCallback.onComplete(null);
    }

    public void saveChatWallpaper(long j10, TLRPC.WallPaper wallPaper) {
        if (wallPaper == null) {
            getEmojiSharedPreferences().edit().remove("chatWallpaper_" + this.currentAccount + "_" + j10).apply();
            return;
        }
        if (wallPaper.document == null) {
            return;
        }
        SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
        wallPaper.serializeToStream(serializedData);
        String strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        getEmojiSharedPreferences().edit().putString("chatWallpaper_" + this.currentAccount + "_" + j10, strBytesToHex).apply();
    }

    public void setDialogTheme(long j10, TLRPC.ChatTheme chatTheme, boolean z10) {
        setDialogTheme(j10, of.b.c(chatTheme), chatTheme, z10);
    }

    public int setWallpaperToPeer(long j10, String str, org.telegram.ui.ActionBar.z5 z5Var, MessageObject messageObject, Runnable runnable) {
        boolean z10;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        }
        tL_messages_setChatWallPaper.for_both = z5Var.f24017o;
        if (messageObject == null || !(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = MessagesController.getInputWallpaper(z5Var);
            z10 = true;
        } else {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f22497id = messageObject.getId();
            if (j10 >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j10);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j10);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageObject.messageOwner.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f22532id = wallPaper2.f22532id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (z5Var.f24013k * 100.0f);
            tL_wallPaperSettings.motion = z5Var.f24012j;
            tL_wallPaperSettings.blur = z5Var.f24011i;
            tL_wallPaperSettings.background_color = z5Var.d;
            tL_wallPaperSettings.second_background_color = z5Var.f24008e;
            tL_wallPaperSettings.third_background_color = z5Var.f24009f;
            tL_wallPaperSettings.fourth_background_color = z5Var.f24010g;
            tL_wallPaperSettings.rotation = z5Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else {
                wallPaper = chatFull != null ? chatFull.wallpaper : null;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull2 = chatFull;
            tL_wallPaper2.f22532id = wallPaper3.f22532id;
            tL_wallPaper2.document = wallPaper3.document;
            int i10 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i10 | 4;
            z10 = false;
            if (userFull != null) {
                userFull.wallpaper = tL_wallPaper2;
                userFull.flags |= 16777216;
                getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            } else if (chatFull2 != null) {
                chatFull2.wallpaper = tL_wallPaper2;
                chatFull2.flags2 |= 128;
                getMessagesStorage().updateChatInfo(chatFull2, false);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, chatFull2, 0, bool, bool);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = MessagesController.getWallpaperSetting(z5Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new oa(this, j10, z10, str, runnable));
    }

    public void clearWallpaper(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i10 = 1;
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
            tL_messages_setChatWallPaper.revert = z11;
            if (!z11) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
                if (userFull != null) {
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
                saveChatWallpaper(j10, null);
                if (z10) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                }
            }
        } else {
            long j11 = -j10;
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j11)));
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j11);
            if (chatFull != null) {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
                getMessagesStorage().updateChatInfo(chatFull, false);
            }
            saveChatWallpaper(j10, null);
            if (z10) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i11 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, chatFull, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new e5(i10));
    }

    public void saveWallpaperBitmap(mf.a aVar, long j10) {
        Bitmap bitmap = aVar.f18037b;
        int i10 = aVar.f18036a;
        if (i10 == 0) {
            saveWallpaperBitmap(bitmap, j10);
        } else if (i10 == 1) {
            saveWallpaperPatternBitmap(bitmap, aVar.f18038c, j10);
        }
    }

    public void setDialogTheme(long j10, of.b bVar) {
        setDialogTheme(j10, bVar, null, true);
    }

    private void setDialogTheme(long j10, of.b bVar, TLRPC.ChatTheme chatTheme, boolean z10) {
        String strConcat;
        String str;
        TLRPC.InputChatTheme tl_inputChatThemeEmpty;
        if (of.b.a(this.dialogEmoticonsMap.get(j10), bVar)) {
            return;
        }
        if (bVar == null) {
            this.dialogEmoticonsMap.delete(j10);
        } else {
            this.dialogEmoticonsMap.put(j10, bVar);
        }
        setGiftThemeUser(bVar != null ? bVar.f19442b : null, j10);
        if (j10 >= 0) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
            if (userFull != null && (bVar == null || bVar.b() || chatTheme != null)) {
                userFull.theme = chatTheme;
                getMessagesStorage().updateUserInfo(userFull, true);
            }
        } else {
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null) {
                chatFull.theme_emoticon = bVar != null ? bVar.f19441a : null;
                getMessagesStorage().updateChatInfo(chatFull, true);
            }
        }
        SharedPreferences.Editor editorEdit = getEmojiSharedPreferences().edit();
        String str2 = "chatTheme_" + this.currentAccount + "_" + j10;
        if (bVar != null) {
            String str3 = bVar.f19441a;
            String str4 = bVar.f19442b;
            if (str4 != null) {
                strConcat = "gift_".concat(str4);
            } else if (str3 != null) {
                strConcat = "emoticon_".concat(str3);
            } else {
                strConcat = null;
            }
        } else {
            strConcat = null;
        }
        editorEdit.putString(str2, strConcat).apply();
        if (z10) {
            TLRPC.TL_messages_setChatTheme tL_messages_setChatTheme = new TLRPC.TL_messages_setChatTheme();
            if (bVar != null) {
                String str5 = bVar.f19441a;
                if (!TextUtils.isEmpty(str5)) {
                    TLRPC.Tl_inputChatTheme tl_inputChatTheme = new TLRPC.Tl_inputChatTheme();
                    tl_inputChatTheme.emoticon = str5;
                    tl_inputChatThemeEmpty = tl_inputChatTheme;
                } else if (bVar != null) {
                    str = bVar.f19442b;
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
            } else if (bVar != null) {
                str = bVar.f19442b;
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
            tL_messages_setChatTheme.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequestTyped(tL_messages_setChatTheme, null, new le(this, 2));
        }
    }

    public void clearWallpaperImages() {
    }

    public static void lambda$clearWallpaper$15(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
