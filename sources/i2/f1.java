package i2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f13533a;
    public final g1 f13534b;
    public final Pair f13535c;

    public f1(g1 g1Var, Pair pair, int i10) {
        this.f13533a = i10;
        this.f13534b = g1Var;
        this.f13535c = pair;
    }

    @Override
    public final void run() {
        switch (this.f13533a) {
            case 0:
                j2.e eVar = this.f13534b.f13549b.h;
                Pair pair = this.f13535c;
                eVar.g(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.e eVar2 = this.f13534b.f13549b.h;
                Pair pair2 = this.f13535c;
                eVar2.i(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
