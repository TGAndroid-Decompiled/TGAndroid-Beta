package ab;

import android.os.Build;
public final class d implements ja.d {
    public static final d f379a = new Object();
    public static final ja.c f380b = ja.c.c("appId");
    public static final ja.c f381c = ja.c.c("deviceModel");
    public static final ja.c d = ja.c.c("sessionSdkVersion");
    public static final ja.c e = ja.c.c("osVersion");
    public static final ja.c f382f = ja.c.c("logEnvironment");
    public static final ja.c f383g = ja.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f380b, bVar.f365a);
        eVar.d(f381c, Build.MODEL);
        eVar.d(d, "1.2.0");
        eVar.d(e, Build.VERSION.RELEASE);
        eVar.d(f382f, p.LOG_ENVIRONMENT_PROD);
        eVar.d(f383g, bVar.f366b);
    }
}
