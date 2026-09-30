package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.cm;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.pi;
import s4.z0;
public final class l extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public l(pi piVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = piVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((iy0) this.R).W != null && LocaleController.isRTL) {
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
                if (((u) this.R).f3591b) {
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
                kjVar.f43218a = i10;
                w0(kjVar);
                return;
            case 2:
                cm cmVar = new cm(this, recyclerView.getContext());
                cmVar.f43218a = i10;
                w0(cmVar);
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

    public l(iy0 iy0Var) {
        super(5);
        this.Q = 3;
        this.R = iy0Var;
    }

    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
