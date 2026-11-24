package defpackage;
public final class mv0 implements q12, js4, ed {
    public final ow0 a;

    public mv0(ow0 ow0Var) {
        this.a = ow0Var;
    }

    @Override
    public final void d(boolean z) {
        ow0 ow0Var = this.a;
        if (ow0Var.f0 && z) {
            return;
        }
        ow0Var.m(true);
    }

    @Override
    public final Object m(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.f.getKeyboardHeight() >= gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.m(false);
    }
}
