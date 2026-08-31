package f2;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.qx0;
public abstract class e0 extends b0 {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, m1 m1Var) {
        int i10;
        qx0 qx0Var = (qx0) this;
        if (m1Var.f5879f == 3) {
            i10 = 0;
        } else {
            i10 = qx0Var.d;
        }
        return b0.l(i10, 0);
    }
}
