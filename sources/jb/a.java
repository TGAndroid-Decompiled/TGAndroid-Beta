package jb;

import ya.g;
public final class a implements y8.d {
    public static final a f14285b = new a(0);
    public static final a f14286c = new a(1);
    public final int f14287a;

    public a(int i9) {
        this.f14287a = i9;
    }

    @Override
    public final Object H1(b3.b bVar) {
        switch (this.f14287a) {
            case 0:
                return new c((g) bVar.a(g.class));
            default:
                return new b((c) bVar.a(c.class), (ya.d) bVar.a(ya.d.class));
        }
    }
}
