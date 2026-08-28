package kh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r7 extends f2.d1 {
    public final s7 f15962a;

    public r7(s7 s7Var) {
        this.f15962a = s7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            s7 s7Var = this.f15962a;
            if (s7Var.f16037e0) {
                s7Var.f16037e0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        s7 s7Var = this.f15962a;
        s7Var.c0();
        s7Var.W();
        if (s7Var.d.G1 && !s7Var.f16037e0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) s7Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
