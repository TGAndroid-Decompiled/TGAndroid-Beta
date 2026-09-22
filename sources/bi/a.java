package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.z81;
import org.telegram.ui.Components.zr0;
public final class a extends z81 {
    public final int U = 1;
    public Object V;
    public final FrameLayout W;

    public a(gs0 gs0Var, Context context, fs0 fs0Var) {
        super(context, null);
        this.W = gs0Var;
        this.V = fs0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((gs0) this.W).f31984n.f30586b0.get(i10, -1);
                ((fs0) this.V).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((zr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((fs0) this.V).d.J0(((gs0) this.W).f31984n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.U) {
            case 0:
                zr0 zr0Var = (zr0) this.W;
                String currentLang = zr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    zr0Var.G.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                int i11 = ((gs0) this.W).f31984n.f30586b0.get(i10, -1);
                lv0 lv0Var = ((fs0) this.V).d;
                if (i11 <= 0) {
                    lv0.t(lv0Var, 8, z10);
                    return;
                } else {
                    lv0.t(lv0Var, lv0Var.i1(i11).f25825a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(zr0 zr0Var, Context context) {
        super(context, null);
        this.W = zr0Var;
    }
}
