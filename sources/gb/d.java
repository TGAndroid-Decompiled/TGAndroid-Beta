package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13303a = new Object();
    public static final na.c f13304b = na.c.c("appId");
    public static final na.c f13305c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13306e = na.c.c("osVersion");
    public static final na.c f13307f = na.c.c("logEnvironment");
    public static final na.c f13308g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13304b, bVar.f13284a);
        eVar.a(f13305c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13306e, Build.VERSION.RELEASE);
        eVar.a(f13307f, y.f13432b);
        eVar.a(f13308g, bVar.f13285b);
    }
}
