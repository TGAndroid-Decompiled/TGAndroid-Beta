package l2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f17812a;
    public final g1 f17813b;
    public final Pair f17814c;

    public f1(g1 g1Var, Pair pair, int i7) {
        this.f17812a = i7;
        this.f17813b = g1Var;
        this.f17814c = pair;
    }

    @Override
    public final void run() {
        switch (this.f17812a) {
            case 0:
                m2.e eVar = this.f17813b.f17821b.h;
                Pair pair = this.f17814c;
                eVar.z(((Integer) pair.first).intValue(), (x2.g0) pair.second);
                return;
            default:
                m2.e eVar2 = this.f17813b.f17821b.h;
                Pair pair2 = this.f17814c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.g0) pair2.second);
                return;
        }
    }
}
