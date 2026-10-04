package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b8 extends s4.s0 {
    public final c8 f4774a;

    public b8(c8 c8Var) {
        this.f4774a = c8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            c8 c8Var = this.f4774a;
            if (c8Var.f4819i0) {
                c8Var.f4819i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        c8 c8Var = this.f4774a;
        c8Var.d0();
        if (c8Var.d.K1 && !c8Var.f4819i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) c8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
