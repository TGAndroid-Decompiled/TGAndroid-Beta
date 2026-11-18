package c8;
public final class w8 implements na.d {
    public static final w8 f5029a = new Object();
    public static final na.c f5030b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f5031c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f5032e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f5033f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5030b, teVar.f4965a);
        eVar.a(f5031c, teVar.f4966b);
        eVar.a(d, teVar.f4967c);
        eVar.a(f5032e, teVar.d);
        eVar.a(f5033f, teVar.f4968e);
    }
}
