package k9;
public final class b implements u9.d {
    public static final b f10077a = new Object();
    public static final u9.c f10078b = u9.c.c("pid");
    public static final u9.c f10079c = u9.c.c("processName");
    public static final u9.c d = u9.c.c("reasonCode");
    public static final u9.c e = u9.c.c("importance");
    public static final u9.c f10080f = u9.c.c("pss");
    public static final u9.c f10081g = u9.c.c("rss");
    public static final u9.c h = u9.c.c("timestamp");
    public static final u9.c f10082i = u9.c.c("traceFile");
    public static final u9.c f10083j = u9.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.a(f10078b, b0Var.f10084a);
        eVar.e(f10079c, b0Var.f10085b);
        eVar.a(d, b0Var.f10086c);
        eVar.a(e, b0Var.d);
        eVar.b(f10080f, b0Var.e);
        eVar.b(f10081g, b0Var.f10087f);
        eVar.b(h, b0Var.f10088g);
        eVar.e(f10082i, b0Var.h);
        eVar.e(f10083j, b0Var.f10089i);
    }
}
