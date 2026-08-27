package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
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
    private static final int PROXY_CURRENT_SCHEMA_VERSION = 2;
    private static final int PROXY_SCHEMA_V2 = 2;
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

        public ProxyInfo(String str, int i10, String str2, String str3, String str4) {
            this.address = str;
            this.port = i10;
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
            StringBuilder sb2 = new StringBuilder(!TextUtils.isEmpty(this.secret) ? "https://t.me/proxy?" : "https://t.me/socks?");
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
    }

    static {
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
        chatBubbles = Build.VERSION.SDK_INT >= 30;
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
            if (proxyInfo.address.equals(proxyInfo2.address) && proxyInfo.port == proxyInfo2.port && proxyInfo.username.equals(proxyInfo2.username) && proxyInfo.password.equals(proxyInfo2.password) && proxyInfo.secret.equals(proxyInfo2.secret)) {
                return proxyInfo2;
            }
        }
        proxyList.add(0, proxyInfo);
        saveProxyList();
        return proxyInfo;
    }

    public static boolean allowPreparingHevcPlayers() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (allowPreparingHevcPlayers == null) {
            int codecCount = MediaCodecList.getCodecCount();
            int i10 = 0;
            for (int i11 = 0; i11 < codecCount; i11++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
                if (!codecInfoAt.isEncoder()) {
                    for (int i12 = 0; i12 < codecInfoAt.getSupportedTypes().length; i12++) {
                        if (codecInfoAt.getSupportedTypes()[i12].contains("video/hevc")) {
                            int maxSupportedInstances = codecInfoAt.getCapabilitiesForType("video/hevc").getMaxSupportedInstances();
                            if (maxSupportedInstances <= i10) {
                                break;
                            }
                            i10 = maxSupportedInstances;
                            break;
                        }
                    }
                }
            }
            allowPreparingHevcPlayers = Boolean.valueOf(i10 >= 8);
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
        } catch (Exception e9) {
            FileLog.e(e9);
            return 0;
        }
    }

    public static boolean canBlurChat() {
        return getDevicePerformanceClass() >= (Build.VERSION.SDK_INT >= 31 ? 1 : 2) || BuildVars.DEBUG_PRIVATE_VERSION;
    }

    public static boolean chatBlurEnabled() {
        return canBlurChat() && LiteMode.isEnabled(256);
    }

    public static void checkLogsToDelete() {
        if (BuildVars.LOGS_ENABLED) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (Math.abs(iCurrentTimeMillis - lastLogsCheckTime) < 3600) {
                return;
            }
            lastLogsCheckTime = iCurrentTimeMillis;
            Utilities.cacheClearQueue.postRunnable(new nh.k2(iCurrentTimeMillis, 6));
        }
    }

    public static boolean checkPasscode(String str) {
        if (passcodeSalt.length != 0) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(passcodeSalt, 0, bArr, bytes.length + 16, 16);
                return passcodeHash.equals(Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length)));
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        }
        boolean zEquals = Utilities.MD5(str).equals(passcodeHash);
        if (zEquals) {
            try {
                passcodeSalt = new byte[16];
                Utilities.random.nextBytes(passcodeSalt);
                byte[] bytes2 = str.getBytes("UTF-8");
                int length2 = bytes2.length + 32;
                byte[] bArr2 = new byte[length2];
                System.arraycopy(passcodeSalt, 0, bArr2, 0, 16);
                System.arraycopy(bytes2, 0, bArr2, 16, bytes2.length);
                System.arraycopy(passcodeSalt, 0, bArr2, bytes2.length + 16, 16);
                passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr2, 0, length2));
                saveConfig();
                return zEquals;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return zEquals;
    }

    public static void checkSaveToGalleryFiles() {
        Utilities.globalQueue.postRunnable(new w1(21));
    }

    public static void checkSdCard(File file) {
        if (file == null || storageCacheDir == null || readOnlyStorageDirAlertShowed || !file.getPath().startsWith(storageCacheDir)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new w1(20));
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
            SharedPreferences.Editor editorEdit = globalMainSettings.edit();
            editorEdit.putString("proxy_ip", "");
            editorEdit.putString("proxy_pass", "");
            editorEdit.putString("proxy_user", "");
            editorEdit.putString("proxy_secret", "");
            editorEdit.putInt("proxy_port", 1080);
            editorEdit.putBoolean("proxy_enabled", false);
            editorEdit.putBoolean("proxy_enabled_calls", false);
            editorEdit.apply();
            if (z10) {
                ConnectionsManager.setProxySettings(false, "", 0, "", "", "");
            }
        }
        proxyList.remove(proxyInfo);
        saveProxyList();
    }

    public static boolean deviceIsAboveAverage() {
        return getDevicePerformanceClass() >= 1;
    }

    public static boolean deviceIsAverage() {
        return getDevicePerformanceClass() <= 1;
    }

    public static boolean deviceIsHigh() {
        return getDevicePerformanceClass() >= 2;
    }

    public static boolean deviceIsLow() {
        return getDevicePerformanceClass() == 0;
    }

    public static boolean enabledRaiseTo(boolean z10) {
        if (raiseToListen) {
            return !z10 || raiseToSpeak;
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
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        forwardingOptionsHintShown = true;
        editorEdit.putBoolean("forwardingOptionsHintShown", true);
        editorEdit.apply();
    }

    public static int getChatSwipeAction(int i10) {
        int i11 = chatSwipeAction;
        if (i11 < 0) {
            return !MessagesController.getInstance(i10).dialogFilters.isEmpty() ? 5 : 2;
        }
        if (i11 == 5 && MessagesController.getInstance(i10).dialogFilters.isEmpty()) {
            return 2;
        }
        return chatSwipeAction;
    }

    public static HashMap<String, String> getCountryLangs() {
        if (passportConfigMap == null) {
            passportConfigMap = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(passportConfigJson);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    passportConfigMap.put(next.toUpperCase(), jSONObject.getString(next).toUpperCase());
                }
            } catch (Throwable th) {
                FileLog.e(th);
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
        if (legacyDevicePerformanceClass == -1) {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            int i12 = 0;
            int iIntValue = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                try {
                    Locale locale = Locale.ENGLISH;
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq", "r");
                    String line = randomAccessFile.readLine();
                    if (line != null) {
                        iIntValue += Utilities.parseInt((CharSequence) line).intValue() / 1000;
                        i12++;
                    }
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
            int iCeil = i12 == 0 ? -1 : (int) Math.ceil(iIntValue / i12);
            if (i11 <= 2 || memoryClass <= 100 || ((i11 <= 4 && iCeil != -1 && iCeil <= 1250) || ((i11 <= 4 && iCeil <= 1600 && memoryClass <= 128 && i10 <= 21) || (i11 <= 4 && iCeil <= 1300 && memoryClass <= 128 && i10 <= 24)))) {
                legacyDevicePerformanceClass = 0;
            } else if (i11 < 8 || memoryClass <= 160 || ((iCeil != -1 && iCeil <= 2050) || (iCeil == -1 && i11 == 8 && i10 <= 23))) {
                legacyDevicePerformanceClass = 1;
            } else {
                legacyDevicePerformanceClass = 2;
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
            if (i10 == 3) {
                passcodeRetryInMs = 5000L;
            } else if (i10 == 4) {
                passcodeRetryInMs = 10000L;
            } else if (i10 == 5) {
                passcodeRetryInMs = 15000L;
            } else if (i10 == 6) {
                passcodeRetryInMs = 20000L;
            } else if (i10 != 7) {
                passcodeRetryInMs = 30000L;
            } else {
                passcodeRetryInMs = 25000L;
            }
            lastUptimeMillis = SystemClock.elapsedRealtime();
        }
        saveConfig();
    }

    public static void increaseDayNightWallpaperSiwtchHint() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        int i10 = dayNightWallpaperSwitchHint + 1;
        dayNightWallpaperSwitchHint = i10;
        editorEdit.putInt("dayNightWallpaperSwitchHint", i10);
        editorEdit.apply();
    }

    public static void increaseLockRecordAudioVideoHintShowed() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        int i10 = lockRecordAudioVideoHint + 1;
        lockRecordAudioVideoHint = i10;
        editorEdit.putInt("lockRecordAudioVideoHint", i10);
        editorEdit.apply();
    }

    public static void increaseScheduledHintShowed() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        scheduledHintSeenAt = System.currentTimeMillis();
        int i10 = scheduledHintShows + 1;
        scheduledHintShows = i10;
        editorEdit.putInt("scheduledHintShows", i10);
        editorEdit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
        editorEdit.apply();
    }

    public static void increaseScheduledOrNoSoundHintShowed() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        scheduledOrNoSoundHintSeenAt = System.currentTimeMillis();
        int i10 = scheduledOrNoSoundHintShows + 1;
        scheduledOrNoSoundHintShows = i10;
        editorEdit.putInt("scheduledOrNoSoundHintShows", i10);
        editorEdit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
        editorEdit.apply();
    }

    public static void increaseTextSelectionHintShowed() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        int i10 = textSelectionHintShows + 1;
        textSelectionHintShows = i10;
        editorEdit.putInt("textSelectionHintShows", i10);
        editorEdit.apply();
    }

    public static void incrementCallEncryptionHintDisplayed(int i10) {
        callEncryptionHintDisplayedCount += i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("callEncryptionHintDisplayedCount", callEncryptionHintDisplayedCount);
        editorEdit.apply();
    }

    public static boolean isAppUpdateAvailable() {
        int iBuildVersion;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
        if (tL_help_appUpdate == null || tL_help_appUpdate.document == null || !ApplicationLoader.isStandaloneBuild()) {
            return false;
        }
        try {
            iBuildVersion = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode;
        } catch (Exception e9) {
            FileLog.e(e9);
            iBuildVersion = buildVersion();
        }
        return pendingAppUpdateBuildVersion == iBuildVersion;
    }

    public static boolean isAutoplayGifs() {
        return LiteMode.isEnabled(2048);
    }

    public static boolean isAutoplayVideo() {
        return LiteMode.isEnabled(1024);
    }

    public static boolean isPassportConfigLoaded() {
        return passportConfigMap != null;
    }

    public static boolean isProxyEnabled() {
        return MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && currentProxy != null;
    }

    public static boolean isSecretMapPreviewSet() {
        return MessagesController.getGlobalMainSettings().contains("mapPreviewType");
    }

    public static boolean isUsingCamera2(int i10) {
        Boolean bool = useCamera2Force;
        if (bool == null) {
            return !MessagesController.getInstance(i10).androidDisableRoundCamera2;
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
        long j10 = i10 - 864000;
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return;
            } else {
                Utilities.clearDir(logsDir.getAbsolutePath(), 0, j10, false);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("lastLogsCheckTime", lastLogsCheckTime);
        editorEdit.apply();
    }

    public static void lambda$checkSaveToGalleryFiles$5() {
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Telegram");
            File file2 = new File(file, "Telegram Images");
            file2.mkdir();
            File file3 = new File(file, "Telegram Video");
            file3.mkdir();
            if (BuildVars.NO_SCOPED_STORAGE) {
                if (file2.isDirectory()) {
                    AndroidUtilities.createEmptyFile(new File(file2, ".nomedia"));
                }
                if (file3.isDirectory()) {
                    AndroidUtilities.createEmptyFile(new File(file3, ".nomedia"));
                    return;
                }
                return;
            }
            if (file2.isDirectory()) {
                new File(file2, ".nomedia").delete();
            }
            if (file3.isDirectory()) {
                new File(file3, ".nomedia").delete();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void lambda$checkSdCard$2() {
        org.telegram.ui.ActionBar.n2 n2VarR;
        if (readOnlyStorageDirAlertShowed || (n2VarR = LaunchActivity.R()) == null || n2VarR.getParentActivity() == null) {
            return;
        }
        storageCacheDir = null;
        saveConfig();
        ImageLoader.getInstance().checkMediaPaths(new w1(19));
        readOnlyStorageDirAlertShowed = true;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SdCardError);
        alertDialog$Builder.f22702a.O = LocaleController.getString(R.string.SdCardErrorDescription);
        alertDialog$Builder.k(LocaleController.getString(R.string.DoNotUseSDCard), new vg());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.setCanceledOnTouchOutside(false);
        b2Var.show();
    }

    public static int lambda$saveProxyList$4(ProxyInfo proxyInfo, ProxyInfo proxyInfo2) {
        ProxyInfo proxyInfo3 = currentProxy;
        long j10 = proxyInfo3 == proxyInfo ? -200000L : 0L;
        if (!proxyInfo.available) {
            j10 += 100000;
        }
        long j11 = proxyInfo3 == proxyInfo2 ? -200000L : 0L;
        if (!proxyInfo2.available) {
            j11 += 100000;
        }
        return Long.compare(proxyInfo.ping + j10, proxyInfo2.ping + j11);
    }

    public static void loadConfig() {
        int iBuildVersion;
        String str;
        String str2;
        synchronized (sync) {
            try {
                if (!configLoaded && ApplicationLoader.applicationContext != null) {
                    SharedPreferences unused = BackgroundActivityPrefs.prefs = ApplicationLoader.applicationContext.getSharedPreferences("background_activity", 0);
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0);
                    saveIncomingPhotos = sharedPreferences.getBoolean("saveIncomingPhotos", false);
                    passcodeHash = sharedPreferences.getString("passcodeHash1", "");
                    appLocked = sharedPreferences.getBoolean("appLocked", false);
                    passcodeType = sharedPreferences.getInt("passcodeType", 0);
                    passcodeRetryInMs = sharedPreferences.getLong("passcodeRetryInMs", 0L);
                    lastUptimeMillis = sharedPreferences.getLong("lastUptimeMillis", 0L);
                    badPasscodeTries = sharedPreferences.getInt("badPasscodeTries", 0);
                    autoLockIn = sharedPreferences.getInt("autoLockIn", 3600);
                    lastPauseTime = sharedPreferences.getInt("lastPauseTime", 0);
                    useFingerprintLock = sharedPreferences.getBoolean("useFingerprint", true);
                    allowScreenCapture = sharedPreferences.getBoolean("allowScreenCapture", false);
                    lastLocalId = sharedPreferences.getInt("lastLocalId", -210000);
                    pushString = sharedPreferences.getString("pushString2", "");
                    pushType = sharedPreferences.getInt("pushType", 2);
                    pushStatSent = sharedPreferences.getBoolean("pushStatSent", false);
                    passportConfigJson = sharedPreferences.getString("passportConfigJson", "");
                    passportConfigHash = sharedPreferences.getInt("passportConfigHash", 0);
                    Boolean boolValueOf = null;
                    storageCacheDir = sharedPreferences.getString("storageCacheDir", null);
                    proxyRotationEnabled = sharedPreferences.getBoolean("proxyRotationEnabled", false);
                    proxyRotationTimeout = sharedPreferences.getInt("proxyRotationTimeout", 1);
                    String string = sharedPreferences.getString("pushAuthKey", null);
                    if (!TextUtils.isEmpty(string)) {
                        pushAuthKey = Base64.decode(string, 0);
                    }
                    if (passcodeHash.length() > 0 && lastPauseTime == 0) {
                        lastPauseTime = (int) ((SystemClock.elapsedRealtime() / 1000) - 600);
                    }
                    String string2 = sharedPreferences.getString("passcodeSalt", "");
                    if (string2.length() > 0) {
                        passcodeSalt = Base64.decode(string2, 0);
                    } else {
                        passcodeSalt = new byte[0];
                    }
                    lastUpdateCheckTime = sharedPreferences.getLong("appUpdateCheckTime", System.currentTimeMillis());
                    try {
                        String string3 = sharedPreferences.getString("appUpdate", null);
                        if (string3 != null) {
                            pendingAppUpdateBuildVersion = sharedPreferences.getInt("appUpdateBuild", buildVersion());
                            byte[] bArrDecode = Base64.decode(string3, 0);
                            if (bArrDecode != null) {
                                SerializedData serializedData = new SerializedData(bArrDecode);
                                pendingAppUpdate = (TLRPC.TL_help_appUpdate) TLRPC.help_AppUpdate.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                serializedData.cleanup();
                            }
                        }
                        if (pendingAppUpdate != null) {
                            try {
                                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                                iBuildVersion = packageInfo.versionCode;
                                try {
                                    str = packageInfo.versionName;
                                } catch (Exception e9) {
                                    e = e9;
                                    FileLog.e(e);
                                    str = null;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                iBuildVersion = 0;
                            }
                            if (iBuildVersion == 0) {
                                iBuildVersion = buildVersion();
                            }
                            if (str == null) {
                                str = BuildVars.BUILD_VERSION_STRING;
                            }
                            if (pendingAppUpdateBuildVersion != iBuildVersion || (str2 = pendingAppUpdate.version) == null || str.compareTo(str2) >= 0 || BuildVars.DEBUG_PRIVATE_VERSION) {
                                pendingAppUpdate = null;
                                AndroidUtilities.runOnUIThread(new w1(18));
                            }
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    SaveToGallerySettingsHelper.load(sharedPreferences2);
                    mapPreviewType = sharedPreferences2.getInt("mapPreviewType", 2);
                    searchEngineType = sharedPreferences2.getInt("searchEngineType", 0);
                    raiseToListen = sharedPreferences2.getBoolean("raise_to_listen", true);
                    raiseToSpeak = sharedPreferences2.getBoolean("raise_to_speak", false);
                    nextMediaTap = sharedPreferences2.getBoolean("next_media_on_tap", true);
                    recordViaSco = sharedPreferences2.getBoolean("record_via_sco", false);
                    adaptableColorInBrowser = sharedPreferences2.getBoolean("adaptableBrowser", false);
                    onlyLocalInstantView = sharedPreferences2.getBoolean("onlyLocalInstantView", BuildVars.DEBUG_PRIVATE_VERSION);
                    directShare = sharedPreferences2.getBoolean("direct_share", true);
                    boolean z10 = sharedPreferences2.getBoolean("shuffleMusic", false);
                    shuffleMusic = z10;
                    playOrderReversed = !z10 && sharedPreferences2.getBoolean("playOrderReversed", false);
                    inappCamera = sharedPreferences2.getBoolean("inappCamera", true);
                    hasCameraCache = sharedPreferences2.contains("cameraCache");
                    roundCamera16to9 = true;
                    repeatMode = sharedPreferences2.getInt("repeatMode", 0);
                    fontSize = sharedPreferences2.getInt("fons_size", (!AndroidUtilities.isTablet() || AndroidUtilities.isFold()) ? 16 : 18);
                    fontSizeIsDefault = !sharedPreferences2.contains("fons_size");
                    bubbleRadius = sharedPreferences2.getInt("bubbleRadius", 17);
                    ivFontSize = sharedPreferences2.getInt("iv_font_size", fontSize);
                    allowBigEmoji = sharedPreferences2.getBoolean("allowBigEmoji", true);
                    useSystemEmoji = sharedPreferences2.getBoolean("useSystemEmoji", false);
                    useSystemBoldFont = sharedPreferences2.getBoolean("useSystemBoldFont", false);
                    forceForumTabs = sharedPreferences2.getBoolean("forceForumTabs", false);
                    fastWallpaperDisabled = sharedPreferences2.getBoolean("fastWallpaperDisabled", false);
                    frameMetricsEnabled = sharedPreferences2.getBoolean("frameMetricsEnabled", false);
                    if (useSystemBoldFont) {
                        AndroidUtilities.mediumTypeface = null;
                    }
                    streamMedia = sharedPreferences2.getBoolean("streamMedia", true);
                    saveStreamMedia = sharedPreferences2.getBoolean("saveStreamMedia", true);
                    pauseMusicOnRecord = sharedPreferences2.getBoolean("pauseMusicOnRecord", true);
                    pauseMusicOnMedia = sharedPreferences2.getBoolean("pauseMusicOnMedia", false);
                    forceDisableTabletMode = sharedPreferences2.getBoolean("forceDisableTabletMode", false);
                    streamAllVideo = sharedPreferences2.getBoolean("streamAllVideo", BuildVars.DEBUG_VERSION);
                    streamMkv = sharedPreferences2.getBoolean("streamMkv", false);
                    suggestStickers = sharedPreferences2.getInt("suggestStickers", 0);
                    suggestAnimatedEmoji = sharedPreferences2.getBoolean("suggestAnimatedEmoji", true);
                    overrideDevicePerformanceClass = sharedPreferences2.getInt("overrideDevicePerformanceClass", -1);
                    devicePerformanceClass = sharedPreferences2.getInt("devicePerformanceClass", -1);
                    sortContactsByName = sharedPreferences2.getBoolean("sortContactsByName", false);
                    sortFilesByName = sharedPreferences2.getBoolean("sortFilesByName", false);
                    noSoundHintShowed = sharedPreferences2.getBoolean("noSoundHintShowed", false);
                    directShareHash = sharedPreferences2.getString("directShareHash2", null);
                    useThreeLinesLayout = sharedPreferences2.getBoolean("useThreeLinesLayout", false);
                    archiveHidden = sharedPreferences2.getBoolean("archiveHidden", false);
                    distanceSystemType = sharedPreferences2.getInt("distanceSystemType", 0);
                    keepMedia = sharedPreferences2.getInt("keep_media", CacheByChatsController.KEEP_MEDIA_ONE_MONTH);
                    debugWebView = sharedPreferences2.getBoolean("debugWebView", false);
                    lastKeepMediaCheckTime = sharedPreferences2.getInt("lastKeepMediaCheckTime", 0);
                    lastLogsCheckTime = sharedPreferences2.getInt("lastLogsCheckTime", 0);
                    searchMessagesAsListUsed = sharedPreferences2.getBoolean("searchMessagesAsListUsed", false);
                    stickersReorderingHintUsed = sharedPreferences2.getBoolean("stickersReorderingHintUsed", false);
                    storyReactionsLongPressHint = sharedPreferences2.getBoolean("storyReactionsLongPressHint", false);
                    storiesIntroShown = sharedPreferences2.getBoolean("storiesIntroShown", false);
                    textSelectionHintShows = sharedPreferences2.getInt("textSelectionHintShows", 0);
                    scheduledOrNoSoundHintShows = sharedPreferences2.getInt("scheduledOrNoSoundHintShows", 0);
                    scheduledOrNoSoundHintSeenAt = sharedPreferences2.getLong("scheduledOrNoSoundHintSeenAt", 0L);
                    scheduledHintShows = sharedPreferences2.getInt("scheduledHintShows", 0);
                    scheduledHintSeenAt = sharedPreferences2.getLong("scheduledHintSeenAt", 0L);
                    forwardingOptionsHintShown = sharedPreferences2.getBoolean("forwardingOptionsHintShown", false);
                    replyingOptionsHintShown = sharedPreferences2.getBoolean("replyingOptionsHintShown", false);
                    lockRecordAudioVideoHint = sharedPreferences2.getInt("lockRecordAudioVideoHint", 0);
                    disableVoiceAudioEffects = sharedPreferences2.getBoolean("disableVoiceAudioEffects", false);
                    noiseSupression = sharedPreferences2.getBoolean("noiseSupression", false);
                    chatSwipeAction = sharedPreferences2.getInt("ChatSwipeAction", -1);
                    messageSeenHintCount = sharedPreferences2.getInt("messageSeenCount", 3);
                    emojiInteractionsHintCount = sharedPreferences2.getInt("emojiInteractionsHintCount", 3);
                    dayNightThemeSwitchHintCount = sharedPreferences2.getInt("dayNightThemeSwitchHintCount", 3);
                    stealthModeSendMessageConfirm = sharedPreferences2.getInt("stealthModeSendMessageConfirm", 2);
                    mediaColumnsCount = sharedPreferences2.getInt("mediaColumnsCount", 3);
                    storiesColumnsCount = sharedPreferences2.getInt("storiesColumnsCount", 3);
                    fastScrollHintCount = sharedPreferences2.getInt("fastScrollHintCount", 3);
                    dontAskManageStorage = sharedPreferences2.getBoolean("dontAskManageStorage", false);
                    hasEmailLogin = sharedPreferences2.getBoolean("hasEmailLogin", false);
                    isFloatingDebugActive = sharedPreferences2.getBoolean("floatingDebugActive", false);
                    updateStickersOrderOnSend = sharedPreferences2.getBoolean("updateStickersOrderOnSend", true);
                    dayNightWallpaperSwitchHint = sharedPreferences2.getInt("dayNightWallpaperSwitchHint", 0);
                    bigCameraForRound = sharedPreferences2.getBoolean("bigCameraForRound", false);
                    useNewBlur = sharedPreferences2.getBoolean("useNewBlur", true);
                    if (sharedPreferences2.contains("useCamera2Force_2")) {
                        boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("useCamera2Force_2", false));
                    }
                    useCamera2Force = boolValueOf;
                    useSurfaceInStories = sharedPreferences2.getBoolean("useSurfaceInStories", Build.VERSION.SDK_INT >= 30);
                    payByInvoice = sharedPreferences2.getBoolean("payByInvoice", false);
                    photoViewerBlur = sharedPreferences2.getBoolean("photoViewerBlur", true);
                    multipleReactionsPromoShowed = sharedPreferences2.getBoolean("multipleReactionsPromoShowed", false);
                    callEncryptionHintDisplayedCount = sharedPreferences2.getInt("callEncryptionHintDisplayedCount", 0);
                    debugVideoQualities = sharedPreferences2.getBoolean("debugVideoQualities", false);
                    shadowsInSections = sharedPreferences2.getBoolean("shadowsInSections", false);
                    debugViewMetrics = sharedPreferences2.getBoolean("debugViewMetrics", false);
                    photoHighQualityDefault = sharedPreferences2.getBoolean("photoHighQualityDefault", false);
                    photoLiveDefault = sharedPreferences2.getBoolean("photoLiveDefault", false);
                    loadDebugConfig(sharedPreferences2);
                    showNotificationsForAllAccounts = ApplicationLoader.applicationContext.getSharedPreferences("Notifications", 0).getBoolean("AllAccounts", true);
                    configLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void loadDebugConfig(SharedPreferences sharedPreferences) {
        drawActionBarShadow = sharedPreferences.getBoolean("drawActionBarShadow", true);
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
        int i10 = sharedPreferences.getInt("proxy_port", 1080);
        proxyListLoaded = true;
        proxyList.clear();
        currentProxy = null;
        String string5 = sharedPreferences.getString("proxy_list", null);
        if (!TextUtils.isEmpty(string5)) {
            SerializedData serializedData = new SerializedData(Base64.decode(string5, 0));
            int int32 = serializedData.readInt32(false);
            if (int32 == -1) {
                byte b10 = serializedData.readByte(false);
                if (b10 == 2) {
                    int int33 = serializedData.readInt32(false);
                    for (int i11 = 0; i11 < int33; i11++) {
                        ProxyInfo proxyInfo = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                        proxyInfo.ping = serializedData.readInt64(false);
                        proxyInfo.availableCheckTime = serializedData.readInt64(false);
                        proxyList.add(0, proxyInfo);
                        if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo.address) && i10 == proxyInfo.port && string2.equals(proxyInfo.username) && string3.equals(proxyInfo.password)) {
                            currentProxy = proxyInfo;
                        }
                    }
                } else {
                    FileLog.e("Unknown proxy schema version: " + ((int) b10));
                }
            } else {
                for (int i12 = 0; i12 < int32; i12++) {
                    ProxyInfo proxyInfo2 = new ProxyInfo(serializedData.readString(false), serializedData.readInt32(false), serializedData.readString(false), serializedData.readString(false), serializedData.readString(false));
                    proxyList.add(0, proxyInfo2);
                    if (currentProxy == null && !TextUtils.isEmpty(string) && string.equals(proxyInfo2.address) && i10 == proxyInfo2.port && string2.equals(proxyInfo2.username) && string3.equals(proxyInfo2.password)) {
                        currentProxy = proxyInfo2;
                    }
                }
            }
            serializedData.cleanup();
        }
        if (currentProxy != null || TextUtils.isEmpty(string)) {
            return;
        }
        ProxyInfo proxyInfo3 = new ProxyInfo(string, i10, string2, string3, string4);
        currentProxy = proxyInfo3;
        proxyList.add(0, proxyInfo3);
    }

    public static boolean loopStickers() {
        return LiteMode.isEnabled(2);
    }

    public static int measureDevicePerformanceClass() {
        long j10;
        String str;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = ConnectionsManager.CPU_COUNT;
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        int i12 = 0;
        if (i10 >= 31 && (str = Build.SOC_MODEL) != null) {
            int iHashCode = str.toUpperCase().hashCode();
            int i13 = 0;
            while (true) {
                int[] iArr = LOW_SOC;
                if (i13 >= iArr.length) {
                    break;
                }
                if (iArr[i13] == iHashCode) {
                    return 0;
                }
                i13++;
            }
        }
        int i14 = 0;
        int iIntValue = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            try {
                Locale locale = Locale.ENGLISH;
                RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_max_freq", "r");
                String line = randomAccessFile.readLine();
                if (line != null) {
                    iIntValue += Utilities.parseInt((CharSequence) line).intValue() / 1000;
                    i14++;
                }
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
        int iCeil = i14 == 0 ? -1 : (int) Math.ceil(iIntValue / i14);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        } catch (Exception unused2) {
            j10 = -1;
        }
        if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || iCeil == -1 || iCeil > 1250) && ((i11 > 4 || iCeil > 1600 || memoryClass > 128 || i10 > 21) && ((i11 > 4 || iCeil > 1300 || memoryClass > 128 || i10 > 24) && (j10 == -1 || j10 >= 2147483648L))))) {
            i12 = (i11 < 8 || memoryClass <= 160 || (iCeil != -1 && iCeil <= 2055) || (iCeil == -1 && i11 == 8 && i10 <= 23)) ? 1 : 2;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sbP = com.google.android.recaptcha.internal.a.p("device performance info selected_class = ", i12, " (cpu_count = ", i11, ", freq = ");
            i0.a.x(sbP, iCeil, ", memoryClass = ", memoryClass, ", android version ");
            sbP.append(i10);
            sbP.append(", manufacture ");
            sbP.append(Build.MANUFACTURER);
            sbP.append(", screenRefreshRate=");
            sbP.append(AndroidUtilities.screenRefreshRate);
            sbP.append(", screenMaxRefreshRate=");
            sbP.append(AndroidUtilities.screenMaxRefreshRate);
            sbP.append(")");
            FileLog.d(sbP.toString());
        }
        return i12;
    }

    public static void overrideDevicePerformanceClass(int i10) {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        overrideDevicePerformanceClass = i10;
        editorEdit.putInt("overrideDevicePerformanceClass", i10).remove("lite_mode").apply();
        if (liteMode != null) {
            LiteMode.loadPreference();
        }
    }

    public static String performanceClassName(int i10) {
        if (i10 == 0) {
            return "LOW";
        }
        if (i10 != 1) {
            return i10 != 2 ? "UNKNOWN" : "HIGH";
        }
        return "AVERAGE";
    }

    public static void removeLockRecordAudioVideoHint() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("lockRecordAudioVideoHint", 3);
        editorEdit.apply();
    }

    public static void removeScheduledHint() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("scheduledHintShows", 3);
        editorEdit.apply();
    }

    public static void removeScheduledOrNoSoundHint() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("scheduledOrNoSoundHintShows", 3);
        editorEdit.apply();
    }

    public static void removeTextSelectionHint() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("textSelectionHintShows", 3);
        editorEdit.apply();
    }

    public static void replyingOptionsHintHintShowed() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        replyingOptionsHintShown = true;
        editorEdit.putBoolean("replyingOptionsHintShown", true);
        editorEdit.apply();
    }

    public static void saveConfig() {
        synchronized (sync) {
            try {
                try {
                    SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("userconfing", 0).edit();
                    editorEdit.putBoolean("saveIncomingPhotos", saveIncomingPhotos);
                    editorEdit.putString("passcodeHash1", passcodeHash);
                    byte[] bArr = passcodeSalt;
                    editorEdit.putString("passcodeSalt", bArr.length > 0 ? Base64.encodeToString(bArr, 0) : "");
                    editorEdit.putBoolean("appLocked", appLocked);
                    editorEdit.putInt("passcodeType", passcodeType);
                    editorEdit.putLong("passcodeRetryInMs", passcodeRetryInMs);
                    editorEdit.putLong("lastUptimeMillis", lastUptimeMillis);
                    editorEdit.putInt("badPasscodeTries", badPasscodeTries);
                    editorEdit.putInt("autoLockIn", autoLockIn);
                    editorEdit.putInt("lastPauseTime", lastPauseTime);
                    editorEdit.putBoolean("useFingerprint", useFingerprintLock);
                    editorEdit.putBoolean("allowScreenCapture", allowScreenCapture);
                    editorEdit.putString("pushString2", pushString);
                    editorEdit.putInt("pushType", pushType);
                    editorEdit.putBoolean("pushStatSent", pushStatSent);
                    byte[] bArr2 = pushAuthKey;
                    editorEdit.putString("pushAuthKey", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                    editorEdit.putInt("lastLocalId", lastLocalId);
                    editorEdit.putString("passportConfigJson", passportConfigJson);
                    editorEdit.putInt("passportConfigHash", passportConfigHash);
                    editorEdit.putBoolean("sortContactsByName", sortContactsByName);
                    editorEdit.putBoolean("sortFilesByName", sortFilesByName);
                    editorEdit.putInt("textSelectionHintShows", textSelectionHintShows);
                    editorEdit.putInt("scheduledOrNoSoundHintShows", scheduledOrNoSoundHintShows);
                    editorEdit.putLong("scheduledOrNoSoundHintSeenAt", scheduledOrNoSoundHintSeenAt);
                    editorEdit.putInt("scheduledHintShows", scheduledHintShows);
                    editorEdit.putLong("scheduledHintSeenAt", scheduledHintSeenAt);
                    editorEdit.putBoolean("forwardingOptionsHintShown", forwardingOptionsHintShown);
                    editorEdit.putBoolean("replyingOptionsHintShown", replyingOptionsHintShown);
                    editorEdit.putInt("lockRecordAudioVideoHint", lockRecordAudioVideoHint);
                    editorEdit.putString("storageCacheDir", !TextUtils.isEmpty(storageCacheDir) ? storageCacheDir : "");
                    editorEdit.putBoolean("proxyRotationEnabled", proxyRotationEnabled);
                    editorEdit.putInt("proxyRotationTimeout", proxyRotationTimeout);
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = pendingAppUpdate;
                    if (tL_help_appUpdate != null) {
                        try {
                            SerializedData serializedData = new SerializedData(tL_help_appUpdate.getObjectSize());
                            pendingAppUpdate.serializeToStream(serializedData);
                            editorEdit.putString("appUpdate", Base64.encodeToString(serializedData.toByteArray(), 0));
                            editorEdit.putInt("appUpdateBuild", pendingAppUpdateBuildVersion);
                            serializedData.cleanup();
                        } catch (Exception unused) {
                        }
                    } else {
                        editorEdit.remove("appUpdate");
                    }
                    editorEdit.putLong("appUpdateCheckTime", lastUpdateCheckTime);
                    editorEdit.apply();
                    SharedPreferences.Editor editorEdit2 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    editorEdit2.putBoolean("hasEmailLogin", hasEmailLogin);
                    editorEdit2.putBoolean("floatingDebugActive", isFloatingDebugActive);
                    editorEdit2.putBoolean("record_via_sco", recordViaSco);
                    editorEdit2.apply();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void saveDebugConfig() {
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", drawActionBarShadow);
    }

    public static void saveProxyList() {
        ArrayList arrayList = new ArrayList(proxyList);
        Collections.sort(arrayList, new wh(3));
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(-1);
        serializedData.writeByte(2);
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
        }
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putString("proxy_list", Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
        serializedData.cleanup();
    }

    public static void setAnimationsEnabled(boolean z10) {
        animationsEnabled = Boolean.valueOf(z10);
    }

    public static void setDistanceSystemType(int i10) {
        distanceSystemType = i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("distanceSystemType", distanceSystemType);
        editorEdit.apply();
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
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("keep_media", keepMedia);
        editorEdit.apply();
    }

    public static void setMediaColumnsCount(int i10) {
        if (mediaColumnsCount != i10) {
            mediaColumnsCount = i10;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("mediaColumnsCount", mediaColumnsCount).apply();
        }
    }

    public static void setMultipleReactionsPromoShowed(boolean z10) {
        multipleReactionsPromoShowed = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("multipleReactionsPromoShowed", multipleReactionsPromoShowed);
        editorEdit.apply();
    }

    public static boolean setNewAppVersionAvailable(TLRPC.TL_help_appUpdate tL_help_appUpdate) {
        int iBuildVersion;
        String str;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            iBuildVersion = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
                str = null;
            }
        } catch (Exception e10) {
            e = e10;
            iBuildVersion = 0;
        }
        if (iBuildVersion == 0) {
            iBuildVersion = buildVersion();
        }
        if (str == null) {
            str = BuildVars.BUILD_VERSION_STRING;
        }
        String str2 = tL_help_appUpdate.version;
        if (str2 == null || versionBiggerOrEqual(str, str2)) {
            return false;
        }
        pendingAppUpdate = tL_help_appUpdate;
        pendingAppUpdateBuildVersion = iBuildVersion;
        saveConfig();
        return true;
    }

    public static void setNoSoundHintShowed(boolean z10) {
        if (noSoundHintShowed == z10) {
            return;
        }
        noSoundHintShowed = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("noSoundHintShowed", noSoundHintShowed);
        editorEdit.apply();
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
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("shuffleMusic", shuffleMusic);
        editorEdit.putBoolean("playOrderReversed", playOrderReversed);
        editorEdit.apply();
    }

    public static void setRepeatMode(int i10) {
        repeatMode = i10;
        if (i10 < 0 || i10 > 2) {
            repeatMode = 0;
        }
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("repeatMode", repeatMode);
        editorEdit.apply();
    }

    public static void setSearchEngineType(int i10) {
        searchEngineType = i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("searchEngineType", searchEngineType);
        editorEdit.apply();
    }

    public static void setSearchMessagesAsListUsed(boolean z10) {
        searchMessagesAsListUsed = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("searchMessagesAsListUsed", searchMessagesAsListUsed);
        editorEdit.apply();
    }

    public static void setSecretMapPreviewType(int i10) {
        mapPreviewType = i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("mapPreviewType", mapPreviewType);
        editorEdit.apply();
    }

    public static void setStickersReorderingHintUsed(boolean z10) {
        stickersReorderingHintUsed = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("stickersReorderingHintUsed", stickersReorderingHintUsed);
        editorEdit.apply();
    }

    public static void setStoriesColumnsCount(int i10) {
        if (storiesColumnsCount != i10) {
            storiesColumnsCount = i10;
            ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putInt("storiesColumnsCount", storiesColumnsCount).apply();
        }
    }

    public static void setStoriesIntroShown(boolean z10) {
        storiesIntroShown = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("storiesIntroShown", storiesIntroShown);
        editorEdit.apply();
    }

    public static void setStoriesReactionsLongPressHintUsed(boolean z10) {
        storyReactionsLongPressHint = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("storyReactionsLongPressHint", storyReactionsLongPressHint);
        editorEdit.apply();
    }

    public static void setSuggestStickers(int i10) {
        suggestStickers = i10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("suggestStickers", suggestStickers);
        editorEdit.apply();
    }

    public static void setUseThreeLinesLayout(boolean z10) {
        useThreeLinesLayout = z10;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("useThreeLinesLayout", useThreeLinesLayout);
        editorEdit.apply();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, Boolean.TRUE);
    }

    public static void toggleArchiveHidden() {
        archiveHidden = !archiveHidden;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("archiveHidden", archiveHidden);
        editorEdit.apply();
    }

    public static void toggleAutoplayGifs() {
        LiteMode.toggleFlag(2048);
    }

    public static void toggleAutoplayVideo() {
        LiteMode.toggleFlag(1024);
    }

    public static void toggleBigEmoji() {
        allowBigEmoji = !allowBigEmoji;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("allowBigEmoji", allowBigEmoji);
        editorEdit.apply();
    }

    public static void toggleBrowserAdaptableColors() {
        adaptableColorInBrowser = !adaptableColorInBrowser;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("adaptableBrowser", adaptableColorInBrowser);
        editorEdit.apply();
    }

    public static void toggleChatBlur() {
        LiteMode.toggleFlag(256);
    }

    public static void toggleDebugVideoQualities() {
        debugVideoQualities = !debugVideoQualities;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("debugVideoQualities", debugVideoQualities);
        editorEdit.apply();
    }

    public static void toggleDebugWebView() {
        debugWebView = !debugWebView;
        WebView.setWebContentsDebuggingEnabled(debugWebView);
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("debugWebView", debugWebView);
        editorEdit.apply();
    }

    public static void toggleDirectShare() {
        directShare = !directShare;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("direct_share", directShare);
        editorEdit.apply();
        g0.f.n(ApplicationLoader.applicationContext);
        MediaDataController.getInstance(UserConfig.selectedAccount).buildShortcuts();
    }

    public static void toggleDisableVoiceAudioEffects() {
        disableVoiceAudioEffects = !disableVoiceAudioEffects;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("disableVoiceAudioEffects", disableVoiceAudioEffects);
        editorEdit.apply();
    }

    public static void toggleFastWallpaperDisabled() {
        fastWallpaperDisabled = !fastWallpaperDisabled;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("fastWallpaperDisabled", fastWallpaperDisabled);
        editorEdit.apply();
    }

    public static void toggleForceDisableTabletMode() {
        forceDisableTabletMode = !forceDisableTabletMode;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("forceDisableTabletMode", forceDisableTabletMode);
        editorEdit.apply();
    }

    public static void toggleForceForumTabs() {
        forceForumTabs = !forceForumTabs;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("forceForumTabs", forceForumTabs);
        editorEdit.apply();
    }

    public static void toggleFrameMetricsEnabled() {
        frameMetricsEnabled = !frameMetricsEnabled;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("frameMetricsEnabled", frameMetricsEnabled);
        editorEdit.apply();
    }

    public static void toggleInappCamera() {
        inappCamera = !inappCamera;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("inappCamera", inappCamera);
        editorEdit.apply();
    }

    public static void toggleLocalInstantView() {
        onlyLocalInstantView = !onlyLocalInstantView;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("onlyLocalInstantView", onlyLocalInstantView);
        editorEdit.apply();
    }

    public static void toggleLoopStickers() {
        LiteMode.toggleFlag(2);
    }

    public static void toggleNextMediaTap() {
        nextMediaTap = !nextMediaTap;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("next_media_on_tap", nextMediaTap);
        editorEdit.apply();
    }

    public static void toggleNoiseSupression() {
        noiseSupression = !noiseSupression;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("noiseSupression", noiseSupression);
        editorEdit.apply();
    }

    public static void togglePauseMusicOnMedia() {
        pauseMusicOnMedia = !pauseMusicOnMedia;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("pauseMusicOnMedia", pauseMusicOnMedia);
        editorEdit.apply();
    }

    public static void togglePauseMusicOnRecord() {
        pauseMusicOnRecord = !pauseMusicOnRecord;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("pauseMusicOnRecord", pauseMusicOnRecord);
        editorEdit.apply();
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
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("raise_to_listen", raiseToListen);
        editorEdit.apply();
    }

    public static void toggleRaiseToSpeak() {
        raiseToSpeak = !raiseToSpeak;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("raise_to_speak", raiseToSpeak);
        editorEdit.apply();
    }

    public static void toggleRoundCamera() {
        bigCameraForRound = !bigCameraForRound;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("bigCameraForRound", bigCameraForRound).apply();
    }

    public static void toggleRoundCamera16to9() {
        roundCamera16to9 = !roundCamera16to9;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("roundCamera16to9", roundCamera16to9);
        editorEdit.apply();
    }

    public static void toggleSaveStreamMedia() {
        saveStreamMedia = !saveStreamMedia;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("saveStreamMedia", saveStreamMedia);
        editorEdit.apply();
    }

    public static void toggleSortContactsByName() {
        sortContactsByName = !sortContactsByName;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("sortContactsByName", sortContactsByName);
        editorEdit.apply();
    }

    public static void toggleSortFilesByName() {
        sortFilesByName = !sortFilesByName;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("sortFilesByName", sortFilesByName);
        editorEdit.apply();
    }

    public static void toggleStreamAllVideo() {
        streamAllVideo = !streamAllVideo;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("streamAllVideo", streamAllVideo);
        editorEdit.apply();
    }

    public static void toggleStreamMedia() {
        streamMedia = !streamMedia;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("streamMedia", streamMedia);
        editorEdit.apply();
    }

    public static void toggleStreamMkv() {
        streamMkv = !streamMkv;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("streamMkv", streamMkv);
        editorEdit.apply();
    }

    public static void toggleSuggestAnimatedEmoji() {
        suggestAnimatedEmoji = !suggestAnimatedEmoji;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("suggestAnimatedEmoji", suggestAnimatedEmoji);
        editorEdit.apply();
    }

    public static void toggleSurfaceInStories() {
        useSurfaceInStories = !useSurfaceInStories;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useSurfaceInStories", useSurfaceInStories).apply();
    }

    public static void toggleUpdateStickersOrderOnSend() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        boolean z10 = !updateStickersOrderOnSend;
        updateStickersOrderOnSend = z10;
        editorEdit.putBoolean("updateStickersOrderOnSend", z10);
        editorEdit.apply();
    }

    public static void toggleUseCamera2(int i10) {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
        boolean z10 = !isUsingCamera2(i10);
        useCamera2Force = Boolean.valueOf(z10);
        editorEdit.putBoolean("useCamera2Force_2", z10).apply();
    }

    public static void toggleUseNewBlur() {
        useNewBlur = !useNewBlur;
        ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("useNewBlur", useNewBlur).apply();
    }

    public static void toggleUseSystemBoldFont() {
        useSystemBoldFont = !useSystemBoldFont;
        AndroidUtilities.mediumTypeface = null;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("useSystemBoldFont", useSystemBoldFont);
        editorEdit.apply();
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
        if (fontSizeIsDefault) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            int i10 = sharedPreferences.getInt("fons_size", (!AndroidUtilities.isTablet() || AndroidUtilities.isFold()) ? 16 : 18);
            fontSize = i10;
            ivFontSize = sharedPreferences.getInt("iv_font_size", i10);
        }
    }

    public static boolean versionBiggerOrEqual(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        for (int i10 = 0; i10 < Math.min(strArrSplit.length, strArrSplit2.length); i10++) {
            int i11 = Integer.parseInt(strArrSplit[i10]);
            int i12 = Integer.parseInt(strArrSplit2[i10]);
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static void lambda$checkSdCard$0() {
    }

    public static void lambda$checkSdCard$1(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
