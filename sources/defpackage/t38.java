package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class t38 extends v79 {
    public final boolean a;
    public final a48 b;

    public t38(a48 a48Var, int i) {
        this.b = a48Var;
        this.a = i;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        axa axaVar;
        a48 a48Var = this.b;
        a48Var.h();
        if (a48Var.L != null) {
            if (a48Var.K != null && a48Var.b()) {
                a48Var.K.o(false);
                return;
            }
            return;
        }
        h48 h48Var = a48Var.q0;
        if (this.a) {
            axaVar = h48Var.c;
        } else {
            axaVar = h48Var.b;
        }
        if (axaVar != null && a48Var.b()) {
            axaVar.a();
        }
    }
}
