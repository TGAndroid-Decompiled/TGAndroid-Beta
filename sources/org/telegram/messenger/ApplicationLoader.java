package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.o70;
import org.telegram.ui.IUpdateLayout;
import org.telegram.ui.ab0;
public class ApplicationLoader extends Application {
    public static volatile Context applicationContext = null;
    public static volatile Handler applicationHandler = null;
    private static volatile boolean applicationInited = false;
    public static ApplicationLoader applicationLoaderInstance = null;
    public static boolean canDrawOverlays = false;
    private static ConnectivityManager connectivityManager = null;
    public static volatile NetworkInfo currentNetworkInfo = null;
    public static volatile boolean externalInterfacePaused = true;
    public static volatile boolean isScreenOn = false;
    private static int lastKnownNetworkType = -1;
    private static long lastNetworkCheck = -1;
    private static long lastNetworkCheckTypeTime = 0;
    private static ILocationServiceProvider locationServiceProvider = null;
    public static volatile boolean mainInterfacePaused = true;
    public static volatile boolean mainInterfacePausedStageQueue = true;
    public static volatile long mainInterfacePausedStageQueueTime = 0;
    public static volatile boolean mainInterfaceStopped = true;
    private static IMapsProvider mapsProvider;
    private static volatile ConnectivityManager.NetworkCallback networkCallback;
    private static PushListenerController.IPushListenerServiceProvider pushProvider;
    public static long startTime;

    public static void appCenterLog(Throwable th2) {
        applicationLoaderInstance.appCenterLogInternal(th2);
    }

    public static void checkForUpdates() {
        applicationLoaderInstance.checkForUpdatesInternal();
    }

