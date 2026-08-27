package i7;

public final class x1 implements r9.d {

    public static final x1 f10882a = new x1();

    public static final r9.c f10883b = new r9.c("logEventKey", s3.c.h(i0.a.r(h0.class, new e0(1))));

    public static final r9.c f10884c = new r9.c("eventCount", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("inferenceDurationStats", s3.c.h(i0.a.r(h0.class, new e0(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10883b, x0Var.f10879a);
        eVar.a(f10884c, x0Var.f10880b);
        eVar.a(d, x0Var.f10881c);
    }
}
