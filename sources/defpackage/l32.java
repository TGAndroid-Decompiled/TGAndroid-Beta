package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l32 extends wd4 {
    public final byte U;
    public final a22 V;

    public l32(n52 n52Var, fv fvVar) {
        super(0, 0, fvVar);
        this.U = (byte) 2;
        this.V = n52Var;
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
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.U) {
            case 0:
                k32 k32Var = new k32(this, recyclerView.getContext());
                k32Var.a = i;
                v0(k32Var);
                return;
            case 1:
                e42 e42Var = new e42(this, recyclerView.getContext());
                e42Var.a = i;
                v0(e42Var);
                return;
            case 2:
                j52 j52Var = new j52(this, recyclerView.getContext());
                j52Var.a = i;
                v0(j52Var);
                return;
            case 3:
                m72 m72Var = new m72(this, recyclerView.getContext());
                m72Var.a = i;
                v0(m72Var);
                return;
            default:
                w72 w72Var = new w72(this, recyclerView.getContext());
                w72Var.a = i;
                v0(w72Var);
                return;
        }
    }

    @Override
    public final void y0(r69 r69Var, int[] iArr) {
        switch (this.U) {
            case 2:
                super.y0(r69Var, iArr);
                iArr[1] = Math.max(iArr[1], ((n52) this.V).M.getHeight());
                return;
            default:
                super.y0(r69Var, iArr);
                return;
        }
    }

    public l32(a22 a22Var, int i, r59 r59Var, byte b) {
        super(i, 0, r59Var);
        this.U = b;
        this.V = a22Var;
    }
}
