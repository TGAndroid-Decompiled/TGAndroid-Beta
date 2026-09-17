package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class g9 extends s4.s0 {
    public final i9 f4724a;

    public g9(i9 i9Var) {
        this.f4724a = i9Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f4724a).containerView;
        viewGroup.invalidate();
    }
}
