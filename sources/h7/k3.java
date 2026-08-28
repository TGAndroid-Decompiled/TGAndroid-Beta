package h7;
public final class k3 implements q9.d {
    public static final k3 f9986a = new Object();
    public static final q9.c f9987b = new q9.c("maxMs", ta.b.g(e2.c.s(h0.class, new e0(1))));
    public static final q9.c f9988c = new q9.c("minMs", ta.b.g(e2.c.s(h0.class, new e0(2))));
    public static final q9.c d = new q9.c("avgMs", ta.b.g(e2.c.s(h0.class, new e0(3))));
    public static final q9.c f9989e = new q9.c("firstQuartileMs", ta.b.g(e2.c.s(h0.class, new e0(4))));
    public static final q9.c f9990f = new q9.c("medianMs", ta.b.g(e2.c.s(h0.class, new e0(5))));
    public static final q9.c f9991g = new q9.c("thirdQuartileMs", ta.b.g(e2.c.s(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(f9987b, f7Var.f9928a);
        eVar.g(f9988c, f7Var.f9929b);
        eVar.g(d, f7Var.f9930c);
        eVar.g(f9989e, f7Var.d);
        eVar.g(f9990f, f7Var.f9931e);
        eVar.g(f9991g, f7Var.f9932f);
    }
}
