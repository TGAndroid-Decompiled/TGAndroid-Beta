package ei;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r7 extends s4.r0 {
    public final s7 f9756a;

    public r7(s7 s7Var) {
        this.f9756a = s7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            s7 s7Var = this.f9756a;
            if (s7Var.f9815i0) {
                s7Var.f9815i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s7 s7Var = this.f9756a;
        s7Var.d0();
        s7Var.X();
        if (s7Var.d.I1 && !s7Var.f9815i0) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) s7Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
