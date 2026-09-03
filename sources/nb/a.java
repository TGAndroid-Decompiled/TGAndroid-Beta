package nb;

import c5.j;
import c9.f;
import cb.h;
public final class a implements f {
    public static final a f14882b = new a(0);
    public static final a f14883c = new a(1);
    public final int f14884a;

    public a(int i10) {
        this.f14884a = i10;
    }

    @Override
    public final Object d0(j jVar) {
        switch (this.f14884a) {
            case 0:
                return new c((h) jVar.a(h.class));
            default:
                return new b((c) jVar.a(c.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
