package l2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f17815a;
    public final g1 f17816b;
    public final Pair f17817c;

    public f1(g1 g1Var, Pair pair, int i7) {
        this.f17815a = i7;
        this.f17816b = g1Var;
        this.f17817c = pair;
    }

    @Override
    public final void run() {
        switch (this.f17815a) {
            case 0:
                m2.e eVar = this.f17816b.f17824b.h;
                Pair pair = this.f17817c;
                eVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                return;
            default:
                m2.e eVar2 = this.f17816b.f17824b.h;
                Pair pair2 = this.f17817c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                return;
        }
    }
}
