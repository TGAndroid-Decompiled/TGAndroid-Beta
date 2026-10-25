package a8;
public final class g9 implements ka.d {
    public static final g9 f488a = new Object();
    public static final ka.c f489b = new ka.c("isForegroundConfidenceMaskEnabled", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c f490c = new ka.c("isForegroundBitmapEnabled", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("isMultipleSubjectsEnabled", ic.a.m(a1.g.x(e0.class, new z(3))));
    public static final ka.c e = new ka.c("isSubjectConfidenceMaskEnabled", ic.a.m(a1.g.x(e0.class, new z(4))));
    public static final ka.c f491f = new ka.c("isSubjectBitmapEnabled", ic.a.m(a1.g.x(e0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ef efVar = (ef) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f489b, efVar.f437a);
        eVar.a(f490c, efVar.f438b);
        eVar.a(d, efVar.f439c);
        eVar.a(e, efVar.d);
        eVar.a(f491f, efVar.e);
    }
}
