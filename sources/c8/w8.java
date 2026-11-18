package c8;
public final class w8 implements na.d {
    public static final w8 f5032a = new Object();
    public static final na.c f5033b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f5034c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f5035e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f5036f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5033b, teVar.f4968a);
        eVar.a(f5034c, teVar.f4969b);
        eVar.a(d, teVar.f4970c);
        eVar.a(f5035e, teVar.d);
        eVar.a(f5036f, teVar.f4971e);
    }
}
