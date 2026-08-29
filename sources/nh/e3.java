package nh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class e3 extends f2.a1 {
    public final n3 f17591a;

    public e3(n3 n3Var) {
        this.f17591a = n3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        n3 n3Var = this.f17591a;
        if (n3Var.f18177n.G1 && (w0Var = n3Var.C) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(n3Var.C.getSearchContainer());
        }
    }
}
