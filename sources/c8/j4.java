package c8;
public final class j4 implements na.d {
    public static final j4 f4557a = new Object();
    public static final na.c f4558b = new na.c("maxMs", i5.c.p(a8.p0.x(w.class, new s(1))));
    public static final na.c f4559c = new na.c("minMs", i5.c.p(a8.p0.x(w.class, new s(2))));
    public static final na.c d = new na.c("avgMs", i5.c.p(a8.p0.x(w.class, new s(3))));
    public static final na.c f4560e = new na.c("firstQuartileMs", i5.c.p(a8.p0.x(w.class, new s(4))));
    public static final na.c f4561f = new na.c("medianMs", i5.c.p(a8.p0.x(w.class, new s(5))));
    public static final na.c f4562g = new na.c("thirdQuartileMs", i5.c.p(a8.p0.x(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        la laVar = (la) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(f4558b, laVar.f4585a);
        eVar.a(f4559c, laVar.f4586b);
        eVar.a(d, laVar.f4587c);
        eVar.a(f4560e, laVar.d);
        eVar.a(f4561f, laVar.f4588e);
        eVar.a(f4562g, laVar.f4589f);
    }
}
