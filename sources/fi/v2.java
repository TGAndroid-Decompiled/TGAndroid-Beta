package fi;

import androidx.recyclerview.widget.RecyclerView;
public final class v2 extends v4.s0 {
    public final int f12918a;
    public final f3 f12919b;

    public v2(f3 f3Var, int i7) {
        this.f12918a = i7;
        this.f12919b = f3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.f12918a) {
            case 0:
                f3 f3Var = this.f12919b;
                f3Var.getClass();
                f3Var.invalidate();
                return;
            default:
                f3 f3Var2 = this.f12919b;
                if (f3Var2.f11974n.I1 && (r0Var = f3Var2.G) != null && r0Var.getSearchField() != null) {
                    org.telegram.messenger.g0.v1(f3Var2.G.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
