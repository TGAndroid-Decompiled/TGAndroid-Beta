package cg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;
public final class g1 extends f2.a1 {
    public final int f3148a;
    public final p1 f3149b;

    public g1(p1 p1Var, int i10) {
        this.f3148a = i10;
        this.f3149b = p1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f3148a) {
            case 0:
                p1 p1Var = this.f3149b;
                viewGroup = ((f3) p1Var).containerView;
                viewGroup.invalidate();
                p1Var.y();
                return;
            default:
                p1 p1Var2 = this.f3149b;
                viewGroup2 = ((f3) p1Var2).containerView;
                viewGroup2.invalidate();
                p1Var2.y();
                return;
        }
    }
}
