package j3;

import android.util.Pair;
public final class l1 implements Runnable {
    public final int f8649a;
    public final f7.b f8650b;
    public final Pair f8651c;

    public l1(f7.b bVar, Pair pair, int i10) {
        this.f8649a = i10;
        this.f8650b = bVar;
        this.f8651c = pair;
    }

    @Override
    public final void run() {
        switch (this.f8649a) {
            case 0:
                k3.f fVar = ((q1) this.f8650b.f6002c).h;
                Pair pair = this.f8651c;
                fVar.b(((Integer) pair.first).intValue(), (o4.v) pair.second);
                return;
            case 1:
                k3.f fVar2 = ((q1) this.f8650b.f6002c).h;
                Pair pair2 = this.f8651c;
                fVar2.l(((Integer) pair2.first).intValue(), (o4.v) pair2.second);
                return;
            default:
                k3.f fVar3 = ((q1) this.f8650b.f6002c).h;
                Pair pair3 = this.f8651c;
                fVar3.j(((Integer) pair3.first).intValue(), (o4.v) pair3.second);
                return;
        }
    }
}
