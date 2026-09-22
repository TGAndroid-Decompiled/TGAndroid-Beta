package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f3487b = new a(0);
    public static final a f3488c = new a(1);
    public final int f3489a;

    public a(int i10) {
        this.f3489a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f3489a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
