package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends s4.r0 {
    public final q3 f9162a;

    public h3(q3 q3Var) {
        this.f9162a = q3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.u0 u0Var;
        q3 q3Var = this.f9162a;
        if (q3Var.f9650n.I1 && (u0Var = q3Var.G) != null && u0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(q3Var.G.getSearchContainer());
        }
    }
}
