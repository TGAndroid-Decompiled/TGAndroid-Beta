package ai;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vr0;
public final class c extends v81 {
    public final int T = 1;
    public Object U;
    public final FrameLayout V;

    public c(cs0 cs0Var, Context context, as0 as0Var) {
        super(context, null);
        this.V = cs0Var;
        this.U = as0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((vr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((as0) this.U).d.J0(((cs0) this.V).f33250n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
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
                int i11 = ((cs0) this.V).f33250n.f27617b0.get(i10, -1);
                iv0 iv0Var = ((as0) this.U).d;
                if (i11 <= 0) {
                    iv0.t(iv0Var, 8, z10);
                    return;
                } else {
                    iv0.t(iv0Var, iv0Var.i1(i11).f23765a, z10);
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
                vr0 vr0Var = (vr0) this.V;
                String currentLang = vr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    vr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((cs0) this.V).f33250n.f27617b0.get(i10, -1);
                ((as0) this.U).d.J0(1.0f);
                return;
        }
    }

    public c(vr0 vr0Var, Context context) {
        super(context, null);
        this.V = vr0Var;
    }
}
