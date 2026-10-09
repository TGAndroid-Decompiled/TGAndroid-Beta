package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends s4.t0 {
    public final d8 f4841a;

    public c8(d8 d8Var) {
        this.f4841a = d8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            d8 d8Var = this.f4841a;
            if (d8Var.f4954i0) {
                d8Var.f4954i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d8 d8Var = this.f4841a;
        d8Var.e0();
        d8Var.Y();
        if (d8Var.d.I1 && !d8Var.f4954i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) d8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
