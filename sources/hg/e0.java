package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yk;
public final class e0 extends pz {
    public final int U;
    public final ni V;

    public e0(ni niVar, int i10, ml0 ml0Var, int i11) {
        super(i10, 0, ml0Var);
        this.U = i11;
        this.V = niVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f42804n - C();
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
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.f42852a = i10;
                w0(d0Var);
                return;
            case 1:
                nj njVar = new nj(this, recyclerView.getContext());
                njVar.f42852a = i10;
                w0(njVar);
                return;
            case 2:
                ek ekVar = new ek(this, recyclerView.getContext());
                ekVar.f42852a = i10;
                w0(ekVar);
                return;
            case 3:
                yk ykVar = new yk(this, recyclerView.getContext());
                ykVar.f42852a = i10;
                w0(ykVar);
                return;
            default:
                in inVar = new in(this, recyclerView.getContext());
                inVar.f42852a = i10;
                w0(inVar);
                return;
        }
    }

    public e0(gl glVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = glVar;
    }
}
