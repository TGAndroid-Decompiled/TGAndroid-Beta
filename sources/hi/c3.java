package hi;

import androidx.recyclerview.widget.RecyclerView;
public final class c3 extends v4.u0 {
    public final int f14263a;
    public final m3 f14264b;

    public c3(m3 m3Var, int i7) {
        this.f14263a = i7;
        this.f14264b = m3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f14263a) {
            case 0:
                m3 m3Var = this.f14264b;
                m3Var.getClass();
                m3Var.invalidate();
                return;
            default:
                m3 m3Var2 = this.f14264b;
                if (m3Var2.f14902n.J1 && (q0Var = m3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(m3Var2.H.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
