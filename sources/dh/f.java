package dh;

import androidx.recyclerview.widget.RecyclerView;
import ci.p;
import org.telegram.messenger.i0;
import org.telegram.ui.jq0;
import org.telegram.ui.sb;
import s4.a0;
import s4.z0;
public final class f extends a0 {
    public final int I;

    public f(int i10) {
        this.I = i10;
    }

    @Override
    public int W0(z0 z0Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 8:
                return i0.L(4000.0f);
            default:
                return super.W0(z0Var);
        }
    }

    @Override
    public boolean e() {
        switch (this.I) {
            case 0:
                return false;
            default:
                return super.e();
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        switch (this.I) {
            case 3:
                p pVar = new p(recyclerView.getContext(), 0);
                pVar.f48056a = i10;
                w0(pVar);
                return;
            case 14:
                jq0 jq0Var = new jq0(recyclerView.getContext());
                jq0Var.f48056a = i10;
                w0(jq0Var);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
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
            case 20:
                return false;
        }
    }

    public f(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public f(sb sbVar) {
        this.I = 3;
    }

    public f() {
        super(0, true);
        this.I = 14;
    }
}
