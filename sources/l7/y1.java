package l7;
public final class y1 implements u9.d {
    public static final y1 f11810a = new Object();
    public static final u9.c f11811b = new u9.c("logEventKey", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c f11812c = new u9.c("eventCount", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.w2.h(kf.k0.o(h0.class, new e0(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11811b, y0Var.f11807a);
        eVar.e(f11812c, y0Var.f11808b);
        eVar.e(d, y0Var.f11809c);
    }
}
