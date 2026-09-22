package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f3489b = new a(0);
    public static final a f3490c = new a(1);
    public final int f3491a;

    public a(int i10) {
        this.f3491a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f3491a) {
            case 0:
                return new c((g) cVar.b(g.class));
            default:
                return new b((c) cVar.b(c.class), (qb.d) cVar.b(qb.d.class));
        }
    }
}
