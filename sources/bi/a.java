package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.zr0;
public final class a extends y81 {
    public final int T = 1;
    public Object U;
    public final FrameLayout V;

    public a(gs0 gs0Var, Context context, fs0 fs0Var) {
        super(context, null);
        this.V = gs0Var;
        this.U = fs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((zr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((fs0) this.U).d.J0(((gs0) this.V).f37566n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
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
                int i11 = ((gs0) this.V).f37566n.f30311b0.get(i10, -1);
                lv0 lv0Var = ((fs0) this.U).d;
                if (i11 <= 0) {
                    lv0.t(lv0Var, 8, z10);
                    return;
                } else {
                    lv0.t(lv0Var, lv0Var.i1(i11).f25827a, z10);
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
                zr0 zr0Var = (zr0) this.V;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    zr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((gs0) this.V).f37566n.f30311b0.get(i10, -1);
                ((fs0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(zr0 zr0Var, Context context) {
        super(context, null);
        this.V = zr0Var;
    }
}
