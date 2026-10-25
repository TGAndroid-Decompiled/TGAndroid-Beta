package bb;

import android.os.Build;
public final class d implements ka.d {
    public static final d f3739a = new Object();
    public static final ka.c f3740b = ka.c.c("appId");
    public static final ka.c f3741c = ka.c.c("deviceModel");
    public static final ka.c d = ka.c.c("sessionSdkVersion");
    public static final ka.c e = ka.c.c("osVersion");
    public static final ka.c f3742f = ka.c.c("logEnvironment");
    public static final ka.c f3743g = ka.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f3740b, bVar.f3725a);
        eVar.a(f3741c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f3742f, p.LOG_ENVIRONMENT_PROD);
        eVar.a(f3743g, bVar.f3726b);
    }
}
