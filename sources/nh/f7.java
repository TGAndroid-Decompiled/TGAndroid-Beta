package nh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends f2.a1 {
    public final g7 f17677a;

    public f7(g7 g7Var) {
        this.f17677a = g7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            g7 g7Var = this.f17677a;
            if (g7Var.f17711e0) {
                g7Var.f17711e0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g7 g7Var = this.f17677a;
        g7Var.d0();
        g7Var.X();
        if (g7Var.d.G1 && !g7Var.f17711e0) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) g7Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
