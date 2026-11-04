package kg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.kb;
import org.telegram.ui.so0;
public final class y extends u4.b0 {
    public final int I;

    public y(int i3) {
        this.I = i3;
    }

    @Override
    public int W0(u4.a1 a1Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return org.telegram.messenger.g0.L(4000.0f);
            default:
                return super.W0(a1Var);
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
    public void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.I) {
            case 4:
                ni.m mVar = new ni.m(recyclerView.getContext(), 0);
                mVar.f55704a = i3;
                w0(mVar);
                return;
            case 15:
                so0 so0Var = new so0(recyclerView.getContext());
                so0Var.f55704a = i3;
                w0(so0Var);
                return;
            default:
                super.v0(recyclerView, a1Var, i3);
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

    public y(int i3, boolean z10, int i10) {
        super(i3, z10);
        this.I = i10;
    }

    public y(kb kbVar) {
        this.I = 4;
    }

    public y() {
        super(0, true);
        this.I = 15;
    }
}
