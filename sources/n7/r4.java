package n7;
public final class r4 implements u9.d {
    public static final r4 f15707a = new Object();
    public static final u9.c f15708b = new u9.c("imageFormat", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15709c = new u9.c("originalImageSize", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("compressedImageSize", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15710e = new u9.c("isOdmlImage", w.c.h(l.d.p(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15708b, saVar.f15730a);
        eVar.e(f15709c, saVar.f15731b);
        eVar.e(d, null);
        eVar.e(f15710e, null);
    }
}
