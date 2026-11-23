package l2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f19367a;
    public final d1 f19368b;
    public final Pair f19369c;

    public c1(d1 d1Var, Pair pair, int i7) {
        this.f19367a = i7;
        this.f19368b = d1Var;
        this.f19369c = pair;
    }

    @Override
    public final void run() {
        switch (this.f19367a) {
            case 0:
                m2.d dVar = this.f19368b.f19374b.h;
                Pair pair = this.f19369c;
                dVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                return;
            default:
                m2.d dVar2 = this.f19368b.f19374b.h;
                Pair pair2 = this.f19369c;
                dVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                return;
        }
    }
}
