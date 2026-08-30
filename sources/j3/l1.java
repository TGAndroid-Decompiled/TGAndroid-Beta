package j3;

import android.util.Pair;
public final class l1 implements Runnable {
    public final int f8667a;
    public final f7.b f8668b;
    public final Pair f8669c;

    public l1(f7.b bVar, Pair pair, int i10) {
        this.f8667a = i10;
        this.f8668b = bVar;
        this.f8669c = pair;
    }

    @Override
    public final void run() {
        switch (this.f8667a) {
            case 0:
                k3.f fVar = ((q1) this.f8668b.f6013c).h;
                Pair pair = this.f8669c;
                fVar.b(((Integer) pair.first).intValue(), (o4.v) pair.second);
                return;
            case 1:
                k3.f fVar2 = ((q1) this.f8668b.f6013c).h;
                Pair pair2 = this.f8669c;
                fVar2.k(((Integer) pair2.first).intValue(), (o4.v) pair2.second);
                return;
            default:
                k3.f fVar3 = ((q1) this.f8668b.f6013c).h;
                Pair pair3 = this.f8669c;
                fVar3.j(((Integer) pair3.first).intValue(), (o4.v) pair3.second);
                return;
        }
    }
}
