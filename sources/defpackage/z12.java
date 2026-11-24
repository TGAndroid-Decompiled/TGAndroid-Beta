package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class z12 extends wb4 {
    public final byte U;
    public final p02 V;

    public z12(c42 c42Var, fu fuVar) {
        super(0, 0, fuVar);
        this.U = (byte) 2;
        this.V = c42Var;
    }

    @Override
    public final int[] t(View view, Rect rect) {
        switch (this.U) {
            case 3:
                int B = this.n - B();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int min = Math.min(0, top);
                int max = Math.max(0, (rect.height() + top) - B);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.U) {
            case 0:
                y12 y12Var = new y12(this, recyclerView.getContext());
                y12Var.a = i;
                v0(y12Var);
                return;
            case 1:
                s22 s22Var = new s22(this, recyclerView.getContext());
                s22Var.a = i;
                v0(s22Var);
                return;
            case 2:
                y32 y32Var = new y32(this, recyclerView.getContext());
                y32Var.a = i;
                v0(y32Var);
                return;
            case 3:
                b62 b62Var = new b62(this, recyclerView.getContext());
                b62Var.a = i;
                v0(b62Var);
                return;
            default:
                l62 l62Var = new l62(this, recyclerView.getContext());
                l62Var.a = i;
                v0(l62Var);
                return;
        }
    }

    @Override
    public final void y0(p49 p49Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(p49Var, iArr);
                iArr[1] = Math.max(iArr[1], ((c42) this.V).M.getHeight());
                return;
            default:
                super.y0(p49Var, iArr);
                return;
        }
    }

    public z12(p02 p02Var, int i, o39 o39Var, byte b) {
        super(i, 0, o39Var);
        this.U = b;
        this.V = p02Var;
    }
}
