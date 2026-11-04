package k2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f16486a;
    public final f1 f16487b;
    public final Pair f16488c;

    public e1(f1 f1Var, Pair pair, int i3) {
        this.f16486a = i3;
        this.f16487b = f1Var;
        this.f16488c = pair;
    }

    @Override
    public final void run() {
        switch (this.f16486a) {
            case 0:
                l2.f fVar = this.f16487b.f16503b.h;
                Pair pair = this.f16488c;
                fVar.b(((Integer) pair.first).intValue(), (w2.g0) pair.second);
                return;
            default:
                l2.f fVar2 = this.f16487b.f16503b.h;
                Pair pair2 = this.f16488c;
                fVar2.I(((Integer) pair2.first).intValue(), (w2.g0) pair2.second);
                return;
        }
    }
}
