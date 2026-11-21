package c8;
public final class w8 implements na.d {
    public static final w8 f5058a = new Object();
    public static final na.c f5059b = new na.c("isForegroundConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f5060c = new na.c("isForegroundBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f5061e = new na.c("isSubjectConfidenceMaskEnabled", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f5062f = new na.c("isSubjectBitmapEnabled", i5.c.p(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5059b, teVar.f4994a);
        eVar.a(f5060c, teVar.f4995b);
        eVar.a(d, teVar.f4996c);
        eVar.a(f5061e, teVar.d);
        eVar.a(f5062f, teVar.f4997e);
    }
}
