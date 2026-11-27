package defpackage;

import android.os.Build;
public final class r70 implements zq7 {
    public static final r70 a = new Object();
    public static final sa4 b = sa4.c("appId");
    public static final sa4 c = sa4.c("deviceModel");
    public static final sa4 d = sa4.c("sessionSdkVersion");
    public static final sa4 e = sa4.c("osVersion");
    public static final sa4 f = sa4.c("logEnvironment");
    public static final sa4 g = sa4.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        tr trVar = (tr) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, trVar.a);
        ar7Var.a(c, Build.MODEL);
        ar7Var.a(d, "3.0.8");
        ar7Var.a(e, Build.VERSION.RELEASE);
        ar7Var.a(f, zd6.LOG_ENVIRONMENT_PROD);
        ar7Var.a(g, trVar.b);
    }
}
