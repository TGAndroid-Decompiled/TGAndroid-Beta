package defpackage;

import android.util.Pair;
public final class a07 implements Runnable {
    public final byte a;
    public final b07 b;
    public final Pair c;

    public a07(b07 b07Var, Pair pair, byte b) {
        this.a = b;
        this.b = b07Var;
        this.c = pair;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        b07 b07Var = this.b;
        switch (b) {
            case 0:
                b07Var.b.i.I(((Integer) pair.first).intValue(), (rz6) pair.second);
                return;
            default:
                b07Var.b.i.y(((Integer) pair.first).intValue(), (rz6) pair.second);
                return;
        }
    }
}
