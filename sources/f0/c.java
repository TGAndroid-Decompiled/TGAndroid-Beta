package f0;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.biometric.n;
import e0.l0;
import j$.util.Objects;
import java.util.concurrent.Executor;
public abstract class c {
    public static final Object f9548a = null;

    public static int a(Context context, String str, int i10, int i11, String str2) {
        int noteProxyOpNoThrow;
        if (context.checkPermission(str, i10, i11) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int myUid = Process.myUid();
                String packageName = context.getPackageName();
                if (myUid == i11 && Objects.equals(packageName, str2)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i12 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, str2);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String g10 = b2.c.g(context);
                            if (appOpsManager != null) {
                                i12 = appOpsManager.checkOpNoThrow(permissionToOp, i11, g10);
                            }
                            noteProxyOpNoThrow = i12;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, str2);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, str2);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int b(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new l0(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Drawable c(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static Executor d(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(context);
        }
        return new n(new Handler(context.getMainLooper()), 3);
    }
}
