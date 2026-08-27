package k7;

public final class x8 implements r9.d {

    public static final x8 f15038a = new x8();

    public static final r9.c f15039b = new r9.c("isForegroundConfidenceMaskEnabled", s3.c.h(i0.a.s(w.class, new s(1))));

    public static final r9.c f15040c = new r9.c("isForegroundBitmapEnabled", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("isMultipleSubjectsEnabled", s3.c.h(i0.a.s(w.class, new s(3))));

    public static final r9.c f15041e = new r9.c("isSubjectConfidenceMaskEnabled", s3.c.h(i0.a.s(w.class, new s(4))));

    public static final r9.c f15042f = new r9.c("isSubjectBitmapEnabled", s3.c.h(i0.a.s(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f15039b, veVar.f14997a);
        eVar.a(f15040c, veVar.f14998b);
        eVar.a(d, veVar.f14999c);
        eVar.a(f15041e, veVar.d);
        eVar.a(f15042f, veVar.f15000e);
    }
}
