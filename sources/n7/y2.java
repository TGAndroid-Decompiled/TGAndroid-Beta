package n7;
public final class y2 implements u9.d {
    public static final y2 f14807a = new Object();
    public static final u9.c f14808b = new u9.c("logEventKey", vh.w2.h(kf.k0.p(w.class, new s(1))));
    public static final u9.c f14809c = new u9.c("eventCount", vh.w2.h(kf.k0.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.w2.h(kf.k0.p(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14808b, j1Var.f14597a);
        eVar.e(f14809c, j1Var.f14598b);
        eVar.e(d, j1Var.f14599c);
    }
}
