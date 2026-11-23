package c8;
public final class j4 implements na.d {
    public static final j4 f4870a = new Object();
    public static final na.c f4871b = new na.c("maxMs", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f4872c = new na.c("minMs", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f4873e = new na.c("firstQuartileMs", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f4874f = new na.c("medianMs", i5.c.p(a8.p0.x(w.class, new s(5))));
    public static final na.c f4875g = new na.c("thirdQuartileMs", i5.c.p(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f4871b, laVar.f4899a);
        eVar.a(f4872c, laVar.f4900b);
        eVar.a(d, laVar.f4901c);
        eVar.a(f4873e, laVar.d);
        eVar.a(f4874f, laVar.f4902e);
        eVar.a(f4875g, laVar.f4903f);
    }
}
