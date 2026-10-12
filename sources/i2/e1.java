package i2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f10950a;
    public final g1 f10951b;
    public final Pair f10952c;

    public e1(g1 g1Var, Pair pair, int i10) {
        this.f10950a = i10;
        this.f10951b = g1Var;
        this.f10952c = pair;
    }

    @Override
    public final void run() {
        switch (this.f10950a) {
            case 0:
                j2.f fVar = this.f10951b.f10977b.h;
                Pair pair = this.f10952c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f10951b.f10977b.h;
                Pair pair2 = this.f10952c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
