package l7;
public final class k4 implements s9.d {
    public static final k4 f14857a = new Object();
    public static final s9.c f14858b = new s9.c("maxMs", u3.c.h(j7.l1.q(w.class, new s(1))));
    public static final s9.c f14859c = new s9.c("minMs", u3.c.h(j7.l1.q(w.class, new s(2))));
    public static final s9.c d = new s9.c("avgMs", u3.c.h(j7.l1.q(w.class, new s(3))));
    public static final s9.c f14860e = new s9.c("firstQuartileMs", u3.c.h(j7.l1.q(w.class, new s(4))));
    public static final s9.c f14861f = new s9.c("medianMs", u3.c.h(j7.l1.q(w.class, new s(5))));
    public static final s9.c f14862g = new s9.c("thirdQuartileMs", u3.c.h(j7.l1.q(w.class, new s(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        ma maVar = (ma) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f14858b, maVar.f14887a);
        eVar.e(f14859c, maVar.f14888b);
        eVar.e(d, maVar.f14889c);
        eVar.e(f14860e, maVar.d);
        eVar.e(f14861f, maVar.f14890e);
        eVar.e(f14862g, maVar.f14891f);
    }
}
