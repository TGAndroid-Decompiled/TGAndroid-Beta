package jg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.yz;
public final class e0 extends yz {
    public final int U;
    public final li V;

    public e0(li liVar, int i10, mm0 mm0Var, int i11) {
        super(i10, 0, mm0Var);
        this.U = i11;
        this.V = liVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f47825n - C();
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
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.U) {
            case 0:
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.f47677a = i10;
                w0(d0Var);
                return;
            case 1:
                mj mjVar = new mj(this, recyclerView.getContext());
                mjVar.f47677a = i10;
                w0(mjVar);
                return;
            case 2:
                dk dkVar = new dk(this, recyclerView.getContext());
                dkVar.f47677a = i10;
                w0(dkVar);
                return;
            case 3:
                jl jlVar = new jl(this, recyclerView.getContext());
                jlVar.f47677a = i10;
                w0(jlVar);
                return;
            default:
                tn tnVar = new tn(this, recyclerView.getContext());
                tnVar.f47677a = i10;
                w0(tnVar);
                return;
        }
    }

    public e0(sl slVar, bi.r1 r1Var) {
        super(0, 0, r1Var);
        this.U = 3;
        this.V = slVar;
    }
}
