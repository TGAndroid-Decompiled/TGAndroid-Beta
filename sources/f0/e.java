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
import com.google.firebase.messaging.q;
import e0.n0;
import j$.util.Objects;
import java.util.concurrent.Executor;

public abstract class e {

    public static final Object f5598a = null;

    public static int a(Context context, String str, int i10, int i11, String str2) {
        int iCheckOpNoThrow;
        if (context.checkPermission(str, i10, i11) != -1) {
            int i12 = Build.VERSION.SDK_INT;
            String strP = i12 >= 23 ? e0.b.p(str) : null;
            if (strP != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                int iO = 1;
                if (iMyUid == i11 && Objects.equals(packageName, str2)) {
                    if (i12 >= 29) {
                        AppOpsManager appOpsManagerC = q.c(context);
                        iCheckOpNoThrow = appOpsManagerC == null ? 1 : appOpsManagerC.checkOpNoThrow(strP, Binder.getCallingUid(), str2);
                        if (iCheckOpNoThrow == 0) {
                            String strB = q.b(context);
                            if (appOpsManagerC != null) {
                                iO = appOpsManagerC.checkOpNoThrow(strP, i11, strB);
                            }
                        }
                        if (iCheckOpNoThrow == 0) {
                            return -2;
                        }
                    } else if (i12 >= 23) {
                        iO = e0.b.o((AppOpsManager) e0.b.i(context), strP, str2);
                    }
                } else if (i12 >= 23) {
                    iO = e0.b.o((AppOpsManager) e0.b.i(context), strP, str2);
                }
                iCheckOpNoThrow = iO;
                if (iCheckOpNoThrow == 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int b(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new n0(context).a() ? 0 : -1;
    }

    public static int c(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? a.a(context, i10) : context.getResources().getColor(i10);
    }

    public static Drawable d(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : new n(new Handler(context.getMainLooper()), 3);
    }

    public static Object f(Context context, Class cls) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return a.b(context, cls);
        }
        String strC = i10 >= 23 ? a.c(context, cls) : (String) d.f5597a.get(cls);
        if (strC != null) {
            return context.getSystemService(strC);
        }
        return null;
    }
}
