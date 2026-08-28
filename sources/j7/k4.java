package j7;
public final class k4 implements q9.d {
    public static final k4 f13998a = new Object();
    public static final q9.c f13999b = new q9.c("maxMs", ta.b.g(j3.r0.r(w.class, new s(1))));
    public static final q9.c f14000c = new q9.c("minMs", ta.b.g(j3.r0.r(w.class, new s(2))));
    public static final q9.c d = new q9.c("avgMs", ta.b.g(j3.r0.r(w.class, new s(3))));
    public static final q9.c f14001e = new q9.c("firstQuartileMs", ta.b.g(j3.r0.r(w.class, new s(4))));
    public static final q9.c f14002f = new q9.c("medianMs", ta.b.g(j3.r0.r(w.class, new s(5))));
    public static final q9.c f14003g = new q9.c("thirdQuartileMs", ta.b.g(j3.r0.r(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(f13999b, maVar.f14028a);
        eVar.g(f14000c, maVar.f14029b);
        eVar.g(d, maVar.f14030c);
        eVar.g(f14001e, maVar.d);
        eVar.g(f14002f, maVar.f14031e);
        eVar.g(f14003g, maVar.f14032f);
    }
}
