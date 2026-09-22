package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yk;
public final class g0 extends pz {
    public final int U;
    public final ni V;

    public g0(ni niVar, int i10, ll0 ll0Var, int i11) {
        super(i10, 0, ll0Var);
        this.U = i11;
        this.V = niVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f42773n - C();
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
                f0Var.f42821a = i10;
                w0(f0Var);
                return;
            case 1:
                nj njVar = new nj(this, recyclerView.getContext());
                njVar.f42821a = i10;
                w0(njVar);
                return;
            case 2:
                ek ekVar = new ek(this, recyclerView.getContext());
                ekVar.f42821a = i10;
                w0(ekVar);
                return;
            case 3:
                yk ykVar = new yk(this, recyclerView.getContext());
                ykVar.f42821a = i10;
                w0(ykVar);
                return;
            default:
                in inVar = new in(this, recyclerView.getContext());
                inVar.f42821a = i10;
                w0(inVar);
                return;
        }
    }

    public g0(gl glVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = glVar;
    }
}
