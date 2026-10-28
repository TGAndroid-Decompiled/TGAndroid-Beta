package fi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class n8 extends s4.u0 {
    public final p8 f11307a;

    public n8(p8 p8Var) {
        this.f11307a = p8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f11307a).containerView;
        viewGroup.invalidate();
    }
}
