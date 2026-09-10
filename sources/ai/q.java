package ai;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.qi;
import s4.z0;
public final class q extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public q(qi qiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = qiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((hy0) this.R).W != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, of.e eVar, z0 z0Var) {
        switch (this.Q) {
            case 0:
                if (((a0) this.R).f412b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        switch (this.Q) {
            case 1:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.f41760a = i10;
                w0(kjVar);
                return;
            case 2:
                em emVar = new em(this, recyclerView.getContext());
                emVar.f41760a = i10;
                w0(emVar);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return super.y0();
        }
    }

    public q(hy0 hy0Var) {
        super(5);
        this.Q = 3;
        this.R = hy0Var;
    }

    public q(a0 a0Var) {
        super(3);
        this.Q = 0;
        this.R = a0Var;
    }
}
