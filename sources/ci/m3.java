package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends s4.s0 {
    public final w3 f5165a;

    public m3(w3 w3Var) {
        this.f5165a = w3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        w3 w3Var = this.f5165a;
        if (w3Var.f5717n.K1 && (v0Var = w3Var.G) != null && v0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(w3Var.G.getSearchContainer());
        }
    }
}
