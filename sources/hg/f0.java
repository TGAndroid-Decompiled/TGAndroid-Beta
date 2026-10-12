package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zl;
public final class f0 extends i00 {
    public final int U;
    public final si V;

    public f0(si siVar, int i10, wm0 wm0Var, int i11) {
        super(i10, 0, wm0Var);
        this.U = i11;
        this.V = siVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f48013n - C();
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
                e0Var.f48066a = i10;
                w0(e0Var);
                return;
            case 1:
                tj tjVar = new tj(this, recyclerView.getContext());
                tjVar.f48066a = i10;
                w0(tjVar);
                return;
            case 2:
                kk kkVar = new kk(this, recyclerView.getContext());
                kkVar.f48066a = i10;
                w0(kkVar);
                return;
            case 3:
                rl rlVar = new rl(this, recyclerView.getContext());
                rlVar.f48066a = i10;
                w0(rlVar);
                return;
            default:
                ao aoVar = new ao(this, recyclerView.getContext());
                aoVar.f48066a = i10;
                w0(aoVar);
                return;
        }
    }

    public f0(zl zlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = zlVar;
    }
}
