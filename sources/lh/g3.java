package lh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class g3 extends f2.b1 {

    public final p3 f16031a;

    public g3(p3 p3Var) {
        this.f16031a = p3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.v0 v0Var;
        p3 p3Var = this.f16031a;
        if (!p3Var.f16517n.G1 || (v0Var = p3Var.C) == null || v0Var.getSearchField() == null) {
            return;
        }
        AndroidUtilities.hideKeyboard(p3Var.C.getSearchContainer());
    }
}
