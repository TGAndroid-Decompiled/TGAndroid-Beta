package defpackage;
public final class c0e implements zq7 {
    public static final c0e a = new Object();
    public static final sa4 b = new sa4("errorCode", c00.n(xnb.q(bpd.class, new tnd(1))));
    public static final sa4 c = new sa4("isColdCall", c00.n(xnb.q(bpd.class, new tnd(2))));
    public static final sa4 d = new sa4("imageInfo", c00.n(xnb.q(bpd.class, new tnd(3))));
    public static final sa4 e = new sa4("detectorOptions", c00.n(xnb.q(bpd.class, new tnd(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        std stdVar = (std) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, stdVar.a);
        ar7Var.a(c, stdVar.b);
        ar7Var.a(d, null);
        ar7Var.a(e, stdVar.c);
    }
}
