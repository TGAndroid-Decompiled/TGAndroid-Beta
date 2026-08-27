package kh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.e1;
import f2.l1;
import f2.x;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.yh;

public final class l extends x {
    public final int Q;
    public final KeyEvent.Callback R;

    public l(yh yhVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = yhVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((ex0) this.R).S != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override
    public int o0(int i10, e1 e1Var, l1 l1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).f15215b) {
                    i10 = 0;
                }
                return super.o0(i10, e1Var, l1Var);
            default:
                return super.o0(i10, e1Var, l1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, l1 l1Var, int i10) {
        switch (this.Q) {
            case 1:
                si siVar = new si(this, recyclerView.getContext());
                siVar.f5731a = i10;
                w0(siVar);
                break;
            case 2:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.f5731a = i10;
                w0(mlVar);
                break;
            default:
                super.v0(recyclerView, l1Var, i10);
                break;
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

    public l(ex0 ex0Var) {
        super(5);
        this.Q = 3;
        this.R = ex0Var;
    }

    public l(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
