package defpackage;
public final class v22 implements ee, c32, ku4 {
    public final e32 a;

    public v22(e32 e32Var) {
        this.a = e32Var;
    }

    @Override
    public final void e(boolean z) {
        e32 e32Var = this.a;
        if (!e32Var.O()) {
            e32Var.K.d(0.0f);
        }
    }

    @Override
    public final Object l(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.b.o3.getKeyboardHeight() >= gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.b.dismiss();
    }
}
