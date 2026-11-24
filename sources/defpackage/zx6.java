package defpackage;

import android.util.Pair;
public final class zx6 implements Runnable {
    public final byte a;
    public final by6 b;
    public final Pair c;
    public final f86 d;
    public final fr6 e;

    public zx6(by6 by6Var, Pair pair, f86 f86Var, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
        this.d = f86Var;
        this.e = fr6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fr6 fr6Var = this.e;
        f86 f86Var = this.d;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                by6Var.b.i.s(((Integer) pair.first).intValue(), (rx6) pair.second, f86Var, fr6Var);
                return;
            default:
                by6Var.b.i.u(((Integer) pair.first).intValue(), (rx6) pair.second, f86Var, fr6Var);
                return;
        }
    }
}
