package i2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f7859a;
    public final i1 f7860b;
    public final Pair f7861c;

    public f1(i1 i1Var, Pair pair, int i10) {
        this.f7859a = i10;
        this.f7860b = i1Var;
        this.f7861c = pair;
    }

    @Override
    public final void run() {
        switch (this.f7859a) {
            case 0:
                j2.g gVar = this.f7860b.f7938b.h;
                Pair pair = this.f7861c;
                gVar.E(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.g gVar2 = this.f7860b.f7938b.h;
                Pair pair2 = this.f7861c;
                gVar2.J(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
