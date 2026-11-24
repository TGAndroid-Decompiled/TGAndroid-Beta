package defpackage;

import java.util.HashMap;
public final class zh6 extends t0d {
    public final HashMap l;
    public final HashMap m;

    public zh6(rh0 rh0Var) {
        super(new kl6(rh0Var, false));
        this.l = new HashMap();
        this.m = new HashMap();
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        return this.k.c(rz6Var, mx6Var, j);
    }

    @Override
    public final bqb h() {
        return new yh6(((kl6) this.k).o, (byte) 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(tt6 tt6Var) {
        this.k.o(tt6Var);
        rz6 rz6Var = (rz6) this.m.remove(tt6Var);
        if (rz6Var != null) {
            this.l.remove(rz6Var);
        }
    }

    @Override
    public final rz6 z(rz6 rz6Var) {
        return rz6Var;
    }
}
