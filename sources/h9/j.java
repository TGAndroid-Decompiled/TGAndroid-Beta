package h9;

public final class j implements r9.d {

    public static final j f8728a = new j();

    public static final r9.c f8729b = r9.c.c("generator");

    public static final r9.c f8730c = r9.c.c("identifier");
    public static final r9.c d = r9.c.c("appQualitySessionId");

    public static final r9.c f8731e = r9.c.c("startedAt");

    public static final r9.c f8732f = r9.c.c("endedAt");

    public static final r9.c f8733g = r9.c.c("crashed");
    public static final r9.c h = r9.c.c("app");

    public static final r9.c f8734i = r9.c.c("user");

    public static final r9.c f8735j = r9.c.c("os");

    public static final r9.c f8736k = r9.c.c("device");

    public static final r9.c f8737l = r9.c.c("events");

    public static final r9.c f8738m = r9.c.c("generatorType");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.a(f8729b, h0Var.f8705a);
        eVar.a(f8730c, h0Var.f8706b.getBytes(e2.f8682a));
        eVar.a(d, h0Var.f8707c);
        eVar.c(f8731e, h0Var.d);
        eVar.a(f8732f, h0Var.f8708e);
        eVar.g(f8733g, h0Var.f8709f);
        eVar.a(h, h0Var.f8710g);
        eVar.a(f8734i, h0Var.h);
        eVar.a(f8735j, h0Var.f8711i);
        eVar.a(f8736k, h0Var.f8712j);
        eVar.a(f8737l, h0Var.f8713k);
        eVar.d(f8738m, h0Var.f8714l);
    }
}
