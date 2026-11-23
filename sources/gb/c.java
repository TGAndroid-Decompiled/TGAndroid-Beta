package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f13291a = new Object();
    public static final na.c f13292b = na.c.c("packageName");
    public static final na.c f13293c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f13294e = na.c.c("deviceManufacturer");
    public static final na.c f13295f = na.c.c("currentProcessDetails");
    public static final na.c f13296g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13292b, aVar.f13277a);
        eVar.a(f13293c, aVar.f13278b);
        eVar.a(d, aVar.f13279c);
        eVar.a(f13294e, Build.MANUFACTURER);
        eVar.a(f13295f, aVar.d);
        eVar.a(f13296g, aVar.f13280e);
    }
}
