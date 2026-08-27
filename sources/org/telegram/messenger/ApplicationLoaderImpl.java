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
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r51;
import org.telegram.ui.IUpdateLayout;

public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i10) {
        if (i10 == 0) {
            return "local-debug";
        }
        if (i10 == 1) {
            return "private";
        }
        if (i10 == 4) {
            return "public";
        }
        if (i10 == 5) {
            return "hardcore";
        }
        if (i10 != 6) {
            return i10 != 7 ? "unknown" : "release";
        }
        return "standalone";
    }

    @Override
    public void appCenterLogInternal(Throwable th) {
        try {
            b9.c cVar = (b9.c) t8.h.c().b(b9.c.class);
            if (cVar == null) {
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
            cVar.a(th);
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
        org.telegram.ui.Components.y4.j(context, null).show();
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
    public void checkUpdate(boolean z10, Runnable runnable) {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().checkForUpdate(z10, runnable);
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
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return zExists;
    }

    @Override
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i10) {
        try {
            new q51(context, betaUpdate).show();
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
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
                b9.c cVar = (b9.c) t8.h.c().b(b9.c.class);
                if (cVar == null) {
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                cVar.d(str);
                cVar.c("version", getVersionName(4));
                cVar.c("model", Build.MODEL);
                cVar.c("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    cVar.c("soc_model", Build.SOC_MODEL);
                    cVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                cVar.c("device", Build.DEVICE);
                cVar.c("product", Build.PRODUCT);
                cVar.c("hardware", Build.HARDWARE);
                cVar.c("user", Build.USER);
                cVar.b();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new r51(activity, viewGroup);
        }
        return null;
    }

    @Override
    public void logDualCameraInternal(boolean z10, boolean z11) {
    }
}
