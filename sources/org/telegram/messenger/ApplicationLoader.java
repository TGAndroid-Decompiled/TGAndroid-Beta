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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjg;
import java.io.File;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ForegroundDetector;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.IUpdateLayout;
import org.telegram.ui.LauncherIconController;

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

    public static void appCenterLog(Throwable th) {
        applicationLoaderInstance.appCenterLogInternal(th);
    }

    public static void checkForUpdates() {
        applicationLoaderInstance.checkForUpdatesInternal();
    }

    private boolean checkPlayServices() {
        try {
            int i = GooglePlayServicesUtil.$r8$clinit;
            return GooglePlayServicesUtil.isGooglePlayServicesAvailable(this, 12451000) == 0;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    private static void ensureCurrentNetworkGet() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ensureCurrentNetworkGet(jCurrentTimeMillis - lastNetworkCheck > 5000);
        lastNetworkCheck = jCurrentTimeMillis;
    }

    public static String getApplicationId() {
        return applicationLoaderInstance.onGetApplicationId();
    }

    public static int getAutodownloadNetworkType() {
        int i;
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo == null) {
                return 0;
            }
            if (currentNetworkInfo.getType() != 1 && currentNetworkInfo.getType() != 9) {
                return currentNetworkInfo.isRoaming() ? 2 : 0;
            }
            if (Build.VERSION.SDK_INT >= 24 && (((i = lastKnownNetworkType) == 0 || i == 1) && System.currentTimeMillis() - lastNetworkCheckTypeTime < 5000)) {
                return lastKnownNetworkType;
            }
            if (connectivityManager.isActiveNetworkMetered()) {
                lastKnownNetworkType = 0;
            } else {
                lastKnownNetworkType = 1;
            }
            lastNetworkCheckTypeTime = System.currentTimeMillis();
            return lastKnownNetworkType;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int getCurrentNetworkType() {
        if (isConnectedOrConnectingToWiFi()) {
            return 1;
        }
        return isRoaming() ? 2 : 0;
    }

    public static File getFilesDirFixed() {
        for (int i = 0; i < 10; i++) {
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
            ILocationServiceProvider iLocationServiceProviderOnCreateLocationServiceProvider = applicationLoaderInstance.onCreateLocationServiceProvider();
            locationServiceProvider = iLocationServiceProviderOnCreateLocationServiceProvider;
            iLocationServiceProviderOnCreateLocationServiceProvider.init(applicationContext);
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
        AndroidUtilities.runOnUIThread(new Emoji$$ExternalSyntheticLambda1(6), 1000L);
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
            if (currentNetworkInfo != null && (currentNetworkInfo.getType() == 1 || currentNetworkInfo.getType() == 9)) {
                NetworkInfo.State state = currentNetworkInfo.getState();
                if (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING || state == NetworkInfo.State.SUSPENDED) {
                    return true;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return false;
    }

    public static boolean isConnectedToWiFi() {
        try {
            ensureCurrentNetworkGet(false);
            if (currentNetworkInfo != null && (currentNetworkInfo.getType() == 1 || currentNetworkInfo.getType() == 9)) {
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
        int subtype;
        try {
            ensureCurrentNetworkGet(false);
            return currentNetworkInfo != null && currentNetworkInfo.getType() == 0 && ((subtype = currentNetworkInfo.getSubtype()) == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11);
        } catch (Throwable unused) {
        }
    }

    public static boolean isHuaweiStoreBuild() {
        return applicationLoaderInstance.isHuaweiBuild();
    }

    public static boolean isNetworkOnline() {
        boolean zIsNetworkOnlineRealtime = isNetworkOnlineRealtime();
        if (BuildVars.DEBUG_PRIVATE_VERSION && zIsNetworkOnlineRealtime != isNetworkOnlineFast()) {
            FileLog.d("network online mismatch");
        }
        return zIsNetworkOnlineRealtime;
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
                return networkInfo2 != null && networkInfo2.isConnectedOrConnecting();
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
                return networkInfo2 != null && networkInfo2.isConnectedOrConnecting();
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
            return currentNetworkInfo != null && currentNetworkInfo.isRoaming();
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

    public static void logDualCamera(boolean z, boolean z2) {
        applicationLoaderInstance.logDualCameraInternal(z, z2);
    }

    public static void postInitApplication() {
        if (applicationInited || applicationContext == null) {
            return;
        }
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
                    boolean zIsConnectionSlow = ApplicationLoader.isConnectionSlow();
                    for (int i = 0; i < 4; i++) {
                        ConnectionsManager.getInstance(i).checkConnection();
                        FileLoader.getInstance(i).onNetworkChanged(zIsConnectionSlow);
                    }
                }
            }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            applicationContext.registerReceiver(new ScreenReceiver(), intentFilter);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            isScreenOn = ((PowerManager) applicationContext.getSystemService("power")).isScreenOn();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("screen state = " + isScreenOn);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        SharedConfig.loadConfig();
        SharedPrefsHelper.init(applicationContext);
        for (int i = 0; i < 4; i++) {
            UserConfig.getInstance(i).loadConfig();
            MessagesController.getInstance(i);
            if (i == 0) {
                SharedConfig.pushStringStatus = "__FIREBASE_GENERATING_SINCE_" + ConnectionsManager.getInstance(i).getCurrentTime() + "__";
            } else {
                ConnectionsManager.getInstance(i);
            }
            TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
            if (currentUser != null) {
                MessagesController.getInstance(i).putUser(currentUser, true);
                SendMessagesHelper.getInstance(i).checkUnsentMessages();
            }
        }
        ((ApplicationLoader) applicationContext).initPushServices();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("app initied");
        }
        MediaController.getInstance();
        for (int i2 = 0; i2 < 4; i2++) {
            ContactsController.getInstance(i2).checkAppAccount();
            DownloadController.getInstance(i2);
        }
        BillingController.getInstance().lambda$onBillingServiceDisconnected$13();
    }

    public static void startAppCenter(Activity activity) {
        applicationLoaderInstance.startAppCenterInternal(activity);
    }

    public static void startPushService() {
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        if (!(globalNotificationsSettings.contains("pushService") ? globalNotificationsSettings.getBoolean("pushService", true) : MessagesController.getMainSettings(UserConfig.selectedAccount).getBoolean("keepAliveService", false))) {
            applicationContext.stopService(new Intent(applicationContext, (Class<?>) NotificationsService.class));
        } else {
            try {
                applicationContext.startService(new Intent(applicationContext, (Class<?>) NotificationsService.class));
            } catch (Throwable unused) {
            }
        }
    }

    public void addItemOptions(ItemOptions itemOptions) {
    }

    public void appCenterLogInternal(Throwable th) {
    }

    @Override
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void cancelDownloadingUpdate() {
    }

    public boolean checkApkInstallPermissions(Context context) {
        return false;
    }

    public void checkForUpdatesInternal() {
    }

    public boolean checkRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        return false;
    }

    public void checkUpdate(boolean z, Runnable runnable) {
    }

    public boolean consumePush(int i, JSONObject jSONObject) {
        return false;
    }

    public void downloadUpdate() {
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

    public void logDualCameraInternal(boolean z, boolean z2) {
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
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d(helloWorld);
            StringBuilder sb = new StringBuilder("app start time = ");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            startTime = jElapsedRealtime;
            zzjg.m(sb, jElapsedRealtime);
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                int i = packageInfo.versionCode % 10;
                if (i == 1 || i == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (isStandaloneBuild()) {
                    str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName;
                int i2 = packageInfo.versionCode;
                FileLog.d("buildVersion = ".concat("v" + str2 + " (" + (i2 / 10) + "[" + (i2 % 10) + "]) " + str));
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
            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(Build.PRODUCT, sb2);
        }
        if (applicationContext == null) {
            applicationContext = getApplicationContext();
        }
        NativeLoader.initNativeLibs(applicationContext);
        try {
            ConnectionsManager.native_setJava(false);
            new ForegroundDetector(this) {
                @Override
                public void onActivityStarted(Activity activity) {
                    boolean zIsBackground = isBackground();
                    super.onActivityStarted(activity);
                    if (zIsBackground) {
                        ApplicationLoader.ensureCurrentNetworkGet(true);
                    }
                }
            };
            new ANRDetector(new Emoji$$ExternalSyntheticLambda1(4));
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("load libs time = " + (SystemClock.elapsedRealtime() - startTime));
            }
            applicationHandler = new Handler(applicationContext.getMainLooper());
            AndroidUtilities.runOnUIThread(new Emoji$$ExternalSyntheticLambda1(5));
            LauncherIconController.tryFixLauncherIconIfNeeded();
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

    public void onResume() {
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

    public BaseFragment openSettings(int i) {
        return null;
    }

    public TLRPC.Update parseTLUpdate(int i) {
        return null;
    }

    public void processUpdate(int i, TLRPC.Update update) {
    }

    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i) {
        return false;
    }

    public boolean showUpdateAppPopup(Context context, TLRPC.TL_help_appUpdate tL_help_appUpdate, int i) {
        return false;
    }

    public void startAppCenterInternal(Activity activity) {
    }

    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        return null;
    }

    public static void ensureCurrentNetworkGet(boolean z) {
        if (z || currentNetworkInfo == null) {
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
}
