package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends s4.r0 {
    public final k0 f12245a;

    public y(k0 k0Var) {
        this.f12245a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.f12245a;
        if (k0Var.G.I1) {
            AndroidUtilities.hideKeyboard(k0Var.E.f27719r);
        }
    }
}
