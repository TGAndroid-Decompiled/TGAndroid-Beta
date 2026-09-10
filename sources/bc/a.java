package bc;

import bi.u6;
import qb.g;
public final class a implements q9.d {
    public static final a f2183b = new a(0);
    public static final a f2184c = new a(1);
    public final int f2185a;

    public a(int i10) {
        this.f2185a = i10;
    }

    @Override
    public final Object P1(u6 u6Var) {
        switch (this.f2185a) {
            case 0:
                return new c((g) u6Var.a(g.class));
            default:
                return new b((c) u6Var.a(c.class), (qb.d) u6Var.a(qb.d.class));
        }
    }
}
