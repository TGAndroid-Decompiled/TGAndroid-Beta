package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zq0;

public final class a extends p71 {
    public final int P = 1;
    public Object Q;
    public final FrameLayout R;

    public a(ar0 ar0Var, Context context, zq0 zq0Var) {
        super(context, null);
        this.R = ar0Var;
        this.Q = zq0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.P) {
            case 0:
                return !((vq0) this.R).C.f29163y1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                vq0 vq0Var = (vq0) this.R;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    vq0Var.C.L0();
                }
                break;
            default:
                zq0 zq0Var = (zq0) this.Q;
                zq0Var.d.J0(((ar0) this.R).f44655n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.P) {
            case 0:
                vq0 vq0Var = (vq0) this.R;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    vq0Var.C.L0();
                }
                break;
        }
    }

    @Override
    public void y(int i10, boolean z10) {
        switch (this.P) {
            case 1:
                zq0 zq0Var = (zq0) this.Q;
                int i11 = ((ar0) this.R).f44655n.U.get(i10, -1);
                hu0 hu0Var = zq0Var.d;
                if (i11 > 0) {
                    hu0.t(hu0Var, hu0Var.i1(i11).f28825a, z10);
                } else {
                    hu0.t(hu0Var, 8, z10);
                }
                break;
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.P) {
            case 0:
                vq0 vq0Var = (vq0) this.R;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    vq0Var.C.L0();
                }
                break;
            default:
                zq0 zq0Var = (zq0) this.Q;
                ((ar0) this.R).f44655n.U.get(i10, -1);
                zq0Var.d.J0(1.0f);
                break;
        }
    }

    public a(vq0 vq0Var, Context context) {
        super(context, null);
        this.R = vq0Var;
    }
}
