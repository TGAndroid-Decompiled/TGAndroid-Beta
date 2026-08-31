package j3;

import android.util.Pair;
public final class l1 implements Runnable {
    public final int f9247a;
    public final f7.b f9248b;
    public final Pair f9249c;

    public l1(f7.b bVar, Pair pair, int i10) {
        this.f9247a = i10;
        this.f9248b = bVar;
        this.f9249c = pair;
    }

    @Override
    public final void run() {
        switch (this.f9247a) {
            case 0:
                k3.f fVar = ((q1) this.f9248b.f6121c).h;
                Pair pair = this.f9249c;
                fVar.b(((Integer) pair.first).intValue(), (o4.v) pair.second);
                return;
            case 1:
                k3.f fVar2 = ((q1) this.f9248b.f6121c).h;
                Pair pair2 = this.f9249c;
                fVar2.k(((Integer) pair2.first).intValue(), (o4.v) pair2.second);
                return;
            default:
                k3.f fVar3 = ((q1) this.f9248b.f6121c).h;
                Pair pair3 = this.f9249c;
                fVar3.j(((Integer) pair3.first).intValue(), (o4.v) pair3.second);
                return;
        }
    }
}
