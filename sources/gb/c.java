package gb;

import android.os.Build;
public final class c implements na.d {
    public static final c f12982a = new Object();
    public static final na.c f12983b = na.c.c("packageName");
    public static final na.c f12984c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c f12985e = na.c.c("deviceManufacturer");
    public static final na.c f12986f = na.c.c("currentProcessDetails");
    public static final na.c f12987g = na.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f12983b, aVar.f12968a);
        eVar.a(f12984c, aVar.f12969b);
        eVar.a(d, aVar.f12970c);
        eVar.a(f12985e, Build.MANUFACTURER);
        eVar.a(f12986f, aVar.d);
        eVar.a(f12987g, aVar.f12971e);
    }
}
