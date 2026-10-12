package ci;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.ty0;
import s4.y0;
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
                if (((ty0) this.R).W != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, qf.e eVar, y0 y0Var) {
        switch (this.Q) {
            case 0:
                if (((t) this.R).f4781b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, y0Var);
            default:
                return super.o0(i10, eVar, y0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, y0 y0Var, int i10) {
        switch (this.Q) {
            case 1:
                ij ijVar = new ij(this, recyclerView.getContext());
                ijVar.f44979a = i10;
                w0(ijVar);
                return;
            case 2:
                nm nmVar = new nm(this, recyclerView.getContext());
                nmVar.f44979a = i10;
                w0(nmVar);
                return;
            default:
                super.v0(recyclerView, y0Var, i10);
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

    public k(ty0 ty0Var) {
        super(5);
        this.Q = 3;
        this.R = ty0Var;
    }

    public k(t tVar) {
        super(3);
        this.Q = 0;
        this.R = tVar;
    }
}
