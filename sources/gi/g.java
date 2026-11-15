package gi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hi.d3;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.wi;
import v4.b1;
import v4.s;
import v4.w0;
public final class g extends s {
    public final int Q;
    public final KeyEvent.Callback R;

    public g(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                if (((bw0) this.R).R1 != null && hd.f24101a0) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public void b0(w0 w0Var, b1 b1Var) {
        switch (this.Q) {
            case 1:
                super.b0(w0Var, b1Var);
                d3 d3Var = (d3) this.R;
                if (d3Var.V) {
                    d3Var.V = false;
                    d3Var.a();
                    return;
                }
                return;
            default:
                super.b0(w0Var, b1Var);
                return;
        }
    }

    @Override
    public int o0(int i7, w0 w0Var, b1 b1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).f13338b) {
                    i7 = 0;
                }
                return super.o0(i7, w0Var, b1Var);
            default:
                return super.o0(i7, w0Var, b1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, b1 b1Var, int i7) {
        switch (this.Q) {
            case 2:
                wi wiVar = new wi(this, recyclerView.getContext());
                wiVar.f58480a = i7;
                w0(wiVar);
                return;
            case 3:
                ul ulVar = new ul(this, recyclerView.getContext());
                ulVar.f58480a = i7;
                w0(ulVar);
                return;
            default:
                super.v0(recyclerView, b1Var, i7);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
        }
    }

    public g(ci ciVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = ciVar;
    }

    public g(bw0 bw0Var) {
        super(5);
        this.Q = 4;
        this.R = bw0Var;
    }
}
