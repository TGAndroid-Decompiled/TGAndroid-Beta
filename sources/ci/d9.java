package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class d9 extends s4.t0 {
    public final f9 f4969a;

    public d9(f9 f9Var) {
        this.f4969a = f9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f4969a).containerView;
        viewGroup.invalidate();
    }
}
