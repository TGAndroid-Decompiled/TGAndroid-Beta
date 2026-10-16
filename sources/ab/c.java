package ab;

import android.os.Build;
public final class c implements ja.d {
    public static final c f374a = new Object();
    public static final ja.c f375b = ja.c.c("packageName");
    public static final ja.c f376c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f377f = ja.c.c("currentProcessDetails");
    public static final ja.c f378g = ja.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f375b, aVar.f364a);
        eVar.d(f376c, aVar.f365b);
        eVar.d(d, aVar.f366c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f377f, aVar.d);
        eVar.d(f378g, aVar.e);
    }
}
