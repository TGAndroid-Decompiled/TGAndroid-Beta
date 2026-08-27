package i7;

public final class p3 implements r9.d {

    public static final p3 f10775a = new p3();

    public static final r9.c f10776b = new r9.c("imageFormat", s3.c.h(i0.a.r(h0.class, new e0(1))));

    public static final r9.c f10777c = new r9.c("originalImageSize", s3.c.h(i0.a.r(h0.class, new e0(2))));
    public static final r9.c d = new r9.c("compressedImageSize", s3.c.h(i0.a.r(h0.class, new e0(3))));

    public static final r9.c f10778e = new r9.c("isOdmlImage", s3.c.h(i0.a.r(h0.class, new e0(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        j7 j7Var = (j7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f10776b, j7Var.f10688a);
        eVar.a(f10777c, j7Var.f10689b);
        eVar.a(d, null);
        eVar.a(f10778e, null);
    }
}
