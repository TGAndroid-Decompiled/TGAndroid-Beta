package j3;

import android.util.Pair;
public final class m1 implements Runnable {
    public final int f9276a;
    public final f7.b f9277b;
    public final Pair f9278c;
    public final o4.r d;

    public m1(f7.b bVar, Pair pair, o4.r rVar, int i10) {
        this.f9276a = i10;
        this.f9277b = bVar;
        this.f9278c = pair;
        this.d = rVar;
    }

    @Override
    public final void run() {
        switch (this.f9276a) {
            case 0:
                k3.f fVar = ((q1) this.f9277b.f6121c).h;
                Pair pair = this.f9278c;
                fVar.f(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d);
                return;
            default:
                k3.f fVar2 = ((q1) this.f9277b.f6121c).h;
                Pair pair2 = this.f9278c;
                int intValue = ((Integer) pair2.first).intValue();
                o4.v vVar = (o4.v) pair2.second;
                vVar.getClass();
                fVar2.i(intValue, vVar, this.d);
                return;
        }
    }
}
