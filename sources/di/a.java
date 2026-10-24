package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.wv0;
public final class a extends l91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(rs0 rs0Var, Context context, qs0 qs0Var) {
        super(context, null);
        this.V = rs0Var;
        this.U = qs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((ls0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                ls0 ls0Var = (ls0) this.V;
                String currentLang = ls0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ls0Var.G.O0();
                    return;
                }
                return;
            default:
                ((qs0) this.U).d.M0(((rs0) this.V).f37714n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                ls0 ls0Var = (ls0) this.V;
                String currentLang = ls0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ls0Var.G.O0();
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
                int i11 = ((rs0) this.V).f37714n.f27966b0.get(i10, -1);
                wv0 wv0Var = ((qs0) this.U).d;
                if (i11 <= 0) {
                    wv0.u(wv0Var, 8, z10);
                    return;
                } else {
                    wv0.u(wv0Var, wv0Var.l1(i11).f32053a, z10);
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
                ls0 ls0Var = (ls0) this.V;
                String currentLang = ls0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    ls0Var.G.O0();
                    return;
                }
                return;
            default:
                ((rs0) this.V).f37714n.f27966b0.get(i10, -1);
                ((qs0) this.U).d.M0(1.0f);
                return;
        }
    }

    public a(ls0 ls0Var, Context context) {
        super(context, null);
        this.V = ls0Var;
    }
}
