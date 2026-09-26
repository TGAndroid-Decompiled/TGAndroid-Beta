package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yr0;
public final class a extends x81 {
    public final int T = 1;
    public Object U;
    public final FrameLayout V;

    public a(fs0 fs0Var, Context context, es0 es0Var) {
        super(context, null);
        this.V = fs0Var;
        this.U = es0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((yr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                yr0 yr0Var = (yr0) this.V;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    yr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((es0) this.U).d.J0(((fs0) this.V).f37565n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                yr0 yr0Var = (yr0) this.V;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    yr0Var.G.L0();
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
                int i11 = ((fs0) this.V).f37565n.f29934b0.get(i10, -1);
                kv0 kv0Var = ((es0) this.U).d;
                if (i11 <= 0) {
                    kv0.t(kv0Var, 8, z10);
                    return;
                } else {
                    kv0.t(kv0Var, kv0Var.i1(i11).f25528a, z10);
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
                yr0 yr0Var = (yr0) this.V;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    yr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((fs0) this.V).f37565n.f29934b0.get(i10, -1);
                ((es0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(yr0 yr0Var, Context context) {
        super(context, null);
        this.V = yr0Var;
    }
}
