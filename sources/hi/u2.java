package hi;

import androidx.recyclerview.widget.RecyclerView;
public final class u2 extends v4.u0 {
    public final int f15527a;
    public final e3 f15528b;

    public u2(e3 e3Var, int i7) {
        this.f15527a = i7;
        this.f15528b = e3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.f15527a) {
            case 0:
                e3 e3Var = this.f15528b;
                e3Var.getClass();
                e3Var.invalidate();
                return;
            default:
                e3 e3Var2 = this.f15528b;
                if (e3Var2.f14548n.J1 && (r0Var = e3Var2.H) != null && r0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(e3Var2.H.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
