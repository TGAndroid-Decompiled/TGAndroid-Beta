package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.wz;
public final class d0 extends wz {
    public final int U;
    public final ji V;

    public d0(ji jiVar, int i10, lm0 lm0Var, int i11) {
        super(i10, 0, lm0Var);
        this.U = i11;
        this.V = jiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f46444n - C();
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
                c0 c0Var = new c0(this, recyclerView.getContext());
                c0Var.f46483a = i10;
                w0(c0Var);
                return;
            case 1:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.f46483a = i10;
                w0(kjVar);
                return;
            case 2:
                bk bkVar = new bk(this, recyclerView.getContext());
                bkVar.f46483a = i10;
                w0(bkVar);
                return;
            case 3:
                hl hlVar = new hl(this, recyclerView.getContext());
                hlVar.f46483a = i10;
                w0(hlVar);
                return;
            default:
                qn qnVar = new qn(this, recyclerView.getContext());
                qnVar.f46483a = i10;
                w0(qnVar);
                return;
        }
    }

    public d0(pl plVar, ai.u1 u1Var) {
        super(0, 0, u1Var);
        this.U = 3;
        this.V = plVar;
    }
}
