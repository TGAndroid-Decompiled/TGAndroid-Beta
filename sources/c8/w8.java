package c8;
public final class w8 implements na.d {
    public static final w8 f5026a = new Object();
    public static final na.c f5027b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f5028c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f5029e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f5030f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5027b, teVar.f4962a);
        eVar.a(f5028c, teVar.f4963b);
        eVar.a(d, teVar.f4964c);
        eVar.a(f5029e, teVar.d);
        eVar.a(f5030f, teVar.f4965e);
    }
}
