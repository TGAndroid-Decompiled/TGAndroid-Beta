package bb;

import android.os.Build;
public final class d implements ja.d {
    public static final d f2539a = new Object();
    public static final ja.c f2540b = ja.c.c("appId");
    public static final ja.c f2541c = ja.c.c("deviceModel");
    public static final ja.c d = ja.c.c("sessionSdkVersion");
    public static final ja.c e = ja.c.c("osVersion");
    public static final ja.c f2542f = ja.c.c("logEnvironment");
    public static final ja.c f2543g = ja.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f2540b, bVar.f2525a);
        eVar.d(f2541c, Build.MODEL);
        eVar.d(d, "1.2.0");
        eVar.d(e, Build.VERSION.RELEASE);
        eVar.d(f2542f, p.LOG_ENVIRONMENT_PROD);
        eVar.d(f2543g, bVar.f2526b);
    }
}
