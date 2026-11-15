package l2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f18902a;
    public final c1 f18903b;
    public final Pair f18904c;

    public b1(c1 c1Var, Pair pair, int i7) {
        this.f18902a = i7;
        this.f18903b = c1Var;
        this.f18904c = pair;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                m2.e eVar = this.f18903b.f18909b.h;
                Pair pair = this.f18904c;
                eVar.z(((Integer) pair.first).intValue(), (x2.f0) pair.second);
                return;
            default:
                m2.e eVar2 = this.f18903b.f18909b.h;
                Pair pair2 = this.f18904c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.f0) pair2.second);
                return;
        }
    }
}
