package j3;

import android.util.Pair;
public final class m1 implements Runnable {
    public final int f8695a;
    public final f7.b f8696b;
    public final Pair f8697c;
    public final o4.r d;

    public m1(f7.b bVar, Pair pair, o4.r rVar, int i10) {
        this.f8695a = i10;
        this.f8696b = bVar;
        this.f8697c = pair;
        this.d = rVar;
    }

    @Override
    public final void run() {
        switch (this.f8695a) {
            case 0:
                k3.f fVar = ((q1) this.f8696b.f6013c).h;
                Pair pair = this.f8697c;
                fVar.f(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d);
                return;
            default:
                k3.f fVar2 = ((q1) this.f8696b.f6013c).h;
                Pair pair2 = this.f8697c;
                int intValue = ((Integer) pair2.first).intValue();
                o4.v vVar = (o4.v) pair2.second;
                vVar.getClass();
                fVar2.i(intValue, vVar, this.d);
                return;
        }
    }
}
