package kh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class s8 extends f2.d1 {
    public final u8 f16058a;

    public s8(u8 u8Var) {
        this.f16058a = u8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f16058a).containerView;
        viewGroup.invalidate();
    }
}
