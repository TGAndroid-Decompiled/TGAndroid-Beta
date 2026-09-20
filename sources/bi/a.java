package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xr0;
public final class a extends x81 {
    public final int U = 1;
    public Object V;
    public final FrameLayout W;

    public a(es0 es0Var, Context context, cs0 cs0Var) {
        super(context, null);
        this.W = es0Var;
        this.V = cs0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                xr0 xr0Var = (xr0) this.W;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    xr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((es0) this.W).f31963n.f29984b0.get(i10, -1);
                ((cs0) this.V).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((xr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                xr0 xr0Var = (xr0) this.W;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    xr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((cs0) this.V).d.J0(((es0) this.W).f31963n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.U) {
            case 0:
                xr0 xr0Var = (xr0) this.W;
                String currentLang = xr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    xr0Var.G.L0();
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
                int i11 = ((es0) this.W).f31963n.f29984b0.get(i10, -1);
                jv0 jv0Var = ((cs0) this.V).d;
                if (i11 <= 0) {
                    jv0.t(jv0Var, 8, z10);
                    return;
                } else {
                    jv0.t(jv0Var, jv0Var.i1(i11).f25136a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(xr0 xr0Var, Context context) {
        super(context, null);
        this.W = xr0Var;
    }
}
