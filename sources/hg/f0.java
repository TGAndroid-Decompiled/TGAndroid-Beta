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
public final class f0 extends sz {
    public final int U;
    public final pi V;

    public f0(pi piVar, int i10, zl0 zl0Var, int i11) {
        super(i10, 0, zl0Var);
        this.U = i11;
        this.V = piVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f46652n - C();
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
                e0 e0Var = new e0(this, recyclerView.getContext());
                e0Var.f46706a = i10;
                w0(e0Var);
                return;
            case 1:
                qj qjVar = new qj(this, recyclerView.getContext());
                qjVar.f46706a = i10;
                w0(qjVar);
                return;
            case 2:
                hk hkVar = new hk(this, recyclerView.getContext());
                hkVar.f46706a = i10;
                w0(hkVar);
                return;
            case 3:
                bl blVar = new bl(this, recyclerView.getContext());
                blVar.f46706a = i10;
                w0(blVar);
                return;
            default:
                ln lnVar = new ln(this, recyclerView.getContext());
                lnVar.f46706a = i10;
                w0(lnVar);
                return;
        }
    }

    public f0(jl jlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = jlVar;
    }
}
