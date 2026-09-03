package n7;
public final class k4 implements u9.d {
    public static final k4 f15625a = new Object();
    public static final u9.c f15626b = new u9.c("maxMs", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15627c = new u9.c("minMs", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("avgMs", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15628e = new u9.c("firstQuartileMs", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15629f = new u9.c("medianMs", w.c.h(l.d.p(w.class, new s(5))));
    public static final u9.c f15630g = new u9.c("thirdQuartileMs", w.c.h(l.d.p(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15626b, maVar.f15658a);
        eVar.e(f15627c, maVar.f15659b);
        eVar.e(d, maVar.f15660c);
        eVar.e(f15628e, maVar.d);
        eVar.e(f15629f, maVar.f15661e);
        eVar.e(f15630g, maVar.f15662f);
    }
}
