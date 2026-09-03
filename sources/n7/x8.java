package n7;
public final class x8 implements u9.d {
    public static final x8 f15799a = new Object();
    public static final u9.c f15800b = new u9.c("isForegroundConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15801c = new u9.c("isForegroundBitmapEnabled", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15802e = new u9.c("isSubjectConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15803f = new u9.c("isSubjectBitmapEnabled", w.c.h(l.d.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15800b, weVar.f15785a);
        eVar.e(f15801c, weVar.f15786b);
        eVar.e(d, weVar.f15787c);
        eVar.e(f15802e, weVar.d);
        eVar.e(f15803f, weVar.f15788e);
    }
}
