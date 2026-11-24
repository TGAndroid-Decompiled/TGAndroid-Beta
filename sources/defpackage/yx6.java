package defpackage;

import android.util.Pair;
public final class yx6 implements Runnable {
    public final byte a;
    public final by6 b;
    public final Pair c;
    public final fr6 d;

    public yx6(by6 by6Var, Pair pair, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
        this.d = fr6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fr6 fr6Var = this.d;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                l93 l93Var = by6Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                rx6 rx6Var = (rx6) pair.second;
                rx6Var.getClass();
                l93Var.k(intValue, rx6Var, fr6Var);
                return;
            default:
                by6Var.b.i.j(((Integer) pair.first).intValue(), (rx6) pair.second, fr6Var);
                return;
        }
    }
}
