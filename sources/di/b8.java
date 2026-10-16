package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b8 extends s4.r0 {
    public final c8 f6664a;

    public b8(c8 c8Var) {
        this.f6664a = c8Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            c8 c8Var = this.f6664a;
            if (c8Var.f6722i0) {
                c8Var.f6722i0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        c8 c8Var = this.f6664a;
        c8Var.e0();
        c8Var.Y();
        if (c8Var.d.I1 && !c8Var.f6722i0) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) c8Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
