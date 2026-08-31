package n7;
public final class k4 implements u9.d {
    public static final k4 f15623a = new Object();
    public static final u9.c f15624b = new u9.c("maxMs", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15625c = new u9.c("minMs", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("avgMs", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15626e = new u9.c("firstQuartileMs", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15627f = new u9.c("medianMs", w.c.h(l.d.p(w.class, new s(5))));
    public static final u9.c f15628g = new u9.c("thirdQuartileMs", w.c.h(l.d.p(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15624b, maVar.f15656a);
        eVar.e(f15625c, maVar.f15657b);
        eVar.e(d, maVar.f15658c);
        eVar.e(f15626e, maVar.d);
        eVar.e(f15627f, maVar.f15659e);
        eVar.e(f15628g, maVar.f15660f);
    }
}
