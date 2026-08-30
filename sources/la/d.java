package la;

import android.os.Build;
public final class d implements u9.d {
    public static final d f11747a = new Object();
    public static final u9.c f11748b = u9.c.c("appId");
    public static final u9.c f11749c = u9.c.c("deviceModel");
    public static final u9.c d = u9.c.c("sessionSdkVersion");
    public static final u9.c e = u9.c.c("osVersion");
    public static final u9.c f11750f = u9.c.c("logEnvironment");
    public static final u9.c f11751g = u9.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11748b, bVar.f11736a);
        eVar.e(f11749c, Build.MODEL);
        eVar.e(d, "1.2.0");
        eVar.e(e, Build.VERSION.RELEASE);
        eVar.e(f11750f, o.LOG_ENVIRONMENT_PROD);
        eVar.e(f11751g, bVar.f11737b);
    }
}
