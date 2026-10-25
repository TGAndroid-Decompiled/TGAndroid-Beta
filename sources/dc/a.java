package dc;

import a8.me;
import sb.g;
public final class a implements s9.d {
    public static final a f8309b = new a(0);
    public static final a f8310c = new a(1);
    public final int f8311a;

    public a(int i10) {
        this.f8311a = i10;
    }

    @Override
    public final Object d1(me meVar) {
        switch (this.f8311a) {
            case 0:
                return new c((g) meVar.a(g.class));
            default:
                return new b((c) meVar.a(c.class), (sb.d) meVar.a(sb.d.class));
        }
    }
}
