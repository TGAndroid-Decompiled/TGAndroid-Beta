package b8;
public final class r4 implements ma.d {
    public static final r4 f3037a = new Object();
    public static final ma.c f3038b = new ma.c("maxMs", k2.p1.o(a1.g.w(e0.class, new z(1))));
    public static final ma.c f3039c = new ma.c("minMs", k2.p1.o(a1.g.w(e0.class, new z(2))));
    public static final ma.c d = new ma.c("avgMs", k2.p1.o(a1.g.w(e0.class, new z(3))));
    public static final ma.c f3040e = new ma.c("firstQuartileMs", k2.p1.o(a1.g.w(e0.class, new z(4))));
    public static final ma.c f3041f = new ma.c("medianMs", k2.p1.o(a1.g.w(e0.class, new z(5))));
    public static final ma.c f3042g = new ma.c("thirdQuartileMs", k2.p1.o(a1.g.w(e0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ta taVar = (ta) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(f3038b, taVar.f3076a);
        eVar.a(f3039c, taVar.f3077b);
        eVar.a(d, taVar.f3078c);
        eVar.a(f3040e, taVar.d);
        eVar.a(f3041f, taVar.f3079e);
        eVar.a(f3042g, taVar.f3080f);
    }
}
