package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends s4.s0 {
    public final w3 f5172a;

    public m3(w3 w3Var) {
        this.f5172a = w3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        w3 w3Var = this.f5172a;
        if (w3Var.f5729n.K1 && (u0Var = w3Var.G) != null && u0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(w3Var.G.getSearchContainer());
        }
    }
}
