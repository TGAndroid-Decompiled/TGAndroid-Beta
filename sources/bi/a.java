package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yr0;
public final class a extends x81 {
    public final int U = 1;
    public Object V;
    public final FrameLayout W;

    public a(fs0 fs0Var, Context context, ds0 ds0Var) {
        super(context, null);
        this.W = fs0Var;
        this.V = ds0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((fs0) this.W).f31923n.f29963b0.get(i10, -1);
                ((ds0) this.V).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((yr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ds0) this.V).d.J0(((fs0) this.W).f31923n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.U) {
            case 0:
                yr0 yr0Var = (yr0) this.W;
                String currentLang = yr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    yr0Var.G.L0();
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
                int i11 = ((fs0) this.W).f31923n.f29963b0.get(i10, -1);
                kv0 kv0Var = ((ds0) this.V).d;
                if (i11 <= 0) {
                    kv0.t(kv0Var, 8, z10);
                    return;
                } else {
                    kv0.t(kv0Var, kv0Var.i1(i11).f25463a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(yr0 yr0Var, Context context) {
        super(context, null);
        this.W = yr0Var;
    }
}
