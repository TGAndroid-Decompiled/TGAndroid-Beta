package c8;
public final class j4 implements na.d {
    public static final j4 f5726a = new Object();
    public static final na.c f5727b = new na.c("maxMs", jg.g.q(a8.p0.x(w.class, new s(1))));
    public static final na.c f5728c = new na.c("minMs", jg.g.q(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", jg.g.q(a8.p0.x(w.class, new s(3))));
    public static final na.c f5729e = new na.c("firstQuartileMs", jg.g.q(a8.p0.x(w.class, new s(4))));
    public static final na.c f5730f = new na.c("medianMs", jg.g.q(a8.p0.x(w.class, new s(5))));
    public static final na.c f5731g = new na.c("thirdQuartileMs", jg.g.q(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5727b, laVar.f5753a);
        eVar.a(f5728c, laVar.f5754b);
        eVar.a(d, laVar.f5755c);
        eVar.a(f5729e, laVar.d);
        eVar.a(f5730f, laVar.f5756e);
        eVar.a(f5731g, laVar.f5757f);
    }
}
