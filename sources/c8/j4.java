package c8;
public final class j4 implements na.d {
    public static final j4 f5728a = new Object();
    public static final na.c f5729b = new na.c("maxMs", jg.g.q(a8.p0.x(w.class, new s(1))));
    public static final na.c f5730c = new na.c("minMs", jg.g.q(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", jg.g.q(a8.p0.x(w.class, new s(3))));
    public static final na.c f5731e = new na.c("firstQuartileMs", jg.g.q(a8.p0.x(w.class, new s(4))));
    public static final na.c f5732f = new na.c("medianMs", jg.g.q(a8.p0.x(w.class, new s(5))));
    public static final na.c f5733g = new na.c("thirdQuartileMs", jg.g.q(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5729b, laVar.f5755a);
        eVar.a(f5730c, laVar.f5756b);
        eVar.a(d, laVar.f5757c);
        eVar.a(f5731e, laVar.d);
        eVar.a(f5732f, laVar.f5758e);
        eVar.a(f5733g, laVar.f5759f);
    }
}
