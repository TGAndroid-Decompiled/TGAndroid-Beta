package j3;

import android.util.Pair;
public final class m1 implements Runnable {
    public final int f8677a;
    public final f7.b f8678b;
    public final Pair f8679c;
    public final o4.r d;

    public m1(f7.b bVar, Pair pair, o4.r rVar, int i10) {
        this.f8677a = i10;
        this.f8678b = bVar;
        this.f8679c = pair;
        this.d = rVar;
    }

    @Override
    public final void run() {
        switch (this.f8677a) {
            case 0:
                k3.f fVar = ((q1) this.f8678b.f6002c).h;
                Pair pair = this.f8679c;
                fVar.f(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d);
                return;
            default:
                k3.f fVar2 = ((q1) this.f8678b.f6002c).h;
                Pair pair2 = this.f8679c;
                int intValue = ((Integer) pair2.first).intValue();
                o4.v vVar = (o4.v) pair2.second;
                vVar.getClass();
                fVar2.i(intValue, vVar, this.d);
                return;
        }
    }
}
