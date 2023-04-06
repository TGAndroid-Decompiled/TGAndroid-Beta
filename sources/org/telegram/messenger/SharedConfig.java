package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.content.pm.ShortcutManagerCompat;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.LaunchActivity;
public class SharedConfig {
    private static final int[] AVERAGE_DEVICES;
    private static final int[] HIGH_DEVICES;
    private static final int[] LOW_DEVICES;
    private static final int[] LOW_SOC;
    public static final int PASSCODE_TYPE_PASSWORD = 1;
    public static final int PASSCODE_TYPE_PIN = 0;
    public static final int PERFORMANCE_CLASS_AVERAGE = 1;
    public static final int PERFORMANCE_CLASS_HIGH = 2;
    public static final int PERFORMANCE_CLASS_LOW = 0;
    private static final int PROXY_CURRENT_SCHEMA_VERSION = 2;
    private static final int PROXY_SCHEMA_V2 = 2;
    public static final int SAVE_TO_GALLERY_FLAG_CHANNELS = 4;
    public static final int SAVE_TO_GALLERY_FLAG_GROUP = 2;
    public static final int SAVE_TO_GALLERY_FLAG_PEER = 1;
    public static boolean allowBigEmoji = false;
    public static boolean allowScreenCapture = false;
    private static Boolean animationsEnabled = null;
    public static boolean appLocked = false;
    public static boolean archiveHidden = false;
    public static int autoLockIn = 3600;
    public static int badPasscodeTries = 0;
    public static boolean bigCameraForRound = false;
    public static int bubbleRadius = 0;
    public static boolean chatBubbles = false;
    private static int chatSwipeAction = 0;
    private static boolean configLoaded = false;
    public static ProxyInfo currentProxy = null;
    public static boolean customTabs = false;
    public static int dayNightThemeSwitchHintCount = 0;
    public static boolean debugWebView = false;
    private static int devicePerformanceClass = 0;
    public static boolean directShare = false;
    public static String directShareHash = null;
    public static boolean disableVoiceAudioEffects = false;
    public static int distanceSystemType = 0;
    public static boolean dontAskManageStorage = false;
    public static boolean drawDialogIcons = false;
    public static int emojiInteractionsHintCount = 0;
    public static int fastScrollHintCount = 0;
    public static int fontSize = 0;
    public static boolean fontSizeIsDefault = false;
    public static boolean forceDisableTabletMode = false;
    public static boolean forwardingOptionsHintShown = false;
    public static boolean hasCameraCache = false;
    public static boolean hasEmailLogin = false;
    public static boolean inappCamera = false;
    public static boolean isFloatingDebugActive = false;
    public static boolean isWaitingForPasscodeEnter = false;
    public static int ivFontSize = 0;
    public static int lastKeepMediaCheckTime = 0;
    public static int lastLogsCheckTime = 0;
    public static int lastPauseTime = 0;
    public static long lastUpdateCheckTime = 0;
    public static String lastUpdateVersion = null;
    public static long lastUptimeMillis = 0;
    private static int legacyDevicePerformanceClass = -1;
    public static LiteMode liteMode = null;
    public static int lockRecordAudioVideoHint = 0;
    public static int mediaColumnsCount = 0;
    public static int messageSeenHintCount = 0;
    public static boolean noSoundHintShowed = false;
    public static final boolean noStatusBar = true;
    public static boolean noiseSupression = false;
    private static int overrideDevicePerformanceClass = 0;
    public static String passcodeHash = "";
    public static long passcodeRetryInMs = 0;
    public static int passcodeType = 0;
    public static int passportConfigHash = 0;
    private static HashMap<String, String> passportConfigMap = null;
    public static boolean pauseMusicOnMedia = false;
    public static boolean pauseMusicOnRecord = false;
    public static TLRPC$TL_help_appUpdate pendingAppUpdate = null;
    public static int pendingAppUpdateBuildVersion = 0;
    public static boolean playOrderReversed = false;
    public static ArrayList<ProxyInfo> proxyList = null;
    private static boolean proxyListLoaded = false;
    public static boolean proxyRotationEnabled = false;
    public static int proxyRotationTimeout = 0;
    public static byte[] pushAuthKey = null;
    public static byte[] pushAuthKeyId = null;
    public static boolean pushStatSent = false;
    public static String pushString = "";
    public static long pushStringGetTimeEnd = 0;
    public static long pushStringGetTimeStart = 0;
    public static String pushStringStatus = "";
    public static int pushType = 2;
    public static boolean raiseToListen = false;
    public static boolean raiseToSpeak = false;
    public static boolean readOnlyStorageDirAlertShowed = false;
    public static boolean recordViaSco = false;
    public static int repeatMode = 0;
    public static boolean roundCamera16to9 = false;
    public static boolean saveIncomingPhotos = false;
    public static boolean saveStreamMedia = false;
    public static int scheduledOrNoSoundHintShows = 0;
    public static int searchMessagesAsListHintShows = 0;
    public static boolean searchMessagesAsListUsed = false;
    public static boolean showNotificationsForAllAccounts = false;
    public static boolean shuffleMusic = false;
    public static boolean sortContactsByName = false;
    public static boolean sortFilesByName = false;
    public static boolean stickersReorderingHintUsed = false;
    public static String storageCacheDir = null;
    public static boolean streamAllVideo = false;
    public static boolean streamMedia = false;
    public static boolean streamMkv = false;
    public static boolean suggestAnimatedEmoji = false;
    public static int suggestStickers = 0;
    public static int textSelectionHintShows = 0;
    public static boolean translateChats = false;
    public static boolean useFingerprint = true;
    public static boolean useSystemEmoji;
    public static boolean useThreeLinesLayout;
    public static byte[] passcodeSalt = new byte[0];
    public static int keepMedia = CacheByChatsController.KEEP_MEDIA_ONE_MONTH;
    public static boolean updateStickersOrderOnSend = true;
    private static int lastLocalId = -210000;
    private static String passportConfigJson = "";
    private static final Object sync = new Object();
    private static final Object localIdSync = new Object();
    public static int mapPreviewType = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PasscodeType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PerformanceClass {
    }

