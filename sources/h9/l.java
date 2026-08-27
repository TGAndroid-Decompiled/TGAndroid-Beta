package h9;

public final class l implements r9.d {

    public static final l f8752a = new l();

    public static final r9.c f8753b = r9.c.c("baseAddress");

    public static final r9.c f8754c = r9.c.c("size");
    public static final r9.c d = r9.c.c("name");

    public static final r9.c f8755e = r9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.c(f8753b, o0Var.f8784a);
        eVar.c(f8754c, o0Var.f8785b);
        eVar.a(d, o0Var.f8786c);
        String str = o0Var.d;
        eVar.a(f8755e, str != null ? str.getBytes(e2.f8682a) : null);
    }
}
