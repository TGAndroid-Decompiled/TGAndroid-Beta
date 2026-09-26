package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.zk;
public final class g0 extends qz {
    public final int U;
    public final oi V;

    public g0(oi oiVar, int i10, wl0 wl0Var, int i11) {
        super(i10, 0, wl0Var);
        this.U = i11;
        this.V = oiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f43062n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int min = Math.min(0, top);
                int max = Math.max(0, (rect.height() + top) - C);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.U) {
            case 0:
                f0 f0Var = new f0(this, recyclerView.getContext());
                f0Var.f43110a = i10;
                w0(f0Var);
                return;
            case 1:
                oj ojVar = new oj(this, recyclerView.getContext());
                ojVar.f43110a = i10;
                w0(ojVar);
                return;
            case 2:
                fk fkVar = new fk(this, recyclerView.getContext());
                fkVar.f43110a = i10;
                w0(fkVar);
                return;
            case 3:
                zk zkVar = new zk(this, recyclerView.getContext());
                zkVar.f43110a = i10;
                w0(zkVar);
                return;
            default:
                jn jnVar = new jn(this, recyclerView.getContext());
                jnVar.f43110a = i10;
                w0(jnVar);
                return;
        }
    }

    public g0(hl hlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = hlVar;
    }
}
