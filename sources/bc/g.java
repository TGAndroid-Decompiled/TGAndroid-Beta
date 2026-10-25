package bc;

import a8.me;
public final class g implements s9.d {
    public static final g f3847b = new g(0);
    public static final g f3848c = new g(1);
    public static final g d = new g(2);
    public final int f3849a;

    public g(int i10) {
        this.f3849a = i10;
    }

    @Override
    public final Object d1(me meVar) {
        switch (this.f3849a) {
            case 0:
                return new e((sb.g) meVar.a(sb.g.class));
            case 1:
                return new d((e) meVar.a(e.class), (sb.d) meVar.a(sb.d.class));
            default:
                return new yb.b(meVar.d(d.class));
        }
    }
}
