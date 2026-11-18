package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.zj;
public final class c0 extends wy {
    public final int U;
    public final ki V;

    public c0(ki kiVar, int i7, ck0 ck0Var, int i10) {
        super(i7, 0, ck0Var);
        this.U = i10;
        this.V = kiVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f59217n - C();
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
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.f59066a = i7;
                w0(b0Var);
                return;
            case 1:
                ij ijVar = new ij(this, recyclerView.getContext());
                ijVar.f59066a = i7;
                w0(ijVar);
                return;
            case 2:
                zj zjVar = new zj(this, recyclerView.getContext());
                zjVar.f59066a = i7;
                w0(zjVar);
                return;
            case 3:
                gl glVar = new gl(this, recyclerView.getContext());
                glVar.f59066a = i7;
                w0(glVar);
                return;
            default:
                gn gnVar = new gn(this, recyclerView.getContext());
                gnVar.f59066a = i7;
                w0(gnVar);
                return;
        }
    }

    @Override
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(c1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((kl) this.V).M.getHeight());
                return;
            default:
                super.z0(c1Var, iArr);
                return;
        }
    }

    public c0(kl klVar, di.b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = klVar;
    }
}
