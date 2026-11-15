package jg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.lb;
import org.telegram.ui.zo0;
public final class b0 extends v4.b0 {
    public final int I;

    public b0(int i7) {
        this.I = i7;
    }

    @Override
    public int W0(v4.b1 b1Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return org.telegram.messenger.g0.L(4000.0f);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.I) {
            case 4:
                pi.l lVar = new pi.l(recyclerView.getContext(), 0);
                lVar.f58480a = i7;
                w0(lVar);
                return;
            case 15:
                zo0 zo0Var = new zo0(recyclerView.getContext());
                zo0Var.f58480a = i7;
                w0(zo0Var);
                return;
            default:
                super.v0(recyclerView, b1Var, i7);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 1:
            case 5:
            case 6:
            case 9:
            case 15:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 7:
                return false;
            case 8:
                return false;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 14:
                return false;
            case 16:
                return false;
            case 17:
                return false;
            case 18:
                return true;
            case 19:
                return false;
            case 20:
                return false;
        }
    }

    public b0(int i7, boolean z10, int i10) {
        super(i7, z10);
        this.I = i10;
    }

    public b0(lb lbVar) {
        this.I = 4;
    }

    public b0() {
        super(0, true);
        this.I = 15;
    }
}
