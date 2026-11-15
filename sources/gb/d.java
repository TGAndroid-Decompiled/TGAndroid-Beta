package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f12994a = new Object();
    public static final na.c f12995b = na.c.c("appId");
    public static final na.c f12996c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f12997e = na.c.c("osVersion");
    public static final na.c f12998f = na.c.c("logEnvironment");
    public static final na.c f12999g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f12995b, bVar.f12975a);
        eVar.a(f12996c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f12997e, Build.VERSION.RELEASE);
        eVar.a(f12998f, y.f13123b);
        eVar.a(f12999g, bVar.f12976b);
    }
}
