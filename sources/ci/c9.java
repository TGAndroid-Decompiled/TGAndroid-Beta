package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class c9 extends s4.s0 {
    public final e9 f4476a;

    public c9(e9 e9Var) {
        this.f4476a = e9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f4476a).containerView;
        viewGroup.invalidate();
    }
}
