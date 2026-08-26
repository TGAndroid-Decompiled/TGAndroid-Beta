package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.IUpdateLayout;

public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i) {
        if (i == 0) {
            return "local-debug";
        }
        if (i == 1) {
            return "private";
        }
        if (i == 4) {
            return "public";
        }
        if (i == 5) {
            return "hardcore";
        }
        if (i != 6) {
            return i != 7 ? "unknown" : "release";
        }
        return "standalone";
    }

    @Override
    public void appCenterLogInternal(Throwable th) {
        try {
            FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
            if (firebaseCrashlytics == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            firebaseCrashlytics.recordException(th);
        } catch (Throwable th2) {
            FileLog.e(th2, false);
        }
    }

    @Override
    public void cancelDownloadingUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().cancelDownloadingUpdate();
        }
    }

    @Override
    public boolean checkApkInstallPermissions(Context context) {
        if (Build.VERSION.SDK_INT < 26 || ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        AlertsCreator.createApkRestrictedDialog(context, null).show();
        return false;
    }

    @Override
    public void checkForUpdatesInternal() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public void checkUpdate(boolean z, Runnable runnable) {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().checkForUpdate(z, runnable);
        }
    }

    @Override
    public void downloadUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().downloadUpdate();
        }
    }

    @Override
    public File getDownloadedUpdateFile() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadedFile();
        }
        return null;
    }

    @Override
    public float getDownloadingUpdateProgress() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadingProgress();
        }
        return 0.0f;
    }

    @Override
    public BetaUpdate getUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getUpdate();
        }
        return null;
    }

    @Override
    public boolean isBeta() {
        return true;
    }

    @Override
    public boolean isCustomUpdate() {
        return !TextUtils.isEmpty("null");
    }

    @Override
    public boolean isDownloadingUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().isDownloading();
        }
        return false;
    }

    @Override
    public void logDualCameraInternal(boolean z, boolean z2) {
    }

    @Override
    public String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    @Override
    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        boolean zExists = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            zExists = pathToAttach.exists();
            if (zExists) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return zExists;
    }

    @Override
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i) {
        try {
            new UpdateAppAlertDialog(context, betaUpdate).show();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public void startAppCenterInternal(Activity activity) {
        try {
            if (BuildVars.DEBUG_VERSION) {
                String str = "" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str = "@" + publicUsername;
                    }
                }
                if (ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend()) {
                    str = str + " [TEST SERVER]";
                }
                FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
                if (firebaseCrashlytics == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                firebaseCrashlytics.setUserId(str);
                firebaseCrashlytics.setCustomKey("version", getVersionName(4));
                firebaseCrashlytics.setCustomKey("model", Build.MODEL);
                firebaseCrashlytics.setCustomKey("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    firebaseCrashlytics.setCustomKey("soc_model", Build.SOC_MODEL);
                    firebaseCrashlytics.setCustomKey("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                firebaseCrashlytics.setCustomKey("device", Build.DEVICE);
                firebaseCrashlytics.setCustomKey("product", Build.PRODUCT);
                firebaseCrashlytics.setCustomKey("hardware", Build.HARDWARE);
                firebaseCrashlytics.setCustomKey("user", Build.USER);
                firebaseCrashlytics.setCrashlyticsCollectionEnabled();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new UpdateLayout(activity, viewGroup);
        }
        return null;
    }
}
