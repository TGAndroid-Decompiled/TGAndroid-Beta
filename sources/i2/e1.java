package i2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f12339a;
    public final f1 f12340b;
    public final Pair f12341c;

    public e1(f1 f1Var, Pair pair, int i10) {
        this.f12339a = i10;
        this.f12340b = f1Var;
        this.f12341c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12339a) {
            case 0:
                j2.f fVar = this.f12340b.f12353b.h;
                Pair pair = this.f12341c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f12340b.f12353b.h;
                Pair pair2 = this.f12341c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
