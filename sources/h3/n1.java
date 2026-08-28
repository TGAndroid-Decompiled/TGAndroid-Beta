package h3;

import android.util.Pair;
public final class n1 implements Runnable {
    public final int f9606a;
    public final g5.b f9607b;
    public final Pair f9608c;
    public final j4.q d;
    public final j4.y f9609e;

    public n1(g5.b bVar, Pair pair, j4.q qVar, j4.y yVar, int i9) {
        this.f9606a = i9;
        this.f9607b = bVar;
        this.f9608c = pair;
        this.d = qVar;
        this.f9609e = yVar;
    }

    @Override
    public final void run() {
        switch (this.f9606a) {
            case 0:
                i3.f fVar = ((s1) this.f9607b.f7112c).h;
                Pair pair = this.f9608c;
                fVar.g(((Integer) pair.first).intValue(), (j4.d0) pair.second, this.d, this.f9609e);
                return;
            case 1:
                i3.f fVar2 = ((s1) this.f9607b.f7112c).h;
                Pair pair2 = this.f9608c;
                fVar2.f(((Integer) pair2.first).intValue(), (j4.d0) pair2.second, this.d, this.f9609e);
                return;
            default:
                i3.f fVar3 = ((s1) this.f9607b.f7112c).h;
                Pair pair3 = this.f9608c;
                fVar3.e(((Integer) pair3.first).intValue(), (j4.d0) pair3.second, this.d, this.f9609e);
                return;
        }
    }
}
