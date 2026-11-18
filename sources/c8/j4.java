package c8;
public final class j4 implements na.d {
    public static final j4 f4841a = new Object();
    public static final na.c f4842b = new na.c("maxMs", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f4843c = new na.c("minMs", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f4844e = new na.c("firstQuartileMs", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f4845f = new na.c("medianMs", i5.c.p(a8.p0.x(w.class, new s(5))));
    public static final na.c f4846g = new na.c("thirdQuartileMs", i5.c.p(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f4842b, laVar.f4870a);
        eVar.a(f4843c, laVar.f4871b);
        eVar.a(d, laVar.f4872c);
        eVar.a(f4844e, laVar.d);
        eVar.a(f4845f, laVar.f4873e);
        eVar.a(f4846g, laVar.f4874f);
    }
}
