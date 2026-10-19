package ei;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class r8 extends s4.r0 {
    public final t8 f9743a;

    public r8(t8 t8Var) {
        this.f9743a = t8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f9743a).containerView;
        viewGroup.invalidate();
    }
}
