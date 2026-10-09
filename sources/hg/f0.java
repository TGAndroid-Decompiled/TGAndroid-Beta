package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.yn;
public final class f0 extends f00 {
    public final int U;
    public final qi V;

    public f0(qi qiVar, int i10, qm0 qm0Var, int i11) {
        super(i10, 0, qm0Var);
        this.U = i11;
        this.V = qiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f47772n - C();
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
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.U) {
            case 0:
                e0 e0Var = new e0(this, recyclerView.getContext());
                e0Var.f47825a = i10;
                w0(e0Var);
                return;
            case 1:
                rj rjVar = new rj(this, recyclerView.getContext());
                rjVar.f47825a = i10;
                w0(rjVar);
                return;
            case 2:
                ik ikVar = new ik(this, recyclerView.getContext());
                ikVar.f47825a = i10;
                w0(ikVar);
                return;
            case 3:
                pl plVar = new pl(this, recyclerView.getContext());
                plVar.f47825a = i10;
                w0(plVar);
                return;
            default:
                yn ynVar = new yn(this, recyclerView.getContext());
                ynVar.f47825a = i10;
                w0(ynVar);
                return;
        }
    }

    public f0(xl xlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = xlVar;
    }
}
