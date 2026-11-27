package defpackage;
public final class b12 implements vma {
    public final n12 a;

    public b12(n12 n12Var) {
        this.a = n12Var;
    }

    @Override
    public final void L(int i, boolean z) {
        n12 n12Var = this.a;
        f12 f12Var = n12Var.v2;
        if (f12Var == n12Var.k2) {
            f12Var.invalidate();
        }
    }
}
