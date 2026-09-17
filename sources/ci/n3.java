package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends s4.s0 {
    public final x3 f5068a;

    public n3(x3 x3Var) {
        this.f5068a = x3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        x3 x3Var = this.f5068a;
        if (x3Var.f5746n.K1 && (w0Var = x3Var.G) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(x3Var.G.getSearchContainer());
        }
    }
}
