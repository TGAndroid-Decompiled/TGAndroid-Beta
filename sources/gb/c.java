package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13636a = new Object();
    public static final na.c f13637b = na.c.c("packageName");
    public static final na.c f13638c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13639e = na.c.c("deviceManufacturer");
    public static final na.c f13640f = na.c.c("currentProcessDetails");
    public static final na.c f13641g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13637b, aVar.f13623a);
        eVar.a(f13638c, aVar.f13624b);
        eVar.a(d, aVar.f13625c);
        eVar.a(f13639e, Build.MANUFACTURER);
        eVar.a(f13640f, aVar.d);
        eVar.a(f13641g, aVar.f13626e);
    }
}
