package i2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f12338a;
    public final e1 f12339b;
    public final Pair f12340c;

    public d1(e1 e1Var, Pair pair, int i10) {
        this.f12338a = i10;
        this.f12339b = e1Var;
        this.f12340c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12338a) {
            case 0:
                j2.f fVar = this.f12339b.f12352b.h;
                Pair pair = this.f12340c;
                fVar.h(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f12339b.f12352b.h;
                Pair pair2 = this.f12340c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
        }
    }
}
