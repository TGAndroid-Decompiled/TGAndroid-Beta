package ei;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lm;
import s4.b1;
public final class k extends s4.t {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(li liVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = liVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((cz0) this.R).W != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, rf.e eVar, b1 b1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).f10002b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, b1Var);
            default:
                return super.o0(i10, eVar, b1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, b1 b1Var, int i10) {
        switch (this.Q) {
            case 1:
                gj gjVar = new gj(this, recyclerView.getContext());
                gjVar.f47677a = i10;
                w0(gjVar);
                return;
            case 2:
                lm lmVar = new lm(this, recyclerView.getContext());
                lmVar.f47677a = i10;
                w0(lmVar);
                return;
            default:
                super.v0(recyclerView, b1Var, i10);
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

    public k(cz0 cz0Var) {
        super(5);
        this.Q = 3;
        this.R = cz0Var;
    }

    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
