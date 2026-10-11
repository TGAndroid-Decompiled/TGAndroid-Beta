package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends s4.t0 {
    public final k0 f10071a;

    public y(k0 k0Var) {
        this.f10071a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.f10071a;
        if (k0Var.G.I1) {
            AndroidUtilities.hideKeyboard(k0Var.E.f30964r);
        }
    }
}
