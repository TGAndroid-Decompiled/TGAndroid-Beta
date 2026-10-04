package i2;

import android.util.Pair;
public final class a1 implements Runnable {
    public final int f11557a;
    public final d1 f11558b;
    public final Pair f11559c;

    public a1(d1 d1Var, Pair pair, int i10) {
        this.f11557a = i10;
        this.f11558b = d1Var;
        this.f11559c = pair;
    }

    @Override
    public final void run() {
        switch (this.f11557a) {
            case 0:
                j2.f fVar = this.f11558b.f11581b.h;
                Pair pair = this.f11559c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                return;
            case 1:
                j2.f fVar2 = this.f11558b.f11581b.h;
                Pair pair2 = this.f11559c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                return;
            default:
                j2.f fVar3 = this.f11558b.f11581b.h;
                Pair pair3 = this.f11559c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                return;
        }
    }
}
