package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends s4.r0 {
    public final v3 f7351a;

    public l3(v3 v3Var) {
        this.f7351a = v3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        v3 v3Var = this.f7351a;
        if (v3Var.f7993n.I1 && (u0Var = v3Var.G) != null && u0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(v3Var.G.getSearchContainer());
        }
    }
}
