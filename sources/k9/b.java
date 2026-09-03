package k9;
public final class b implements u9.d {
    public static final b f10057a = new Object();
    public static final u9.c f10058b = u9.c.c("pid");
    public static final u9.c f10059c = u9.c.c("processName");
    public static final u9.c d = u9.c.c("reasonCode");
    public static final u9.c e = u9.c.c("importance");
    public static final u9.c f10060f = u9.c.c("pss");
    public static final u9.c f10061g = u9.c.c("rss");
    public static final u9.c h = u9.c.c("timestamp");
    public static final u9.c f10062i = u9.c.c("traceFile");
    public static final u9.c f10063j = u9.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.a(f10058b, b0Var.f10064a);
        eVar.e(f10059c, b0Var.f10065b);
        eVar.a(d, b0Var.f10066c);
        eVar.a(e, b0Var.d);
        eVar.b(f10060f, b0Var.e);
        eVar.b(f10061g, b0Var.f10067f);
        eVar.b(h, b0Var.f10068g);
        eVar.e(f10062i, b0Var.h);
        eVar.e(f10063j, b0Var.f10069i);
    }
}
