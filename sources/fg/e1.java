package fg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;
public final class e1 extends f2.a1 {
    public final int f6306a;
    public final n1 f6307b;

    public e1(n1 n1Var, int i10) {
        this.f6306a = i10;
        this.f6307b = n1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f6306a) {
            case 0:
                n1 n1Var = this.f6307b;
                viewGroup = ((h3) n1Var).containerView;
                viewGroup.invalidate();
                n1Var.y();
                return;
            default:
                n1 n1Var2 = this.f6307b;
                viewGroup2 = ((h3) n1Var2).containerView;
                viewGroup2.invalidate();
                n1Var2.y();
                return;
        }
    }
}
