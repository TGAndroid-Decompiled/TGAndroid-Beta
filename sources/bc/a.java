package bc;

import qb.g;
public final class a implements q9.d {
    public static final a f2571b = new a(0);
    public static final a f2572c = new a(1);
    public final int f2573a;

    public a(int i10) {
        this.f2573a = i10;
    }

    @Override
    public final Object D(cf.c cVar) {
        switch (this.f2573a) {
            case 0:
                return new c((g) cVar.a(g.class));
            default:
                return new b((c) cVar.a(c.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
