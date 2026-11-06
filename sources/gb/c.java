package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13634a = new Object();
    public static final na.c f13635b = na.c.c("packageName");
    public static final na.c f13636c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13637e = na.c.c("deviceManufacturer");
    public static final na.c f13638f = na.c.c("currentProcessDetails");
    public static final na.c f13639g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13635b, aVar.f13621a);
        eVar.a(f13636c, aVar.f13622b);
        eVar.a(d, aVar.f13623c);
        eVar.a(f13637e, Build.MANUFACTURER);
        eVar.a(f13638f, aVar.d);
        eVar.a(f13639g, aVar.f13624e);
    }
}
