package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13311a = new Object();
    public static final na.c f13312b = na.c.c("appId");
    public static final na.c f13313c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13314e = na.c.c("osVersion");
    public static final na.c f13315f = na.c.c("logEnvironment");
    public static final na.c f13316g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13312b, bVar.f13292a);
        eVar.a(f13313c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13314e, Build.VERSION.RELEASE);
        eVar.a(f13315f, y.f13440b);
        eVar.a(f13316g, bVar.f13293b);
    }
}
