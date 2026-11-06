package gb;

import android.content.Context;
public final class m implements ib.b {
    public final int f13728a;
    public final d9.o f13729b;

    public m(d9.o oVar, int i7) {
        this.f13728a = i7;
        this.f13729b = oVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13728a) {
            case 0:
                return new l((ua.b) this.f13729b.f8253a);
            default:
                return new jb.a((Context) this.f13729b.f8253a);
        }
    }
}
