package i2;

import android.util.Pair;
public final class e1 implements Runnable {
    public final int f12341a;
    public final f1 f12342b;
    public final Pair f12343c;

    public e1(f1 f1Var, Pair pair, int i10) {
        this.f12341a = i10;
        this.f12342b = f1Var;
        this.f12343c = pair;
    }

    @Override
    public final void run() {
        switch (this.f12341a) {
            case 0:
                j2.f fVar = this.f12342b.f12355b.h;
                Pair pair = this.f12343c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                return;
            default:
                j2.f fVar2 = this.f12342b.f12355b.h;
                Pair pair2 = this.f12343c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                return;
        }
    }
}
