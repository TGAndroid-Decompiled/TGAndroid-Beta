package defpackage;

import android.os.Build;
public final class p70 implements zn7 {
    public static final p70 a = new Object();
    public static final w84 b = w84.c("appId");
    public static final w84 c = w84.c("deviceModel");
    public static final w84 d = w84.c("sessionSdkVersion");
    public static final w84 e = w84.c("osVersion");
    public static final w84 f = w84.c("logEnvironment");
    public static final w84 g = w84.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        sr srVar = (sr) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, srVar.a);
        ao7Var.a(c, Build.MODEL);
        ao7Var.a(d, "3.0.8");
        ao7Var.a(e, Build.VERSION.RELEASE);
        ao7Var.a(f, vb6.LOG_ENVIRONMENT_PROD);
        ao7Var.a(g, srVar.b);
    }
}
