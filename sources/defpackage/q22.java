package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class q22 extends td4 {
    public final byte U;
    public final f12 V;

    public q22(s42 s42Var, gu guVar) {
        super(0, 0, guVar);
        this.U = (byte) 2;
        this.V = s42Var;
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
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.U) {
            case 0:
                p22 p22Var = new p22(this, recyclerView.getContext());
                p22Var.a = i;
                v0(p22Var);
                return;
            case 1:
                j32 j32Var = new j32(this, recyclerView.getContext());
                j32Var.a = i;
                v0(j32Var);
                return;
            case 2:
                o42 o42Var = new o42(this, recyclerView.getContext());
                o42Var.a = i;
                v0(o42Var);
                return;
            case 3:
                r62 r62Var = new r62(this, recyclerView.getContext());
                r62Var.a = i;
                v0(r62Var);
                return;
            default:
                b72 b72Var = new b72(this, recyclerView.getContext());
                b72Var.a = i;
                v0(b72Var);
                return;
        }
    }

    @Override
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(c89Var, iArr);
                iArr[1] = Math.max(iArr[1], ((s42) this.V).M.getHeight());
                return;
            default:
                super.y0(c89Var, iArr);
                return;
        }
    }

    public q22(f12 f12Var, int i, d79 d79Var, byte b) {
        super(i, 0, d79Var);
        this.U = b;
        this.V = f12Var;
    }
}
