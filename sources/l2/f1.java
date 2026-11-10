package l2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f17816a;
    public final g1 f17817b;
    public final Pair f17818c;

    public f1(g1 g1Var, Pair pair, int i7) {
        this.f17816a = i7;
        this.f17817b = g1Var;
        this.f17818c = pair;
    }

    @Override
    public final void run() {
        switch (this.f17816a) {
            case 0:
                m2.e eVar = this.f17817b.f17825b.h;
                Pair pair = this.f17818c;
                eVar.z(((Integer) pair.first).intValue(), (x2.f0) pair.second);
                return;
            default:
                m2.e eVar2 = this.f17817b.f17825b.h;
                Pair pair2 = this.f17818c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.f0) pair2.second);
                return;
        }
    }
}
