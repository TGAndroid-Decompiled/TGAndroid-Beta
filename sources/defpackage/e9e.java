package defpackage;
public final class e9e implements zq7 {
    public static final e9e a = new Object();
    public static final sa4 b = new sa4("maxMs", c00.n(xnb.q(bpd.class, new tnd(1))));
    public static final sa4 c = new sa4("minMs", c00.n(xnb.q(bpd.class, new tnd(2))));
    public static final sa4 d = new sa4("avgMs", c00.n(xnb.q(bpd.class, new tnd(3))));
    public static final sa4 e = new sa4("firstQuartileMs", c00.n(xnb.q(bpd.class, new tnd(4))));
    public static final sa4 f = new sa4("medianMs", c00.n(xnb.q(bpd.class, new tnd(5))));
    public static final sa4 g = new sa4("thirdQuartileMs", c00.n(xnb.q(bpd.class, new tnd(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        kue kueVar = (kue) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, kueVar.a);
        ar7Var.a(c, kueVar.b);
        ar7Var.a(d, kueVar.c);
        ar7Var.a(e, kueVar.d);
        ar7Var.a(f, kueVar.e);
        ar7Var.a(g, kueVar.f);
    }
}
