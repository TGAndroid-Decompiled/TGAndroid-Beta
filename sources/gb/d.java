package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13299a = new Object();
    public static final na.c f13300b = na.c.c("appId");
    public static final na.c f13301c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13302e = na.c.c("osVersion");
    public static final na.c f13303f = na.c.c("logEnvironment");
    public static final na.c f13304g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13300b, bVar.f13283a);
        eVar.a(f13301c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13302e, Build.VERSION.RELEASE);
        eVar.a(f13303f, z.f13436b);
        eVar.a(f13304g, bVar.f13284b);
    }
}
