package db;

import android.os.Build;
public final class c implements ma.d {
    public static final c f8611a = new Object();
    public static final ma.c f8612b = ma.c.c("packageName");
    public static final ma.c f8613c = ma.c.c("versionName");
    public static final ma.c d = ma.c.c("appBuildVersion");
    public static final ma.c f8614e = ma.c.c("deviceManufacturer");
    public static final ma.c f8615f = ma.c.c("currentProcessDetails");
    public static final ma.c f8616g = ma.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f8612b, aVar.f8595a);
        eVar.a(f8613c, aVar.f8596b);
        eVar.a(d, aVar.f8597c);
        eVar.a(f8614e, Build.MANUFACTURER);
        eVar.a(f8615f, aVar.d);
        eVar.a(f8616g, aVar.f8598e);
    }
}
