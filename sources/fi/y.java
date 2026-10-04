package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends s4.s0 {
    public final k0 f9996a;

    public y(k0 k0Var) {
        this.f9996a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.f9996a;
        if (k0Var.G.K1) {
            AndroidUtilities.hideKeyboard(k0Var.E.f26247r);
        }
    }
}
