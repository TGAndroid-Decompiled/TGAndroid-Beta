package l7;
public final class l3 implements u9.d {
    public static final l3 f11916a = new Object();
    public static final u9.c f11917b = new u9.c("maxMs", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c f11918c = new u9.c("minMs", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("avgMs", w.c.h(l.d.o(h0.class, new e0(3))));
    public static final u9.c f11919e = new u9.c("firstQuartileMs", w.c.h(l.d.o(h0.class, new e0(4))));
    public static final u9.c f11920f = new u9.c("medianMs", w.c.h(l.d.o(h0.class, new e0(5))));
    public static final u9.c f11921g = new u9.c("thirdQuartileMs", w.c.h(l.d.o(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11917b, g7Var.f11860a);
        eVar.e(f11918c, g7Var.f11861b);
        eVar.e(d, g7Var.f11862c);
        eVar.e(f11919e, g7Var.d);
        eVar.e(f11920f, g7Var.f11863e);
        eVar.e(f11921g, g7Var.f11864f);
    }
}
