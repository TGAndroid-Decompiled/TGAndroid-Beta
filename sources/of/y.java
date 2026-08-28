package of;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.as0;
import org.telegram.ui.pb;
public final class y extends f2.m0 {
    public final int I;

    public y(int i9) {
        this.I = i9;
    }

    @Override
    public int W0(f2.n1 n1Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 8:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(n1Var);
        }
    }

    @Override
    public boolean e() {
        switch (this.I) {
            case 20:
                return false;
            default:
                return super.e();
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.I) {
            case 3:
                rh.n nVar = new rh.n(recyclerView.getContext(), 0);
                nVar.f5443a = i9;
                w0(nVar);
                return;
            case 14:
                as0 as0Var = new as0(recyclerView.getContext());
                as0Var.f5443a = i9;
                w0(as0Var);
                return;
            default:
                super.v0(recyclerView, n1Var, i9);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
            case 5:
            case 8:
            case 14:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 15:
                return false;
            case 16:
                return false;
            case 17:
                return true;
            case 18:
                return false;
            case 19:
                return false;
        }
    }

    public y(int i9, boolean z10, int i10) {
        super(i9, z10);
        this.I = i10;
    }

    public y(pb pbVar) {
        this.I = 3;
    }

    public y() {
        super(0, true);
        this.I = 14;
    }
}
