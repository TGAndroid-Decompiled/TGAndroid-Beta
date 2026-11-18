package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13308a = new Object();
    public static final na.c f13309b = na.c.c("appId");
    public static final na.c f13310c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13311e = na.c.c("osVersion");
    public static final na.c f13312f = na.c.c("logEnvironment");
    public static final na.c f13313g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13309b, bVar.f13289a);
        eVar.a(f13310c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13311e, Build.VERSION.RELEASE);
        eVar.a(f13312f, y.f13437b);
        eVar.a(f13313g, bVar.f13290b);
    }
}
