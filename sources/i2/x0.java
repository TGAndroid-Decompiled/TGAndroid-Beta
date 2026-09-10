package i2;

import android.util.Pair;
public final class x0 implements Runnable {
    public final int f10397a;
    public final b1 f10398b;
    public final Pair f10399c;
    public final u2.c0 d;

    public x0(b1 b1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.f10397a = i10;
        this.f10398b = b1Var;
        this.f10399c = pair;
        this.d = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f10397a) {
            case 0:
                j2.e eVar = this.f10398b.f10110b.h;
                Pair pair = this.f10399c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                eVar.c(intValue, g0Var, this.d);
                return;
            default:
                j2.e eVar2 = this.f10398b.f10110b.h;
                Pair pair2 = this.f10399c;
                eVar2.d(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                return;
        }
    }
}
