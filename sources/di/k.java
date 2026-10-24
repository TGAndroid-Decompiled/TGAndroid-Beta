package di;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.sy0;
import s4.y0;
public final class k extends s4.s {
    public final int Q;
    public final KeyEvent.Callback R;

    public k(ji jiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = jiVar;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                if (((sy0) this.R).W != null && LocaleController.isRTL) {
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
                if (((r) this.R).f8062b) {
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
                ej ejVar = new ej(this, recyclerView.getContext());
                ejVar.f46483a = i10;
                w0(ejVar);
                return;
            case 2:
                im imVar = new im(this, recyclerView.getContext());
                imVar.f46483a = i10;
                w0(imVar);
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

    public k(sy0 sy0Var) {
        super(5);
        this.Q = 3;
        this.R = sy0Var;
    }

    public k(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}
