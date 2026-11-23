package hi;

import androidx.recyclerview.widget.RecyclerView;
public final class t2 extends v4.u0 {
    public final int f15501a;
    public final d3 f15502b;

    public t2(d3 d3Var, int i7) {
        this.f15501a = i7;
        this.f15502b = d3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f15501a) {
            case 0:
                d3 d3Var = this.f15502b;
                d3Var.getClass();
                d3Var.invalidate();
                return;
            default:
                d3 d3Var2 = this.f15502b;
                if (d3Var2.f14502n.J1 && (q0Var = d3Var2.H) != null && q0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(d3Var2.H.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
