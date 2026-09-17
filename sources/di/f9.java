package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class f9 extends s4.s0 {
    public final h9 f7266a;

    public f9(h9 h9Var) {
        this.f7266a = h9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f7266a).containerView;
        viewGroup.invalidate();
    }
}
