package db;
public final class e implements ma.d {
    public static final e f8638a = new Object();
    public static final ma.c f8639b = ma.c.c("performance");
    public static final ma.c f8640c = ma.c.c("crashlytics");
    public static final ma.c d = ma.c.c("sessionSamplingRate");

    @Override
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f8639b, kVar.f8695a);
        eVar.a(f8640c, kVar.f8696b);
        eVar.c(d, kVar.f8697c);
    }
}
