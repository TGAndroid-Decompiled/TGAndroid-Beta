package gi;

import androidx.recyclerview.widget.RecyclerView;
public final class t2 extends u4.t0 {
    public final int f13607a;
    public final d3 f13608b;

    public t2(d3 d3Var, int i3) {
        this.f13607a = i3;
        this.f13608b = d3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f13607a) {
            case 0:
                d3 d3Var = this.f13608b;
                d3Var.getClass();
                d3Var.invalidate();
                return;
            default:
                d3 d3Var2 = this.f13608b;
                if (d3Var2.f12574n.J1 && (q0Var = d3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(d3Var2.H.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
