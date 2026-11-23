package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13328a = new Object();
    public static final na.c f13329b = na.c.c("packageName");
    public static final na.c f13330c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13331e = na.c.c("deviceManufacturer");
    public static final na.c f13332f = na.c.c("currentProcessDetails");
    public static final na.c f13333g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13329b, aVar.f13314a);
        eVar.a(f13330c, aVar.f13315b);
        eVar.a(d, aVar.f13316c);
        eVar.a(f13331e, Build.MANUFACTURER);
        eVar.a(f13332f, aVar.d);
        eVar.a(f13333g, aVar.f13317e);
    }
}
