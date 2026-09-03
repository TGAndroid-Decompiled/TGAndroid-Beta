package n7;
public final class x8 implements u9.d {
    public static final x8 f14779a = new Object();
    public static final u9.c f14780b = new u9.c("isForegroundConfidenceMaskEnabled", vh.w2.h(kf.k0.p(w.class, new s(1))));
    public static final u9.c f14781c = new u9.c("isForegroundBitmapEnabled", vh.w2.h(kf.k0.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("isMultipleSubjectsEnabled", vh.w2.h(kf.k0.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isSubjectConfidenceMaskEnabled", vh.w2.h(kf.k0.p(w.class, new s(4))));
    public static final u9.c f14782f = new u9.c("isSubjectBitmapEnabled", vh.w2.h(kf.k0.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14780b, weVar.f14766a);
        eVar.e(f14781c, weVar.f14767b);
        eVar.e(d, weVar.f14768c);
        eVar.e(e, weVar.d);
        eVar.e(f14782f, weVar.e);
    }
}
