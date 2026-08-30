package l7;
public final class y1 implements u9.d {
    public static final y1 f11700a = new Object();
    public static final u9.c f11701b = new u9.c("logEventKey", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c f11702c = new u9.c("eventCount", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", vh.v2.h(kh.a2.o(h0.class, new e0(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11701b, y0Var.f11697a);
        eVar.e(f11702c, y0Var.f11698b);
        eVar.e(d, y0Var.f11699c);
    }
}
