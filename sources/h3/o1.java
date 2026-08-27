package h3;

import android.util.Pair;

public final class o1 implements Runnable {

    public final int f8050a;

    public final g5.b f8051b;

    public final Pair f8052c;
    public final j4.x d;

    public o1(g5.b bVar, Pair pair, j4.x xVar, int i10) {
        this.f8050a = i10;
        this.f8051b = bVar;
        this.f8052c = pair;
        this.d = xVar;
    }

    @Override
    public final void run() {
        switch (this.f8050a) {
            case 0:
                i3.f fVar = ((s1) this.f8051b.f6390c).h;
                Pair pair = this.f8052c;
                fVar.b(((Integer) pair.first).intValue(), (j4.c0) pair.second, this.d);
                break;
            default:
                i3.f fVar2 = ((s1) this.f8051b.f6390c).h;
                Pair pair2 = this.f8052c;
                int iIntValue = ((Integer) pair2.first).intValue();
                j4.c0 c0Var = (j4.c0) pair2.second;
                c0Var.getClass();
                fVar2.c(iIntValue, c0Var, this.d);
                break;
        }
    }
}
