package defpackage;

import android.os.Build;
public final class p80 implements cq7 {
    public static final p80 a = new Object();
    public static final wa4 b = wa4.c("appId");
    public static final wa4 c = wa4.c("deviceModel");
    public static final wa4 d = wa4.c("sessionSdkVersion");
    public static final wa4 e = wa4.c("osVersion");
    public static final wa4 f = wa4.c("logEnvironment");
    public static final wa4 g = wa4.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        ss ssVar = (ss) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, ssVar.a);
        dq7Var.a(c, Build.MODEL);
        dq7Var.a(d, "3.0.8");
        dq7Var.a(e, Build.VERSION.RELEASE);
        dq7Var.a(f, ud6.LOG_ENVIRONMENT_PROD);
        dq7Var.a(g, ssVar.b);
    }
}
