package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class hc6 extends v79 {
    public final byte a;
    public final uc6 b;

    public hc6(uc6 uc6Var, byte b) {
        this.a = b;
        this.b = uc6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        boolean z = true;
        uc6 uc6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && uc6Var.u0 && uc6Var.v0) {
                    hl.t1(uc6Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                uc6Var.N = z;
                if (!z && uc6Var.I != null) {
                    uc6Var.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                uc6 uc6Var = this.b;
                uc6Var.N0(false);
                if (uc6Var.I != null) {
                    uc6Var.K += i2;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
