package l7;
public final class l3 implements u9.d {
    public static final l3 f11527a = new Object();
    public static final u9.c f11528b = new u9.c("maxMs", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c f11529c = new u9.c("minMs", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("avgMs", vh.v2.h(kh.a2.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("firstQuartileMs", vh.v2.h(kh.a2.o(h0.class, new e0(4))));
    public static final u9.c f11530f = new u9.c("medianMs", vh.v2.h(kh.a2.o(h0.class, new e0(5))));
    public static final u9.c f11531g = new u9.c("thirdQuartileMs", vh.v2.h(kh.a2.o(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11528b, g7Var.f11475a);
        eVar.e(f11529c, g7Var.f11476b);
        eVar.e(d, g7Var.f11477c);
        eVar.e(e, g7Var.d);
        eVar.e(f11530f, g7Var.e);
        eVar.e(f11531g, g7Var.f11478f);
    }
}
