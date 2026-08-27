package i7;

public final class t4 implements r9.d {

    public static final t4 f10832a = new t4();

    public static final r9.c f10833b = new r9.c("detectorOptions", s3.c.h(i0.a.r(h0.class, new e0(1))));

    public static final r9.c f10834c = new r9.c("errorCodes", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("totalInitializationMs", s3.c.h(i0.a.r(h0.class, new e0(3))));

    public static final r9.c f10835e = new r9.c("loggingInitializationMs", s3.c.h(i0.a.r(h0.class, new e0(4))));

    public static final r9.c f10836f = new r9.c("otherErrors", s3.c.h(i0.a.r(h0.class, new e0(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        l8 l8Var = (l8) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10833b, l8Var.f10727a);
        eVar.a(f10834c, l8Var.f10728b);
        eVar.a(d, null);
        eVar.a(f10835e, null);
        eVar.a(f10836f, null);
    }
}
