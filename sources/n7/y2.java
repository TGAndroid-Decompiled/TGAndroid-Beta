package n7;
public final class y2 implements u9.d {
    public static final y2 f15831a = new Object();
    public static final u9.c f15832b = new u9.c("logEventKey", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15833c = new u9.c("eventCount", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("inferenceDurationStats", w.c.h(l.d.p(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15832b, j1Var.f15604a);
        eVar.e(f15833c, j1Var.f15605b);
        eVar.e(d, j1Var.f15606c);
    }
}
