package ei;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r7 extends s4.r0 {
    public final s7 f9742a;

    public r7(s7 s7Var) {
        this.f9742a = s7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            s7 s7Var = this.f9742a;
            if (s7Var.f9800i0) {
                s7Var.f9800i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s7 s7Var = this.f9742a;
        s7Var.e0();
        s7Var.Y();
        if (s7Var.d.I1 && !s7Var.f9800i0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) s7Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
