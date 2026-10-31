package ag;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.zm;
public final class d1 extends az {
    public final int U;
    public final uh V;

    public d1(uh uhVar, int i10, tk0 tk0Var, int i11) {
        super(i10, 0, tk0Var);
        this.U = i11;
        this.V = uhVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f47988n - C();
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
                c1 c1Var = new c1(this, recyclerView.getContext());
                c1Var.f48045a = i10;
                w0(c1Var);
                return;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.f48045a = i10;
                w0(tiVar);
                return;
            case 2:
                mj mjVar = new mj(this, recyclerView.getContext());
                mjVar.f48045a = i10;
                w0(mjVar);
                return;
            case 3:
                tk tkVar = new tk(this, recyclerView.getContext());
                tkVar.f48045a = i10;
                w0(tkVar);
                return;
            default:
                zm zmVar = new zm(this, recyclerView.getContext());
                zmVar.f48045a = i10;
                w0(zmVar);
                return;
        }
    }

    public d1(bl blVar, b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = blVar;
    }
}
