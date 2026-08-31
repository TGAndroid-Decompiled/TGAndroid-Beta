package la;

import android.os.Build;
public final class c implements u9.d {
    public static final c f12148a = new Object();
    public static final u9.c f12149b = u9.c.c("packageName");
    public static final u9.c f12150c = u9.c.c("versionName");
    public static final u9.c d = u9.c.c("appBuildVersion");
    public static final u9.c f12151e = u9.c.c("deviceManufacturer");
    public static final u9.c f12152f = u9.c.c("currentProcessDetails");
    public static final u9.c f12153g = u9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f12149b, aVar.f12137a);
        eVar.e(f12150c, aVar.f12138b);
        eVar.e(d, aVar.f12139c);
        eVar.e(f12151e, Build.MANUFACTURER);
        eVar.e(f12152f, aVar.d);
        eVar.e(f12153g, aVar.f12140e);
    }
}
