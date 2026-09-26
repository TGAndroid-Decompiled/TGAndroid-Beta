package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.oi;
import s4.z0;
public final class l extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public l(oi oiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = oiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((gy0) this.R).W != null && LocaleController.isRTL) {
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
                if (((u) this.R).f3584b) {
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
                jj jjVar = new jj(this, recyclerView.getContext());
                jjVar.f43109a = i10;
                w0(jjVar);
                return;
            case 2:
                bm bmVar = new bm(this, recyclerView.getContext());
                bmVar.f43109a = i10;
                w0(bmVar);
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

    public l(gy0 gy0Var) {
        super(5);
        this.Q = 3;
        this.R = gy0Var;
    }

    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
