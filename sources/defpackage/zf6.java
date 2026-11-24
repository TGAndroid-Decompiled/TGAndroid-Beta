package defpackage;

import java.util.HashMap;
public final class zf6 extends syc {
    public final HashMap l;
    public final HashMap m;

    public zf6(qg0 qg0Var) {
        super(new hj6(qg0Var, false));
        this.l = new HashMap();
        this.m = new HashMap();
    }

    @Override
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        return this.k.c(rx6Var, mv6Var, j);
    }

    @Override
    public final aob h() {
        return new yf6(((hj6) this.k).o, (byte) 0);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void o(sr6 sr6Var) {
        this.k.o(sr6Var);
        rx6 rx6Var = (rx6) this.m.remove(sr6Var);
        if (rx6Var != null) {
            this.l.remove(rx6Var);
        }
    }

    @Override
    public final rx6 z(rx6 rx6Var) {
        return rx6Var;
    }
}
