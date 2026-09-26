package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.xl0;
public final class g0 extends rz {
    public final int U;
    public final oi V;

    public g0(oi oiVar, int i10, xl0 xl0Var, int i11) {
        super(i10, 0, xl0Var);
        this.U = i11;
        this.V = oiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f43061n - C();
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
                f0Var.f43109a = i10;
                w0(f0Var);
                return;
            case 1:
                pj pjVar = new pj(this, recyclerView.getContext());
                pjVar.f43109a = i10;
                w0(pjVar);
                return;
            case 2:
                gk gkVar = new gk(this, recyclerView.getContext());
                gkVar.f43109a = i10;
                w0(gkVar);
                return;
            case 3:
                al alVar = new al(this, recyclerView.getContext());
                alVar.f43109a = i10;
                w0(alVar);
                return;
            default:
                kn knVar = new kn(this, recyclerView.getContext());
                knVar.f43109a = i10;
                w0(knVar);
                return;
        }
    }

    public g0(il ilVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = ilVar;
    }
}
