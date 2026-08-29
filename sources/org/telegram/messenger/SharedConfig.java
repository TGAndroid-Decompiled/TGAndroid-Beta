package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class SharedConfig {
    private static final int[] LOW_SOC;
    public static final int PASSCODE_TYPE_PASSWORD = 1;
    public static final int PASSCODE_TYPE_PIN = 0;
    public static final int PERFORMANCE_CLASS_AVERAGE = 1;
    public static final int PERFORMANCE_CLASS_HIGH = 2;
    public static final int PERFORMANCE_CLASS_LOW = 0;
    private static final int PROXY_CURRENT_SCHEMA_VERSION = 3;
    private static final int PROXY_SCHEMA_V2 = 2;
    private static final int PROXY_SCHEMA_V3 = 3;
    public static final int PROXY_TYPE_MTPROTO = 1;
    public static final int PROXY_TYPE_SOCKS5 = 0;
    public static final int PROXY_TYPE_WEB = 2;
    public static final int SAVE_TO_GALLERY_FLAG_CHANNELS = 4;
    public static final int SAVE_TO_GALLERY_FLAG_GROUP = 2;
    public static final int SAVE_TO_GALLERY_FLAG_PEER = 1;
    public static boolean adaptableColorInBrowser = false;
    public static boolean allowBigEmoji = false;
    static Boolean allowPreparingHevcPlayers = null;
    public static boolean allowScreenCapture = false;
    private static Boolean animationsEnabled = null;
    public static boolean appLocked = false;
    public static boolean archiveHidden = false;
    public static int autoLockIn = 0;
    public static int badPasscodeTries = 0;
    public static boolean bigCameraForRound = false;
    public static int bubbleRadius = 0;
    public static int callEncryptionHintDisplayedCount = 0;
    public static boolean chatBubbles = false;
    private static int chatSwipeAction = 0;
    private static boolean configLoaded = false;
    public static ProxyInfo currentProxy = null;
    public static int dayNightThemeSwitchHintCount = 0;
    public static int dayNightWallpaperSwitchHint = 0;
    public static boolean debugVideoQualities = false;
    public static boolean debugViewMetrics = false;
    public static boolean debugWebView = false;
    private static int devicePerformanceClass = 0;
    public static boolean directShare = false;
    public static String directShareHash = null;
    public static boolean disableVoiceAudioEffects = false;
    public static int distanceSystemType = 0;
    public static boolean dontAskManageStorage = false;
    public static boolean drawActionBarShadow = false;
    public static boolean drawDialogIcons = false;
    public static int emojiInteractionsHintCount = 0;
    public static int fastScrollHintCount = 0;
    public static boolean fastWallpaperDisabled = false;
    public static int fontSize = 0;
    public static boolean fontSizeIsDefault = false;
    public static boolean forceDisableTabletMode = false;
    public static boolean forceForumTabs = false;
    public static boolean forwardingOptionsHintShown = false;
    public static boolean frameMetricsEnabled = false;
    private static String goodHevcEncoder = null;
    public static boolean hasCameraCache = false;
    public static boolean hasEmailLogin = false;
    private static HashSet<String> hevcEncoderWhitelist = null;
    public static boolean inappCamera = false;
    public static boolean isFloatingDebugActive = false;
    public static boolean isWaitingForPasscodeEnter = false;
    public static int ivFontSize = 0;
    public static int keepMedia = 0;
    public static int lastKeepMediaCheckTime = 0;
    private static int lastLocalId = 0;
    public static int lastLogsCheckTime = 0;
    public static int lastPauseTime = 0;
    public static long lastUpdateCheckTime = 0;
    public static long lastUptimeMillis = 0;
    private static int legacyDevicePerformanceClass = -1;
    public static LiteMode liteMode;
    private static final Object localIdSync;
    public static int lockRecordAudioVideoHint;
    public static int mapPreviewType;
    public static int mediaColumnsCount;
    public static int messageSeenHintCount;
    public static boolean multipleReactionsPromoShowed;
    public static boolean nextMediaTap;
    public static boolean noSoundHintShowed;
    public static boolean noiseSupression;
    public static boolean onlyLocalInstantView;
    private static int overrideDevicePerformanceClass;
    public static String passcodeHash;
    public static long passcodeRetryInMs;
    public static byte[] passcodeSalt;
    public static int passcodeType;
    public static int passportConfigHash;
    private static String passportConfigJson;
    private static HashMap<String, String> passportConfigMap;
    public static boolean pauseMusicOnMedia;
    public static boolean pauseMusicOnRecord;
    public static boolean payByInvoice;
    public static TLRPC.TL_help_appUpdate pendingAppUpdate;
    public static int pendingAppUpdateBuildVersion;
    public static boolean photoHighQualityDefault;
    public static boolean photoLiveDefault;
    public static boolean photoViewerBlur;
    public static boolean playOrderReversed;
    public static ArrayList<ProxyInfo> proxyList;
    private static boolean proxyListLoaded;
    public static boolean proxyRotationEnabled;
    public static int proxyRotationTimeout;
    public static byte[] pushAuthKey;
    public static byte[] pushAuthKeyId;
    public static boolean pushStatSent;
    public static String pushString;
    public static long pushStringGetTimeEnd;
    public static long pushStringGetTimeStart;
    public static String pushStringStatus;
    public static int pushType;
    public static boolean raiseToListen;
    public static boolean raiseToSpeak;
    public static boolean readOnlyStorageDirAlertShowed;
    public static boolean recordViaSco;
    public static int repeatMode;
    public static boolean replyingOptionsHintShown;
    public static boolean roundCamera16to9;
    public static boolean saveIncomingPhotos;
    public static boolean saveStreamMedia;
    public static long scheduledHintSeenAt;
    public static int scheduledHintShows;
    public static long scheduledOrNoSoundHintSeenAt;
    public static int scheduledOrNoSoundHintShows;
    public static String searchEngineCustomURLAutocomplete;
    public static String searchEngineCustomURLQuery;
    public static int searchEngineType;
    public static boolean searchMessagesAsListUsed;
    public static boolean shadowsInSections;
    public static boolean showNotificationsForAllAccounts;
    public static boolean shuffleMusic;
    public static boolean sortContactsByName;
    public static boolean sortFilesByName;
    public static int stealthModeSendMessageConfirm;
    public static boolean stickersReorderingHintUsed;
    public static String storageCacheDir;
    public static int storiesColumnsCount;
    public static boolean storiesIntroShown;
    public static boolean storyReactionsLongPressHint;
    public static boolean streamAllVideo;
    public static boolean streamMedia;
    public static boolean streamMkv;
    public static boolean suggestAnimatedEmoji;
    public static int suggestStickers;
    private static final Object sync;
    public static int textSelectionHintShows;
    public static boolean updateStickersOrderOnSend;
    public static Boolean useCamera2Force;
    public static boolean useFaceLock;
    public static boolean useFingerprintLock;
    public static boolean useNewBlur;
    public static boolean useSurfaceInStories;
    public static boolean useSystemBoldFont;
    public static boolean useSystemEmoji;
    public static boolean useThreeLinesLayout;

    public static class BackgroundActivityPrefs {
        private static SharedPreferences prefs;

        public static int getDismissedCount() {
            return prefs.getInt("dismissed_count", 0);
        }

        public static long getLastCheckedBackgroundActivity() {
            return prefs.getLong("last_checked", 0L);
        }

        public static void increaseDismissedCount() {
            prefs.edit().putInt("dismissed_count", getDismissedCount() + 1).apply();
        }

        public static void setLastCheckedBackgroundActivity(long j10) {
            prefs.edit().putLong("last_checked", j10).apply();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PasscodeType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PerformanceClass {
    }

    static {
        boolean z10;
        HashSet<String> hashSet = new HashSet<>();
        hevcEncoderWhitelist = hashSet;
        hashSet.add("c2.exynos.hevc.encoder");
        hevcEncoderWhitelist.add("OMX.Exynos.HEVC.Encoder".toLowerCase());
        pushType = 2;
        pushString = "";
        pushStringStatus = "";
        passcodeHash = "";
        passcodeSalt = new byte[0];
        autoLockIn = 3600;
        useFingerprintLock = true;
        useFaceLock = true;
        keepMedia = CacheByChatsController.KEEP_MEDIA_ONE_MONTH;
        updateStickersOrderOnSend = true;
        photoViewerBlur = true;
        stealthModeSendMessageConfirm = 2;
        lastLocalId = -210000;
        passportConfigJson = "";
        sync = new Object();
        localIdSync = new Object();
        mapPreviewType = 2;
        searchEngineType = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        chatBubbles = z10;
        raiseToSpeak = false;
        raiseToListen = true;
        nextMediaTap = true;
        recordViaSco = false;
        adaptableColorInBrowser = true;
        onlyLocalInstantView = false;
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
        debugVideoQualities = false;
        fontSize = 16;
        bubbleRadius = 17;
        ivFontSize = 16;
        mediaColumnsCount = 3;
        storiesColumnsCount = 3;
        fastScrollHintCount = 3;
        LOW_SOC = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
        loadConfig();
        proxyList = new ArrayList<>();
        drawActionBarShadow = true;
    }

    public static ProxyInfo addProxy(ProxyInfo proxyInfo) {
        loadProxyList();
        int size = proxyList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ProxyInfo proxyInfo2 = proxyList.get(i10);
            if (proxyInfo.address.equals(proxyInfo2.address) && proxyInfo.port == proxyInfo2.port && proxyInfo.username.equals(proxyInfo2.username) && proxyInfo.password.equals(proxyInfo2.password) && proxyInfo.secret.equals(proxyInfo2.secret) && proxyInfo.type == proxyInfo2.type) {
                return proxyInfo2;
            }
        }
        proxyList.add(0, proxyInfo);
        saveProxyList();
        return proxyInfo;
    }

    public static boolean allowPreparingHevcPlayers() {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (allowPreparingHevcPlayers == null) {
            int codecCount = MediaCodecList.getCodecCount();
            int i10 = 0;
            for (int i11 = 0; i11 < codecCount; i11++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
                if (!codecInfoAt.isEncoder()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= codecInfoAt.getSupportedTypes().length) {
                            break;
                        } else if (codecInfoAt.getSupportedTypes()[i12].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances > i10) {
                                i10 = maxSupportedInstances;
                            }
                        } else {
                            i12++;
                        }
                    }
                }
            }
            if (i10 >= 8) {
                z10 = true;
            }
            allowPreparingHevcPlayers = Boolean.valueOf(z10);
        }
        return allowPreparingHevcPlayers.booleanValue();
    }

    public static boolean animationsEnabled() {
        if (animationsEnabled == null) {
            animationsEnabled = Boolean.valueOf(MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
        return animationsEnabled.booleanValue();
    }

    public static int buildVersion() {
        try {
            return ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            FileLog.e(e10);
            return 0;
        }
    }

    public static boolean canBlurChat() {
        int i10;
        int devicePerformanceClass2 = getDevicePerformanceClass();
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        if (devicePerformanceClass2 >= i10 || BuildVars.DEBUG_PRIVATE_VERSION) {
            return true;
        }
        return false;
    }

    public static boolean chatBlurEnabled() {
        if (canBlurChat() && LiteMode.isEnabled(256)) {
            return true;
        }
        return false;
    }

    public static void checkLogsToDelete() {
        if (BuildVars.LOGS_ENABLED) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(currentTimeMillis - lastLogsCheckTime) < 3600) {
                return;
            }
            lastLogsCheckTime = currentTimeMillis;
            Utilities.cacheClearQueue.postRunnable(new d6(currentTimeMillis, 5));
        }
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
                    return equals;
                } catch (Exception e10) {
                    FileLog.e(e10);
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
        } catch (Exception e11) {
            FileLog.e(e11);
            return false;
        }
    }

    public static void checkSaveToGalleryFiles() {
        Utilities.globalQueue.postRunnable(new w1(21));
    }

    public static void checkSdCard(File file) {
        if (file != null && storageCacheDir != null && !readOnlyStorageDirAlertShowed && file.getPath().startsWith(storageCacheDir)) {
            AndroidUtilities.runOnUIThread(new w1(20));
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
        useFingerprintLock = true;
        isWaitingForPasscodeEnter = false;
        allowScreenCapture = false;
        textSelectionHintShows = 0;
        scheduledOrNoSoundHintShows = 0;
        scheduledOrNoSoundHintSeenAt = 0L;
        scheduledHintShows = 0;
        scheduledHintSeenAt = 0L;
        lockRecordAudioVideoHint = 0;
        forwardingOptionsHintShown = false;
        replyingOptionsHintShown = false;
        messageSeenHintCount = 3;
        emojiInteractionsHintCount = 3;
        dayNightThemeSwitchHintCount = 3;
        stealthModeSendMessageConfirm = 2;
        dayNightWallpaperSwitchHint = 0;
        saveConfig();
    }

    public static void deleteProxy(ProxyInfo proxyInfo) {
        if (currentProxy == proxyInfo) {
            currentProxy = null;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedPreferences.Editor edit = globalMainSettings.edit();
            edit.putString("proxy_ip", "");
            edit.putString("proxy_pass", "");
            edit.putString("proxy_user", "");
            edit.putString("proxy_secret", "");
            edit.putInt("proxy_type", 0);
            edit.putInt("proxy_port", 1080);
            edit.putBoolean("proxy_enabled", false);
            edit.putBoolean("proxy_enabled_calls", false);
            edit.apply();
            if (z10) {
                ConnectionsManager.setProxySettings(false, "", 0, "", "", "");
            }
        }
        proxyList.remove(proxyInfo);
        saveProxyList();
    }

    public static boolean deviceIsAboveAverage() {
        if (getDevicePerformanceClass() >= 1) {
            return true;
        }
        return false;
    }

    public static boolean deviceIsAverage() {
        if (getDevicePerformanceClass() <= 1) {
            return true;
        }
        return false;
    }

    public static boolean deviceIsHigh() {
        if (getDevicePerformanceClass() >= 2) {
            return true;
        }
        return false;
    }

    public static boolean deviceIsLow() {
        if (getDevicePerformanceClass() == 0) {
            return true;
        }
        return false;
    }

    public static boolean enabledRaiseTo(boolean z10) {
        if (raiseToListen) {
            if (!z10 || raiseToSpeak) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String findGoodHevcEncoder() {
        if (goodHevcEncoder == null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt.isEncoder()) {
                    for (int i11 = 0; i11 < codecInfoAt.getSupportedTypes().length; i11++) {
                        if (codecInfoAt.getSupportedTypes()[i11].contains("video/hevc") && codecInfoAt.isHardwareAccelerated() && isWhitelisted(codecInfoAt)) {
                            String name = codecInfoAt.getName();
                            goodHevcEncoder = name;
                            return name;
                        }
                    }
                    continue;
                }
            }
            goodHevcEncoder = "";
        }
        if (TextUtils.isEmpty(goodHevcEncoder)) {
            return null;
        }
        return goodHevcEncoder;
    }

    public static void forwardingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        forwardingOptionsHintShown = true;
        edit.putBoolean("forwardingOptionsHintShown", true);
        edit.apply();
    }

    public static int getChatSwipeAction(int i10) {
        int i11 = chatSwipeAction;
        if (i11 >= 0) {
            if (i11 == 5 && MessagesController.getInstance(i10).dialogFilters.isEmpty()) {
                return 2;
            }
            return chatSwipeAction;
        } else if (MessagesController.getInstance(i10).dialogFilters.isEmpty()) {
            return 2;
        } else {
            return 5;
        }
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
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return passportConfigMap;
    }

    public static int getDevicePerformanceClass() {
        int i10 = overrideDevicePerformanceClass;
        if (i10 != -1) {
            return i10;
        }
        if (devicePerformanceClass == -1) {
            devicePerformanceClass = measureDevicePerformanceClass();
        }
        return devicePerformanceClass;
    }

    public static int getLastLocalId() {
        int i10;
        synchronized (localIdSync) {
            i10 = lastLocalId;
            lastLocalId = i10 - 1;
        }
        return i10;
    }

    @Deprecated
    public static int getLegacyDevicePerformanceClass() {
        int ceil;
        if (legacyDevicePerformanceClass == -1) {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                try {
                    Locale locale = Locale.ENGLISH;
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_max_freq", "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        i13 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                        i12++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            if (i12 == 0) {
                ceil = -1;
            } else {
                ceil = (int) Math.ceil(i13 / i12);
            }
            if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1600 || memoryClass > 128 || i10 > 21) && (i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24)))) {
                if (i11 >= 8 && memoryClass > 160 && ((ceil == -1 || ceil > 2050) && (ceil != -1 || i11 != 8 || i10 > 23))) {
                    legacyDevicePerformanceClass = 2;
                } else {
                    legacyDevicePerformanceClass = 1;
                }
            } else {
                legacyDevicePerformanceClass = 0;
            }
        }
        return legacyDevicePerformanceClass;
    }

    public static SharedPreferences getPreferences() {
        return ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
    }

    public static void increaseBadPasscodeTries() {
        int i10 = badPasscodeTries + 1;
        badPasscodeTries = i10;
        if (i10 >= 3) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                passcodeRetryInMs = 30000L;
                            } else {
                                passcodeRetryInMs = 25000L;
                            }
                        } else {
                            passcodeRetryInMs = 20000L;
                        }
                    } else {
                        passcodeRetryInMs = 15000L;
                    }
                } else {
                    passcodeRetryInMs = 10000L;
                }
            } else {
                passcodeRetryInMs = 5000L;
            }
            lastUptimeMillis = SystemClock.elapsedRealtime();
        }
        saveConfig();
    }

    public static void increaseDayNightWallpaperSiwtchHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i10 = dayNightWallpaperSwitchHint + 1;
        dayNightWallpaperSwitchHint = i10;
        edit.putInt("dayNightWallpaperSwitchHint", i10);
        edit.apply();
    }

    public static void increaseLockRecordAudioVideoHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i10 = lockRecordAudioVideoHint + 1;
        lockRecordAudioVideoHint = i10;
        edit.putInt("lockRecordAudioVideoHint", i10);
        edit.apply();
    }

    public static void increaseScheduledHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        scheduledHintSeenAt = System.currentTimeMillis();
        int i10 = scheduledHintShows + 1;
        scheduledHintShows = i10;
        edit.putInt("scheduledHintShows", i10);
        edit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
        edit.apply();
    }

    public static void increaseScheduledOrNoSoundHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        scheduledOrNoSoundHintSeenAt = System.currentTimeMillis();
        int i10 = scheduledOrNoSoundHintShows + 1;
        scheduledOrNoSoundHintShows = i10;
        edit.putInt("scheduledOrNoSoundHintShows", i10);
        edit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
        edit.apply();
    }

    public static void increaseTextSelectionHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        int i10 = textSelectionHintShows + 1;
        textSelectionHintShows = i10;
        edit.putInt("textSelectionHintShows", i10);
        edit.apply();
    }

    public static void incrementCallEncryptionHintDisplayed(int i10) {
        callEncryptionHintDisplayedCount += i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("callEncryptionHintDisplayedCount", callEncryptionHintDisplayedCount);
        edit.apply();
    }

    public static boolean isAppUpdateAvailable() {
        int buildVersion;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
        if (tL_help_appUpdate == null || tL_help_appUpdate.document == null || !ApplicationLoader.isStandaloneBuild()) {
            return false;
        }
        try {
            buildVersion = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            FileLog.e(e10);
            buildVersion = buildVersion();
        }
        if (pendingAppUpdateBuildVersion != buildVersion) {
            return false;
        }
        return true;
    }

    public static boolean isAutoplayGifs() {
        return LiteMode.isEnabled(2048);
    }

    public static boolean isAutoplayVideo() {
        return LiteMode.isEnabled(1024);
    }

    public static boolean isPassportConfigLoaded() {
        if (passportConfigMap != null) {
            return true;
        }
        return false;
    }

    public static boolean isProxyEnabled() {
        if (!MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) || currentProxy == null) {
            return false;
        }
        return true;
    }

    public static boolean isSecretMapPreviewSet() {
        return MessagesController.getGlobalMainSettings().contains("mapPreviewType");
    }

    public static boolean isUsingCamera2(int i10) {
        Boolean bool = useCamera2Force;
        if (bool == null) {
            if (!MessagesController.getInstance(i10).androidDisableRoundCamera2) {
                return true;
            }
            return false;
        }
        return bool.booleanValue();
    }

    private static boolean isWhitelisted(MediaCodecInfo mediaCodecInfo) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            return true;
        }
        return hevcEncoderWhitelist.contains(mediaCodecInfo.getName().toLowerCase());
    }

    public static void lambda$checkLogsToDelete$3(int i10) {
        File logsDir;
        long j10 = i10 - 864000;
        try {
            logsDir = AndroidUtilities.getLogsDir();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        if (logsDir == null) {
            return;
        }
        Utilities.clearDir(logsDir.getAbsolutePath(), 0, j10, false);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lastLogsCheckTime", lastLogsCheckTime);
        edit.apply();
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public static void lambda$checkSdCard$2() {
        org.telegram.ui.ActionBar.o2 R;
        if (!readOnlyStorageDirAlertShowed && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
            storageCacheDir = null;
            saveConfig();
            ImageLoader.getInstance().checkMediaPaths(new w1(19));
            readOnlyStorageDirAlertShowed = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.SdCardError);
            alertDialog$Builder.f22714a.O = LocaleController.getString(R.string.SdCardErrorDescription);
            alertDialog$Builder.k(LocaleController.getString(R.string.DoNotUseSDCard), new Object());
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.setCanceledOnTouchOutside(false);
            c2Var.show();
        }
    }

    public static int lambda$saveProxyList$4(ProxyInfo proxyInfo, ProxyInfo proxyInfo2) {
        long j10;
        ProxyInfo proxyInfo3 = currentProxy;
        long j11 = 0;
        if (proxyInfo3 == proxyInfo) {
            j10 = -200000;
        } else {
            j10 = 0;
        }
        if (!proxyInfo.available) {
            j10 += 100000;
        }
        if (proxyInfo3 == proxyInfo2) {
            j11 = -200000;
        }
        if (!proxyInfo2.available) {
            j11 += 100000;
        }
        return Long.compare(proxyInfo.ping + j10, proxyInfo2.ping + j11);
    }

    public static void loadConfig() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SharedConfig.loadConfig():void");
    }

    private static void loadDebugConfig(SharedPreferences sharedPreferences) {
        drawActionBarShadow = sharedPreferences.getBoolean("drawActionBarShadow", true);
    }

    public static void loadProxyList() {
        if (!proxyListLoaded) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            String string2 = sharedPreferences.getString("proxy_user", "");
            String string3 = sharedPreferences.getString("proxy_pass", "");
            String string4 = sharedPreferences.getString("proxy_secret", "");
            int i10 = sharedPreferences.getInt("proxy_port", 1080);
            int i11 = sharedPreferences.getInt("proxy_type", !TextUtils.isEmpty(string4) ? 1 : 0);
            proxyListLoaded = true;
            proxyList.clear();
            currentProxy = null;
            String string5 = sharedPreferences.getString("proxy_list", null);
            if (!TextUtils.isEmpty(string5)) {
                SerializedData serializedData = new SerializedData(Base64.decode(string5, 0));
                int readInt32 = serializedData.readInt32(false);
                if (readInt32 == -1) {
                    byte readByte = serializedData.readByte(false);
                    if (readByte != 2 && readByte != 3) {
                        FileLog.e("Unknown proxy schema version: " + ((int) readByte));
                    } else {
                        int readInt322 = serializedData.readInt32(false);
                        for (int i12 = 0; i12 < readInt322; i12++) {
                            ProxyInfo proxyInfo = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                            proxyInfo.ping = serializedData.readInt64(false);
                            proxyInfo.availableCheckTime = serializedData.readInt64(false);
                            if (readByte >= 3) {
                                proxyInfo.type = serializedData.readInt32(false);
                            }
                            proxyList.add(0, proxyInfo);
                            if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo.address) && i10 == proxyInfo.port && string2.equals(proxyInfo.username) && string3.equals(proxyInfo.password) && i11 == proxyInfo.type) {
                                currentProxy = proxyInfo;
                            }
                        }
                    }
                } else {
                    for (int i13 = 0; i13 < readInt32; i13++) {
                        ProxyInfo proxyInfo2 = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                        proxyList.add(0, proxyInfo2);
                        if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo2.address) && i10 == proxyInfo2.port && string2.equals(proxyInfo2.username) && string3.equals(proxyInfo2.password) && i11 == proxyInfo2.type) {
                            currentProxy = proxyInfo2;
                        }
                    }
                }
                serializedData.cleanup();
            }
            if (currentProxy == null && !TextUtils.isEmpty(string)) {
                ProxyInfo proxyInfo3 = new ProxyInfo(string, i10, string2, string3, string4, i11);
                currentProxy = proxyInfo3;
                proxyList.add(0, proxyInfo3);
            }
        }
    }

    public static boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    public static int measureDevicePerformanceClass() {
        int ceil;
        long j10;
        String d;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (d = b.d()) != null) {
            int hashCode = d.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = LOW_SOC;
                if (i13 >= iArr.length) {
                    break;
                } else if (iArr[i13] == hashCode) {
                    return 0;
                } else {
                    i13++;
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i16 + "/cpufreq/cpuinfo_max_freq", "r");
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    i15 += Utilities.parseInt((CharSequence) readLine).intValue() / 1000;
                    i14++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        if (i14 == 0) {
            ceil = -1;
        } else {
            ceil = (int) Math.ceil(i15 / i14);
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && ((i11 > 4 || ceil > 1600 || memoryClass > 128 || i10 > 21) && ((i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24) && (j10 == -1 || j10 >= 2147483648L))))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055) || (ceil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder o10 = com.google.android.recaptcha.internal.a.o("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            j7.l1.w(o10, ceil, ", memoryClass = ", memoryClass, ", android version ");
            o10.append(i10);
            o10.append(", manufacture ");
            o10.append(Build.MANUFACTURER);
            o10.append(", screenRefreshRate=");
            o10.append(AndroidUtilities.screenRefreshRate);
            o10.append(", screenMaxRefreshRate=");
            o10.append(AndroidUtilities.screenMaxRefreshRate);
            o10.append(")");
            FileLog.d(o10.toString());
        }
        return i12;
    }

    public static void overrideDevicePerformanceClass(int i10) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        overrideDevicePerformanceClass = i10;
        edit.putInt("overrideDevicePerformanceClass", i10).remove("lite_mode").apply();
        if (liteMode != null) {
            LiteMode.loadPreference();
        }
    }

    public static String performanceClassName(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return "UNKNOWN";
                }
                return "HIGH";
            }
            return "AVERAGE";
        }
        return "LOW";
    }

    public static void removeLockRecordAudioVideoHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
    }

    public static void removeScheduledHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledHintShows", 3);
        edit.apply();
    }

    public static void removeScheduledOrNoSoundHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
    }

    public static void removeTextSelectionHint() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public static void replyingOptionsHintHintShowed() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        replyingOptionsHintShown = true;
        edit.putBoolean("replyingOptionsHintShown", true);
        edit.apply();
    }

    public static void saveConfig() {
        String str;
        String str2;
        String str3;
        synchronized (sync) {
            try {
                try {
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0).edit();
                    edit.putBoolean("saveIncomingPhotos", saveIncomingPhotos);
                    edit.putString("passcodeHash1", passcodeHash);
                    byte[] bArr = passcodeSalt;
                    if (bArr.length > 0) {
                        str = Base64.encodeToString(bArr, 0);
                    } else {
                        str = "";
                    }
                    edit.putString("passcodeSalt", str);
                    edit.putBoolean("appLocked", appLocked);
                    edit.putInt("passcodeType", passcodeType);
                    edit.putLong("passcodeRetryInMs", passcodeRetryInMs);
                    edit.putLong("lastUptimeMillis", lastUptimeMillis);
                    edit.putInt("badPasscodeTries", badPasscodeTries);
                    edit.putInt("autoLockIn", autoLockIn);
                    edit.putInt("lastPauseTime", lastPauseTime);
                    edit.putBoolean("useFingerprint", useFingerprintLock);
                    edit.putBoolean("allowScreenCapture", allowScreenCapture);
                    edit.putString("pushString2", pushString);
                    edit.putInt("pushType", pushType);
                    edit.putBoolean("pushStatSent", pushStatSent);
                    byte[] bArr2 = pushAuthKey;
                    if (bArr2 != null) {
                        str2 = Base64.encodeToString(bArr2, 0);
                    } else {
                        str2 = "";
                    }
                    edit.putString("pushAuthKey", str2);
                    edit.putInt("lastLocalId", lastLocalId);
                    edit.putString("passportConfigJson", passportConfigJson);
                    edit.putInt("passportConfigHash", passportConfigHash);
                    edit.putBoolean("sortContactsByName", sortContactsByName);
                    edit.putBoolean("sortFilesByName", sortFilesByName);
                    edit.putInt("textSelectionHintShows", textSelectionHintShows);
                    edit.putInt("scheduledOrNoSoundHintShows", scheduledOrNoSoundHintShows);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
                    edit.putInt("scheduledHintShows", scheduledHintShows);
                    edit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
                    edit.putBoolean("forwardingOptionsHintShown", forwardingOptionsHintShown);
                    edit.putBoolean("replyingOptionsHintShown", replyingOptionsHintShown);
                    edit.putInt("lockRecordAudioVideoHint", lockRecordAudioVideoHint);
                    if (!TextUtils.isEmpty(storageCacheDir)) {
                        str3 = storageCacheDir;
                    } else {
                        str3 = "";
                    }
                    edit.putString("storageCacheDir", str3);
                    edit.putBoolean("proxyRotationEnabled", proxyRotationEnabled);
                    edit.putInt("proxyRotationTimeout", proxyRotationTimeout);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void saveDebugConfig() {
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", drawActionBarShadow);
    }

    public static void saveProxyList() {
        ArrayList arrayList = new ArrayList(proxyList);
        Collections.sort(arrayList, new zh(3));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(3);
        int size = arrayList.size();
        serializedData.writeInt32(size);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            ProxyInfo proxyInfo = (ProxyInfo) arrayList.get(i10);
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
            serializedData.writeInt32(proxyInfo.type);
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
        serializedData.cleanup();
    }

    public static void setAnimationsEnabled(boolean z10) {
        animationsEnabled = Boolean.valueOf(z10);
    }

    public static void setDistanceSystemType(int i10) {
        distanceSystemType = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("distanceSystemType", distanceSystemType);
        edit.apply();
        LocaleController.resetImperialSystemType();
    }

    public static void setDontAskManageStorage(boolean z10) {
        dontAskManageStorage = z10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("dontAskManageStorage", dontAskManageStorage).apply();
    }

    public static void setFastScrollHintCount(int i10) {
        if (fastScrollHintCount != i10) {
            fastScrollHintCount = i10;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", fastScrollHintCount).apply();
        }
    }

    public static void setKeepMedia(int i10) {
        keepMedia = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("keep_media", keepMedia);
        edit.apply();
    }

    public static void setMediaColumnsCount(int i10) {
        if (mediaColumnsCount != i10) {
            mediaColumnsCount = i10;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", mediaColumnsCount).apply();
        }
    }

    public static void setMultipleReactionsPromoShowed(boolean z10) {
        multipleReactionsPromoShowed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("multipleReactionsPromoShowed", multipleReactionsPromoShowed);
        edit.apply();
    }

    public static boolean setNewAppVersionAvailable(org.telegram.tgnet.TLRPC.TL_help_appUpdate r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SharedConfig.setNewAppVersionAvailable(org.telegram.tgnet.TLRPC$TL_help_appUpdate):boolean");
    }

    public static void setNoSoundHintShowed(boolean z10) {
        if (noSoundHintShowed == z10) {
            return;
        }
        noSoundHintShowed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noSoundHintShowed", noSoundHintShowed);
        edit.apply();
    }

    public static void setPassportConfig(String str, int i10) {
        passportConfigMap = null;
        passportConfigJson = str;
        passportConfigHash = i10;
        saveConfig();
        getCountryLangs();
    }

    public static void setPlaybackOrderType(int i10) {
        if (i10 == 2) {
            shuffleMusic = true;
            playOrderReversed = false;
        } else if (i10 == 1) {
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
        edit.apply();
    }

    public static void setRepeatMode(int i10) {
        repeatMode = i10;
        if (i10 < 0 || i10 > 2) {
            repeatMode = 0;
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("repeatMode", repeatMode);
        edit.apply();
    }

    public static void setSearchEngineType(int i10) {
        searchEngineType = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("searchEngineType", searchEngineType);
        edit.apply();
    }

    public static void setSearchMessagesAsListUsed(boolean z10) {
        searchMessagesAsListUsed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("searchMessagesAsListUsed", searchMessagesAsListUsed);
        edit.apply();
    }

    public static void setSecretMapPreviewType(int i10) {
        mapPreviewType = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("mapPreviewType", mapPreviewType);
        edit.apply();
    }

    public static void setStickersReorderingHintUsed(boolean z10) {
        stickersReorderingHintUsed = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("stickersReorderingHintUsed", stickersReorderingHintUsed);
        edit.apply();
    }

    public static void setStoriesColumnsCount(int i10) {
        if (storiesColumnsCount != i10) {
            storiesColumnsCount = i10;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", storiesColumnsCount).apply();
        }
    }

    public static void setStoriesIntroShown(boolean z10) {
        storiesIntroShown = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("storiesIntroShown", storiesIntroShown);
        edit.apply();
    }

    public static void setStoriesReactionsLongPressHintUsed(boolean z10) {
        storyReactionsLongPressHint = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("storyReactionsLongPressHint", storyReactionsLongPressHint);
        edit.apply();
    }

    public static void setSuggestStickers(int i10) {
        suggestStickers = i10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("suggestStickers", suggestStickers);
        edit.apply();
    }

    public static void setUseThreeLinesLayout(boolean z10) {
        useThreeLinesLayout = z10;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useThreeLinesLayout", useThreeLinesLayout);
        edit.apply();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public static void toggleArchiveHidden() {
        archiveHidden = !archiveHidden;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("archiveHidden", archiveHidden);
        edit.apply();
    }

    public static void toggleAutoplayGifs() {
        LiteMode.toggleFlag(2048);
    }

    public static void toggleAutoplayVideo() {
        LiteMode.toggleFlag(1024);
    }

    public static void toggleBigEmoji() {
        allowBigEmoji = !allowBigEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("allowBigEmoji", allowBigEmoji);
        edit.apply();
    }

    public static void toggleBrowserAdaptableColors() {
        adaptableColorInBrowser = !adaptableColorInBrowser;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("adaptableBrowser", adaptableColorInBrowser);
        edit.apply();
    }

    public static void toggleChatBlur() {
        LiteMode.toggleFlag(256);
    }

    public static void toggleDebugVideoQualities() {
        debugVideoQualities = !debugVideoQualities;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugVideoQualities", debugVideoQualities);
        edit.apply();
    }

    public static void toggleDebugWebView() {
        debugWebView = !debugWebView;
        WebView.setWebContentsDebuggingEnabled(debugWebView);
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("debugWebView", debugWebView);
        edit.apply();
    }

    public static void toggleDirectShare() {
        directShare = !directShare;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("direct_share", directShare);
        edit.apply();
        g0.f.n(ApplicationLoader.applicationContext);
        MediaDataController.getInstance(UserConfig.selectedAccount).buildShortcuts();
    }

    public static void toggleDisableVoiceAudioEffects() {
        disableVoiceAudioEffects = !disableVoiceAudioEffects;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("disableVoiceAudioEffects", disableVoiceAudioEffects);
        edit.apply();
    }

    public static void toggleFastWallpaperDisabled() {
        fastWallpaperDisabled = !fastWallpaperDisabled;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("fastWallpaperDisabled", fastWallpaperDisabled);
        edit.apply();
    }

    public static void toggleForceDisableTabletMode() {
        forceDisableTabletMode = !forceDisableTabletMode;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceDisableTabletMode", forceDisableTabletMode);
        edit.apply();
    }

    public static void toggleForceForumTabs() {
        forceForumTabs = !forceForumTabs;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("forceForumTabs", forceForumTabs);
        edit.apply();
    }

    public static void toggleFrameMetricsEnabled() {
        frameMetricsEnabled = !frameMetricsEnabled;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("frameMetricsEnabled", frameMetricsEnabled);
        edit.apply();
    }

    public static void toggleInappCamera() {
        inappCamera = !inappCamera;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("inappCamera", inappCamera);
        edit.apply();
    }

    public static void toggleLocalInstantView() {
        onlyLocalInstantView = !onlyLocalInstantView;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("onlyLocalInstantView", onlyLocalInstantView);
        edit.apply();
    }

    public static void toggleLoopStickers() {
        LiteMode.toggleFlag(2);
    }

    public static void toggleNextMediaTap() {
        nextMediaTap = !nextMediaTap;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("next_media_on_tap", nextMediaTap);
        edit.apply();
    }

    public static void toggleNoiseSupression() {
        noiseSupression = !noiseSupression;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("noiseSupression", noiseSupression);
        edit.apply();
    }

    public static void togglePauseMusicOnMedia() {
        pauseMusicOnMedia = !pauseMusicOnMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnMedia", pauseMusicOnMedia);
        edit.apply();
    }

    public static void togglePauseMusicOnRecord() {
        pauseMusicOnRecord = !pauseMusicOnRecord;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("pauseMusicOnRecord", pauseMusicOnRecord);
        edit.apply();
    }

    public static void togglePaymentByInvoice() {
        payByInvoice = !payByInvoice;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("payByInvoice", payByInvoice).apply();
    }

    public static void togglePhotoViewerBlur() {
        photoViewerBlur = !photoViewerBlur;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoViewerBlur", photoViewerBlur).apply();
    }

    public static void toggleRaiseToListen() {
        raiseToListen = !raiseToListen;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_listen", raiseToListen);
        edit.apply();
    }

    public static void toggleRaiseToSpeak() {
        raiseToSpeak = !raiseToSpeak;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("raise_to_speak", raiseToSpeak);
        edit.apply();
    }

    public static void toggleRoundCamera() {
        bigCameraForRound = !bigCameraForRound;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", bigCameraForRound).apply();
    }

    public static void toggleRoundCamera16to9() {
        roundCamera16to9 = !roundCamera16to9;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("roundCamera16to9", roundCamera16to9);
        edit.apply();
    }

    public static void toggleSaveStreamMedia() {
        saveStreamMedia = !saveStreamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("saveStreamMedia", saveStreamMedia);
        edit.apply();
    }

    public static void toggleSortContactsByName() {
        sortContactsByName = !sortContactsByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortContactsByName", sortContactsByName);
        edit.apply();
    }

    public static void toggleSortFilesByName() {
        sortFilesByName = !sortFilesByName;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("sortFilesByName", sortFilesByName);
        edit.apply();
    }

    public static void toggleStreamAllVideo() {
        streamAllVideo = !streamAllVideo;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamAllVideo", streamAllVideo);
        edit.apply();
    }

    public static void toggleStreamMedia() {
        streamMedia = !streamMedia;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMedia", streamMedia);
        edit.apply();
    }

    public static void toggleStreamMkv() {
        streamMkv = !streamMkv;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("streamMkv", streamMkv);
        edit.apply();
    }

    public static void toggleSuggestAnimatedEmoji() {
        suggestAnimatedEmoji = !suggestAnimatedEmoji;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("suggestAnimatedEmoji", suggestAnimatedEmoji);
        edit.apply();
    }

    public static void toggleSurfaceInStories() {
        useSurfaceInStories = !useSurfaceInStories;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", useSurfaceInStories).apply();
    }

    public static void toggleUpdateStickersOrderOnSend() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        boolean z10 = !updateStickersOrderOnSend;
        updateStickersOrderOnSend = z10;
        edit.putBoolean("updateStickersOrderOnSend", z10);
        edit.apply();
    }

    public static void toggleUseCamera2(int i10) {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !isUsingCamera2(i10);
        useCamera2Force = Boolean.valueOf(z10);
        edit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void toggleUseNewBlur() {
        useNewBlur = !useNewBlur;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", useNewBlur).apply();
    }

    public static void toggleUseSystemBoldFont() {
        useSystemBoldFont = !useSystemBoldFont;
        AndroidUtilities.mediumTypeface = null;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("useSystemBoldFont", useSystemBoldFont);
        edit.apply();
    }

    public static void updateChatListSwipeSetting(int i10) {
        chatSwipeAction = i10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", chatSwipeAction).apply();
    }

    public static void updateDayNightThemeSwitchHintCount(int i10) {
        dayNightThemeSwitchHintCount = i10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", dayNightThemeSwitchHintCount).apply();
    }

    public static void updateEmojiInteractionsHintCount(int i10) {
        emojiInteractionsHintCount = i10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("emojiInteractionsHintCount", emojiInteractionsHintCount).apply();
    }

    public static void updateMessageSeenHintCount(int i10) {
        messageSeenHintCount = i10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("messageSeenCount", messageSeenHintCount).apply();
    }

    public static void updateStealthModeSendMessageConfirm(int i10) {
        stealthModeSendMessageConfirm = i10;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("stealthModeSendMessageConfirm", stealthModeSendMessageConfirm).apply();
    }

    public static void updateTabletConfig() {
        int i10;
        if (fontSizeIsDefault) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isFold()) {
                i10 = 18;
            } else {
                i10 = 16;
            }
            int i11 = sharedPreferences.getInt("fons_size", i10);
            fontSize = i11;
            ivFontSize = sharedPreferences.getInt("iv_font_size", i11);
        }
    }

    public static boolean versionBiggerOrEqual(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i10 = 0; i10 < Math.min(split.length, split2.length); i10++) {
            int parseInt = Integer.parseInt(split[i10]);
            int parseInt2 = Integer.parseInt(split2[i10]);
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
        }
        return true;
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
        public int type;
        public String username;

        public ProxyInfo(String str, int i10, String str2, String str3, String str4) {
            this(str, i10, str2, str3, str4, !TextUtils.isEmpty(str4) ? 1 : 0);
        }

        public String getLink() {
            String str;
            if (this.type == 2) {
                return "";
            }
            if (!TextUtils.isEmpty(this.secret)) {
                str = "https://t.me/proxy?";
            } else {
                str = "https://t.me/socks?";
            }
            StringBuilder sb2 = new StringBuilder(str);
            try {
                sb2.append("server=");
                sb2.append(URLEncoder.encode(this.address, "UTF-8"));
                sb2.append("&");
                sb2.append("port=");
                sb2.append(this.port);
                if (!TextUtils.isEmpty(this.username)) {
                    sb2.append("&user=");
                    sb2.append(URLEncoder.encode(this.username, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.password)) {
                    sb2.append("&pass=");
                    sb2.append(URLEncoder.encode(this.password, "UTF-8"));
                }
                if (!TextUtils.isEmpty(this.secret)) {
                    sb2.append("&secret=");
                    sb2.append(URLEncoder.encode(this.secret, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return sb2.toString();
        }

        public ProxyInfo(String str, int i10, String str2, String str3, String str4, int i11) {
            this.address = str;
            this.port = i10;
            this.username = str2;
            this.password = str3;
            this.secret = str4;
            this.type = i11;
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
    }

    public static void lambda$checkSdCard$0() {
    }

    public static void lambda$checkSdCard$1(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
