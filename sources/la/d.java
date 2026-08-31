package la;

import android.os.Build;
public final class d implements u9.d {
    public static final d f12156a = new Object();
    public static final u9.c f12157b = u9.c.c("appId");
    public static final u9.c f12158c = u9.c.c("deviceModel");
    public static final u9.c d = u9.c.c("sessionSdkVersion");
    public static final u9.c f12159e = u9.c.c("osVersion");
    public static final u9.c f12160f = u9.c.c("logEnvironment");
    public static final u9.c f12161g = u9.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f12157b, bVar.f12144a);
        eVar.e(f12158c, Build.MODEL);
        eVar.e(d, "1.2.0");
        eVar.e(f12159e, Build.VERSION.RELEASE);
        eVar.e(f12160f, o.LOG_ENVIRONMENT_PROD);
        eVar.e(f12161g, bVar.f12145b);
    }
}
