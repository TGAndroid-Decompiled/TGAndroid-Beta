package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class d9 extends s4.s0 {
    public final f9 f4545a;

    public d9(f9 f9Var) {
        this.f4545a = f9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f4545a).containerView;
        viewGroup.invalidate();
    }
}
