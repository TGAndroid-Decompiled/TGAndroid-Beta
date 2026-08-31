package n7;
public final class r4 implements u9.d {
    public static final r4 f15705a = new Object();
    public static final u9.c f15706b = new u9.c("imageFormat", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15707c = new u9.c("originalImageSize", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("compressedImageSize", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15708e = new u9.c("isOdmlImage", w.c.h(l.d.p(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15706b, saVar.f15728a);
        eVar.e(f15707c, saVar.f15729b);
        eVar.e(d, null);
        eVar.e(f15708e, null);
    }
}
