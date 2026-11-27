package defpackage;

import android.util.Pair;
public final class d07 implements Runnable {
    public final byte a;
    public final f07 b;
    public final Pair c;
    public final ja6 d;
    public final jt6 e;

    public d07(f07 f07Var, Pair pair, ja6 ja6Var, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
        this.d = ja6Var;
        this.e = jt6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jt6 jt6Var = this.e;
        ja6 ja6Var = this.d;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                f07Var.b.i.s(((Integer) pair.first).intValue(), (vz6) pair.second, ja6Var, jt6Var);
                return;
            default:
                f07Var.b.i.u(((Integer) pair.first).intValue(), (vz6) pair.second, ja6Var, jt6Var);
                return;
        }
    }
}
