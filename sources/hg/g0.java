package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.zl0;
public final class g0 extends sz {
    public final int U;
    public final pi V;

    public g0(pi piVar, int i10, zl0 zl0Var, int i11) {
        super(i10, 0, zl0Var);
        this.U = i11;
        this.V = piVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f43170n - C();
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
                f0Var.f43218a = i10;
                w0(f0Var);
                return;
            case 1:
                qj qjVar = new qj(this, recyclerView.getContext());
                qjVar.f43218a = i10;
                w0(qjVar);
                return;
            case 2:
                hk hkVar = new hk(this, recyclerView.getContext());
                hkVar.f43218a = i10;
                w0(hkVar);
                return;
            case 3:
                bl blVar = new bl(this, recyclerView.getContext());
                blVar.f43218a = i10;
                w0(blVar);
                return;
            default:
                ln lnVar = new ln(this, recyclerView.getContext());
                lnVar.f43218a = i10;
                w0(lnVar);
                return;
        }
    }

    public g0(jl jlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = jlVar;
    }
}
