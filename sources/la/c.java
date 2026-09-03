package la;

import android.os.Build;
public final class c implements u9.d {
    public static final c f11850a = new Object();
    public static final u9.c f11851b = u9.c.c("packageName");
    public static final u9.c f11852c = u9.c.c("versionName");
    public static final u9.c d = u9.c.c("appBuildVersion");
    public static final u9.c e = u9.c.c("deviceManufacturer");
    public static final u9.c f11853f = u9.c.c("currentProcessDetails");
    public static final u9.c f11854g = u9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11851b, aVar.f11840a);
        eVar.e(f11852c, aVar.f11841b);
        eVar.e(d, aVar.f11842c);
        eVar.e(e, Build.MANUFACTURER);
        eVar.e(f11853f, aVar.d);
        eVar.e(f11854g, aVar.e);
    }
}
