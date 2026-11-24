package defpackage;
public final class k12 implements ed, q12, js4 {
    public final s12 a;

    public k12(s12 s12Var) {
        this.a = s12Var;
    }

    @Override
    public final void d(boolean z) {
        s12 s12Var = this.a;
        if (!s12Var.P()) {
            s12Var.K.d(0.0f);
        }
    }

    @Override
    public final Object m(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.b.o3.getKeyboardHeight() >= gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.b.dismiss();
    }
}
