package h9;

public final class b implements r9.d {

    public static final b f8630a = new b();

    public static final r9.c f8631b = r9.c.c("pid");

    public static final r9.c f8632c = r9.c.c("processName");
    public static final r9.c d = r9.c.c("reasonCode");

    public static final r9.c f8633e = r9.c.c("importance");

    public static final r9.c f8634f = r9.c.c("pss");

    public static final r9.c f8635g = r9.c.c("rss");
    public static final r9.c h = r9.c.c("timestamp");

    public static final r9.c f8636i = r9.c.c("traceFile");

    public static final r9.c f8637j = r9.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.d(f8631b, b0Var.f8638a);
        eVar.a(f8632c, b0Var.f8639b);
        eVar.d(d, b0Var.f8640c);
        eVar.d(f8633e, b0Var.d);
        eVar.c(f8634f, b0Var.f8641e);
        eVar.c(f8635g, b0Var.f8642f);
        eVar.c(h, b0Var.f8643g);
        eVar.a(f8636i, b0Var.h);
        eVar.a(f8637j, b0Var.f8644i);
    }
}
