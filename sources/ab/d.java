package ab;

import android.os.Build;
public final class d implements ja.d {
    public static final d f381a = new Object();
    public static final ja.c f382b = ja.c.c("appId");
    public static final ja.c f383c = ja.c.c("deviceModel");
    public static final ja.c d = ja.c.c("sessionSdkVersion");
    public static final ja.c e = ja.c.c("osVersion");
    public static final ja.c f384f = ja.c.c("logEnvironment");
    public static final ja.c f385g = ja.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f382b, bVar.f367a);
        eVar.d(f383c, Build.MODEL);
        eVar.d(d, "1.2.0");
        eVar.d(e, Build.VERSION.RELEASE);
        eVar.d(f384f, p.LOG_ENVIRONMENT_PROD);
        eVar.d(f385g, bVar.f368b);
    }
}
