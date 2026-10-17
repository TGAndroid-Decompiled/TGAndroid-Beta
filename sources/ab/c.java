package ab;

import android.os.Build;
public final class c implements ja.d {
    public static final c f373a = new Object();
    public static final ja.c f374b = ja.c.c("packageName");
    public static final ja.c f375c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f376f = ja.c.c("currentProcessDetails");
    public static final ja.c f377g = ja.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f374b, aVar.f363a);
        eVar.d(f375c, aVar.f364b);
        eVar.d(d, aVar.f365c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f376f, aVar.d);
        eVar.d(f377g, aVar.e);
    }
}
