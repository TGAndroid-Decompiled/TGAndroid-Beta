package n7;
public final class r4 implements u9.d {
    public static final r4 f14707a = new Object();
    public static final u9.c f14708b = new u9.c("imageFormat", vh.v2.h(kh.a2.p(w.class, new s(1))));
    public static final u9.c f14709c = new u9.c("originalImageSize", vh.v2.h(kh.a2.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("compressedImageSize", vh.v2.h(kh.a2.p(w.class, new s(3))));
    public static final u9.c e = new u9.c("isOdmlImage", vh.v2.h(kh.a2.p(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f14708b, saVar.f14728a);
        eVar.e(f14709c, saVar.f14729b);
        eVar.e(d, null);
        eVar.e(e, null);
    }
}
