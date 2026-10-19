package ab;

import android.os.Build;
public final class c implements ja.d {
    public static final c f372a = new Object();
    public static final ja.c f373b = ja.c.c("packageName");
    public static final ja.c f374c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f375f = ja.c.c("currentProcessDetails");
    public static final ja.c f376g = ja.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f373b, aVar.f362a);
        eVar.d(f374c, aVar.f363b);
        eVar.d(d, aVar.f364c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f375f, aVar.d);
        eVar.d(f376g, aVar.e);
    }
}
