package jh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.g1;
import f2.n1;
import f2.y;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.wi;
public final class k extends y {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(ci ciVar, int i9, int i10) {
        super(i9);
        this.Q = i10;
        this.R = ciVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((cx0) this.R).S != null && LocaleController.isRTL) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        switch (this.Q) {
            case 0:
                if (((q) this.R).f14364b) {
                    i9 = 0;
                }
                return super.o0(i9, g1Var, n1Var);
            default:
                return super.o0(i9, g1Var, n1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, n1 n1Var, int i9) {
        switch (this.Q) {
            case 1:
                wi wiVar = new wi(this, recyclerView.getContext());
                wiVar.f5443a = i9;
                w0(wiVar);
                return;
            case 2:
                ql qlVar = new ql(this, recyclerView.getContext());
                qlVar.f5443a = i9;
                w0(qlVar);
                return;
            default:
                super.v0(recyclerView, n1Var, i9);
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

    public k(cx0 cx0Var) {
        super(5);
        this.Q = 3;
        this.R = cx0Var;
    }

    public k(q qVar) {
        super(3);
        this.Q = 0;
        this.R = qVar;
    }
}
