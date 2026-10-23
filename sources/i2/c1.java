package i2;

import android.util.Pair;
public final class c1 implements Runnable {
    public final int f12360a;
    public final e1 f12361b;
    public final Pair f12362c;
    public final u2.v d;
    public final u2.d0 e;

    public c1(e1 e1Var, Pair pair, u2.v vVar, u2.d0 d0Var, int i10) {
        this.f12360a = i10;
        this.f12361b = e1Var;
        this.f12362c = pair;
        this.d = vVar;
        this.e = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f12360a) {
            case 0:
                j2.e eVar = this.f12361b.f12382b.h;
                Pair pair = this.f12362c;
                eVar.k(((Integer) pair.first).intValue(), (u2.h0) pair.second, this.d, this.e);
                return;
            default:
                j2.e eVar2 = this.f12361b.f12382b.h;
                Pair pair2 = this.f12362c;
                eVar2.f(((Integer) pair2.first).intValue(), (u2.h0) pair2.second, this.d, this.e);
                return;
        }
    }
}
