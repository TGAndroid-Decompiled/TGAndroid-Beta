package defpackage;

import android.util.Pair;
public final class yz6 implements Runnable {
    public final byte a;
    public final b07 b;
    public final Pair c;
    public final ft6 d;

    public yz6(b07 b07Var, Pair pair, ft6 ft6Var, byte b) {
        this.a = b;
        this.b = b07Var;
        this.c = pair;
        this.d = ft6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ft6 ft6Var = this.d;
        Pair pair = this.c;
        b07 b07Var = this.b;
        switch (b) {
            case 0:
                xa3 xa3Var = b07Var.b.i;
                int intValue = ((Integer) pair.first).intValue();
                rz6 rz6Var = (rz6) pair.second;
                rz6Var.getClass();
                xa3Var.k(intValue, rz6Var, ft6Var);
                return;
            default:
                b07Var.b.i.j(((Integer) pair.first).intValue(), (rz6) pair.second, ft6Var);
                return;
        }
    }
}
