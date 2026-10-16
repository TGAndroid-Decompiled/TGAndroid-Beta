package di;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class c9 extends s4.r0 {
    public final e9 f6739a;

    public c9(e9 e9Var) {
        this.f6739a = e9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f6739a).containerView;
        viewGroup.invalidate();
    }
}
