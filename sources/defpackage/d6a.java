package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class d6a {
    public static final d6a a = new Object();
    public static final gi3 b;

    static {
        qu5 qu5Var = new qu5();
        qu5Var.a(c6a.class, s70.a);
        qu5Var.a(i6a.class, t70.a);
        qu5Var.a(a63.class, q70.a);
        qu5Var.a(sr.class, p70.a);
        qu5Var.a(xj.class, o70.a);
        qu5Var.a(zk8.class, r70.a);
        qu5Var.d = true;
        b = new gi3(qu5Var);
    }

    public static sr a(jg4 jg4Var) {
        String valueOf;
        jg4Var.a();
        Context context = jg4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        jg4Var.a();
        String str2 = jg4Var.c.b;
        str2.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = str;
        }
        Build.MANUFACTURER.getClass();
        jg4Var.a();
        zk8 f = s4.f(context);
        jg4Var.a();
        return new sr(str2, new xj(packageName, str3, str, f, s4.c(context)));
    }
}
