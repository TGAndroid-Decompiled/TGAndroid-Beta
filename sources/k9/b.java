package k9;
public final class b implements u9.d {
    public static final b f10814a = new Object();
    public static final u9.c f10815b = u9.c.c("pid");
    public static final u9.c f10816c = u9.c.c("processName");
    public static final u9.c d = u9.c.c("reasonCode");
    public static final u9.c f10817e = u9.c.c("importance");
    public static final u9.c f10818f = u9.c.c("pss");
    public static final u9.c f10819g = u9.c.c("rss");
    public static final u9.c h = u9.c.c("timestamp");
    public static final u9.c f10820i = u9.c.c("traceFile");
    public static final u9.c f10821j = u9.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.a(f10815b, b0Var.f10822a);
        eVar.e(f10816c, b0Var.f10823b);
        eVar.a(d, b0Var.f10824c);
        eVar.a(f10817e, b0Var.d);
        eVar.b(f10818f, b0Var.f10825e);
        eVar.b(f10819g, b0Var.f10826f);
        eVar.b(h, b0Var.f10827g);
        eVar.e(f10820i, b0Var.h);
        eVar.e(f10821j, b0Var.f10828i);
    }
}
