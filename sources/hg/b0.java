package hg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ct0;
import org.telegram.ui.ub;
public final class b0 extends s4.c0 {
    public final int I;

    public b0(int i10) {
        this.I = i10;
    }

    @Override
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(z0Var);
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
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 4:
                ki.p pVar = new ki.p(recyclerView.getContext(), 0);
                pVar.f45906a = i10;
                w0(pVar);
                return;
            case 15:
                ct0 ct0Var = new ct0(recyclerView.getContext());
                ct0Var.f45906a = i10;
                w0(ct0Var);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
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

    public b0(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public b0(ub ubVar) {
        this.I = 4;
    }

    public b0() {
        super(0, true);
        this.I = 15;
    }
}
