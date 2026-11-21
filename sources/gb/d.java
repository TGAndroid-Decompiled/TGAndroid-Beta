package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13337a = new Object();
    public static final na.c f13338b = na.c.c("appId");
    public static final na.c f13339c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13340e = na.c.c("osVersion");
    public static final na.c f13341f = na.c.c("logEnvironment");
    public static final na.c f13342g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13338b, bVar.f13318a);
        eVar.a(f13339c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13340e, Build.VERSION.RELEASE);
        eVar.a(f13341f, y.f13466b);
        eVar.a(f13342g, bVar.f13319b);
    }
}
