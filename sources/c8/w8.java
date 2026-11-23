package c8;
public final class w8 implements na.d {
    public static final w8 f5061a = new Object();
    public static final na.c f5062b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f5063c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f5064e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f5065f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5062b, teVar.f4997a);
        eVar.a(f5063c, teVar.f4998b);
        eVar.a(d, teVar.f4999c);
        eVar.a(f5064e, teVar.d);
        eVar.a(f5065f, teVar.f5000e);
    }
}
