package defpackage;
public final class xv0 implements h22, nu4, fd {
    public final xw0 a;

    public xv0(xw0 xw0Var) {
        this.a = xw0Var;
    }

    @Override
    public final void e(boolean z) {
        xw0 xw0Var = this.a;
        if (xw0Var.f0 && z) {
            return;
        }
        xw0Var.m(true);
    }

    @Override
    public final Object h(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.f.getKeyboardHeight() >= hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.m(false);
    }
}
