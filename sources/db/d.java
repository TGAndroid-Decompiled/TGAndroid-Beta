package db;

import android.os.Build;
public final class d implements ma.d {
    public static final d f8625a = new Object();
    public static final ma.c f8626b = ma.c.c("appId");
    public static final ma.c f8627c = ma.c.c("deviceModel");
    public static final ma.c d = ma.c.c("sessionSdkVersion");
    public static final ma.c f8628e = ma.c.c("osVersion");
    public static final ma.c f8629f = ma.c.c("logEnvironment");
    public static final ma.c f8630g = ma.c.c("androidAppInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f8626b, bVar.f8604a);
        eVar.a(f8627c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(f8628e, Build.VERSION.RELEASE);
        eVar.a(f8629f, x.f8752b);
        eVar.a(f8630g, bVar.f8605b);
    }
}
