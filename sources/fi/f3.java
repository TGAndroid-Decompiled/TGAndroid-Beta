package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f3 extends s4.u0 {
    public final o3 f10858a;

    public f3(o3 o3Var) {
        this.f10858a = o3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        o3 o3Var = this.f10858a;
        if (o3Var.f11348n.I1 && (w0Var = o3Var.G) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(o3Var.G.getSearchContainer());
        }
    }
}
