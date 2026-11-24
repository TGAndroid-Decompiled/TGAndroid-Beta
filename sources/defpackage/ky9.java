package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class ky9 extends q55 {
    public final byte Q;
    public final vz9 R;

    public ky9(vz9 vz9Var, byte b) {
        super(40);
        this.Q = b;
        this.R = vz9Var;
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    rw3 rw3Var = new rw3((byte) 3, recyclerView.getContext(), this);
                    rw3Var.a = i;
                    v0(rw3Var);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                try {
                    rw3 rw3Var2 = new rw3((byte) 5, recyclerView.getContext(), this);
                    rw3Var2.a = i;
                    v0(rw3Var2);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
