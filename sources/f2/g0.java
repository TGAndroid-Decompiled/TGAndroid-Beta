package f2;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.vw0;
public abstract class g0 extends d0 {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, q1 q1Var) {
        int i9;
        vw0 vw0Var = (vw0) this;
        if (q1Var.f5505f == 3) {
            i9 = 0;
        } else {
            i9 = vw0Var.d;
        }
        return d0.l(i9, 0);
    }
}
