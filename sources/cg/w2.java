package cg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class w2 extends f2.b1 {

    public final y2 f2849a;

    public w2(y2 y2Var) {
        this.f2849a = y2Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f2849a.V.getEditText());
        }
    }
}
