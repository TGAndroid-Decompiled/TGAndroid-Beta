package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f3 extends s4.u0 {
    public final o3 f10859a;

    public f3(o3 o3Var) {
        this.f10859a = o3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        o3 o3Var = this.f10859a;
        if (o3Var.f11349n.I1 && (w0Var = o3Var.G) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(o3Var.G.getSearchContainer());
        }
    }
}
