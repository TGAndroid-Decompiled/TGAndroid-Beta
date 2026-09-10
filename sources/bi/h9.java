package bi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h9 extends s4.s0 {
    public final i9 f2800a;

    public h9(i9 i9Var) {
        this.f2800a = i9Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            i9 i9Var = this.f2800a;
            if (i9Var.f2870i0) {
                i9Var.f2870i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i9 i9Var = this.f2800a;
        i9Var.d0();
        i9Var.X();
        if (i9Var.d.K1 && !i9Var.f2870i0) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) i9Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
