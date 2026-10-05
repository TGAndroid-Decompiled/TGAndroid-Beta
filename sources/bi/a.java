package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.qv0;
public final class a extends h91 {
    public final int V = 0;
    public Object W;
    public final FrameLayout f3841a0;

    public a(ls0 ls0Var, Context context, ks0 ks0Var) {
        super(context, null);
        this.f3841a0 = ls0Var;
        this.W = ks0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.f3841a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ls0) this.f3841a0).f40686n.f26770b0.get(i10, -1);
                ((ks0) this.W).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return !((es0) this.f3841a0).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.f3841a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ks0) this.W).d.J0(((ls0) this.f3841a0).f40686n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.V) {
            case 0:
                es0 es0Var = (es0) this.f3841a0;
                String currentLang = es0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    es0Var.G.L0();
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
                int i11 = ((ls0) this.f3841a0).f40686n.f26770b0.get(i10, -1);
                qv0 qv0Var = ((ks0) this.W).d;
                if (i11 <= 0) {
                    qv0.t(qv0Var, 8, z10);
                    return;
                } else {
                    qv0.t(qv0Var, qv0Var.i1(i11).f29850a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(es0 es0Var, Context context) {
        super(context, null);
        this.f3841a0 = es0Var;
    }
}
