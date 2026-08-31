package hg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends f2.a1 {
    public final v2 f7613a;

    public t2(v2 v2Var) {
        this.f7613a = v2Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f7613a.W.getEditText());
        }
    }
}
