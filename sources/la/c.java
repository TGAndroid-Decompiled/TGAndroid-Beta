package la;

import android.os.Build;
public final class c implements u9.d {
    public static final c f11740a = new Object();
    public static final u9.c f11741b = u9.c.c("packageName");
    public static final u9.c f11742c = u9.c.c("versionName");
    public static final u9.c d = u9.c.c("appBuildVersion");
    public static final u9.c e = u9.c.c("deviceManufacturer");
    public static final u9.c f11743f = u9.c.c("currentProcessDetails");
    public static final u9.c f11744g = u9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11741b, aVar.f11730a);
        eVar.e(f11742c, aVar.f11731b);
        eVar.e(d, aVar.f11732c);
        eVar.e(e, Build.MANUFACTURER);
        eVar.e(f11743f, aVar.d);
        eVar.e(f11744g, aVar.e);
    }
}
