package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f8 extends s4.s0 {
    public final g8 f4660a;

    public f8(g8 g8Var) {
        this.f4660a = g8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            g8 g8Var = this.f4660a;
            if (g8Var.f4702i0) {
                g8Var.f4702i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g8 g8Var = this.f4660a;
        g8Var.d0();
        g8Var.X();
        if (g8Var.d.K1 && !g8Var.f4702i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) g8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
