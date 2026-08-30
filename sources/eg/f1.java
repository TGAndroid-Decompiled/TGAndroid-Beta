package eg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.g3;
public final class f1 extends f2.z0 {
    public final int f5289a;
    public final o1 f5290b;

    public f1(o1 o1Var, int i10) {
        this.f5289a = i10;
        this.f5290b = o1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f5289a) {
            case 0:
                o1 o1Var = this.f5290b;
                viewGroup = ((g3) o1Var).containerView;
                viewGroup.invalidate();
                o1Var.y();
                return;
            default:
                o1 o1Var2 = this.f5290b;
                viewGroup2 = ((g3) o1Var2).containerView;
                viewGroup2.invalidate();
                o1Var2.y();
                return;
        }
    }
}
