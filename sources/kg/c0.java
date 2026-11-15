package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Components.zm;
public final class c0 extends qy {
    public final int U;
    public final ci V;

    public c0(ci ciVar, int i7, uj0 uj0Var, int i10) {
        super(i7, 0, uj0Var);
        this.U = i10;
        this.V = ciVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f58632n - C();
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
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.U) {
            case 0:
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.f58480a = i7;
                w0(b0Var);
                return;
            case 1:
                bj bjVar = new bj(this, recyclerView.getContext());
                bjVar.f58480a = i7;
                w0(bjVar);
                return;
            case 2:
                sj sjVar = new sj(this, recyclerView.getContext());
                sjVar.f58480a = i7;
                w0(sjVar);
                return;
            case 3:
                zk zkVar = new zk(this, recyclerView.getContext());
                zkVar.f58480a = i7;
                w0(zkVar);
                return;
            default:
                zm zmVar = new zm(this, recyclerView.getContext());
                zmVar.f58480a = i7;
                w0(zmVar);
                return;
        }
    }

    @Override
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((dl) this.V).M.getHeight());
                return;
            default:
                super.z0(b1Var, iArr);
                return;
        }
    }

    public c0(dl dlVar, di.c1 c1Var) {
        super(0, 0, c1Var);
        this.U = 3;
        this.V = dlVar;
    }
}
