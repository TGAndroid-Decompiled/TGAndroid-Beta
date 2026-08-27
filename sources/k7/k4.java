package k7;

public final class k4 implements r9.d {

    public static final k4 f14852a = new k4();

    public static final r9.c f14853b = new r9.c("maxMs", s3.c.h(i0.a.s(w.class, new s(1))));

    public static final r9.c f14854c = new r9.c("minMs", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("avgMs", s3.c.h(i0.a.s(w.class, new s(3))));

    public static final r9.c f14855e = new r9.c("firstQuartileMs", s3.c.h(i0.a.s(w.class, new s(4))));

    public static final r9.c f14856f = new r9.c("medianMs", s3.c.h(i0.a.s(w.class, new s(5))));

    public static final r9.c f14857g = new r9.c("thirdQuartileMs", s3.c.h(i0.a.s(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f14853b, maVar.f14882a);
        eVar.a(f14854c, maVar.f14883b);
        eVar.a(d, maVar.f14884c);
        eVar.a(f14855e, maVar.d);
        eVar.a(f14856f, maVar.f14885e);
        eVar.a(f14857g, maVar.f14886f);
    }
}
