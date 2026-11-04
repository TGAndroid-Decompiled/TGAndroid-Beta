package b8;
public final class e9 implements ma.d {
    public static final e9 f2564a = new Object();
    public static final ma.c f2565b = new ma.c("isForegroundConfidenceMaskEnabled", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c f2566c = new ma.c("isForegroundBitmapEnabled", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("isMultipleSubjectsEnabled", k2.p1.o(a1.g.w(e0.class, new z(3))));
    public static final ma.c f2567e = new ma.c("isSubjectConfidenceMaskEnabled", k2.p1.o(a1.g.w(e0.class, new z(4))));
    public static final ma.c f2568f = new ma.c("isSubjectBitmapEnabled", k2.p1.o(a1.g.w(e0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        cf cfVar = (cf) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f2565b, cfVar.f2518a);
        eVar.a(f2566c, cfVar.f2519b);
        eVar.a(d, cfVar.f2520c);
        eVar.a(f2567e, cfVar.d);
        eVar.a(f2568f, cfVar.f2521e);
    }
}
