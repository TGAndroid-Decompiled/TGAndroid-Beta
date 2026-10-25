package bb;

import android.os.Build;
public final class c implements ka.d {
    public static final c f3730a = new Object();
    public static final ka.c f3731b = ka.c.c("packageName");
    public static final ka.c f3732c = ka.c.c("versionName");
    public static final ka.c d = ka.c.c("appBuildVersion");
    public static final ka.c e = ka.c.c("deviceManufacturer");
    public static final ka.c f3733f = ka.c.c("currentProcessDetails");
    public static final ka.c f3734g = ka.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f3731b, aVar.f3720a);
        eVar.a(f3732c, aVar.f3721b);
        eVar.a(d, aVar.f3722c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f3733f, aVar.d);
        eVar.a(f3734g, aVar.e);
    }
}
