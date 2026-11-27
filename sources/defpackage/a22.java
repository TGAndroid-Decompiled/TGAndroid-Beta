package defpackage;
public final class a22 implements fd, h22, nu4 {
    public final j22 a;

    public a22(j22 j22Var) {
        this.a = j22Var;
    }

    @Override
    public final void e(boolean z) {
        j22 j22Var = this.a;
        if (!j22Var.O()) {
            j22Var.K.d(0.0f);
        }
    }

    @Override
    public final Object h(Object obj) {
        boolean z;
        Void r1 = (Void) obj;
        if (this.a.b.o3.getKeyboardHeight() >= hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.b.dismiss();
    }
}
