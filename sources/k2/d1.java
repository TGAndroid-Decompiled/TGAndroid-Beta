package k2;

import android.util.Pair;
public final class d1 implements Runnable {
    public final int f16475a;
    public final f1 f16476b;
    public final Pair f16477c;
    public final w2.u d;
    public final w2.c0 f16478e;

    public d1(f1 f1Var, Pair pair, w2.u uVar, w2.c0 c0Var, int i3) {
        this.f16475a = i3;
        this.f16476b = f1Var;
        this.f16477c = pair;
        this.d = uVar;
        this.f16478e = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f16475a) {
            case 0:
                l2.f fVar = this.f16476b.f16503b.h;
                Pair pair = this.f16477c;
                fVar.z(((Integer) pair.first).intValue(), (w2.g0) pair.second, this.d, this.f16478e);
                return;
            default:
                l2.f fVar2 = this.f16476b.f16503b.h;
                Pair pair2 = this.f16477c;
                fVar2.t(((Integer) pair2.first).intValue(), (w2.g0) pair2.second, this.d, this.f16478e);
                return;
        }
    }
}
