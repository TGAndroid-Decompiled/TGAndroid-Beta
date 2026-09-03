package l7;
public final class u4 implements u9.d {
    public static final u4 f11761a = new Object();
    public static final u9.c f11762b = new u9.c("detectorOptions", vh.w2.h(kf.k0.o(h0.class, new e0(1))));
    public static final u9.c f11763c = new u9.c("errorCodes", vh.w2.h(kf.k0.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("totalInitializationMs", vh.w2.h(kf.k0.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("loggingInitializationMs", vh.w2.h(kf.k0.o(h0.class, new e0(4))));
    public static final u9.c f11764f = new u9.c("otherErrors", vh.w2.h(kf.k0.o(h0.class, new e0(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        m8 m8Var = (m8) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11762b, m8Var.f11666a);
        eVar.e(f11763c, m8Var.f11667b);
        eVar.e(d, null);
        eVar.e(e, null);
        eVar.e(f11764f, null);
    }
}
