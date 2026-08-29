package f2;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gx0;
public abstract class d0 extends b0 {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, n1 n1Var) {
        int i10;
        gx0 gx0Var = (gx0) this;
        if (n1Var.f6436f == 3) {
            i10 = 0;
        } else {
            i10 = gx0Var.d;
        }
        return b0.l(i10, 0);
    }
}
