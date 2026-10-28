package i2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f13532a;
    public final g1 f13533b;
    public final Pair f13534c;

    public f1(g1 g1Var, Pair pair, int i10) {
        this.f13532a = i10;
        this.f13533b = g1Var;
        this.f13534c = pair;
    }

    @Override
    public final void run() {
        switch (this.f13532a) {
            case 0:
                j2.e eVar = this.f13533b.f13548b.h;
                Pair pair = this.f13534c;
                eVar.g(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.e eVar2 = this.f13533b.f13548b.h;
                Pair pair2 = this.f13534c;
                eVar2.i(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
