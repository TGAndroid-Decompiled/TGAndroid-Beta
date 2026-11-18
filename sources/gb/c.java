package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13296a = new Object();
    public static final na.c f13297b = na.c.c("packageName");
    public static final na.c f13298c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13299e = na.c.c("deviceManufacturer");
    public static final na.c f13300f = na.c.c("currentProcessDetails");
    public static final na.c f13301g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13297b, aVar.f13282a);
        eVar.a(f13298c, aVar.f13283b);
        eVar.a(d, aVar.f13284c);
        eVar.a(f13299e, Build.MANUFACTURER);
        eVar.a(f13300f, aVar.d);
        eVar.a(f13301g, aVar.f13285e);
    }
}
