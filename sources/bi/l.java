package bi;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.xy0;
import s4.a1;
public final class l extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public l(qi qiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = qiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((xy0) this.R).W != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, pf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((u) this.R).f3924b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, a1Var);
            default:
                return super.o0(i10, eVar, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i10) {
        switch (this.Q) {
            case 1:
                lj ljVar = new lj(this, recyclerView.getContext());
                ljVar.f47827a = i10;
                w0(ljVar);
                return;
            case 2:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.f47827a = i10;
                w0(qmVar);
                return;
            default:
                super.v0(recyclerView, a1Var, i10);
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

    public l(xy0 xy0Var) {
        super(5);
        this.Q = 3;
        this.R = xy0Var;
    }

    public l(u uVar) {
        super(3);
        this.Q = 0;
        this.R = uVar;
    }
}
