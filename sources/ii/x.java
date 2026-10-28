package ii;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import s4.u0;
public final class x extends u0 {
    public final j0 f14435a;

    public x(j0 j0Var) {
        this.f14435a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j0 j0Var = this.f14435a;
        if (j0Var.G.I1) {
            AndroidUtilities.hideKeyboard(j0Var.E.f30347r);
        }
    }
}
