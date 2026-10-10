package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xs0;
public final class a extends p91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(xs0 xs0Var, Context context, ws0 ws0Var) {
        super(context, null);
        this.V = xs0Var;
        this.U = ws0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((rs0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                rs0 rs0Var = (rs0) this.V;
                String currentLang = rs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    rs0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ws0) this.U).d.J0(((xs0) this.V).f35855n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                rs0 rs0Var = (rs0) this.V;
                String currentLang = rs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    rs0Var.G.L0();
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
                int i11 = ((xs0) this.V).f35855n.f29403b0.get(i10, -1);
                cw0 cw0Var = ((ws0) this.U).d;
                if (i11 <= 0) {
                    cw0.t(cw0Var, 8, z10);
                    return;
                } else {
                    cw0.t(cw0Var, cw0Var.i1(i11).f25067a, z10);
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
                rs0 rs0Var = (rs0) this.V;
                String currentLang = rs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    rs0Var.G.L0();
                    return;
                }
                return;
            default:
                ((xs0) this.V).f35855n.f29403b0.get(i10, -1);
                ((ws0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(rs0 rs0Var, Context context) {
        super(context, null);
        this.V = rs0Var;
    }
}
