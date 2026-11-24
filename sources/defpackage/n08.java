package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class n08 extends i49 {
    public final boolean a;
    public final t08 b;

    public n08(t08 t08Var, int i) {
        this.b = t08Var;
        this.a = i;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        xsa xsaVar;
        t08 t08Var = this.b;
        t08Var.h();
        if (t08Var.L != null) {
            if (t08Var.K != null && t08Var.b()) {
                t08Var.K.l(false);
                return;
            }
            return;
        }
        a18 a18Var = t08Var.q0;
        if (this.a) {
            xsaVar = a18Var.c;
        } else {
            xsaVar = a18Var.b;
        }
        if (xsaVar != null && t08Var.b()) {
            xsaVar.a();
        }
    }
}
