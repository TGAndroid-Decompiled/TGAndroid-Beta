package a8;
public final class t4 implements ka.d {
    public static final t4 f928a = new Object();
    public static final ka.c f929b = new ka.c("maxMs", ic.a.m(a1.g.x(e0.class, new z(1))));
    public static final ka.c f930c = new ka.c("minMs", ic.a.m(a1.g.x(e0.class, new z(2))));
    public static final ka.c d = new ka.c("avgMs", ic.a.m(a1.g.x(e0.class, new z(3))));
    public static final ka.c e = new ka.c("firstQuartileMs", ic.a.m(a1.g.x(e0.class, new z(4))));
    public static final ka.c f931f = new ka.c("medianMs", ic.a.m(a1.g.x(e0.class, new z(5))));
    public static final ka.c f932g = new ka.c("thirdQuartileMs", ic.a.m(a1.g.x(e0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        va vaVar = (va) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f929b, vaVar.f965a);
        eVar.a(f930c, vaVar.f966b);
        eVar.a(d, vaVar.f967c);
        eVar.a(e, vaVar.d);
        eVar.a(f931f, vaVar.e);
        eVar.a(f932g, vaVar.f968f);
    }
}
