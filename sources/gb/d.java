package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13645a = new Object();
    public static final na.c f13646b = na.c.c("appId");
    public static final na.c f13647c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13648e = na.c.c("osVersion");
    public static final na.c f13649f = na.c.c("logEnvironment");
    public static final na.c f13650g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13646b, bVar.f13627a);
        eVar.a(f13647c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13648e, Build.VERSION.RELEASE);
        eVar.a(f13649f, y.f13782b);
        eVar.a(f13650g, bVar.f13628b);
    }
}
