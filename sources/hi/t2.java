package hi;

import androidx.recyclerview.widget.RecyclerView;
public final class t2 extends v4.t0 {
    public final int f15371a;
    public final d3 f15372b;

    public t2(d3 d3Var, int i7) {
        this.f15371a = i7;
        this.f15372b = d3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f15371a) {
            case 0:
                d3 d3Var = this.f15372b;
                d3Var.getClass();
                d3Var.invalidate();
                return;
            default:
                d3 d3Var2 = this.f15372b;
                if (d3Var2.f14348n.J1 && (q0Var = d3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(d3Var2.H.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
