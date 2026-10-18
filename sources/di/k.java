package di;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.oy0;
import s4.y0;
public final class k extends s4.s {
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
                if (((oy0) this.R).W != null && LocaleController.isRTL) {
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
                if (((r) this.R).f8058b) {
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
                gj gjVar = new gj(this, recyclerView.getContext());
                gjVar.f46099a = i10;
                w0(gjVar);
                return;
            case 2:
                km kmVar = new km(this, recyclerView.getContext());
                kmVar.f46099a = i10;
                w0(kmVar);
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

    public k(oy0 oy0Var) {
        super(5);
        this.Q = 3;
        this.R = oy0Var;
    }

    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
