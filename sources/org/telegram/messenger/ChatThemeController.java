package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ao;
public class ChatThemeController extends BaseController {
    public static final int THEME_LIST_WITH_DEFAULT = 1;
    public static final int THEME_LIST_WITH_EMOJI = 2;
    public static final int THEME_LIST_WITH_GIFTS = 4;
    public static volatile DispatchQueue chatThemeQueue = new DispatchQueue("chatThemeQueue");
    private static final ChatThemeController[] instances = new ChatThemeController[4];
    private final Map<String, org.telegram.ui.ActionBar.f4> allChatGiftThemes;
    private List<org.telegram.ui.ActionBar.f4> allChatThemes;
    private final LongSparseArray<tf.b> dialogEmoticonsMap;
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
        private List<org.telegram.ui.ActionBar.f4> themes;

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

    public static void c(ChatThemeController chatThemeController, Pair pair) {
        chatThemeController.lambda$preloadAllWallpaperThumbs$5(pair);
    }

    public static void e(File file, List list, Bitmap bitmap) {
        lambda$saveWallpaperPatternBitmap$12(file, list, bitmap);
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
            if (wallPaper.f20995id == wallPaper2.f20995id && TextUtils.equals(ao.e(wallPaper.settings), ao.e(wallPaper2.settings)) && TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2))) {
                return true;
            }
        }
        return false;
    }

    public static void f(File file, Bitmap bitmap) {
        lambda$saveWallpaperBitmap$8(file, bitmap);
    }

    private List<org.telegram.ui.ActionBar.f4> getAllChatThemesFromPrefs() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i10 = sharedPreferences.getInt("count", 0);
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(sharedPreferences.getString("theme_" + i11, "")));
            try {
                TLRPC.TL_theme TLdeserialize = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null) {
                    arrayList.add(new org.telegram.ui.ActionBar.f4(this.currentAccount, TLdeserialize));
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
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
        if (chatThemeController2 == null) {
            synchronized (ChatThemeController.class) {
                try {
                    chatThemeController = chatThemeControllerArr[i10];
                    if (chatThemeController == null) {
                        chatThemeController = new ChatThemeController(i10);
                        chatThemeControllerArr[i10] = chatThemeController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return chatThemeController;
        }
        return chatThemeController2;
    }

    private File getPatternFile(long j10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        Locale locale = Locale.US;
        long j11 = this.themesHash;
        return new File(filesDirFixed, j10 + "_" + j11 + ".jpg");
    }

    private SharedPreferences getSharedPreferences() {
        Context context = ApplicationLoader.applicationContext;
        return context.getSharedPreferences("chatthemeconfig_" + this.currentAccount, 0);
    }

    private void getWallpaperBitmap(long j10, ResultCallback<Bitmap> resultCallback) {
        if (this.themesHash == 0) {
            resultCallback.onComplete(null);
            return;
        }
        chatThemeQueue.postRunnable(new e3(14, getPatternFile(j10), resultCallback));
    }

    public static String getWallpaperEmoticon(TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings != null && !TextUtils.isEmpty(wallPaperSettings.emoticon)) {
                return wallPaper.settings.emoticon;
            }
            return "";
        }
        return null;
    }

    public static void h(Utilities.Callback callback, Bitmap bitmap) {
        lambda$loadWallpaperBitmap$9(callback, bitmap);
    }

    private void init() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.themesHash = 0L;
        this.lastReloadTimeMs = 0L;
        try {
            this.themesHash = sharedPreferences.getLong("hash", 0L);
            this.lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.allChatThemes = getAllChatThemesFromPrefs();
        getMessagesStorage().loadGiftChatTheme(new a1(this, 0));
        preloadSticker("❌");
        if (!this.allChatThemes.isEmpty()) {
            for (org.telegram.ui.ActionBar.f4 f4Var : this.allChatThemes) {
                preloadSticker(f4Var.f21361e);
            }
        }
    }

    public static boolean isNotEmoticonWallpaper(TLRPC.WallPaper wallPaper) {
        String wallpaperEmoticon = getWallpaperEmoticon(wallPaper);
        if (wallpaperEmoticon != null && wallpaperEmoticon.length() == 0) {
            return true;
        }
        return false;
    }

    public static void k(ChatThemeController chatThemeController, ResultCallback resultCallback) {
        chatThemeController.lambda$requestNextChatThemes$20(resultCallback);
    }

    public static void lambda$getWallpaperBitmap$7(File file, ResultCallback resultCallback) {
        Bitmap bitmap = null;
        try {
            if (file.exists()) {
                bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (resultCallback != null) {
            AndroidUtilities.runOnUIThread(new e3(15, resultCallback, bitmap));
        }
    }

    public void lambda$init$0(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) it.next();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.f4(this.currentAccount, tL_chatThemeUniqueGift));
            }
        }
    }

    public static void lambda$loadWallpaperBitmap$9(Utilities.Callback callback, Bitmap bitmap) {
        if (bitmap != null) {
            callback.run(new qf.a(bitmap, 0, null));
        } else {
            callback.run(null);
        }
    }

    public static void lambda$loadWallpaperPatternBitmap$11(java.io.File r13, org.telegram.messenger.Utilities.Callback r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.lambda$loadWallpaperPatternBitmap$11(java.io.File, org.telegram.messenger.Utilities$Callback):void");
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

    public void lambda$requestAllChatThemes$2(List list, ResultCallback resultCallback, boolean z4) {
        this.allChatThemes = new ArrayList(list);
        resultCallback.onComplete(getEmojiThemes((z4 ? 1 : 0) | 2));
    }

    public void lambda$requestAllChatThemes$3(org.telegram.tgnet.ResultCallback r10, boolean r11, org.telegram.tgnet.tl.TL_account.Themes r12, org.telegram.tgnet.TLRPC.TL_error r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.lambda$requestAllChatThemes$3(org.telegram.tgnet.ResultCallback, boolean, org.telegram.tgnet.tl.TL_account$Themes, org.telegram.tgnet.TLRPC$TL_error):void");
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
            org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) it.next();
            Map<String, org.telegram.ui.ActionBar.f4> map = this.allChatGiftThemes;
            tf.b bVar = f4Var.f21360c;
            if (bVar != null && (str = bVar.f48079b) == null) {
                str = bVar.f48078a;
            }
            map.put(str, f4Var);
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
            AndroidUtilities.runOnUIThread(new z0(resultCallback, tL_error, 1));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (chatThemes instanceof TL_account.Tl_chatThemes) {
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
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) arrayList.get(i11));
                f4Var.p(0, null);
                f4Var.p(1, null);
                f4Var.o(0, null);
                f4Var.o(1, null);
                arrayList3.add(f4Var);
            }
            AndroidUtilities.runOnUIThread(new d5(this, tl_chatThemes, arrayList3, arrayList, resultCallback, 3));
        } else if (chatThemes instanceof TL_account.TL_chatThemesNotModified) {
            AndroidUtilities.runOnUIThread(new e3(19, this, resultCallback));
        }
    }

    public static void lambda$saveWallpaperBitmap$8(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$saveWallpaperPatternBitmap$12(File file, List list, Bitmap bitmap) {
        List list2;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
            if (list != null && !list.isEmpty()) {
                SerializedData serializedData = new SerializedData(list.size() * 52);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qf.c cVar = (qf.c) it.next();
                    RectF rectF = cVar.f44834a;
                    serializedData.writeFloat(rectF.left);
                    serializedData.writeFloat(rectF.top);
                    serializedData.writeFloat(rectF.width());
                    serializedData.writeFloat(rectF.height());
                    float[] fArr = new float[9];
                    cVar.f44835b.getValues(fArr);
                    for (int i10 = 0; i10 < 9; i10++) {
                        serializedData.writeFloat(fArr[i10]);
                    }
                }
                list2 = Collections.singletonList("patterns = " + Utilities.bytesToHex(serializedData.toByteArray()));
                serializedData.cleanup();
            } else {
                list2 = null;
            }
            if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                k7.i7.e(bitmap, gZIPOutputStream, list2);
            } else {
                Bitmap extractAlpha = bitmap.extractAlpha();
                k7.i7.e(extractAlpha, gZIPOutputStream, list2);
                extractAlpha.recycle();
            }
            gZIPOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public void lambda$setDialogTheme$4(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            getMessagesController().processUpdates(updates, false);
        }
    }

    public void lambda$setWallpaperToPeer$16(TLObject tLObject, long j10, boolean z4, String str, Runnable runnable) {
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
            int i10 = 0;
            while (true) {
                if (i10 >= updates.updates.size()) {
                    break;
                }
                if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                        if (z4) {
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str;
                            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                                tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                            }
                            if (userFull != null) {
                                TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                userFull.wallpaper = wallPaper2;
                                userFull.flags |= 16777216;
                                saveChatWallpaper(j10, wallPaper2);
                                getMessagesStorage().updateUserInfo(userFull, false);
                                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
                            } else if (chatFull != null) {
                                TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                chatFull.wallpaper = wallPaper3;
                                chatFull.flags2 |= 128;
                                saveChatWallpaper(j10, wallPaper3);
                                getMessagesStorage().updateChatInfo(chatFull, false);
                                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                int i11 = NotificationCenter.chatInfoDidLoad;
                                Boolean bool = Boolean.FALSE;
                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, chatFull, 0, bool, bool);
                            }
                        }
                    }
                }
                i10++;
            }
            MessagesController.getInstance(this.currentAccount).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
            if (runnable != null) {
                runnable.run();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.wallpaperSettedToUser, new Object[0]);
        }
    }

    public void lambda$setWallpaperToPeer$17(long j10, boolean z4, String str, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new nd(this, tLObject, j10, z4, str, runnable));
    }

    private void loadWallpaperPatternBitmap(long j10, Utilities.Callback<qf.a> callback) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new e3(17, new File(filesDirFixed, e2.c.i(j10, "pattern_", ".pgm.gz")), callback));
    }

    public static void m(File file, Utilities.Callback callback) {
        lambda$loadWallpaperPatternBitmap$11(file, callback);
    }

    public static void o(File file, ResultCallback resultCallback) {
        lambda$getWallpaperBitmap$7(file, resultCallback);
    }

    private void preloadSticker(String str) {
        new ImageReceiver().setImage(ImageLocation.getForDocument(MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker(str)), "50_50", null, null, null, 0);
        Emoji.preloadEmoji(str);
    }

    private void requestNextChatThemes(ResultCallback<Void> resultCallback) {
        boolean z4;
        if (this.giftsThemeList.hash != 0) {
            long unused = this.giftsThemeList.lastReloadTimeMs;
        }
        if (System.currentTimeMillis() - this.giftsThemeList.lastReloadTimeMs > 7200000) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.giftsThemeList.themes != null && this.giftsThemeList.completed && !z4) {
            return;
        }
        TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
        tl_getUniqueGiftChatThemes.offset = this.giftsThemeList.offset;
        tl_getUniqueGiftChatThemes.hash = this.giftsThemeList.hash;
        tl_getUniqueGiftChatThemes.limit = 50;
        ConnectionsManager connectionsManager = getConnectionsManager();
        DispatchQueue dispatchQueue = chatThemeQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new c1(dispatchQueue), new d1(0, this, resultCallback));
    }

    public static void s(ResultCallback resultCallback, Bitmap bitmap) {
        resultCallback.onComplete(bitmap);
    }

    private void saveWallpaperBitmap(Bitmap bitmap, long j10) {
        chatThemeQueue.postRunnable(new e3(20, getPatternFile(j10), bitmap));
    }

    private void saveWallpaperPatternBitmap(Bitmap bitmap, List<qf.c> list, long j10) {
        File filesDirFixed = ApplicationLoader.getFilesDirFixed("rasterized/wallpaper");
        Locale locale = Locale.US;
        chatThemeQueue.postRunnable(new g0(new File(filesDirFixed, e2.c.i(j10, "pattern_", ".pgm.gz")), list, bitmap, 12));
    }

    private void setGiftThemeUser(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            String remove = this.usedGiftThemesByUsers.remove(Long.valueOf(j10));
            if (remove != null) {
                this.usedGiftThemesBySlug.remove(remove);
            }
        } else if (j10 == 0) {
            Long remove2 = this.usedGiftThemesBySlug.remove(str);
            if (remove2 != null) {
                this.usedGiftThemesByUsers.remove(remove2);
            }
        } else {
            String put = this.usedGiftThemesByUsers.put(Long.valueOf(j10), str);
            Long put2 = this.usedGiftThemesBySlug.put(str, Long.valueOf(j10));
            if (put != null && !TextUtils.equals(str, put)) {
                this.usedGiftThemesBySlug.remove(put);
            }
            if (put2 != null && put2.longValue() != j10) {
                this.usedGiftThemesByUsers.remove(put2);
            }
        }
    }

    public static void t(Utilities.Callback callback, qf.a aVar) {
        callback.run(aVar);
    }

    public static void u(ChatThemeController chatThemeController, TLRPC.ChatFull chatFull) {
        chatThemeController.lambda$processUpdate$14(chatFull);
    }

    public static boolean wallpaperEquals(TLRPC.WallPaper wallPaper, TLRPC.WallPaper wallPaper2) {
        if (wallPaper == null && wallPaper2 == null) {
            return true;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaper) && (wallPaper2 instanceof TLRPC.TL_wallPaper)) {
            if (wallPaper.f20995id == wallPaper2.f20995id) {
                return true;
            }
            return false;
        }
        if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile)) {
            if (wallPaper.settings != null && wallPaper2.settings != null) {
                return TextUtils.equals(getWallpaperEmoticon(wallPaper), getWallpaperEmoticon(wallPaper2));
            }
            if (wallPaper.f20995id == wallPaper2.f20995id) {
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

    public void clearWallpaper(long j10, boolean z4) {
        clearWallpaper(j10, z4, false);
    }

    public void clearWallpaperThumbImages() {
        this.themeIdWallpaperThumbMap.clear();
    }

    public org.telegram.ui.ActionBar.f4 getDialogTheme(long j10) {
        tf.b bVar;
        tf.b bVar2 = this.dialogEmoticonsMap.get(j10);
        if (bVar2 == null) {
            String string = getEmojiSharedPreferences().getString("chatTheme_" + this.currentAccount + "_" + j10, null);
            if (string != null) {
                if (string.startsWith("gift_")) {
                    bVar = new tf.b(null, string.substring(5));
                } else if (string.startsWith("emoticon_")) {
                    bVar = new tf.b(string.substring(9), null);
                } else if (!TextUtils.isEmpty(string)) {
                    bVar = new tf.b(string, null);
                }
                bVar2 = bVar;
                this.dialogEmoticonsMap.put(j10, bVar2);
            }
            bVar2 = null;
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
        SharedPreferences emojiSharedPreferences = getEmojiSharedPreferences();
        String string = emojiSharedPreferences.getString("chatWallpaper_" + this.currentAccount + "_" + j10, null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                return TLRPC.WallPaper.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }

    public List<org.telegram.ui.ActionBar.f4> getEmojiThemes(int i10) {
        List<org.telegram.ui.ActionBar.f4> list;
        boolean hasFlag = TLObject.hasFlag(i10, 1);
        boolean hasFlag2 = TLObject.hasFlag(i10, 2);
        boolean hasFlag3 = TLObject.hasFlag(i10, 4);
        ArrayList arrayList = new ArrayList();
        if (hasFlag3 && this.giftsThemeList.themes != null) {
            arrayList.addAll(this.giftsThemeList.themes);
        }
        if (hasFlag2 && (list = this.allChatThemes) != null) {
            arrayList.addAll(list);
        }
        int i11 = 0;
        if (hasFlag && (arrayList.isEmpty() || !((org.telegram.ui.ActionBar.f4) arrayList.get(0)).f21358a)) {
            org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount);
            f4Var.f21361e = "❌";
            f4Var.f21360c = tf.b.d("❌");
            f4Var.d = TLRPC.ChatTheme.ofEmoticon("❌");
            f4Var.f21358a = true;
            org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
            e4Var.f21310a = org.telegram.ui.ActionBar.f4.e(true);
            f4Var.f21362f.add(e4Var);
            org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
            e4Var2.f21310a = org.telegram.ui.ActionBar.f4.e(false);
            f4Var.f21362f.add(e4Var2);
            arrayList.add(0, f4Var);
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.f4) obj).l();
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

    public org.telegram.ui.ActionBar.f4 getTheme(tf.b bVar) {
        if (bVar != null) {
            String str = bVar.f48079b;
            if (!TextUtils.isEmpty(str)) {
                return this.allChatGiftThemes.get(str);
            }
            for (org.telegram.ui.ActionBar.f4 f4Var : this.allChatThemes) {
                if (bVar.equals(f4Var.f21360c)) {
                    return f4Var;
                }
            }
            return null;
        }
        return null;
    }

    public Bitmap getWallpaperThumbBitmap(long j10) {
        return this.themeIdWallpaperThumbMap.get(Long.valueOf(j10));
    }

    public boolean isAllThemesFullyLoaded() {
        List<org.telegram.ui.ActionBar.f4> list;
        if (isGiftThemesFullyLoaded() && (list = this.allChatThemes) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isGiftThemesFullyLoaded() {
        return this.giftsThemeList.completed;
    }

    public void loadNextChatThemes(ResultCallback<Void> resultCallback) {
        requestNextChatThemes(resultCallback);
    }

    public void loadWallpaperBitmap(long j10, int i10, Utilities.Callback<qf.a> callback) {
        if (i10 == 0) {
            getWallpaperBitmap(j10, new d0(callback, 1));
        } else if (i10 == 1) {
            loadWallpaperPatternBitmap(j10, callback);
        }
    }

    public void preloadAllWallpaperImages(boolean z4) {
        for (org.telegram.ui.ActionBar.f4 f4Var : this.allChatThemes) {
            long i10 = f4Var.i(z4 ? 1 : 0);
            if (i10 != 0 && !getPatternFile(i10).exists()) {
                f4Var.o(z4 ? 1 : 0, null);
            }
        }
    }

    public void preloadAllWallpaperThumbs(boolean z4) {
        for (org.telegram.ui.ActionBar.f4 f4Var : this.allChatThemes) {
            long i10 = f4Var.i(z4 ? 1 : 0);
            if (i10 != 0 && !this.themeIdWallpaperThumbMap.containsKey(Long.valueOf(i10))) {
                f4Var.p(z4 ? 1 : 0, new d0(this, 2));
            }
        }
    }

    public void processUpdate(TL_update.TL_updatePeerWallpaper tL_updatePeerWallpaper) {
        if (tL_updatePeerWallpaper.peer instanceof TLRPC.TL_peerUser) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(tL_updatePeerWallpaper.peer.user_id);
            if (userFull != null && !wallpaperEquals(userFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
                long j10 = userFull.f20991id;
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
                saveChatWallpaper(j10, userFull.wallpaper);
                AndroidUtilities.runOnUIThread(new d4(this, j10, userFull, 4));
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-DialogObject.getPeerDialogId(tL_updatePeerWallpaper.peer));
        if (chatFull != null && !wallpaperEquals(chatFull.wallpaper, tL_updatePeerWallpaper.wallpaper)) {
            long j11 = -chatFull.f20844id;
            if ((tL_updatePeerWallpaper.flags & 1) != 0) {
                chatFull.wallpaper = tL_updatePeerWallpaper.wallpaper;
                chatFull.flags2 |= 128;
            } else {
                chatFull.wallpaper = null;
                chatFull.flags2 &= -129;
            }
            getMessagesStorage().updateChatInfo(chatFull, false);
            saveChatWallpaper(j11, chatFull.wallpaper);
            AndroidUtilities.runOnUIThread(new e3(16, this, chatFull));
        }
    }

    public void putThemeIfNeeded(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift = (TLRPC.TL_chatThemeUniqueGift) chatTheme;
            if (!this.allChatGiftThemes.containsKey(tL_chatThemeUniqueGift.gift.slug)) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount, tL_chatThemeUniqueGift);
                f4Var.l();
                this.allChatGiftThemes.put(tL_chatThemeUniqueGift.gift.slug, f4Var);
                getMessagesStorage().putGiftChatTheme(chatTheme);
            }
        }
    }

    public void requestAllChatThemes(final ResultCallback<List<org.telegram.ui.ActionBar.f4>> resultCallback, final boolean z4) {
        boolean z10;
        if (this.themesHash == 0 || this.lastReloadTimeMs == 0) {
            init();
        }
        if (System.currentTimeMillis() - this.lastReloadTimeMs > 7200000) {
            z10 = true;
        } else {
            z10 = false;
        }
        List<org.telegram.ui.ActionBar.f4> list = this.allChatThemes;
        if (list == null || list.isEmpty() || z10) {
            TL_account.getChatThemes getchatthemes = new TL_account.getChatThemes();
            getchatthemes.hash = this.themesHash;
            ConnectionsManager connectionsManager = getConnectionsManager();
            DispatchQueue dispatchQueue = chatThemeQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(getchatthemes, new c1(dispatchQueue), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ChatThemeController.this.lambda$requestAllChatThemes$3(resultCallback, z4, (TL_account.Themes) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
        List<org.telegram.ui.ActionBar.f4> list2 = this.allChatThemes;
        if (list2 != null && !list2.isEmpty()) {
            resultCallback.onComplete(getEmojiThemes((z4 ? 1 : 0) | 2));
        }
    }

    public void requestChatTheme(final tf.b bVar, final ResultCallback<org.telegram.ui.ActionBar.f4> resultCallback) {
        if (bVar != null) {
            String str = bVar.f48079b;
            if (!bVar.b()) {
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.f4 f4Var = this.allChatGiftThemes.get(str);
                    if (f4Var != null) {
                        f4Var.l();
                        resultCallback.onComplete(f4Var);
                        return;
                    }
                    resultCallback.onComplete(null);
                    return;
                }
                requestAllChatThemes(new ResultCallback<List<org.telegram.ui.ActionBar.f4>>() {
                    {
                        ChatThemeController.this = this;
                    }

                    @Override
                    public final void onError(Throwable th2) {
                        org.telegram.tgnet.k.a(this, th2);
                    }

                    @Override
                    public void onComplete(List<org.telegram.ui.ActionBar.f4> list) {
                        for (org.telegram.ui.ActionBar.f4 f4Var2 : list) {
                            if (bVar.equals(f4Var2.f21360c)) {
                                f4Var2.l();
                                resultCallback.onComplete(f4Var2);
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
        }
        resultCallback.onComplete(null);
    }

    public void saveChatWallpaper(long j10, TLRPC.WallPaper wallPaper) {
        if (wallPaper != null) {
            if (wallPaper.document == null) {
                return;
            }
            SerializedData serializedData = new SerializedData(wallPaper.getObjectSize());
            wallPaper.serializeToStream(serializedData);
            String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
            SharedPreferences.Editor edit = getEmojiSharedPreferences().edit();
            edit.putString("chatWallpaper_" + this.currentAccount + "_" + j10, bytesToHex).apply();
            return;
        }
        SharedPreferences.Editor edit2 = getEmojiSharedPreferences().edit();
        edit2.remove("chatWallpaper_" + this.currentAccount + "_" + j10).apply();
    }

    public void setDialogTheme(long j10, TLRPC.ChatTheme chatTheme, boolean z4) {
        setDialogTheme(j10, tf.b.c(chatTheme), chatTheme, z4);
    }

    public int setWallpaperToPeer(long j10, String str, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, Runnable runnable) {
        boolean z4;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.WallPaper wallPaper;
        String str2;
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)));
        }
        tL_messages_setChatWallPaper.for_both = d6Var.f21294o;
        if (messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetChatWallPaper)) {
            tL_messages_setChatWallPaper.flags |= 2;
            tL_messages_setChatWallPaper.f20960id = messageObject.getId();
            if (i10 >= 0) {
                userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j10);
                chatFull = null;
            } else {
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j10);
                userFull = null;
            }
            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageObject.messageOwner.action;
            TLRPC.TL_wallPaper tL_wallPaper = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper.f20995id = wallPaper2.f20995id;
            tL_wallPaper.document = wallPaper2.document;
            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
            tL_wallPaper.settings = tL_wallPaperSettings;
            tL_wallPaperSettings.intensity = (int) (d6Var.f21290k * 100.0f);
            tL_wallPaperSettings.motion = d6Var.f21289j;
            tL_wallPaperSettings.blur = d6Var.f21288i;
            tL_wallPaperSettings.background_color = d6Var.d;
            tL_wallPaperSettings.second_background_color = d6Var.f21285e;
            tL_wallPaperSettings.third_background_color = d6Var.f21286f;
            tL_wallPaperSettings.fourth_background_color = d6Var.f21287g;
            tL_wallPaperSettings.rotation = d6Var.h;
            tL_wallPaper.uploadingImage = str;
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            } else if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            } else {
                wallPaper = null;
            }
            if (wallPaper != null && (str2 = wallPaper.uploadingImage) != null && str2.equals(str)) {
                tL_wallPaper.stripedThumb = wallPaper.stripedThumb;
            }
            tL_wallPaper.settings.flags |= 121;
            TLRPC.TL_wallPaper tL_wallPaper2 = new TLRPC.TL_wallPaper();
            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
            tL_wallPaper2.pattern = wallPaper3.pattern;
            TLRPC.ChatFull chatFull2 = chatFull;
            tL_wallPaper2.f20995id = wallPaper3.f20995id;
            tL_wallPaper2.document = wallPaper3.document;
            int i11 = wallPaper3.flags;
            tL_wallPaper2.creator = wallPaper3.creator;
            tL_wallPaper2.dark = wallPaper3.dark;
            tL_wallPaper2.isDefault = wallPaper3.isDefault;
            tL_wallPaper2.slug = wallPaper3.slug;
            tL_wallPaper2.access_hash = wallPaper3.access_hash;
            tL_wallPaper2.stripedThumb = wallPaper3.stripedThumb;
            tL_wallPaper2.settings = tL_wallPaper.settings;
            tL_wallPaper2.flags = i11 | 4;
            z4 = false;
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
                int i12 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, chatFull2, 0, bool, bool);
            }
            if (runnable != null) {
                runnable.run();
            }
        } else {
            tL_messages_setChatWallPaper.flags |= 1;
            tL_messages_setChatWallPaper.wallpaper = MessagesController.getInputWallpaper(d6Var);
            z4 = true;
        }
        tL_messages_setChatWallPaper.flags |= 4;
        tL_messages_setChatWallPaper.settings = MessagesController.getWallpaperSetting(d6Var);
        return ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setChatWallPaper, new ra(this, j10, z4, str, runnable));
    }

    public void clearWallpaper(long j10, boolean z4, boolean z10) {
        TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
        if (j10 >= 0) {
            tL_messages_setChatWallPaper.peer = MessagesController.getInputPeer(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
            tL_messages_setChatWallPaper.revert = z10;
            if (!z10) {
                TLRPC.UserFull userFull = getMessagesController().getUserFull(j10);
                if (userFull != null) {
                    userFull.wallpaper = null;
                    userFull.flags &= -16777217;
                    getMessagesStorage().updateUserInfo(userFull, false);
                }
                saveChatWallpaper(j10, null);
                if (z4) {
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
            if (z4) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i10 = NotificationCenter.chatInfoDidLoad;
                Boolean bool = Boolean.FALSE;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, chatFull, 0, bool, bool);
            }
        }
        getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new f5(1));
    }

    public void saveWallpaperBitmap(qf.a aVar, long j10) {
        Bitmap bitmap = aVar.f44831b;
        int i10 = aVar.f44830a;
        if (i10 == 0) {
            saveWallpaperBitmap(bitmap, j10);
        } else if (i10 == 1) {
            saveWallpaperPatternBitmap(bitmap, aVar.f44832c, j10);
        }
    }

    public void setDialogTheme(long j10, tf.b bVar) {
        setDialogTheme(j10, bVar, null, true);
    }

    private void setDialogTheme(long r6, tf.b r8, org.telegram.tgnet.TLRPC.ChatTheme r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatThemeController.setDialogTheme(long, tf.b, org.telegram.tgnet.TLRPC$ChatTheme, boolean):void");
    }

    public void clearWallpaperImages() {
    }

    public static void lambda$clearWallpaper$15(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
