package nb;

import c5.j;
import cb.h;
public final class a implements c9.e {
    public static final a f15912b = new a(0);
    public static final a f15913c = new a(1);
    public final int f15914a;

    public a(int i10) {
        this.f15914a = i10;
    }

    @Override
    public final Object e0(j jVar) {
        switch (this.f15914a) {
            case 0:
                return new c((h) jVar.a(h.class));
            default:
                return new b((c) jVar.a(c.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
