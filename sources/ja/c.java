package ja;

import android.os.Build;
public final class c implements s9.d {
    public static final c f11304a = new Object();
    public static final s9.c f11305b = s9.c.c("packageName");
    public static final s9.c f11306c = s9.c.c("versionName");
    public static final s9.c d = s9.c.c("appBuildVersion");
    public static final s9.c f11307e = s9.c.c("deviceManufacturer");
    public static final s9.c f11308f = s9.c.c("currentProcessDetails");
    public static final s9.c f11309g = s9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11305b, aVar.f11293a);
        eVar.e(f11306c, aVar.f11294b);
        eVar.e(d, aVar.f11295c);
        eVar.e(f11307e, Build.MANUFACTURER);
        eVar.e(f11308f, aVar.d);
        eVar.e(f11309g, aVar.f11296e);
    }
}
