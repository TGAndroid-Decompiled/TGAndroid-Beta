package j3;

import android.util.Pair;
public final class k1 implements Runnable {
    public final int f8657a;
    public final f7.b f8658b;
    public final Pair f8659c;
    public final o4.j d;
    public final o4.r e;

    public k1(f7.b bVar, Pair pair, o4.j jVar, o4.r rVar, int i10) {
        this.f8657a = i10;
        this.f8658b = bVar;
        this.f8659c = pair;
        this.d = jVar;
        this.e = rVar;
    }

    @Override
    public final void run() {
        switch (this.f8657a) {
            case 0:
                k3.f fVar = ((q1) this.f8658b.f6013c).h;
                Pair pair = this.f8659c;
                fVar.a(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d, this.e);
                return;
            case 1:
                k3.f fVar2 = ((q1) this.f8658b.f6013c).h;
                Pair pair2 = this.f8659c;
                fVar2.h(((Integer) pair2.first).intValue(), (o4.v) pair2.second, this.d, this.e);
                return;
            default:
                k3.f fVar3 = ((q1) this.f8658b.f6013c).h;
                Pair pair3 = this.f8659c;
                fVar3.d(((Integer) pair3.first).intValue(), (o4.v) pair3.second, this.d, this.e);
                return;
        }
    }
}
