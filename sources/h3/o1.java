package h3;

import android.util.Pair;
public final class o1 implements Runnable {
    public final int f9620a;
    public final g5.b f9621b;
    public final Pair f9622c;
    public final j4.y d;

    public o1(g5.b bVar, Pair pair, j4.y yVar, int i9) {
        this.f9620a = i9;
        this.f9621b = bVar;
        this.f9622c = pair;
        this.d = yVar;
    }

    @Override
    public final void run() {
        switch (this.f9620a) {
            case 0:
                i3.f fVar = ((s1) this.f9621b.f7112c).h;
                Pair pair = this.f9622c;
                fVar.b(((Integer) pair.first).intValue(), (j4.d0) pair.second, this.d);
                return;
            default:
                i3.f fVar2 = ((s1) this.f9621b.f7112c).h;
                Pair pair2 = this.f9622c;
                int intValue = ((Integer) pair2.first).intValue();
                j4.d0 d0Var = (j4.d0) pair2.second;
                d0Var.getClass();
                fVar2.c(intValue, d0Var, this.d);
                return;
        }
    }
}
