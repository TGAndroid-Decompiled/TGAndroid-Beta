package defpackage;

import android.os.Bundle;
public final class z64 implements x76, ku4, fu2, os4 {
    public final byte a;
    public final boolean b;

    public z64(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override
    public final u31 a(c41 c41Var) {
        return c41Var.k(this.b);
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 3:
                cf8Var.V(z);
                return;
            case 4:
                cf8Var.o0(z);
                return;
            default:
                cf8Var.v(z);
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 0:
                pe8Var.v(z);
                return;
            default:
                pe8Var.f(z);
                return;
        }
    }

    @Override
    public final Object l(Object obj) {
        Void r1 = (Void) obj;
        Bundle l = ts2.l("afterSignup", this.b);
        bj6 bj6Var = new bj6();
        bj6Var.n0(l);
        return bj6Var;
    }
}
