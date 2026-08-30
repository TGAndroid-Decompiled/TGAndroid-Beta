package gg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends f2.z0 {
    public final v2 f6758a;

    public t2(v2 v2Var) {
        this.f6758a = v2Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f6758a.W.getEditText());
        }
    }
}
