package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.vn;
public final class e0 extends b00 {
    public final int U;
    public final ni V;

    public e0(ni niVar, int i10, mm0 mm0Var, int i11) {
        super(i10, 0, mm0Var);
        this.U = i11;
        this.V = niVar;
    }

    @Override
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.f44940n - C();
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
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.U) {
            case 0:
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.f44979a = i10;
                w0(d0Var);
                return;
            case 1:
                oj ojVar = new oj(this, recyclerView.getContext());
                ojVar.f44979a = i10;
                w0(ojVar);
                return;
            case 2:
                fk fkVar = new fk(this, recyclerView.getContext());
                fkVar.f44979a = i10;
                w0(fkVar);
                return;
            case 3:
                ll llVar = new ll(this, recyclerView.getContext());
                llVar.f44979a = i10;
                w0(llVar);
                return;
            default:
                vn vnVar = new vn(this, recyclerView.getContext());
                vnVar.f44979a = i10;
                w0(vnVar);
                return;
        }
    }

    public e0(tl tlVar, bi.o0 o0Var) {
        super(0, 0, o0Var);
        this.U = 3;
        this.V = tlVar;
    }
}
