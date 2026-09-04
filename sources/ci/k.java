package ci;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.zl;
import s4.z0;
public final class k extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(ni niVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = niVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((ux0) this.R).W != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, pf.e eVar, z0 z0Var) {
        switch (this.Q) {
            case 0:
                if (((t) this.R).f4832b) {
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
                hj hjVar = new hj(this, recyclerView.getContext());
                hjVar.f45906a = i10;
                w0(hjVar);
                return;
            case 2:
                zl zlVar = new zl(this, recyclerView.getContext());
                zlVar.f45906a = i10;
                w0(zlVar);
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

    public k(ux0 ux0Var) {
        super(5);
        this.Q = 3;
        this.R = ux0Var;
    }

    public k(t tVar) {
        super(3);
        this.Q = 0;
        this.R = tVar;
    }
}
