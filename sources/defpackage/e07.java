package defpackage;

import android.util.Pair;
public final class e07 implements Runnable {
    public final byte a;
    public final f07 b;
    public final Pair c;

    public e07(f07 f07Var, Pair pair, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                f07Var.b.i.I(((Integer) pair.first).intValue(), (vz6) pair.second);
                return;
            default:
                f07Var.b.i.y(((Integer) pair.first).intValue(), (vz6) pair.second);
                return;
        }
    }
}
