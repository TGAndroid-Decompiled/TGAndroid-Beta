package n7;
public final class y2 implements u9.d {
    public static final y2 f14822a = new Object();
    public static final u9.c f14823b = new u9.c("logEventKey", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c f14824c = new u9.c("eventCount", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.v2.h(kh.a2.p(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14823b, j1Var.f14612a);
        eVar.e(f14824c, j1Var.f14613b);
        eVar.e(d, j1Var.f14614c);
    }
}
