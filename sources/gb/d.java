package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13340a = new Object();
    public static final na.c f13341b = na.c.c("appId");
    public static final na.c f13342c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13343e = na.c.c("osVersion");
    public static final na.c f13344f = na.c.c("logEnvironment");
    public static final na.c f13345g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13341b, bVar.f13321a);
        eVar.a(f13342c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13343e, Build.VERSION.RELEASE);
        eVar.a(f13344f, y.f13469b);
        eVar.a(f13345g, bVar.f13322b);
    }
}
