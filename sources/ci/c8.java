package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends s4.s0 {
    public final d8 f4443a;

    public c8(d8 d8Var) {
        this.f4443a = d8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            d8 d8Var = this.f4443a;
            if (d8Var.f4528i0) {
                d8Var.f4528i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d8 d8Var = this.f4443a;
        d8Var.d0();
        d8Var.X();
        if (d8Var.d.K1 && !d8Var.f4528i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) d8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
