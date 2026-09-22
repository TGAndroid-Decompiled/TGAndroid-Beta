package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.yu0;
public final class a extends i81 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(tr0 tr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.V = tr0Var;
        this.U = rr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((mr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((rr0) this.U).d.J0(((tr0) this.V).f32636n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
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
                int i11 = ((tr0) this.V).f32636n.f24594b0.get(i10, -1);
                yu0 yu0Var = ((rr0) this.U).d;
                if (i11 <= 0) {
                    yu0.t(yu0Var, 8, z10);
                    return;
                } else {
                    yu0.t(yu0Var, yu0Var.i1(i11).f30063a, z10);
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
                mr0 mr0Var = (mr0) this.V;
                String currentLang = mr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    mr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((tr0) this.V).f32636n.f24594b0.get(i10, -1);
                ((rr0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(mr0 mr0Var, Context context) {
        super(context, null);
        this.V = mr0Var;
    }
}
