package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wz;
public final class j0 extends wz {
    public final int U;
    public final qi V;

    public j0(qi qiVar, int i10, vl0 vl0Var, int i11) {
        super(i10, 0, vl0Var);
        this.U = i11;
        this.V = qiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f41712n - C();
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
                i0 i0Var = new i0(this, recyclerView.getContext());
                i0Var.f41760a = i10;
                w0(i0Var);
                return;
            case 1:
                qj qjVar = new qj(this, recyclerView.getContext());
                qjVar.f41760a = i10;
                w0(qjVar);
                return;
            case 2:
                jk jkVar = new jk(this, recyclerView.getContext());
                jkVar.f41760a = i10;
                w0(jkVar);
                return;
            case 3:
                dl dlVar = new dl(this, recyclerView.getContext());
                dlVar.f41760a = i10;
                w0(dlVar);
                return;
            default:
                on onVar = new on(this, recyclerView.getContext());
                onVar.f41760a = i10;
                w0(onVar);
                return;
        }
    }

    public j0(ll llVar, bi.y1 y1Var) {
        super(0, 0, y1Var);
        this.U = 3;
        this.V = llVar;
    }
}
