package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class da6 extends i49 {
    public final byte a;
    public final qa6 b;

    public da6(qa6 qa6Var, byte b) {
        this.a = b;
        this.b = qa6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        boolean z = true;
        qa6 qa6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && qa6Var.u0 && qa6Var.v0) {
                    gl.t1(qa6Var.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 0) {
                    z = false;
                }
                qa6Var.N = z;
                if (!z && qa6Var.I != null) {
                    qa6Var.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                qa6 qa6Var = this.b;
                qa6Var.M0(false);
                if (qa6Var.I != null) {
                    qa6Var.K += i2;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
