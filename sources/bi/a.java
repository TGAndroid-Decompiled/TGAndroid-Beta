package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.ys0;
public final class a extends q91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(ys0 ys0Var, Context context, xs0 xs0Var) {
        super(context, null);
        this.V = ys0Var;
        this.U = xs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((ss0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                ss0 ss0Var = (ss0) this.V;
                String currentLang = ss0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ss0Var.G.L0();
                    return;
                }
                return;
            default:
                ((xs0) this.U).d.J0(((ys0) this.V).f44556n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                ss0 ss0Var = (ss0) this.V;
                String currentLang = ss0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ss0Var.G.L0();
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
                int i11 = ((ys0) this.V).f44556n.f29661b0.get(i10, -1);
                dw0 dw0Var = ((xs0) this.U).d;
                if (i11 <= 0) {
                    dw0.t(dw0Var, 8, z10);
                    return;
                } else {
                    dw0.t(dw0Var, dw0Var.i1(i11).f25332a, z10);
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
                ss0 ss0Var = (ss0) this.V;
                String currentLang = ss0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ss0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ys0) this.V).f44556n.f29661b0.get(i10, -1);
                ((xs0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(ss0 ss0Var, Context context) {
        super(context, null);
        this.V = ss0Var;
    }
}
