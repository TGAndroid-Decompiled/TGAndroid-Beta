package gb;

import android.os.Build;
public final class d implements na.d {
    public static final d f13647a = new Object();
    public static final na.c f13648b = na.c.c("appId");
    public static final na.c f13649c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c f13650e = na.c.c("osVersion");
    public static final na.c f13651f = na.c.c("logEnvironment");
    public static final na.c f13652g = na.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f13648b, bVar.f13629a);
        eVar.a(f13649c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f13650e, Build.VERSION.RELEASE);
        eVar.a(f13651f, y.f13784b);
        eVar.a(f13652g, bVar.f13630b);
    }
}
