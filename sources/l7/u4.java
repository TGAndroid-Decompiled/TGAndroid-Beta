package l7;
public final class u4 implements u9.d {
    public static final u4 f12051a = new Object();
    public static final u9.c f12052b = new u9.c("detectorOptions", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c f12053c = new u9.c("errorCodes", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("totalInitializationMs", w.c.h(l.d.o(h0.class, new e0(3))));
    public static final u9.c f12054e = new u9.c("loggingInitializationMs", w.c.h(l.d.o(h0.class, new e0(4))));
    public static final u9.c f12055f = new u9.c("otherErrors", w.c.h(l.d.o(h0.class, new e0(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        m8 m8Var = (m8) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f12052b, m8Var.f11948a);
        eVar.e(f12053c, m8Var.f11949b);
        eVar.e(d, null);
        eVar.e(f12054e, null);
        eVar.e(f12055f, null);
    }
}
