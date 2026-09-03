package n7;
public final class k4 implements u9.d {
    public static final k4 f14617a = new Object();
    public static final u9.c f14618b = new u9.c("maxMs", vh.w2.h(kf.k0.p(w.class, new s(1))));
    public static final u9.c f14619c = new u9.c("minMs", vh.w2.h(kf.k0.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("avgMs", vh.w2.h(kf.k0.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", vh.w2.h(kf.k0.p(w.class, new s(4))));
    public static final u9.c f14620f = new u9.c("medianMs", vh.w2.h(kf.k0.p(w.class, new s(5))));
    public static final u9.c f14621g = new u9.c("thirdQuartileMs", vh.w2.h(kf.k0.p(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14618b, maVar.f14647a);
        eVar.e(f14619c, maVar.f14648b);
        eVar.e(d, maVar.f14649c);
        eVar.e(e, maVar.d);
        eVar.e(f14620f, maVar.e);
        eVar.e(f14621g, maVar.f14650f);
    }
}
