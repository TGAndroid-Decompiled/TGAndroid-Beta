package l7;
public final class y1 implements u9.d {
    public static final y1 f12106a = new Object();
    public static final u9.c f12107b = new u9.c("logEventKey", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c f12108c = new u9.c("eventCount", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", w.c.h(l.d.o(h0.class, new e0(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f12107b, y0Var.f12103a);
        eVar.e(f12108c, y0Var.f12104b);
        eVar.e(d, y0Var.f12105c);
    }
}
