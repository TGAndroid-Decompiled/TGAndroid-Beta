package ia;

import android.os.Build;

public final class d implements r9.d {

    public static final d f10986a = new d();

    public static final r9.c f10987b = r9.c.c("appId");

    public static final r9.c f10988c = r9.c.c("deviceModel");
    public static final r9.c d = r9.c.c("sessionSdkVersion");

    public static final r9.c f10989e = r9.c.c("osVersion");

    public static final r9.c f10990f = r9.c.c("logEnvironment");

    public static final r9.c f10991g = r9.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10987b, bVar.f10973a);
        eVar.a(f10988c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(f10989e, Build.VERSION.RELEASE);
        eVar.a(f10990f, q.LOG_ENVIRONMENT_PROD);
        eVar.a(f10991g, bVar.f10974b);
    }
}
