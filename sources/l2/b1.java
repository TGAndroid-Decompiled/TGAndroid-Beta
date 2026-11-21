package l2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f19294a;
    public final c1 f19295b;
    public final Pair f19296c;

    public b1(c1 c1Var, Pair pair, int i7) {
        this.f19294a = i7;
        this.f19295b = c1Var;
        this.f19296c = pair;
    }

    @Override
    public final void run() {
        switch (this.f19294a) {
            case 0:
                m2.d dVar = this.f19295b.f19301b.h;
                Pair pair = this.f19296c;
                dVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                return;
            default:
                m2.d dVar2 = this.f19295b.f19301b.h;
                Pair pair2 = this.f19296c;
                dVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                return;
        }
    }
}
