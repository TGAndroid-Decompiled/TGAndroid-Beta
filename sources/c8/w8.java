package c8;
public final class w8 implements na.d {
    public static final w8 f4746a = new Object();
    public static final na.c f4747b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f4748c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f4749e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f4750f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f4747b, teVar.f4681a);
        eVar.a(f4748c, teVar.f4682b);
        eVar.a(d, teVar.f4683c);
        eVar.a(f4749e, teVar.d);
        eVar.a(f4750f, teVar.f4684e);
    }
}
