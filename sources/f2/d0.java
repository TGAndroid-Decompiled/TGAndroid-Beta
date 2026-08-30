package f2;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.px0;
public abstract class d0 extends b0 {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, l1 l1Var) {
        int i10;
        px0 px0Var = (px0) this;
        if (l1Var.f5788f == 3) {
            i10 = 0;
        } else {
            i10 = px0Var.d;
        }
        return b0.l(i10, 0);
    }
}
