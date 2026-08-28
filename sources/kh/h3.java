package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends f2.d1 {
    public final q3 f15392a;

    public h3(q3 q3Var) {
        this.f15392a = q3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        q3 q3Var = this.f15392a;
        if (q3Var.f15868n.G1 && (w0Var = q3Var.C) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(q3Var.C.getSearchContainer());
        }
    }
}
