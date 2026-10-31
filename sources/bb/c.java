package bb;

import android.os.Build;
public final class c implements ja.d {
    public static final c f2530a = new Object();
    public static final ja.c f2531b = ja.c.c("packageName");
    public static final ja.c f2532c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f2533f = ja.c.c("currentProcessDetails");
    public static final ja.c f2534g = ja.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f2531b, aVar.f2520a);
        eVar.d(f2532c, aVar.f2521b);
        eVar.d(d, aVar.f2522c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f2533f, aVar.d);
        eVar.d(f2534g, aVar.e);
    }
}
