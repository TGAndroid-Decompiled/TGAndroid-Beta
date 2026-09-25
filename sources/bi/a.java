package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.xr0;
public final class a extends w81 {
    public final int T = 1;
    public Object U;
    public final FrameLayout V;

    public a(es0 es0Var, Context context, ds0 ds0Var) {
        super(context, null);
        this.V = es0Var;
        this.U = ds0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((xr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ds0) this.U).d.J0(((es0) this.V).f37567n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
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
                int i11 = ((es0) this.V).f37567n.f29084b0.get(i10, -1);
                jv0 jv0Var = ((ds0) this.U).d;
                if (i11 <= 0) {
                    jv0.t(jv0Var, 8, z10);
                    return;
                } else {
                    jv0.t(jv0Var, jv0Var.i1(i11).f25173a, z10);
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
                xr0 xr0Var = (xr0) this.V;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    xr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((es0) this.V).f37567n.f29084b0.get(i10, -1);
                ((ds0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(xr0 xr0Var, Context context) {
        super(context, null);
        this.V = xr0Var;
    }
}
