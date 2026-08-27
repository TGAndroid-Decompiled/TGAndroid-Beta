package oh;

import androidx.recyclerview.widget.RecyclerView;
import f2.b1;
import org.telegram.messenger.AndroidUtilities;

public final class x extends b1 {

    public final j0 f19579a;

    public x(j0 j0Var) {
        this.f19579a = j0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j0 j0Var = this.f19579a;
        if (j0Var.C.G1) {
            AndroidUtilities.hideKeyboard(j0Var.A.f31468r);
        }
    }
}
