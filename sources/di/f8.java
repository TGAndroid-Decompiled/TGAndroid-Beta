package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f8 extends s4.s0 {
    public final g8 f7265a;

    public f8(g8 g8Var) {
        this.f7265a = g8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            g8 g8Var = this.f7265a;
            if (g8Var.f7308i0) {
                g8Var.f7308i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g8 g8Var = this.f7265a;
        g8Var.d0();
        g8Var.X();
        if (g8Var.d.K1 && !g8Var.f7308i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) g8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
