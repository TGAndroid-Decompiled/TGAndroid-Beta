package defpackage;

import android.util.Pair;
public final class c07 implements Runnable {
    public final byte a;
    public final f07 b;
    public final Pair c;
    public final jt6 d;

    public c07(f07 f07Var, Pair pair, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
        this.d = jt6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jt6 jt6Var = this.d;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                ea3 ea3Var = f07Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                vz6 vz6Var = (vz6) pair.second;
                vz6Var.getClass();
                ea3Var.k(intValue, vz6Var, jt6Var);
                return;
            default:
                f07Var.b.i.j(((Integer) pair.first).intValue(), (vz6) pair.second, jt6Var);
                return;
        }
    }
}
