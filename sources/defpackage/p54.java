package defpackage;

import android.os.Bundle;
public final class p54 implements x56, js4, us2, nq4 {
    public final byte a;
    public final boolean b;

    public p54(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override
    public final m21 a(u21 u21Var) {
        return u21Var.k(this.b);
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 3:
                ad8Var.V(z);
                return;
            case 4:
                ad8Var.o0(z);
                return;
            default:
                ad8Var.v(z);
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 0:
                mc8Var.v(z);
                return;
            default:
                mc8Var.h(z);
                return;
        }
    }

    @Override
    public final Object m(Object obj) {
        Void r1 = (Void) obj;
        Bundle l = ir2.l("afterSignup", this.b);
        ah6 ah6Var = new ah6();
        ah6Var.q0(l);
        return ah6Var;
    }
}
