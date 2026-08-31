package n7;
public final class x8 implements u9.d {
    public static final x8 f15797a = new Object();
    public static final u9.c f15798b = new u9.c("isForegroundConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15799c = new u9.c("isForegroundBitmapEnabled", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15800e = new u9.c("isSubjectConfidenceMaskEnabled", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15801f = new u9.c("isSubjectBitmapEnabled", w.c.h(l.d.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15798b, weVar.f15783a);
        eVar.e(f15799c, weVar.f15784b);
        eVar.e(d, weVar.f15785c);
        eVar.e(f15800e, weVar.d);
        eVar.e(f15801f, weVar.f15786e);
    }
}
