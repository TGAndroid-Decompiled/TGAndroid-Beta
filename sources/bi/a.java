package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.pv0;
public final class a extends g91 {
    public final int U = 0;
    public Object V;
    public final FrameLayout W;

    public a(ks0 ks0Var, Context context, js0 js0Var) {
        super(context, null);
        this.W = ks0Var;
        this.V = js0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ks0) this.W).f40668n.f26396b0.get(i10, -1);
                ((js0) this.V).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((ds0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
                    return;
                }
                return;
            default:
                ((js0) this.V).d.J0(((ks0) this.W).f40668n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.U) {
            case 0:
                ds0 ds0Var = (ds0) this.W;
                String currentLang = ds0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    ds0Var.G.L0();
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
                int i11 = ((ks0) this.W).f40668n.f26396b0.get(i10, -1);
                pv0 pv0Var = ((js0) this.V).d;
                if (i11 <= 0) {
                    pv0.t(pv0Var, 8, z10);
                    return;
                } else {
                    pv0.t(pv0Var, pv0Var.i1(i11).f29455a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(ds0 ds0Var, Context context) {
        super(context, null);
        this.W = ds0Var;
    }
}
