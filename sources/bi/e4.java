package bi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends s4.s0 {
    public final p4 f2625a;

    public e4(p4 p4Var) {
        this.f2625a = p4Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        p4 p4Var = this.f2625a;
        if (p4Var.f3381n.K1 && (w0Var = p4Var.G) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(p4Var.G.getSearchContainer());
        }
    }
}
