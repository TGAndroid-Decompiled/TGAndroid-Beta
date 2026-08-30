package l7;
public final class q3 implements u9.d {
    public static final q3 f11601a = new Object();
    public static final u9.c f11602b = new u9.c("imageFormat", vh.v2.h(kh.a2.o(h0.class, new e0(1))));
    public static final u9.c f11603c = new u9.c("originalImageSize", vh.v2.h(kh.a2.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("compressedImageSize", vh.v2.h(kh.a2.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("isOdmlImage", vh.v2.h(kh.a2.o(h0.class, new e0(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        k7 k7Var = (k7) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f11602b, k7Var.f11522a);
        eVar.e(f11603c, k7Var.f11523b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
