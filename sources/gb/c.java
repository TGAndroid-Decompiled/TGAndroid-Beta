package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13288a = new Object();
    public static final na.c f13289b = na.c.c("packageName");
    public static final na.c f13290c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13291e = na.c.c("deviceManufacturer");
    public static final na.c f13292f = na.c.c("currentProcessDetails");
    public static final na.c f13293g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13289b, aVar.f13275a);
        eVar.a(f13290c, aVar.f13276b);
        eVar.a(d, aVar.f13277c);
        eVar.a(f13291e, Build.MANUFACTURER);
        eVar.a(f13292f, aVar.d);
        eVar.a(f13293g, aVar.f13278e);
    }
}
