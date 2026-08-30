package l7;
public final class u4 implements u9.d {
    public static final u4 f11651a = new Object();
    public static final u9.c f11652b = new u9.c("detectorOptions", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c f11653c = new u9.c("errorCodes", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("totalInitializationMs", vh.v2.h(kh.a2.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("loggingInitializationMs", vh.v2.h(kh.a2.o(h0.class, new e0(4))));
    public static final u9.c f11654f = new u9.c("otherErrors", vh.v2.h(kh.a2.o(h0.class, new e0(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        m8 m8Var = (m8) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11652b, m8Var.f11556a);
        eVar.e(f11653c, m8Var.f11557b);
        eVar.e(d, null);
        eVar.e(e, null);
        eVar.e(f11654f, null);
    }
}
