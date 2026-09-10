package bi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class ia extends s4.s0 {
    public final ka f2887a;

    public ia(ka kaVar) {
        this.f2887a = kaVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f2887a).containerView;
        viewGroup.invalidate();
    }
}
