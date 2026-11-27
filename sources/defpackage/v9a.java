package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class v9a {
    public static final v9a a = new Object();
    public static final kj4 b;

    static {
        vw5 vw5Var = new vw5();
        vw5Var.a(u9a.class, u70.a);
        vw5Var.a(aaa.class, v70.a);
        vw5Var.a(t63.class, s70.a);
        vw5Var.a(tr.class, r70.a);
        vw5Var.a(yj.class, q70.a);
        vw5Var.a(mo8.class, t70.a);
        vw5Var.d = true;
        b = new kj4(vw5Var, (byte) 10);
    }

    public static tr a(ji4 ji4Var) {
        String valueOf;
        ji4Var.a();
        Context context = ji4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        ji4Var.a();
        String str2 = ji4Var.c.b;
        str2.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = str;
        }
        Build.MANUFACTURER.getClass();
        ji4Var.a();
        mo8 f = t4.f(context);
        ji4Var.a();
        return new tr(str2, new yj(packageName, str3, str, f, t4.c(context)));
    }
}
