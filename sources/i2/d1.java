package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f12336a;
    public final e1 f12337b;
    public final Pair f12338c;

    public d1(e1 e1Var, Pair pair, int i10) {
        this.f12336a = i10;
        this.f12337b = e1Var;
        this.f12338c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12336a) {
            case 0:
                j2.f fVar = this.f12337b.f12350b.h;
                Pair pair = this.f12338c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f12337b.f12350b.h;
                Pair pair2 = this.f12338c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
