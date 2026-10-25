package fi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n7 extends s4.u0 {
    public final o7 f11307a;

    public n7(o7 o7Var) {
        this.f11307a = o7Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            o7 o7Var = this.f11307a;
            if (o7Var.f11404i0) {
                o7Var.f11404i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        o7 o7Var = this.f11307a;
        o7Var.d0();
        if (o7Var.d.I1 && !o7Var.f11404i0) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) o7Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
