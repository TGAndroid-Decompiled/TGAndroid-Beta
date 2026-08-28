package ha;

import android.os.Build;
public final class d implements q9.d {
    public static final d f10280a = new Object();
    public static final q9.c f10281b = q9.c.c("appId");
    public static final q9.c f10282c = q9.c.c("deviceModel");
    public static final q9.c d = q9.c.c("sessionSdkVersion");
    public static final q9.c f10283e = q9.c.c("osVersion");
    public static final q9.c f10284f = q9.c.c("logEnvironment");
    public static final q9.c f10285g = q9.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(f10281b, bVar.f10264a);
        eVar.g(f10282c, Build.MODEL);
        eVar.g(d, "1.2.0");
        eVar.g(f10283e, Build.VERSION.RELEASE);
        eVar.g(f10284f, p.LOG_ENVIRONMENT_PROD);
        eVar.g(f10285g, bVar.f10265b);
    }
}
