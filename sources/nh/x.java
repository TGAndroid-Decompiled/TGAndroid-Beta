package nh;

import androidx.recyclerview.widget.RecyclerView;
import f2.d1;
import org.telegram.messenger.AndroidUtilities;
public final class x extends d1 {
    public final j0 f18730a;

    public x(j0 j0Var) {
        this.f18730a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        j0 j0Var = this.f18730a;
        if (j0Var.C.G1) {
            AndroidUtilities.hideKeyboard(j0Var.A.f30664r);
        }
    }
}
