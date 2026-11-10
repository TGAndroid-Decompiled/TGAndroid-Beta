package gb;

import android.content.Context;
public final class m implements ib.b {
    public final int f13730a;
    public final d9.o f13731b;

    public m(d9.o oVar, int i7) {
        this.f13730a = i7;
        this.f13731b = oVar;
    }

    @Override
    public final Object mo24get() {
        switch (this.f13730a) {
            case 0:
                return new l((ua.b) this.f13731b.f8256a);
            default:
                return new jb.a((Context) this.f13731b.f8256a);
        }
    }
}
