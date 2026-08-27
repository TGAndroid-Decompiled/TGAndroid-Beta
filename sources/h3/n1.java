package h3;

import android.util.Pair;

public final class n1 implements Runnable {

    public final int f8036a;

    public final g5.b f8037b;

    public final Pair f8038c;
    public final j4.p d;

    public final j4.x f8039e;

    public n1(g5.b bVar, Pair pair, j4.p pVar, j4.x xVar, int i10) {
        this.f8036a = i10;
        this.f8037b = bVar;
        this.f8038c = pair;
        this.d = pVar;
        this.f8039e = xVar;
    }

    @Override
    public final void run() {
        switch (this.f8036a) {
            case 0:
                i3.f fVar = ((s1) this.f8037b.f6390c).h;
                Pair pair = this.f8038c;
                fVar.h(((Integer) pair.first).intValue(), (j4.c0) pair.second, this.d, this.f8039e);
                break;
            case 1:
                i3.f fVar2 = ((s1) this.f8037b.f6390c).h;
                Pair pair2 = this.f8038c;
                fVar2.g(((Integer) pair2.first).intValue(), (j4.c0) pair2.second, this.d, this.f8039e);
                break;
            default:
                i3.f fVar3 = ((s1) this.f8037b.f6390c).h;
                Pair pair3 = this.f8038c;
                fVar3.f(((Integer) pair3.first).intValue(), (j4.c0) pair3.second, this.d, this.f8039e);
                break;
        }
    }
}
