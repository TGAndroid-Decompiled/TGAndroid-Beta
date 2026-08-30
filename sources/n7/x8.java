package n7;
public final class x8 implements u9.d {
    public static final x8 f14794a = new Object();
    public static final u9.c f14795b = new u9.c("isForegroundConfidenceMaskEnabled", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c f14796c = new u9.c("isForegroundBitmapEnabled", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", vh.v2.h(kh.a2.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isSubjectConfidenceMaskEnabled", vh.v2.h(kh.a2.p(w.class, new s(4))));
    public static final u9.c f14797f = new u9.c("isSubjectBitmapEnabled", vh.v2.h(kh.a2.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14795b, weVar.f14781a);
        eVar.e(f14796c, weVar.f14782b);
        eVar.e(d, weVar.f14783c);
        eVar.e(e, weVar.d);
        eVar.e(f14797f, weVar.e);
    }
}
