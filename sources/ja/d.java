package ja;

import android.os.Build;
public final class d implements s9.d {
    public static final d f11315a = new Object();
    public static final s9.c f11316b = s9.c.c("appId");
    public static final s9.c f11317c = s9.c.c("deviceModel");
    public static final s9.c d = s9.c.c("sessionSdkVersion");
    public static final s9.c f11318e = s9.c.c("osVersion");
    public static final s9.c f11319f = s9.c.c("logEnvironment");
    public static final s9.c f11320g = s9.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11316b, bVar.f11299a);
        eVar.e(f11317c, Build.MODEL);
        eVar.e(d, "1.2.0");
        eVar.e(f11318e, Build.VERSION.RELEASE);
        eVar.e(f11319f, p.LOG_ENVIRONMENT_PROD);
        eVar.e(f11320g, bVar.f11300b);
    }
}
