package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f12333a;
    public final e1 f12334b;
    public final Pair f12335c;

    public c1(e1 e1Var, Pair pair, int i10) {
        this.f12333a = i10;
        this.f12334b = e1Var;
        this.f12335c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12333a) {
            case 0:
                j2.f fVar = this.f12334b.f12356b.h;
                Pair pair = this.f12335c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f12334b.f12356b.h;
                Pair pair2 = this.f12335c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
