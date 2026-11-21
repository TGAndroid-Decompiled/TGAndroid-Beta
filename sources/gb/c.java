package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13325a = new Object();
    public static final na.c f13326b = na.c.c("packageName");
    public static final na.c f13327c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13328e = na.c.c("deviceManufacturer");
    public static final na.c f13329f = na.c.c("currentProcessDetails");
    public static final na.c f13330g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13326b, aVar.f13311a);
        eVar.a(f13327c, aVar.f13312b);
        eVar.a(d, aVar.f13313c);
        eVar.a(f13328e, Build.MANUFACTURER);
        eVar.a(f13329f, aVar.d);
        eVar.a(f13330g, aVar.f13314e);
    }
}