    public static void lambda$checkSdCard$0() {
    }

    public static void lambda$checkSdCard$1(DialogInterface dialogInterface, int i) {
    }

    public static String performanceClassName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "HIGH" : "AVERAGE" : "LOW";
    }

    public static boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    public static void checkSdCard(File file) {
        if (file == null || storageCacheDir == null || readOnlyStorageDirAlertShowed || !file.getPath().startsWith(storageCacheDir)) {
            return;
        }
        AndroidUtilities.runOnUIThread(SharedConfig$$ExternalSyntheticLambda3.INSTANCE);
    }

    public static void lambda$checkSdCard$2() {
        BaseFragment lastFragment;
        if (readOnlyStorageDirAlertShowed || (lastFragment = LaunchActivity.getLastFragment()) == null || lastFragment.getParentActivity() == null) {
            return;
        }
        storageCacheDir = null;
        saveConfig();
        ImageLoader.getInstance().checkMediaPaths(SharedConfig$$ExternalSyntheticLambda2.INSTANCE);
        readOnlyStorageDirAlertShowed = true;
        AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getParentActivity());
        builder.setTitle(LocaleController.getString("SdCardError", R.string.SdCardError));
        builder.setSubtitle(LocaleController.getString("SdCardErrorDescription", R.string.SdCardErrorDescription));
        builder.setPositiveButton(LocaleController.getString("DoNotUseSDCard", R.string.DoNotUseSDCard), SharedConfig$$ExternalSyntheticLambda0.INSTANCE);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    static {
        chatBubbles = Build.VERSION.SDK_INT >= 30;
        raiseToSpeak = false;
        raiseToListen = true;
        recordViaSco = false;
        customTabs = true;
        directShare = true;
        inappCamera = true;
        roundCamera16to9 = true;
        noSoundHintShowed = false;
        streamMedia = true;
        streamAllVideo = false;
        streamMkv = false;
        saveStreamMedia = true;
        pauseMusicOnRecord = false;
        pauseMusicOnMedia = false;
        showNotificationsForAllAccounts = true;
        fontSize = 16;
        bubbleRadius = 17;
        ivFontSize = 16;
        mediaColumnsCount = 3;
        fastScrollHintCount = 3;
        translateChats = true;
        LOW_SOC = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        LOW_DEVICES = new int[]{1903542002, 1904553494, 1616144535, -713271737, -1394191140, -270252297, -270251367, -270252359};
        AVERAGE_DEVICES = new int[]{812981419, -993913431};
        HIGH_DEVICES = new int[]{1908570923, -980514379, 577463889, 1764745014, 1908524435, -215787089, -215458996, -1394179578, 220599115, 1737652784};
        loadConfig();
        proxyList = new ArrayList<>();
    }

    public static class ProxyInfo {
        public String address;
        public boolean available;
        public long availableCheckTime;
        public boolean checking;
        public String password;
        public long ping;
        public int port;
        public long proxyCheckPingId;
        public String secret;
        public String username;

        public ProxyInfo(String str, int i, String str2, String str3, String str4) {
            this.address = str;
            this.port = i;
            this.username = str2;
            this.password = str3;
            this.secret = str4;
            if (str == null) {
                this.address = "";
            }
            if (str3 == null) {
                this.password = "";
            }
            if (str2 == null) {
                this.username = "";
            }
            if (str4 == null) {
                this.secret = "";
            }
        }

        public String getLink() {
            StringBuilder sb = new StringBuilder(!TextUtils.isEmpty(this.secret) ? "https://t.me/proxy?" : "https://t.me/socks?");
            try {
                sb.append("server=");
                sb.append(URLEncoder.encode(this.address, "UTF-8"));
                sb.append("&");
                sb.append("port=");
                sb.append(this.port);
                if (!TextUtils.isEmpty(this.username)) {
                    sb.append("&user=");
                    sb.append(URLEncoder.encode(this.username, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.password)) {
                    sb.append("&pass=");
                    sb.append(URLEncoder.encode(this.password, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.secret)) {
                    sb.append("&secret=");
                    sb.append(URLEncoder.encode(this.secret, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return sb.toString();
        }
    }

    public static void saveConfig() {
        synchronized (sync) {
            try {
                SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0).edit();
                edit.putBoolean("saveIncomingPhotos", saveIncomingPhotos);
                edit.putString("passcodeHash1", passcodeHash);
                byte[] bArr = passcodeSalt;
                edit.putString("passcodeSalt", bArr.length > 0 ? Base64.encodeToString(bArr, 0) : "");
                edit.putBoolean("appLocked", appLocked);
                edit.putInt("passcodeType", passcodeType);
                edit.putLong("passcodeRetryInMs", passcodeRetryInMs);
                edit.putLong("lastUptimeMillis", lastUptimeMillis);
                edit.putInt("badPasscodeTries", badPasscodeTries);
                edit.putInt("autoLockIn", autoLockIn);
                edit.putInt("lastPauseTime", lastPauseTime);
                edit.putString("lastUpdateVersion2", lastUpdateVersion);
                edit.putBoolean("useFingerprint", useFingerprint);
                edit.putBoolean("allowScreenCapture", allowScreenCapture);
                edit.putString("pushString2", pushString);
                edit.putInt("pushType", pushType);
                edit.putBoolean("pushStatSent", pushStatSent);
                byte[] bArr2 = pushAuthKey;
                edit.putString("pushAuthKey", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                edit.putInt("lastLocalId", lastLocalId);
                edit.putString("passportConfigJson", passportConfigJson);
                edit.putInt("passportConfigHash", passportConfigHash);
                edit.putBoolean("sortContactsByName", sortContactsByName);
                edit.putBoolean("sortFilesByName", sortFilesByName);
                edit.putInt("textSelectionHintShows", textSelectionHintShows);
                edit.putInt("scheduledOrNoSoundHintShows", scheduledOrNoSoundHintShows);
                edit.putBoolean("forwardingOptionsHintShown", forwardingOptionsHintShown);
                edit.putInt("lockRecordAudioVideoHint", lockRecordAudioVideoHint);
                edit.putString("storageCacheDir", !TextUtils.isEmpty(storageCacheDir) ? storageCacheDir : "");
                edit.putBoolean("proxyRotationEnabled", proxyRotationEnabled);
                edit.putInt("proxyRotationTimeout", proxyRotationTimeout);
                TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = pendingAppUpdate;
                if (tLRPC$TL_help_appUpdate != null) {
                    try {
                        SerializedData serializedData = new SerializedData(tLRPC$TL_help_appUpdate.getObjectSize());
                        pendingAppUpdate.serializeToStream(serializedData);
                        edit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                        edit.putInt("appUpdateBuild", pendingAppUpdateBuildVersion);
                        serializedData.cleanup();
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove("appUpdate");
                }
                edit.putLong("appUpdateCheckTime", lastUpdateCheckTime);
                edit.apply();
                SharedPreferences.Editor edit2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                edit2.putBoolean("hasEmailLogin", hasEmailLogin);
                edit2.putBoolean("floatingDebugActive", isFloatingDebugActive);
                edit2.putBoolean("record_via_sco", recordViaSco);
                edit2.apply();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static int getLastLocalId() {
        int i;
        synchronized (localIdSync) {
            i = lastLocalId;
            lastLocalId = i - 1;
        }
        return i;
    }

    public static void loadConfig() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SharedConfig.loadConfig():void");
    }

    public static void updateTabletConfig() {
        if (fontSizeIsDefault) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i = sharedPreferences.getInt("fons_size", AndroidUtilities.isTablet() ? 18 : 16);
            fontSize = i;
            ivFontSize = sharedPreferences.getInt("iv_font_size", i);
        }
    }

    public static void increaseBadPasscodeTries() {
        int i = badPasscodeTries + 1;
        badPasscodeTries = i;
        if (i >= 3) {
            if (i == 3) {
                passcodeRetryInMs = 5000L;
            } else if (i == 4) {
                passcodeRetryInMs = 10000L;
            } else if (i == 5) {
                passcodeRetryInMs = 15000L;
            } else if (i == 6) {
                passcodeRetryInMs = 20000L;
            } else if (i == 7) {
                passcodeRetryInMs = 25000L;
            } else {
                passcodeRetryInMs = 30000L;
            }
            lastUptimeMillis = SystemClock.elapsedRealtime();
        }
        saveConfig();
    }

    public static boolean isAutoplayVideo() {
        return LiteMode.isEnabled(1024);
    }

    public static boolean isAutoplayGifs() {
        return LiteMode.isEnabled(LiteMode.FLAG_AUTOPLAY_GIFS);
    }

    public static boolean isPassportConfigLoaded() {
        return passportConfigMap != null;
    }

    public static void setPassportConfig(String str, int i) {
        passportConfigMap = null;
        passportConfigJson = str;
        passportConfigHash = i;
        saveConfig();
        getCountryLangs();
    }

    public static HashMap<String, String> getCountryLangs() {
        if (passportConfigMap == null) {
            passportConfigMap = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(passportConfigJson);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    passportConfigMap.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return passportConfigMap;
    }

    public static boolean isAppUpdateAvailable() {
        int i;
        TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate = pendingAppUpdate;
        if (tLRPC$TL_help_appUpdate == null || tLRPC$TL_help_appUpdate.document == null || !BuildVars.isStandaloneApp()) {
            return false;
        }
        try {
            i = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            FileLog.e(e);
            i = BuildVars.BUILD_VERSION;
        }
        return pendingAppUpdateBuildVersion == i;
    }

    public static boolean setNewAppVersionAvailable(org.telegram.tgnet.TLRPC$TL_help_appUpdate r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SharedConfig.setNewAppVersionAvailable(org.telegram.tgnet.TLRPC$TL_help_appUpdate):boolean");
    }

    public static boolean checkPasscode(String str) {
        if (passcodeSalt.length == 0) {
            boolean equals = Utilities.MD5(str).equals(passcodeHash);
            if (equals) {
                try {
                    passcodeSalt = new byte[16];
                    Utilities.random.nextBytes(passcodeSalt);
                    byte[] bytes = str.getBytes("UTF-8");
                    int length = bytes.length + 32;
                    byte[] bArr = new byte[length];
                    System.arraycopy(passcodeSalt, 0, bArr, 0, 16);
                    System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                    System.arraycopy(passcodeSalt, 0, bArr, bytes.length + 16, 16);
                    passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
                    saveConfig();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return equals;
        }
        try {
            byte[] bytes2 = str.getBytes("UTF-8");
            int length2 = bytes2.length + 32;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(passcodeSalt, 0, bArr2, 0, 16);
            System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
            System.arraycopy(passcodeSalt, 0, bArr2, bytes2.length + 16, 16);
            return passcodeHash.equals(Utilities.bytesToHex(Utilities.computeSHA256(bArr2, 0, length2)));
        } catch (Exception e2) {
            FileLog.e(e2);
            return false;
        }
    }

    public static void clearConfig() {
        saveIncomingPhotos = false;
        appLocked = false;
        passcodeType = 0;
        passcodeRetryInMs = 0L;
        lastUptimeMillis = 0L;
        badPasscodeTries = 0;
        passcodeHash = "";
        passcodeSalt = new byte[0];
        autoLockIn = 3600;
        lastPauseTime = 0;
        useFingerprint = true;
        isWaitingForPasscodeEnter = false;
        allowScreenCapture = false;
        lastUpdateVersion = BuildVars.BUILD_VERSION_STRING;
        textSelectionHintShows = 0;
        scheduledOrNoSoundHintShows = 0;
        lockRecordAudioVideoHint = 0;
        forwardingOptionsHintShown = false;
        messageSeenHintCount = 3;
        emojiInteractionsHintCount = 3;
        dayNightThemeSwitchHintCount = 3;
        saveConfig();
    }

    public static void setSuggestStickers(int i) {
        suggestStickers = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("suggestStickers", suggestStickers);
        edit.commit();
    }

    public static void setSearchMessagesAsListUsed(boolean z) {
        searchMessagesAsListUsed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("searchMessagesAsListUsed", searchMessagesAsListUsed);
        edit.commit();
    }

    public static void setStickersReorderingHintUsed(boolean z) {
        stickersReorderingHintUsed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("stickersReorderingHintUsed", stickersReorderingHintUsed);
        edit.commit();
    }

    public static void increaseTextSelectionHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = textSelectionHintShows + 1;
        textSelectionHintShows = i;
        edit.putInt("textSelectionHintShows", i);
        edit.commit();
    }

    public static void removeTextSelectionHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.commit();
    }

    public static void increaseScheduledOrNoSuoundHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = scheduledOrNoSoundHintShows + 1;
        scheduledOrNoSoundHintShows = i;
        edit.putInt("scheduledOrNoSoundHintShows", i);
        edit.commit();
    }

    public static void forwardingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        forwardingOptionsHintShown = true;
        edit.putBoolean("forwardingOptionsHintShown", true);
        edit.commit();
    }

    public static void removeScheduledOrNoSoundHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.commit();
    }

    public static void increaseLockRecordAudioVideoHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = lockRecordAudioVideoHint + 1;
        lockRecordAudioVideoHint = i;
        edit.putInt("lockRecordAudioVideoHint", i);
        edit.commit();
    }

    public static void removeLockRecordAudioVideoHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.commit();
    }

    public static void increaseSearchAsListHintShows() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i = searchMessagesAsListHintShows + 1;
        searchMessagesAsListHintShows = i;
        edit.putInt("searchMessagesAsListHintShows", i);
        edit.commit();
    }

    public static void setKeepMedia(int i) {
        keepMedia = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("keep_media", keepMedia);
        edit.commit();
    }

    public static void toggleUpdateStickersOrderOnSend() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        boolean z = !updateStickersOrderOnSend;
        updateStickersOrderOnSend = z;
        edit.putBoolean("updateStickersOrderOnSend", z);
        edit.commit();
    }

    public static void checkLogsToDelete() {
        if (BuildVars.LOGS_ENABLED) {
            final int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis - lastLogsCheckTime) < 3600) {
                return;
            }
            lastLogsCheckTime = currentTimeMillis;
            Utilities.cacheClearQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SharedConfig.lambda$checkLogsToDelete$3(currentTimeMillis);
                }
            });
        }
    }

    public static void lambda$checkLogsToDelete$3(int i) {
        File logsDir;
        long j = i - 864000;
        try {
            logsDir = AndroidUtilities.getLogsDir();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (logsDir == null) {
            return;
        }
        Utilities.clearDir(logsDir.getAbsolutePath(), 0, j, false);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lastLogsCheckTime", lastLogsCheckTime);
        edit.commit();
    }

    public static void toggleDisableVoiceAudioEffects() {
        disableVoiceAudioEffects = !disableVoiceAudioEffects;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("disableVoiceAudioEffects", disableVoiceAudioEffects);
        edit.commit();
    }

    public static void toggleNoiseSupression() {
        noiseSupression = !noiseSupression;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noiseSupression", noiseSupression);
        edit.commit();
    }

    public static void toggleDebugWebView() {
        boolean z = !debugWebView;
        debugWebView = z;
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugWebView", debugWebView);
        edit.apply();
    }

    public static void toggleLoopStickers() {
        LiteMode.toggleFlag(2);
    }

    public static void toggleBigEmoji() {
        allowBigEmoji = !allowBigEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("allowBigEmoji", allowBigEmoji);
        edit.commit();
    }

    public static void toggleSuggestAnimatedEmoji() {
        suggestAnimatedEmoji = !suggestAnimatedEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("suggestAnimatedEmoji", suggestAnimatedEmoji);
        edit.commit();
    }

    public static void setPlaybackOrderType(int i) {
        if (i == 2) {
            shuffleMusic = true;
            playOrderReversed = false;
        } else if (i == 1) {
            playOrderReversed = true;
            shuffleMusic = false;
        } else {
            playOrderReversed = false;
            shuffleMusic = false;
        }
        MediaController.getInstance().checkIsNextMediaFileDownloaded();
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("shuffleMusic", shuffleMusic);
        edit.putBoolean("playOrderReversed", playOrderReversed);
        edit.commit();
    }

    public static void setRepeatMode(int i) {
        repeatMode = i;
        if (i < 0 || i > 2) {
            repeatMode = 0;
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("repeatMode", repeatMode);
        edit.commit();
    }

    public static void overrideDevicePerformanceClass(int i) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        overrideDevicePerformanceClass = i;
        edit.putInt("overrideDevicePerformanceClass", i).remove("lite_mode").commit();
        if (liteMode != null) {
            LiteMode.loadPreference();
        }
    }

    public static void toggleAutoplayGifs() {
        LiteMode.toggleFlag(LiteMode.FLAG_AUTOPLAY_GIFS);
    }

    public static void setUseThreeLinesLayout(boolean z) {
        useThreeLinesLayout = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useThreeLinesLayout", useThreeLinesLayout);
        edit.commit();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public static void toggleArchiveHidden() {
        archiveHidden = !archiveHidden;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("archiveHidden", archiveHidden);
        edit.commit();
    }

    public static void toggleAutoplayVideo() {
        LiteMode.toggleFlag(1024);
    }

    public static boolean isSecretMapPreviewSet() {
        return MessagesController.getGlobalMainSettings().contains("mapPreviewType");
    }

    public static void setSecretMapPreviewType(int i) {
        mapPreviewType = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("mapPreviewType", mapPreviewType);
        edit.commit();
    }

    public static void setNoSoundHintShowed(boolean z) {
        if (noSoundHintShowed == z) {
            return;
        }
        noSoundHintShowed = z;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noSoundHintShowed", noSoundHintShowed);
        edit.commit();
    }

    public static void toggleRaiseToSpeak() {
        raiseToSpeak = !raiseToSpeak;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_speak", raiseToSpeak);
        edit.commit();
    }

    public static void toggleRaiseToListen() {
        raiseToListen = !raiseToListen;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_listen", raiseToListen);
        edit.commit();
    }

    public static boolean enabledRaiseTo(boolean z) {
        return raiseToListen && (!z || raiseToSpeak);
    }

    public static void toggleCustomTabs() {
        customTabs = !customTabs;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("custom_tabs", customTabs);
        edit.commit();
    }

    public static void toggleDirectShare() {
        directShare = !directShare;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("direct_share", directShare);
        edit.commit();
        ShortcutManagerCompat.removeAllDynamicShortcuts(ApplicationLoader.applicationContext);
        MediaDataController.getInstance(UserConfig.selectedAccount).buildShortcuts();
    }

    public static void toggleStreamMedia() {
        streamMedia = !streamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMedia", streamMedia);
        edit.commit();
    }

    public static void toggleSortContactsByName() {
        sortContactsByName = !sortContactsByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortContactsByName", sortContactsByName);
        edit.commit();
    }

    public static void toggleSortFilesByName() {
        sortFilesByName = !sortFilesByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortFilesByName", sortFilesByName);
        edit.commit();
    }

    public static void toggleStreamAllVideo() {
        streamAllVideo = !streamAllVideo;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamAllVideo", streamAllVideo);
        edit.commit();
    }

    public static void toggleStreamMkv() {
        streamMkv = !streamMkv;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMkv", streamMkv);
        edit.commit();
    }

    public static void toggleSaveStreamMedia() {
        saveStreamMedia = !saveStreamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("saveStreamMedia", saveStreamMedia);
        edit.commit();
    }

    public static void togglePauseMusicOnRecord() {
        pauseMusicOnRecord = !pauseMusicOnRecord;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnRecord", pauseMusicOnRecord);
        edit.commit();
    }

    public static void togglePauseMusicOnMedia() {
        pauseMusicOnMedia = !pauseMusicOnMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnMedia", pauseMusicOnMedia);
        edit.commit();
    }

    public static void toggleChatBlur() {
        LiteMode.toggleFlag(LiteMode.FLAG_CHAT_BLUR);
    }

    public static void toggleForceDisableTabletMode() {
        forceDisableTabletMode = !forceDisableTabletMode;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceDisableTabletMode", forceDisableTabletMode);
        edit.commit();
    }

    public static void toggleInappCamera() {
        inappCamera = !inappCamera;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("inappCamera", inappCamera);
        edit.commit();
    }

    public static void toggleRoundCamera16to9() {
        roundCamera16to9 = !roundCamera16to9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("roundCamera16to9", roundCamera16to9);
        edit.commit();
    }

    public static void setDistanceSystemType(int i) {
        distanceSystemType = i;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("distanceSystemType", distanceSystemType);
        edit.commit();
        LocaleController.resetImperialSystemType();
    }

    public static void loadProxyList() {
        if (proxyListLoaded) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i = sharedPreferences.getInt("proxy_port", 1080);
        proxyListLoaded = true;
        proxyList.clear();
        currentProxy = null;
        String string5 = sharedPreferences.getString("proxy_list", null);
        if (!TextUtils.isEmpty(string5)) {
            SerializedData serializedData = new SerializedData(Base64.decode(string5, 0));
            int readInt32 = serializedData.readInt32(false);
            if (readInt32 == -1) {
                byte readByte = serializedData.readByte(false);
                if (readByte == 2) {
                    int readInt322 = serializedData.readInt32(false);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        ProxyInfo proxyInfo = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                        proxyInfo.ping = serializedData.readInt64(false);
                        proxyInfo.availableCheckTime = serializedData.readInt64(false);
                        proxyList.add(0, proxyInfo);
                        if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo.address) && i == proxyInfo.port && string2.equals(proxyInfo.username) && string3.equals(proxyInfo.password)) {
                            currentProxy = proxyInfo;
                        }
                    }
                } else {
                    FileLog.e("Unknown proxy schema version: " + ((int) readByte));
                }
            } else {
                for (int i3 = 0; i3 < readInt32; i3++) {
                    ProxyInfo proxyInfo2 = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                    proxyList.add(0, proxyInfo2);
                    if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo2.address) && i == proxyInfo2.port && string2.equals(proxyInfo2.username) && string3.equals(proxyInfo2.password)) {
                        currentProxy = proxyInfo2;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (currentProxy != null || TextUtils.isEmpty(string)) {
            return;
        }
        ProxyInfo proxyInfo3 = new ProxyInfo(string, i, string2, string3, string4);
        currentProxy = proxyInfo3;
        proxyList.add(0, proxyInfo3);
    }

    public static void saveProxyList() {
        ArrayList arrayList = new ArrayList(proxyList);
        Collections.sort(arrayList, SharedConfig$$ExternalSyntheticLambda6.INSTANCE);
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(2);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        for (int i = size - 1; i >= 0; i--) {
            ProxyInfo proxyInfo = (ProxyInfo) arrayList.get(i);
            String str = proxyInfo.address;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            serializedData.writeString(str);
            serializedData.writeInt32(proxyInfo.port);
            String str3 = proxyInfo.username;
            if (str3 == null) {
                str3 = "";
            }
            serializedData.writeString(str3);
            String str4 = proxyInfo.password;
            if (str4 == null) {
                str4 = "";
            }
            serializedData.writeString(str4);
            String str5 = proxyInfo.secret;
            if (str5 != null) {
                str2 = str5;
            }
            serializedData.writeString(str2);
            serializedData.writeInt64(proxyInfo.ping);
            serializedData.writeInt64(proxyInfo.availableCheckTime);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).commit();
        serializedData.cleanup();
    }

    public static int lambda$saveProxyList$4(ProxyInfo proxyInfo, ProxyInfo proxyInfo2) {
        ProxyInfo proxyInfo3 = currentProxy;
        long j = proxyInfo3 == proxyInfo ? -200000L : 0L;
        if (!proxyInfo.available) {
            j += 100000;
        }
        long j2 = proxyInfo3 != proxyInfo2 ? 0L : -200000L;
        if (!proxyInfo2.available) {
            j2 += 100000;
        }
        return Long.compare(proxyInfo.ping + j, proxyInfo2.ping + j2);
    }

    public static ProxyInfo addProxy(ProxyInfo proxyInfo) {
        loadProxyList();
        int size = proxyList.size();
        for (int i = 0; i < size; i++) {
            ProxyInfo proxyInfo2 = proxyList.get(i);
            if (proxyInfo.address.equals(proxyInfo2.address) && proxyInfo.port == proxyInfo2.port && proxyInfo.username.equals(proxyInfo2.username) && proxyInfo.password.equals(proxyInfo2.password) && proxyInfo.secret.equals(proxyInfo2.secret)) {
                return proxyInfo2;
            }
        }
        proxyList.add(proxyInfo);
        saveProxyList();
        return proxyInfo;
    }

    public static boolean isProxyEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && currentProxy != null;
    }

    public static void deleteProxy(ProxyInfo proxyInfo) {
        if (currentProxy == proxyInfo) {
            currentProxy = null;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.putBoolean("proxy_enabled_calls", false);
            edit.commit();
            if (z) {
                ConnectionsManager.setProxySettings(false, "", 0, "", "", "");
            }
        }
        proxyList.remove(proxyInfo);
        saveProxyList();
    }

    public static void checkSaveToGalleryFiles() {
        Utilities.globalQueue.postRunnable(SharedConfig$$ExternalSyntheticLambda4.INSTANCE);
    }

    public static void lambda$checkSaveToGalleryFiles$5() {
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
            File file2 = new File(file, "Telegram Images");
            file2.mkdir();
            File file3 = new File(file, "Telegram Video");
            file3.mkdir();
            if (!BuildVars.NO_SCOPED_STORAGE) {
                if (file2.isDirectory()) {
                    new File(file2, ".nomedia").delete();
                }
                if (file3.isDirectory()) {
                    new File(file3, ".nomedia").delete();
                    return;
                }
                return;
            }
            if (file2.isDirectory()) {
                AndroidUtilities.createEmptyFile(new File(file2, ".nomedia"));
            }
            if (file3.isDirectory()) {
                AndroidUtilities.createEmptyFile(new File(file3, ".nomedia"));
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static int getChatSwipeAction(int i) {
        int i2 = chatSwipeAction;
        if (i2 < 0) {
            return !MessagesController.getInstance(i).dialogFilters.isEmpty() ? 5 : 2;
        } else if (i2 == 5 && MessagesController.getInstance(i).dialogFilters.isEmpty()) {
            return 2;
        } else {
            return chatSwipeAction;
        }
    }

    public static void updateChatListSwipeSetting(int i) {
        chatSwipeAction = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", chatSwipeAction).apply();
    }

    public static void updateMessageSeenHintCount(int i) {
        messageSeenHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", messageSeenHintCount).apply();
    }

    public static void updateEmojiInteractionsHintCount(int i) {
        emojiInteractionsHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", emojiInteractionsHintCount).apply();
    }

    public static void updateDayNightThemeSwitchHintCount(int i) {
        dayNightThemeSwitchHintCount = i;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", dayNightThemeSwitchHintCount).apply();
    }

    public static int getDevicePerformanceClass() {
        int i = overrideDevicePerformanceClass;
        if (i != -1) {
            return i;
        }
        if (devicePerformanceClass == -1) {
            devicePerformanceClass = measureDevicePerformanceClass();
        }
        return devicePerformanceClass;
    }

    public static int measureDevicePerformanceClass() {
        long j;
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        int i2 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        String str3 = Build.DEVICE;
        int i3 = 2;
        if (str3 != null && (str2 = Build.MANUFACTURER) != null) {
            int hashCode = (str2 + " " + str3).toUpperCase().hashCode();
            int i4 = 0;
            while (true) {
                int[] iArr = LOW_DEVICES;
                if (i4 >= iArr.length) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr2 = AVERAGE_DEVICES;
                        if (i5 >= iArr2.length) {
                            int i6 = 0;
                            while (true) {
                                int[] iArr3 = HIGH_DEVICES;
                                if (i6 >= iArr3.length) {
                                    break;
                                } else if (iArr3[i6] == hashCode) {
                                    return 2;
                                } else {
                                    i6++;
                                }
                            }
                        } else if (iArr2[i5] == hashCode) {
                            return 1;
                        } else {
                            i5++;
                        }
                    }
                } else if (iArr[i4] == hashCode) {
                    return 0;
                } else {
                    i4++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (str = Build.SOC_MODEL) != null) {
            int hashCode2 = str.toUpperCase().hashCode();
            int i7 = 0;
            while (true) {
                int[] iArr4 = LOW_SOC;
                if (i7 >= iArr4.length) {
                    break;
                } else if (iArr4[i7] == hashCode2) {
                    return 0;
                } else {
                    i7++;
                }
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i2; i10++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i10)), "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i9 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                    i8++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int ceil = i8 == 0 ? -1 : (int) Math.ceil(i9 / i8);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j = -1;
        }
        if (i < 21 || i2 <= 2 || memoryClass <= 100 || ((i2 <= 4 && ceil != -1 && ceil <= 1250) || ((i2 <= 4 && ceil <= 1600 && memoryClass <= 128 && i <= 21) || ((i2 <= 4 && ceil <= 1300 && memoryClass <= 128 && i <= 24) || (j != -1 && j < 2147483648L))))) {
            i3 = 0;
        } else if (i2 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2055) || (ceil == -1 && i2 == 8 && i <= 23))) {
            i3 = 1;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("device performance info selected_class = " + i3 + " (cpu_count = " + i2 + ", freq = " + ceil + ", memoryClass = " + memoryClass + ", android version " + i + ", manufacture " + Build.MANUFACTURER + ", screenRefreshRate=" + AndroidUtilities.screenRefreshRate + ")");
        }
        return i3;
    }

    public static void setMediaColumnsCount(int i) {
        if (mediaColumnsCount != i) {
            mediaColumnsCount = i;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", mediaColumnsCount).apply();
        }
    }

    public static void setFastScrollHintCount(int i) {
        if (fastScrollHintCount != i) {
            fastScrollHintCount = i;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", fastScrollHintCount).apply();
        }
    }

    public static void setDontAskManageStorage(boolean z) {
        dontAskManageStorage = z;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("dontAskManageStorage", dontAskManageStorage).apply();
    }

    public static boolean canBlurChat() {
        return getDevicePerformanceClass() == 2;
    }

    public static boolean chatBlurEnabled() {
        return canBlurChat() && LiteMode.isEnabled(LiteMode.FLAG_CHAT_BLUR);
    }

    public static class BackgroundActivityPrefs {
        private static SharedPreferences prefs;

        public static long getLastCheckedBackgroundActivity() {
            return prefs.getLong("last_checked", 0L);
        }

        public static void setLastCheckedBackgroundActivity(long j) {
            prefs.edit().putLong("last_checked", j).apply();
        }

        public static int getDismissedCount() {
            return prefs.getInt("dismissed_count", 0);
        }

        public static void increaseDismissedCount() {
            prefs.edit().putInt("dismissed_count", getDismissedCount() + 1).apply();
        }
    }

    public static void setAnimationsEnabled(boolean z) {
        animationsEnabled = Boolean.valueOf(z);
    }

    public static boolean animationsEnabled() {
        if (animationsEnabled == null) {
            animationsEnabled = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
        return animationsEnabled.booleanValue();
    }

    public static SharedPreferences getPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
    }

    public static boolean deviceIsLow() {
        return getDevicePerformanceClass() == 0;
    }

    public static boolean deviceIsAboveAverage() {
        return getDevicePerformanceClass() >= 1;
    }

    public static boolean deviceIsHigh() {
        return getDevicePerformanceClass() >= 2;
    }

    public static boolean deviceIsAverage() {
        return getDevicePerformanceClass() <= 1;
    }

    public static void toggleRoundCamera() {
        bigCameraForRound = !bigCameraForRound;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", bigCameraForRound).apply();
    }

    @Deprecated
    public static int getLegacyDevicePerformanceClass() {
        if (legacyDevicePerformanceClass == -1) {
            int i = Build.VERSION.SDK_INT;
            int i2 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i5)), "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        i4 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                        i3++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            int ceil = i3 == 0 ? -1 : (int) Math.ceil(i4 / i3);
            if (i < 21 || i2 <= 2 || memoryClass <= 100 || ((i2 <= 4 && ceil != -1 && ceil <= 1250) || ((i2 <= 4 && ceil <= 1600 && memoryClass <= 128 && i <= 21) || (i2 <= 4 && ceil <= 1300 && memoryClass <= 128 && i <= 24)))) {
                legacyDevicePerformanceClass = 0;
            } else if (i2 < 8 || memoryClass <= 160 || ((ceil != -1 && ceil <= 2050) || (ceil == -1 && i2 == 8 && i <= 23))) {
                legacyDevicePerformanceClass = 1;
            } else {
                legacyDevicePerformanceClass = 2;
            }
        }
        return legacyDevicePerformanceClass;
    }
}
