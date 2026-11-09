package c8;
public final class w8 implements na.d {
    public static final w8 f5920a = new Object();
    public static final na.c f5921b = new na.c("isForegroundConfidenceMaskEnabled", jg.g.q(a8.p0.x(w.class, new s(1))));
    public static final na.c f5922c = new na.c("isForegroundBitmapEnabled", jg.g.q(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("isMultipleSubjectsEnabled", jg.g.q(a8.p0.x(w.class, new s(3))));
    public static final na.c f5923e = new na.c("isSubjectConfidenceMaskEnabled", jg.g.q(a8.p0.x(w.class, new s(4))));
    public static final na.c f5924f = new na.c("isSubjectBitmapEnabled", jg.g.q(a8.p0.x(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        te teVar = (te) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5921b, teVar.f5853a);
        eVar.a(f5922c, teVar.f5854b);
        eVar.a(d, teVar.f5855c);
        eVar.a(f5923e, teVar.d);
        eVar.a(f5924f, teVar.f5856e);
    }
}
