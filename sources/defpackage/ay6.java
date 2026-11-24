package defpackage;

import android.util.Pair;
public final class ay6 implements Runnable {
    public final byte a;
    public final by6 b;
    public final Pair c;

    public ay6(by6 by6Var, Pair pair, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                by6Var.b.i.I(((Integer) pair.first).intValue(), (rx6) pair.second);
                return;
            default:
                by6Var.b.i.y(((Integer) pair.first).intValue(), (rx6) pair.second);
                return;
        }
    }
}
