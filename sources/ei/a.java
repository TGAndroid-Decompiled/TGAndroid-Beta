package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zs0;
public final class a extends u91 {
    public final int V = 0;
    public Object W;
    public final FrameLayout f9976a0;

    public a(zs0 zs0Var, Context context, ys0 ys0Var) {
        super(context, null);
        this.f9976a0 = zs0Var;
        this.W = ys0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.f9976a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    return;
                }
                return;
            default:
                ((zs0) this.f9976a0).f41109b.f32922b0.get(i10, -1);
                ((ys0) this.W).d.Q0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((us0) this.f9976a0).G.E1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.f9976a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    return;
                }
                return;
            default:
                ((ys0) this.W).d.Q0(((zs0) this.f9976a0).f41109b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.V) {
            case 0:
                us0 us0Var = (us0) this.f9976a0;
                String currentLang = us0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    us0Var.G.S0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 1:
                int i11 = ((zs0) this.f9976a0).f41109b.f32922b0.get(i10, -1);
                aw0 aw0Var = ((ys0) this.W).d;
                if (i11 <= 0) {
                    aw0.u(aw0Var, 8, z10);
                    return;
                } else {
                    aw0.u(aw0Var, aw0Var.r1(i11).f35409a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(us0 us0Var, Context context) {
        super(context, null);
        this.f9976a0 = us0Var;
    }
}
