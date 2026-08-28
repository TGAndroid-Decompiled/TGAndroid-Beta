package ha;

import android.os.Build;
public final class c implements q9.d {
    public static final c f10269a = new Object();
    public static final q9.c f10270b = q9.c.c("packageName");
    public static final q9.c f10271c = q9.c.c("versionName");
    public static final q9.c d = q9.c.c("appBuildVersion");
    public static final q9.c f10272e = q9.c.c("deviceManufacturer");
    public static final q9.c f10273f = q9.c.c("currentProcessDetails");
    public static final q9.c f10274g = q9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(f10270b, aVar.f10258a);
        eVar.g(f10271c, aVar.f10259b);
        eVar.g(d, aVar.f10260c);
        eVar.g(f10272e, Build.MANUFACTURER);
        eVar.g(f10273f, aVar.d);
        eVar.g(f10274g, aVar.f10261e);
    }
}
