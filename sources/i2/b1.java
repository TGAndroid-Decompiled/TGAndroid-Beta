package i2;

import android.util.Pair;
public final class b1 implements Runnable {
    public final int f12354a;
    public final e1 f12355b;
    public final Pair f12356c;
    public final u2.d0 d;

    public b1(e1 e1Var, Pair pair, u2.d0 d0Var, int i10) {
        this.f12354a = i10;
        this.f12355b = e1Var;
        this.f12356c = pair;
        this.d = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f12354a) {
            case 0:
                j2.e eVar = this.f12355b.f12382b.h;
                Pair pair = this.f12356c;
                int intValue = ((Integer) pair.first).intValue();
                u2.h0 h0Var = (u2.h0) pair.second;
                h0Var.getClass();
                eVar.d(intValue, h0Var, this.d);
                return;
            default:
                j2.e eVar2 = this.f12355b.f12382b.h;
                Pair pair2 = this.f12356c;
                eVar2.e(((Integer) pair2.first).intValue(), (u2.h0) pair2.second, this.d);
                return;
        }
    }
}
