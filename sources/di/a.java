package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.xv0;
public final class a extends l91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(ss0 ss0Var, Context context, rs0 rs0Var) {
        super(context, null);
        this.V = ss0Var;
        this.U = rs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((ms0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.O0();
                    return;
                }
                return;
            default:
                ((rs0) this.U).d.M0(((ss0) this.V).f38037n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.O0();
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
                int i11 = ((ss0) this.V).f38037n.f27963b0.get(i10, -1);
                xv0 xv0Var = ((rs0) this.U).d;
                if (i11 <= 0) {
                    xv0.u(xv0Var, 8, z10);
                    return;
                } else {
                    xv0.u(xv0Var, xv0Var.l1(i11).f32355a, z10);
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
                ms0 ms0Var = (ms0) this.V;
                String currentLang = ms0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ms0Var.G.O0();
                    return;
                }
                return;
            default:
                ((ss0) this.V).f38037n.f27963b0.get(i10, -1);
                ((rs0) this.U).d.M0(1.0f);
                return;
        }
    }

    public a(ms0 ms0Var, Context context) {
        super(context, null);
        this.V = ms0Var;
    }
}
