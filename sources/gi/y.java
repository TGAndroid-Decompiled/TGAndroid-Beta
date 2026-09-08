package gi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends s4.s0 {
    public final k0 f10819a;

    public y(k0 k0Var) {
        this.f10819a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.f10819a;
        if (k0Var.G.K1) {
            AndroidUtilities.hideKeyboard(k0Var.E.f24549r);
        }
    }
}
