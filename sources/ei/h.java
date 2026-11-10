package ei;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import fi.f3;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.yv0;
import v4.a1;
import v4.s;
import v4.v0;
public final class h extends s {
    public final int Q;
    public final KeyEvent.Callback R;

    public h(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                if (((yv0) this.R).Q1 != null && id.f23161a0) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public void b0(v0 v0Var, a1 a1Var) {
        switch (this.Q) {
            case 1:
                super.b0(v0Var, a1Var);
                f3 f3Var = (f3) this.R;
                if (f3Var.U) {
                    f3Var.U = false;
                    f3Var.a();
                    return;
                }
                return;
            default:
                super.b0(v0Var, a1Var);
                return;
        }
    }

    @Override
    public int o0(int i7, v0 v0Var, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((n) this.R).f10835b) {
                    i7 = 0;
                }
                return super.o0(i7, v0Var, a1Var);
            default:
                return super.o0(i7, v0Var, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i7) {
        switch (this.Q) {
            case 2:
                ni niVar = new ni(this, recyclerView.getContext());
                niVar.f57221a = i7;
                w0(niVar);
                return;
            case 3:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.f57221a = i7;
                w0(mlVar);
                return;
            default:
                super.v0(recyclerView, a1Var, i7);
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

    public h(uh uhVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = uhVar;
    }

    public h(yv0 yv0Var) {
        super(5);
        this.Q = 4;
        this.R = yv0Var;
    }
}
