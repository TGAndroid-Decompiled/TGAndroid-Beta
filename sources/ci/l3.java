package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends s4.t0 {
    public final v3 f5385a;

    public l3(v3 v3Var) {
        this.f5385a = v3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        v3 v3Var = this.f5385a;
        if (v3Var.f6142n.I1 && (v0Var = v3Var.G) != null && v0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(v3Var.G.getSearchContainer());
        }
    }
}
