package l7;
public final class l3 implements u9.d {
    public static final l3 f11637a = new Object();
    public static final u9.c f11638b = new u9.c("maxMs", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c f11639c = new u9.c("minMs", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("avgMs", vh.w2.h(kf.k0.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", vh.w2.h(kf.k0.o(h0.class, new e0(4))));
    public static final u9.c f11640f = new u9.c("medianMs", vh.w2.h(kf.k0.o(h0.class, new e0(5))));
    public static final u9.c f11641g = new u9.c("thirdQuartileMs", vh.w2.h(kf.k0.o(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11638b, g7Var.f11585a);
        eVar.e(f11639c, g7Var.f11586b);
        eVar.e(d, g7Var.f11587c);
        eVar.e(e, g7Var.d);
        eVar.e(f11640f, g7Var.e);
        eVar.e(f11641g, g7Var.f11588f);
    }
}
