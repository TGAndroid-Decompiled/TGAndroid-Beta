package j3;

import android.util.Pair;
public final class n1 implements Runnable {
    public final int f10643a;
    public final g9.l f10644b;
    public final Pair f10645c;
    public final l4.p d;
    public final l4.x f10646e;

    public n1(g9.l lVar, Pair pair, l4.p pVar, l4.x xVar, int i10) {
        this.f10643a = i10;
        this.f10644b = lVar;
        this.f10645c = pair;
        this.d = pVar;
        this.f10646e = xVar;
    }

    @Override
    public final void run() {
        switch (this.f10643a) {
            case 0:
                k3.f fVar = ((s1) this.f10644b.f7169c).h;
                Pair pair = this.f10645c;
                fVar.h(((Integer) pair.first).intValue(), (l4.c0) pair.second, this.d, this.f10646e);
                return;
            case 1:
                k3.f fVar2 = ((s1) this.f10644b.f7169c).h;
                Pair pair2 = this.f10645c;
                fVar2.g(((Integer) pair2.first).intValue(), (l4.c0) pair2.second, this.d, this.f10646e);
                return;
            default:
                k3.f fVar3 = ((s1) this.f10644b.f7169c).h;
                Pair pair3 = this.f10645c;
                fVar3.a(((Integer) pair3.first).intValue(), (l4.c0) pair3.second, this.d, this.f10646e);
                return;
        }
    }
}
