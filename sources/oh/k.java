package oh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.i1;
import f2.w;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.vl;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xx0;
public final class k extends w {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(di diVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = diVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((xx0) this.R).T != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, af.h hVar, i1 i1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).f16582b) {
                    i10 = 0;
                }
                return super.o0(i10, hVar, i1Var);
            default:
                return super.o0(i10, hVar, i1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, i1 i1Var, int i10) {
        switch (this.Q) {
            case 1:
                xi xiVar = new xi(this, recyclerView.getContext());
                xiVar.f5712a = i10;
                w0(xiVar);
                return;
            case 2:
                vl vlVar = new vl(this, recyclerView.getContext());
                vlVar.f5712a = i10;
                w0(vlVar);
                return;
            default:
                super.v0(recyclerView, i1Var, i10);
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

    public k(xx0 xx0Var) {
        super(5);
        this.Q = 3;
        this.R = xx0Var;
    }

    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
