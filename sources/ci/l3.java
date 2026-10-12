package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends s4.t0 {
    public final v3 f5383a;

    public l3(v3 v3Var) {
        this.f5383a = v3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        v3 v3Var = this.f5383a;
        if (v3Var.f6140n.I1 && (u0Var = v3Var.G) != null && u0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(v3Var.G.getSearchContainer());
        }
    }
}
