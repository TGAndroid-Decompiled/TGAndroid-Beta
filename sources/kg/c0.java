package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vk;
public final class c0 extends ly {
    public final int U;
    public final uh V;

    public c0(uh uhVar, int i7, pj0 pj0Var, int i10) {
        super(i7, 0, pj0Var);
        this.U = i10;
        this.V = uhVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f57150n - C();
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
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.U) {
            case 0:
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.f57221a = i7;
                w0(b0Var);
                return;
            case 1:
                si siVar = new si(this, recyclerView.getContext());
                siVar.f57221a = i7;
                w0(siVar);
                return;
            case 2:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.f57221a = i7;
                w0(kjVar);
                return;
            case 3:
                rk rkVar = new rk(this, recyclerView.getContext());
                rkVar.f57221a = i7;
                w0(rkVar);
                return;
            default:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.f57221a = i7;
                w0(qmVar);
                return;
        }
    }

    @Override
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((vk) this.V).L.getHeight());
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public c0(vk vkVar, bi.q1 q1Var) {
        super(0, 0, q1Var);
        this.U = 3;
        this.V = vkVar;
    }
}
