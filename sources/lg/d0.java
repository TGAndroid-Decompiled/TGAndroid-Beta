package lg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uk;
public final class d0 extends jy {
    public final int U;
    public final th V;

    public d0(th thVar, int i3, tj0 tj0Var, int i10) {
        super(i3, 0, tj0Var);
        this.U = i10;
        this.V = thVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f55640n - C();
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
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.U) {
            case 0:
                c0 c0Var = new c0(this, recyclerView.getContext());
                c0Var.f55704a = i3;
                w0(c0Var);
                return;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.f55704a = i3;
                w0(tiVar);
                return;
            case 2:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.f55704a = i3;
                w0(kjVar);
                return;
            case 3:
                qk qkVar = new qk(this, recyclerView.getContext());
                qkVar.f55704a = i3;
                w0(qkVar);
                return;
            default:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.f55704a = i3;
                w0(qmVar);
                return;
        }
    }

    @Override
    public void z0(u4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((uk) this.V).M.getHeight());
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public d0(uk ukVar, ci.j1 j1Var) {
        super(0, 0, j1Var);
        this.U = 3;
        this.V = ukVar;
    }
}
