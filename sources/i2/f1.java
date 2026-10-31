package i2;

import android.util.Pair;
public final class f1 implements Runnable {
    public final int f7858a;
    public final i1 f7859b;
    public final Pair f7860c;

    public f1(i1 i1Var, Pair pair, int i10) {
        this.f7858a = i10;
        this.f7859b = i1Var;
        this.f7860c = pair;
    }

    @Override
    public final void run() {
        switch (this.f7858a) {
            case 0:
                j2.g gVar = this.f7859b.f7937b.h;
                Pair pair = this.f7860c;
                gVar.E(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.g gVar2 = this.f7859b.f7937b.h;
                Pair pair2 = this.f7860c;
                gVar2.J(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
