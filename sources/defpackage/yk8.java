package defpackage;

import android.content.Context;
public final class yk8 implements kt8 {
    public final byte a = 1;
    public final kt8 b;
    public final mo5 c;

    public yk8(mo5 mo5Var, kt8 kt8Var) {
        this.c = mo5Var;
        this.b = kt8Var;
    }

    @Override
    public final Object mo9get() {
        byte b = this.a;
        mo5 mo5Var = this.c;
        kt8 kt8Var = this.b;
        switch (b) {
            case 0:
                return new xk8((Context) mo5Var.a, (v8c) kt8Var.mo9get());
            default:
                return new p69((sr) kt8Var.mo9get(), (sw2) mo5Var.a);
        }
    }

    public yk8(kt8 kt8Var, mo5 mo5Var) {
        this.b = kt8Var;
        this.c = mo5Var;
    }
}
