package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class f8a {
    public static final f8a a = new Object();
    public static final lj4 b;

    static {
        qw5 qw5Var = new qw5();
        qw5Var.a(e8a.class, s80.a);
        qw5Var.a(k8a.class, t80.a);
        qw5Var.a(m73.class, q80.a);
        qw5Var.a(ss.class, p80.a);
        qw5Var.a(xk.class, o80.a);
        qw5Var.a(bn8.class, r80.a);
        qw5Var.d = true;
        b = new lj4(qw5Var);
    }

    public static ss a(li4 li4Var) {
        String valueOf;
        li4Var.a();
        Context context = li4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        li4Var.a();
        String str2 = li4Var.c.b;
        str2.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = str;
        }
        Build.MANUFACTURER.getClass();
        li4Var.a();
        bn8 f = s4.f(context);
        li4Var.a();
        return new ss(str2, new xk(packageName, str3, str, f, s4.c(context)));
    }
}
