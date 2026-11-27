package defpackage;

import android.os.Build;
public final class q70 implements zq7 {
    public static final q70 a = new Object();
    public static final sa4 b = sa4.c("packageName");
    public static final sa4 c = sa4.c("versionName");
    public static final sa4 d = sa4.c("appBuildVersion");
    public static final sa4 e = sa4.c("deviceManufacturer");
    public static final sa4 f = sa4.c("currentProcessDetails");
    public static final sa4 g = sa4.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        yj yjVar = (yj) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, yjVar.a);
        ar7Var.a(c, yjVar.b);
        ar7Var.a(d, yjVar.c);
        ar7Var.a(e, Build.MANUFACTURER);
        ar7Var.a(f, yjVar.d);
        ar7Var.a(g, yjVar.e);
    }
}
