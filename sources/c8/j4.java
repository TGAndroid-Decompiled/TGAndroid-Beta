package c8;
public final class j4 implements na.d {
    public static final j4 f5731a = new Object();
    public static final na.c f5732b = new na.c("maxMs", jg.g.q(a8.p0.x(w.class, new s(1))));
    public static final na.c f5733c = new na.c("minMs", jg.g.q(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", jg.g.q(a8.p0.x(w.class, new s(3))));
    public static final na.c f5734e = new na.c("firstQuartileMs", jg.g.q(a8.p0.x(w.class, new s(4))));
    public static final na.c f5735f = new na.c("medianMs", jg.g.q(a8.p0.x(w.class, new s(5))));
    public static final na.c f5736g = new na.c("thirdQuartileMs", jg.g.q(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f5732b, laVar.f5758a);
        eVar.a(f5733c, laVar.f5759b);
        eVar.a(d, laVar.f5760c);
        eVar.a(f5734e, laVar.d);
        eVar.a(f5735f, laVar.f5761e);
        eVar.a(f5736g, laVar.f5762f);
    }
}
