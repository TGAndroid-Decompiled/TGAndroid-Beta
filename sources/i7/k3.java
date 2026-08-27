package i7;

public final class k3 implements r9.d {

    public static final k3 f10695a = new k3();

    public static final r9.c f10696b = new r9.c("maxMs", s3.c.h(i0.a.r(h0.class, new e0(1))));

    public static final r9.c f10697c = new r9.c("minMs", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("avgMs", s3.c.h(i0.a.r(h0.class, new e0(3))));

    public static final r9.c f10698e = new r9.c("firstQuartileMs", s3.c.h(i0.a.r(h0.class, new e0(4))));

    public static final r9.c f10699f = new r9.c("medianMs", s3.c.h(i0.a.r(h0.class, new e0(5))));

    public static final r9.c f10700g = new r9.c("thirdQuartileMs", s3.c.h(i0.a.r(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        f7 f7Var = (f7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10696b, f7Var.f10637a);
        eVar.a(f10697c, f7Var.f10638b);
        eVar.a(d, f7Var.f10639c);
        eVar.a(f10698e, f7Var.d);
        eVar.a(f10699f, f7Var.f10640e);
        eVar.a(f10700g, f7Var.f10641f);
    }
}
