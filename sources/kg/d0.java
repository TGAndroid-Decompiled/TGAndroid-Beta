package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.yy;
public final class d0 extends yy {
    public final int U;
    public final mi V;

    public d0(mi miVar, int i7, ek0 ek0Var, int i10) {
        super(i7, 0, ek0Var);
        this.U = i10;
        this.V = miVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f59260n - C();
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
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.U) {
            case 0:
                c0 c0Var = new c0(this, recyclerView.getContext());
                c0Var.f59109a = i7;
                w0(c0Var);
                return;
            case 1:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.f59109a = i7;
                w0(kjVar);
                return;
            case 2:
                bk bkVar = new bk(this, recyclerView.getContext());
                bkVar.f59109a = i7;
                w0(bkVar);
                return;
            case 3:
                il ilVar = new il(this, recyclerView.getContext());
                ilVar.f59109a = i7;
                w0(ilVar);
                return;
            default:
                in inVar = new in(this, recyclerView.getContext());
                inVar.f59109a = i7;
                w0(inVar);
                return;
        }
    }

    @Override
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(c1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((ml) this.V).M.getHeight());
                return;
            default:
                super.z0(c1Var, iArr);
                return;
        }
    }

    public d0(ml mlVar, di.b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = mlVar;
    }
}
