package lh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class q7 extends f2.b1 {

    public final r7 f16591a;

    public q7(r7 r7Var) {
        this.f16591a = r7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            r7 r7Var = this.f16591a;
            if (r7Var.f16655e0) {
                r7Var.f16655e0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r7 r7Var = this.f16591a;
        r7Var.d0();
        r7Var.X();
        if (!r7Var.d.G1 || r7Var.f16655e0) {
            return;
        }
        AndroidUtilities.hideKeyboard(((org.telegram.ui.ActionBar.e3) r7Var).containerView);
    }
}
