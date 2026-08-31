package j3;

import android.util.Pair;
public final class k1 implements Runnable {
    public final int f9235a;
    public final f7.b f9236b;
    public final Pair f9237c;
    public final o4.j d;
    public final o4.r f9238e;

    public k1(f7.b bVar, Pair pair, o4.j jVar, o4.r rVar, int i10) {
        this.f9235a = i10;
        this.f9236b = bVar;
        this.f9237c = pair;
        this.d = jVar;
        this.f9238e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f9235a) {
            case 0:
                k3.f fVar = ((q1) this.f9236b.f6121c).h;
                Pair pair = this.f9237c;
                fVar.a(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d, this.f9238e);
                return;
            case 1:
                k3.f fVar2 = ((q1) this.f9236b.f6121c).h;
                Pair pair2 = this.f9237c;
                fVar2.h(((Integer) pair2.first).intValue(), (o4.v) pair2.second, this.d, this.f9238e);
                return;
            default:
                k3.f fVar3 = ((q1) this.f9236b.f6121c).h;
                Pair pair3 = this.f9237c;
                fVar3.d(((Integer) pair3.first).intValue(), (o4.v) pair3.second, this.d, this.f9238e);
                return;
        }
    }
}
