package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f12368a;
    public final e1 f12369b;
    public final Pair f12370c;

    public d1(e1 e1Var, Pair pair, int i10) {
        this.f12368a = i10;
        this.f12369b = e1Var;
        this.f12370c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12368a) {
            case 0:
                j2.e eVar = this.f12369b.f12382b.h;
                Pair pair = this.f12370c;
                eVar.h(((Integer) pair.first).intValue(), (u2.h0) pair.second);
                return;
            default:
                j2.e eVar2 = this.f12369b.f12382b.h;
                Pair pair2 = this.f12370c;
                eVar2.j(((Integer) pair2.first).intValue(), (u2.h0) pair2.second);
                return;
        }
    }
}
