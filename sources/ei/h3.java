package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.r0 {
    public final q3 f9151a;

    public h3(q3 q3Var) {
        this.f9151a = q3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        q3 q3Var = this.f9151a;
        if (q3Var.f9634n.I1 && (u0Var = q3Var.G) != null && u0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(q3Var.G.getSearchContainer());
        }
    }
}
