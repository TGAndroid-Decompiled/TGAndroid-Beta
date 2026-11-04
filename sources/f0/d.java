package f0;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.biometric.o;
import e0.j0;
import j$.util.Objects;
import java.util.concurrent.Executor;
public abstract class d {
    public static final Object f11330a = null;

    public static int a(Context context, String str, int i3, int i10, String str2) {
        int noteProxyOpNoThrow;
        if (context.checkPermission(str, i3, i10) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int myUid = Process.myUid();
                String packageName = context.getPackageName();
                if (myUid == i10 && Objects.equals(packageName, str2)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i11 = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, str2);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String f10 = d2.d.f(context);
                            if (appOpsManager != null) {
                                i11 = appOpsManager.checkOpNoThrow(permissionToOp, i10, f10);
                            }
                            noteProxyOpNoThrow = i11;
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
                if (new j0(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int c(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static Drawable d(Context context, int i3) {
        return context.getDrawable(i3);
    }

    public static Executor e(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(context);
        }
        return new o(new Handler(context.getMainLooper()), 3);
    }
}
