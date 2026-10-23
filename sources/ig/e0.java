package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.yz;
public final class e0 extends yz {
    public final int U;
    public final li V;

    public e0(li liVar, int i10, jm0 jm0Var, int i11) {
        super(i10, 0, jm0Var);
        this.U = i11;
        this.V = liVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f46023n - C();
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
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.U) {
            case 0:
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.f46062a = i10;
                w0(d0Var);
                return;
            case 1:
                mj mjVar = new mj(this, recyclerView.getContext());
                mjVar.f46062a = i10;
                w0(mjVar);
                return;
            case 2:
                dk dkVar = new dk(this, recyclerView.getContext());
                dkVar.f46062a = i10;
                w0(dkVar);
                return;
            case 3:
                jl jlVar = new jl(this, recyclerView.getContext());
                jlVar.f46062a = i10;
                w0(jlVar);
                return;
            default:
                sn snVar = new sn(this, recyclerView.getContext());
                snVar.f46062a = i10;
                w0(snVar);
                return;
        }
    }

    public e0(rl rlVar, ai.u1 u1Var) {
        super(0, 0, u1Var);
        this.U = 3;
        this.V = rlVar;
    }
}
