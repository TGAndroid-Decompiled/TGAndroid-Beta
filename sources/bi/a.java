package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bt0;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.ws0;
public final class a extends u91 {
    public final int T = 1;
    public Object U;
    public final FrameLayout V;

    public a(ct0 ct0Var, Context context, bt0 bt0Var) {
        super(context, null);
        this.V = ct0Var;
        this.U = bt0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((ws0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                ws0 ws0Var = (ws0) this.V;
                String currentLang = ws0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ws0Var.G.L0();
                    return;
                }
                return;
            default:
                ((bt0) this.U).d.J0(((ct0) this.V).f36308n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                ws0 ws0Var = (ws0) this.V;
                String currentLang = ws0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ws0Var.G.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                int i11 = ((ct0) this.V).f36308n.f30806b0.get(i10, -1);
                hw0 hw0Var = ((bt0) this.U).d;
                if (i11 <= 0) {
                    hw0.t(hw0Var, 8, z10);
                    return;
                } else {
                    hw0.t(hw0Var, hw0Var.i1(i11).f26543a, z10);
                    return;
                }
            default:
                super.y(i10, z10);
                return;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                ws0 ws0Var = (ws0) this.V;
                String currentLang = ws0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ws0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ct0) this.V).f36308n.f30806b0.get(i10, -1);
                ((bt0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(ws0 ws0Var, Context context) {
        super(context, null);
        this.V = ws0Var;
    }
}
