package ab;

import android.os.Build;
public final class d implements ja.d {
    public static final d f382a = new Object();
    public static final ja.c f383b = ja.c.c("appId");
    public static final ja.c f384c = ja.c.c("deviceModel");
    public static final ja.c d = ja.c.c("sessionSdkVersion");
    public static final ja.c e = ja.c.c("osVersion");
    public static final ja.c f385f = ja.c.c("logEnvironment");
    public static final ja.c f386g = ja.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f383b, bVar.f368a);
        eVar.d(f384c, Build.MODEL);
        eVar.d(d, "1.2.0");
        eVar.d(e, Build.VERSION.RELEASE);
        eVar.d(f385f, p.LOG_ENVIRONMENT_PROD);
        eVar.d(f386g, bVar.f369b);
    }
}
