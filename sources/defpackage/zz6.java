package defpackage;

import android.util.Pair;
public final class zz6 implements Runnable {
    public final byte a;
    public final b07 b;
    public final Pair c;
    public final ea6 d;
    public final ft6 e;

    public zz6(b07 b07Var, Pair pair, ea6 ea6Var, ft6 ft6Var, byte b) {
        this.a = b;
        this.b = b07Var;
        this.c = pair;
        this.d = ea6Var;
        this.e = ft6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ft6 ft6Var = this.e;
        ea6 ea6Var = this.d;
        Pair pair = this.c;
        b07 b07Var = this.b;
        switch (b) {
            case 0:
                b07Var.b.i.s(((Integer) pair.first).intValue(), (rz6) pair.second, ea6Var, ft6Var);
                return;
            default:
                b07Var.b.i.u(((Integer) pair.first).intValue(), (rz6) pair.second, ea6Var, ft6Var);
                return;
        }
    }
}
