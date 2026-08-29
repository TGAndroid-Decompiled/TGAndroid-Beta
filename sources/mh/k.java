package mh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.d1;
import f2.k1;
import f2.w;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.zi;
public final class k extends w {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(fi fiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = fiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((nx0) this.R).S != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, d1 d1Var, k1 k1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).f17042b) {
                    i10 = 0;
                }
                return super.o0(i10, d1Var, k1Var);
            default:
                return super.o0(i10, d1Var, k1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, k1 k1Var, int i10) {
        switch (this.Q) {
            case 1:
                zi ziVar = new zi(this, recyclerView.getContext());
                ziVar.f6373a = i10;
                w0(ziVar);
                return;
            case 2:
                ul ulVar = new ul(this, recyclerView.getContext());
                ulVar.f6373a = i10;
                w0(ulVar);
                return;
            default:
                super.v0(recyclerView, k1Var, i10);
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

    public k(nx0 nx0Var) {
        super(5);
        this.Q = 3;
        this.R = nx0Var;
    }

    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
