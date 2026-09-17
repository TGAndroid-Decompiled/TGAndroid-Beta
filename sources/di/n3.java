package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends s4.s0 {
    public final x3 f7705a;

    public n3(x3 x3Var) {
        this.f7705a = x3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        x3 x3Var = this.f7705a;
        if (x3Var.f8404n.K1 && (v0Var = x3Var.G) != null && v0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(x3Var.G.getSearchContainer());
        }
    }
}
