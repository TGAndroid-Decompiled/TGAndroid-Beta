package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zs0;
public final class a extends v91 {
    public final int V = 1;
    public Object W;
    public final FrameLayout f9975a0;

    public a(at0 at0Var, Context context, zs0 zs0Var) {
        super(context, null);
        this.f9975a0 = at0Var;
        this.W = zs0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.f9975a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
                    return;
                }
                return;
            default:
                ((at0) this.f9975a0).f41609b.f33299b0.get(i10, -1);
                ((zs0) this.W).d.Q0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((vs0) this.f9975a0).G.E1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.f9975a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
                    return;
                }
                return;
            default:
                ((zs0) this.W).d.Q0(((at0) this.f9975a0).f41609b.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.V) {
            case 0:
                vs0 vs0Var = (vs0) this.f9975a0;
                String currentLang = vs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vs0Var.G.S0();
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
                int i11 = ((at0) this.f9975a0).f41609b.f33299b0.get(i10, -1);
                bw0 bw0Var = ((zs0) this.W).d;
                if (i11 <= 0) {
                    bw0.u(bw0Var, 8, z10);
                    return;
                } else {
                    bw0.u(bw0Var, bw0Var.r1(i11).f26682a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(vs0 vs0Var, Context context) {
        super(context, null);
        this.f9975a0 = vs0Var;
    }
}
