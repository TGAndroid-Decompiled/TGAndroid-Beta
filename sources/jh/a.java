package jh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.zq0;
public final class a extends n71 {
    public final int P = 0;
    public Object Q;
    public final FrameLayout R;

    public a(zq0 zq0Var, Context context, yq0 yq0Var) {
        super(context, null);
        this.R = zq0Var;
        this.Q = yq0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.P) {
            case 0:
                return !((uq0) this.R).C.f28178y1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    return;
                }
                return;
            default:
                ((yq0) this.Q).d.J0(((zq0) this.R).f44301n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i9) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i9, boolean z10) {
        switch (this.P) {
            case 1:
                int i10 = ((zq0) this.R).f44301n.U.get(i9, -1);
                eu0 eu0Var = ((yq0) this.Q).d;
                if (i10 <= 0) {
                    eu0.t(eu0Var, 8, z10);
                    return;
                } else {
                    eu0.t(eu0Var, eu0Var.i1(i10).f27810a, z10);
                    return;
                }
            default:
                super.y(i9, z10);
                return;
        }
    }

    @Override
    public final void z(int i9) {
        switch (this.P) {
            case 0:
                uq0 uq0Var = (uq0) this.R;
                String currentLang = uq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    uq0Var.C.L0();
                    return;
                }
                return;
            default:
                ((zq0) this.R).f44301n.U.get(i9, -1);
                ((yq0) this.Q).d.J0(1.0f);
                return;
        }
    }

    public a(uq0 uq0Var, Context context) {
        super(context, null);
        this.R = uq0Var;
    }
}
