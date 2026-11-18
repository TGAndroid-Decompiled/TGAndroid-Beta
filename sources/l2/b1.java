package l2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f19269a;
    public final c1 f19270b;
    public final Pair f19271c;

    public b1(c1 c1Var, Pair pair, int i7) {
        this.f19269a = i7;
        this.f19270b = c1Var;
        this.f19271c = pair;
    }

    @Override
    public final void run() {
        switch (this.f19269a) {
            case 0:
                m2.d dVar = this.f19270b.f19276b.h;
                Pair pair = this.f19271c;
                dVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                return;
            default:
                m2.d dVar2 = this.f19270b.f19276b.h;
                Pair pair2 = this.f19271c;
                dVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                return;
        }
    }
}
