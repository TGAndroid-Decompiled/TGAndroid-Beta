package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13299a = new Object();
    public static final na.c f13300b = na.c.c("packageName");
    public static final na.c f13301c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13302e = na.c.c("deviceManufacturer");
    public static final na.c f13303f = na.c.c("currentProcessDetails");
    public static final na.c f13304g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13300b, aVar.f13285a);
        eVar.a(f13301c, aVar.f13286b);
        eVar.a(d, aVar.f13287c);
        eVar.a(f13302e, Build.MANUFACTURER);
        eVar.a(f13303f, aVar.d);
        eVar.a(f13304g, aVar.f13288e);
    }
}
