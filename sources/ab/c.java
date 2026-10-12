package ab;

import android.os.Build;
public final class c implements ja.d {
    public static final c f370a = new Object();
    public static final ja.c f371b = ja.c.c("packageName");
    public static final ja.c f372c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f373f = ja.c.c("currentProcessDetails");
    public static final ja.c f374g = ja.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f371b, aVar.f360a);
        eVar.d(f372c, aVar.f361b);
        eVar.d(d, aVar.f362c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f373f, aVar.d);
        eVar.d(f374g, aVar.e);
    }
}
