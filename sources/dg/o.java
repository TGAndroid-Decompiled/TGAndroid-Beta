package dg;

import org.telegram.ui.mt0;
public final class o implements q0.a {
    public final int f4691a;
    public final mt0 f4692b;

    public o(mt0 mt0Var, int i10) {
        this.f4691a = i10;
        this.f4692b = mt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4691a) {
            case 0:
                e1.Z(this.f4692b, (Integer) obj);
                return;
            default:
                e1.c0(this.f4692b, (Integer) obj);
                return;
        }
    }
}
