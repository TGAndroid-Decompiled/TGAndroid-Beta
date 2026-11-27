package defpackage;
public final class yzd implements zq7 {
    public static final yzd a = new Object();
    public static final sa4 b = new sa4("logEventKey", c00.n(xnb.q(bpd.class, new tnd(1))));
    public static final sa4 c = new sa4("eventCount", c00.n(xnb.q(bpd.class, new tnd(2))));
    public static final sa4 d = new sa4("inferenceDurationStats", c00.n(xnb.q(bpd.class, new tnd(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        eud eudVar = (eud) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, eudVar.a);
        ar7Var.a(c, eudVar.b);
        ar7Var.a(d, eudVar.c);
    }
}
