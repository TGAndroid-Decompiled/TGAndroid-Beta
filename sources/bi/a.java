package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.ws0;
public final class a extends o91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(ws0 ws0Var, Context context, vs0 vs0Var) {
        super(context, null);
        this.V = ws0Var;
        this.U = vs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((qs0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
                    return;
                }
                return;
            default:
                ((vs0) this.U).d.J0(((ws0) this.V).f35811n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
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
                int i11 = ((ws0) this.V).f35811n.f29098b0.get(i10, -1);
                bw0 bw0Var = ((vs0) this.U).d;
                if (i11 <= 0) {
                    bw0.t(bw0Var, 8, z10);
                    return;
                } else {
                    bw0.t(bw0Var, bw0Var.i1(i11).f24783a, z10);
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
                qs0 qs0Var = (qs0) this.V;
                String currentLang = qs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    qs0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ws0) this.V).f35811n.f29098b0.get(i10, -1);
                ((vs0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(qs0 qs0Var, Context context) {
        super(context, null);
        this.V = qs0Var;
    }
}
