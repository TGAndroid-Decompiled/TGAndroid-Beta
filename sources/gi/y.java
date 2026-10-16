package gi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y extends s4.r0 {
    public final k0 f10279a;

    public y(k0 k0Var) {
        this.f10279a = k0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k0 k0Var = this.f10279a;
        if (k0Var.G.I1) {
            AndroidUtilities.hideKeyboard(k0Var.E.f27510r);
        }
    }
}
