package oh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.yu0;
public final class a extends l81 {
    public final int Q = 0;
    public Object R;
    public final FrameLayout S;

    public a(sr0 sr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.S = sr0Var;
        this.R = rr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return !((nr0) this.S).D.f31161z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
            default:
                ((rr0) this.R).d.J0(((sr0) this.S).f35201n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i10, boolean z4) {
        switch (this.Q) {
            case 1:
                int i11 = ((sr0) this.S).f35201n.V.get(i10, -1);
                yu0 yu0Var = ((rr0) this.R).d;
                if (i11 <= 0) {
                    yu0.t(yu0Var, 8, z4);
                    return;
                } else {
                    yu0.t(yu0Var, yu0Var.i1(i11).f30728a, z4);
                    return;
                }
            default:
                super.y(i10, z4);
                return;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    return;
                }
                return;
            default:
                ((sr0) this.S).f35201n.V.get(i10, -1);
                ((rr0) this.R).d.J0(1.0f);
                return;
        }
    }

    public a(nr0 nr0Var, Context context) {
        super(context, null);
        this.S = nr0Var;
    }
}
