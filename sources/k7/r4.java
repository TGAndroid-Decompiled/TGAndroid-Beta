package k7;

public final class r4 implements r9.d {

    public static final r4 f14933a = new r4();

    public static final r9.c f14934b = new r9.c("imageFormat", s3.c.h(i0.a.s(w.class, new s(1))));

    public static final r9.c f14935c = new r9.c("originalImageSize", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("compressedImageSize", s3.c.h(i0.a.s(w.class, new s(3))));

    public static final r9.c f14936e = new r9.c("isOdmlImage", s3.c.h(i0.a.s(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f14934b, raVar.f14941a);
        eVar.a(f14935c, raVar.f14942b);
        eVar.a(d, null);
        eVar.a(f14936e, null);
    }
}
