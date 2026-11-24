package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class cc6 extends k69 {
    public final byte a;
    public final pc6 b;

    public cc6(pc6 pc6Var, byte b) {
        this.a = b;
        this.b = pc6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        boolean z = true;
        pc6 pc6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && pc6Var.u0 && pc6Var.v0) {
                    gm.t1(pc6Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                pc6Var.N = z;
                if (!z && pc6Var.I != null) {
                    pc6Var.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                pc6 pc6Var = this.b;
                pc6Var.N0(false);
                if (pc6Var.I != null) {
                    pc6Var.K += i2;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
