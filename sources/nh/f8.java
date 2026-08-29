package nh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class f8 extends f2.a1 {
    public final h8 f17678a;

    public f8(h8 h8Var) {
        this.f17678a = h8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f17678a).containerView;
        viewGroup.invalidate();
    }
}
