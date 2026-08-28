package hb;
public final class g implements y8.d {
    public static final g f10399b = new g(0);
    public static final g f10400c = new g(1);
    public static final g d = new g(2);
    public final int f10401a;

    public g(int i9) {
        this.f10401a = i9;
    }

    @Override
    public final Object H1(b3.b bVar) {
        switch (this.f10401a) {
            case 0:
                return new e((ya.g) bVar.a(ya.g.class));
            case 1:
                return new d((e) bVar.a(e.class), (ya.d) bVar.a(ya.d.class));
            default:
                return new eb.b(bVar.e(d.class));
        }
    }
}
