package k7;

public final class y2 implements r9.d {

    public static final y2 f15053a = new y2();

    public static final r9.c f15054b = new r9.c("logEventKey", s3.c.h(i0.a.s(w.class, new s(1))));

    public static final r9.c f15055c = new r9.c("eventCount", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("inferenceDurationStats", s3.c.h(i0.a.s(w.class, new s(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f15054b, j1Var.f14836a);
        eVar.a(f15055c, j1Var.f14837b);
        eVar.a(d, j1Var.f14838c);
    }
}
