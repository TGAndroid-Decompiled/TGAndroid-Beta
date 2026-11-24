package defpackage;
public final class ww0 implements c32, ku4, ee {
    public final wx0 a;

    public ww0(wx0 wx0Var) {
        this.a = wx0Var;
    }

    @Override
    public final void e(boolean z) {
        wx0 wx0Var = this.a;
        if (wx0Var.f0 && z) {
            return;
        }
        wx0Var.m(true);
    }

    @Override
    public final Object l(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.f.getKeyboardHeight() >= gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.m(false);
    }
}
