package ia;

import android.os.Build;

public final class c implements r9.d {

    public static final c f10977a = new c();

    public static final r9.c f10978b = r9.c.c("packageName");

    public static final r9.c f10979c = r9.c.c("versionName");
    public static final r9.c d = r9.c.c("appBuildVersion");

    public static final r9.c f10980e = r9.c.c("deviceManufacturer");

    public static final r9.c f10981f = r9.c.c("currentProcessDetails");

    public static final r9.c f10982g = r9.c.c("appProcessDetails");

    @Override
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10978b, aVar.f10966a);
        eVar.a(f10979c, aVar.f10967b);
        eVar.a(d, aVar.f10968c);
        eVar.a(f10980e, Build.MANUFACTURER);
        eVar.a(f10981f, aVar.d);
        eVar.a(f10982g, aVar.f10969e);
    }
}