    private boolean checkPlayServices() {
        try {
            AtomicBoolean atomicBoolean = y5.g.f47084a;
            if (y5.g.b(this, 12451000) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    private static void ensureCurrentNetworkGet() {
        long currentTimeMillis = System.currentTimeMillis();
        ensureCurrentNetworkGet(currentTimeMillis - lastNetworkCheck > 5000);
        lastNetworkCheck = currentTimeMillis;
    }

    public static String getApplicationId() {
        return applicationLoaderInstance.onGetApplicationId();
    }

    public static int getAutodownloadNetworkType() {
        int i10;
        try {
            ensureCurrentNetworkGet(false);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (currentNetworkInfo == null) {
            return 0;
        }
        if (currentNetworkInfo.getType() != 1 && currentNetworkInfo.getType() != 9) {
            if (!currentNetworkInfo.isRoaming()) {
                return 0;
            }
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 24 && (((i10 = lastKnownNetworkType) == 0 || i10 == 1) && System.currentTimeMillis() - lastNetworkCheckTypeTime < 5000)) {
            return lastKnownNetworkType;
        }
        if (connectivityManager.isActiveNetworkMetered()) {
            lastKnownNetworkType = 0;
        } else {
            lastKnownNetworkType = 1;
        }
        lastNetworkCheckTypeTime = System.currentTimeMillis();
        return lastKnownNetworkType;
    }

    public static int getCurrentNetworkType() {
        if (isConnectedOrConnectingToWiFi()) {
            return 1;
        }
        if (isRoaming()) {
            return 2;
        }
        return 0;
    }

    public static File getFilesDirFixed() {
        for (int i10 = 0; i10 < 10; i10++) {
            File filesDir = applicationContext.getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
        }
        try {
            File file = new File(applicationContext.getApplicationInfo().dataDir, "files");
            file.mkdirs();
            return file;
        } catch (Exception e) {
            FileLog.e(e);
            return new File("/data/data/org.telegram.messenger/files");
        }
    }

    public static ILocationServiceProvider getLocationServiceProvider() {
        if (locationServiceProvider == null) {
            ILocationServiceProvider onCreateLocationServiceProvider = applicationLoaderInstance.onCreateLocationServiceProvider();
            locationServiceProvider = onCreateLocationServiceProvider;
            onCreateLocationServiceProvider.init(applicationContext);
        }
        return locationServiceProvider;
    }

    public static IMapsProvider getMapsProvider() {
        if (mapsProvider == null) {
            mapsProvider = applicationLoaderInstance.onCreateMapsProvider();
        }
        return mapsProvider;
    }

    public static PushListenerController.IPushListenerServiceProvider getPushProvider() {
        if (pushProvider == null) {
            pushProvider = applicationLoaderInstance.onCreatePushProvider();
        }
        return pushProvider;
    }

    private void initPushServices() {
        AndroidUtilities.runOnUIThread(new x1(5), 1000L);
    }

    public static boolean isAndroidTestEnvironment() {
        return applicationLoaderInstance.isAndroidTestEnv();
    }

    public static boolean isBetaBuild() {
        return applicationLoaderInstance.isBeta();
    }

    public static boolean isConnectedOrConnectingToWiFi() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null) {
                if (currentNetworkInfo.getType() != 1) {
                    if (currentNetworkInfo.getType() == 9) {
                    }
                }
                NetworkInfo.State state = currentNetworkInfo.getState();
                if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                    if (state == NetworkInfo.State.SUSPENDED) {
                    }
                }
                return true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return false;
    }

    public static boolean isConnectedToWiFi() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null) {
                if (currentNetworkInfo.getType() != 1) {
                    if (currentNetworkInfo.getType() == 9) {
                    }
                }
                if (currentNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return false;
    }

    public static boolean isConnectionSlow() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null && currentNetworkInfo.getType() == 0) {
                int subtype = currentNetworkInfo.getSubtype();
                if (subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean isHuaweiStoreBuild() {
        return applicationLoaderInstance.isHuaweiBuild();
    }

    public static boolean isNetworkOnline() {
        boolean isNetworkOnlineRealtime = isNetworkOnlineRealtime();
        if (BuildVars.DEBUG_PRIVATE_VERSION && isNetworkOnlineRealtime != isNetworkOnlineFast()) {
            FileLog.d("network online mismatch");
        }
        return isNetworkOnlineRealtime;
    }

    public static boolean isNetworkOnlineFast() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null && !currentNetworkInfo.isConnectedOrConnecting() && !currentNetworkInfo.isAvailable()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null) {
                    if (networkInfo2.isConnectedOrConnecting()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    public static boolean isNetworkOnlineRealtime() {
        try {
            ConnectivityManager connectivityManager2 = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
            if (activeNetworkInfo == null || (!activeNetworkInfo.isConnectedOrConnecting() && !activeNetworkInfo.isAvailable())) {
                NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(0);
                if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
                NetworkInfo networkInfo2 = connectivityManager2.getNetworkInfo(1);
                if (networkInfo2 != null) {
                    if (networkInfo2.isConnectedOrConnecting()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    public static boolean isRoaming() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null) {
                if (currentNetworkInfo.isRoaming()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isStandaloneBuild() {
        return applicationLoaderInstance.isStandalone();
    }

    public static void lambda$initPushServices$0() {
        if (getPushProvider().hasServices()) {
            getPushProvider().onRequestPushToken();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("No valid " + getPushProvider().getLogTitle() + " APK found.");
        }
        SharedConfig.pushStringStatus = "__NO_GOOGLE_PLAY_SERVICES__";
        PushListenerController.sendRegistrationToServer(getPushProvider().getPushType(), null);
    }

    public static void logDualCamera(boolean z4, boolean z10) {
        applicationLoaderInstance.logDualCameraInternal(z4, z10);
    }

    public static void postInitApplication() {
        if (!applicationInited && applicationContext != null) {
            applicationInited = true;
            NativeLoader.initNativeLibs(applicationContext);
            try {
                LocaleController.getInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                applicationContext.registerReceiver(new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        try {
                            ApplicationLoader.currentNetworkInfo = ApplicationLoader.connectivityManager.getActiveNetworkInfo();
                        } catch (Throwable unused) {
                        }
                        boolean isConnectionSlow = ApplicationLoader.isConnectionSlow();
                        for (int i10 = 0; i10 < 4; i10++) {
                            ConnectionsManager.getInstance(i10).checkConnection();
                            FileLoader.getInstance(i10).onNetworkChanged(isConnectionSlow);
                        }
                    }
                }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                applicationContext.registerReceiver(new ScreenReceiver(), intentFilter);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                isScreenOn = ((PowerManager) applicationContext.getSystemService("power")).isScreenOn();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("screen state = " + isScreenOn);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            SharedConfig.loadConfig();
            SharedPrefsHelper.init(applicationContext);
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig.getInstance(i10).loadConfig();
                MessagesController.getInstance(i10);
                if (i10 == 0) {
                    SharedConfig.pushStringStatus = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i10).getCurrentTime() + "__";
                } else {
                    ConnectionsManager.getInstance(i10);
                }
                TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
                if (currentUser != null) {
                    MessagesController.getInstance(i10).putUser(currentUser, true);
                    SendMessagesHelper.getInstance(i10).checkUnsentMessages();
                }
            }
            ((ApplicationLoader) applicationContext).initPushServices();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("app initied");
            }
            MediaController.getInstance();
            for (int i11 = 0; i11 < 4; i11++) {
                ContactsController.getInstance(i11).checkAppAccount();
                DownloadController.getInstance(i11);
            }
            BillingController.getInstance().lambda$onBillingServiceDisconnected$13();
        }
    }

    public static void startAppCenter(Activity activity) {
        applicationLoaderInstance.startAppCenterInternal(activity);
    }

    public static void startPushService() {
        boolean z4;
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        if (globalNotificationsSettings.contains("pushService")) {
            z4 = globalNotificationsSettings.getBoolean("pushService", true);
        } else {
            z4 = MessagesController.getMainSettings(UserConfig.selectedAccount).getBoolean("keepAliveService", false);
        }
        if (z4) {
            try {
                applicationContext.startService(new Intent(applicationContext, NotificationsService.class));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        applicationContext.stopService(new Intent(applicationContext, NotificationsService.class));
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public boolean checkApkInstallPermissions(Context context) {
        return false;
    }

    public boolean checkRequestPermissionResult(int i10, String[] strArr, int[] iArr) {
        return false;
    }

    public boolean consumePush(int i10, JSONObject jSONObject) {
        return false;
    }

    public File getDownloadedUpdateFile() {
        return null;
    }

    public float getDownloadingUpdateProgress() {
        return 0.0f;
    }

    public BetaUpdate getUpdate() {
        return null;
    }

    public boolean isAndroidTestEnv() {
        return false;
    }

    public boolean isBeta() {
        return false;
    }

    public boolean isCustomUpdate() {
        return false;
    }

    public boolean isDownloadingUpdate() {
        return false;
    }

    public boolean isHuaweiBuild() {
        return false;
    }

    public boolean isStandalone() {
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            LocaleController.getInstance().onDeviceConfigurationChange(configuration);
            AndroidUtilities.checkDisplaySize(applicationContext, configuration);
            VideoCapturerDevice.checkScreenCapturerSize();
            AndroidUtilities.resetTabletFlag();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        String str;
        applicationLoaderInstance = this;
        try {
            applicationContext = getApplicationContext();
        } catch (Throwable unused) {
        }
        super.onCreate();
        String helloWorld = AndroidUtilities.getHelloWorld();
        int i10 = 0;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(helloWorld);
            StringBuilder sb = new StringBuilder("app start time = ");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            startTime = elapsedRealtime;
            kh.a2.x(sb, elapsedRealtime);
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                int i11 = packageInfo.versionCode % 10;
                if (i11 != 1 && i11 != 2) {
                    if (isStandaloneBuild()) {
                        str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                    } else {
                        str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                    }
                } else {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                FileLog.d("buildVersion = ".concat("v" + packageInfo.versionName + " (" + (packageInfo.versionCode / 10) + "[" + (packageInfo.versionCode % 10) + "]) " + str));
            } catch (Exception e) {
                FileLog.e(e);
            }
            StringBuilder sb2 = new StringBuilder("device = manufacturer=");
            sb2.append(Build.MANUFACTURER);
            sb2.append(", device=");
            sb2.append(Build.DEVICE);
            sb2.append(", model=");
            sb2.append(Build.MODEL);
            sb2.append(", product=");
            org.telegram.ui.yh.w(Build.PRODUCT, sb2);
        }
        if (applicationContext == null) {
            applicationContext = getApplicationContext();
        }
        NativeLoader.initNativeLibs(applicationContext);
        try {
            ConnectionsManager.native_setJava(false);
            new g10(this) {
                @Override
                public void onActivityStarted(Activity activity) {
                    boolean isBackground = isBackground();
                    super.onActivityStarted(activity);
                    if (isBackground) {
                        ApplicationLoader.ensureCurrentNetworkGet(true);
                    }
                }
            };
            new ANRDetector(new x1(3));
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load libs time = " + (SystemClock.elapsedRealtime() - startTime));
            }
            applicationHandler = new Handler(applicationContext.getMainLooper());
            AndroidUtilities.runOnUIThread(new x1(4));
            ab0[] values = ab0.values();
            int length = values.length;
            while (true) {
                if (i10 < length) {
                    if (k7.i6.a(values[i10])) {
                        break;
                    }
                    i10++;
                } else {
                    k7.i6.b(ab0.h);
                    break;
                }
            }
            ProxyRotationController.init();
        } catch (UnsatisfiedLinkError unused2) {
            throw new RuntimeException("can't load native libraries " + Build.CPU_ABI + " lookup folder " + NativeLoader.getAbiFolder());
        }
    }

    public ILocationServiceProvider onCreateLocationServiceProvider() {
        return new GoogleLocationProvider();
    }

    public IMapsProvider onCreateMapsProvider() {
        return new GoogleMapsProvider();
    }

    public PushListenerController.IPushListenerServiceProvider onCreatePushProvider() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE;
    }

    public String onGetApplicationId() {
        return null;
    }

    public boolean onPause() {
        return false;
    }

    public boolean onSuggestionClick(String str) {
        return false;
    }

    public boolean onSuggestionFill(String str, CharSequence[] charSequenceArr, boolean[] zArr) {
        return false;
    }

    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        return false;
    }

    public org.telegram.ui.ActionBar.p2 openSettings(int i10) {
        return null;
    }

    public TLRPC.Update parseTLUpdate(int i10) {
        return null;
    }

    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i10) {
        return false;
    }

    public boolean showUpdateAppPopup(Context context, TLRPC.TL_help_appUpdate tL_help_appUpdate, int i10) {
        return false;
    }

    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        return null;
    }

    public static void ensureCurrentNetworkGet(boolean z4) {
        if (z4 || currentNetworkInfo == null) {
            try {
                if (connectivityManager == null) {
                    connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                }
                currentNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (Build.VERSION.SDK_INT < 24 || networkCallback != null) {
                    return;
                }
                networkCallback = new ConnectivityManager.NetworkCallback() {
                    @Override
                    public void onAvailable(Network network) {
                        int unused = ApplicationLoader.lastKnownNetworkType = -1;
                    }

                    @Override
                    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        int unused = ApplicationLoader.lastKnownNetworkType = -1;
                    }
                };
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
            } catch (Throwable unused) {
            }
        }
    }

    public static File getFilesDirFixed(String str) {
        try {
            File file = new File(getFilesDirFixed(), str);
            file.mkdirs();
            return file;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void cancelDownloadingUpdate() {
    }

    public void checkForUpdatesInternal() {
    }

    public void downloadUpdate() {
    }

    public void onResume() {
    }

    public void addItemOptions(o70 o70Var) {
    }

    public void appCenterLogInternal(Throwable th2) {
    }

    public void startAppCenterInternal(Activity activity) {
    }

    public void checkUpdate(boolean z4, Runnable runnable) {
    }

    public void logDualCameraInternal(boolean z4, boolean z10) {
    }

    public void processUpdate(int i10, TLRPC.Update update) {
    }
}
