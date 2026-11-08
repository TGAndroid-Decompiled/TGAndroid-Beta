package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wk;
public final class c0 extends my {
    public final int U;
    public final vh V;

    public c0(vh vhVar, int i7, pj0 pj0Var, int i10) {
        super(i7, 0, pj0Var);
        this.U = i10;
        this.V = vhVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f57142n - C();
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
                b0Var.f57213a = i7;
                w0(b0Var);
                return;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.f57213a = i7;
                w0(tiVar);
                return;
            case 2:
                lj ljVar = new lj(this, recyclerView.getContext());
                ljVar.f57213a = i7;
                w0(ljVar);
                return;
            case 3:
                sk skVar = new sk(this, recyclerView.getContext());
                skVar.f57213a = i7;
                w0(skVar);
                return;
            default:
                rm rmVar = new rm(this, recyclerView.getContext());
                rmVar.f57213a = i7;
                w0(rmVar);
                return;
        }
    }

    @Override
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((wk) this.V).L.getHeight());
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public c0(wk wkVar, bi.q1 q1Var) {
        super(0, 0, q1Var);
        this.U = 3;
        this.V = wkVar;
    }
}
