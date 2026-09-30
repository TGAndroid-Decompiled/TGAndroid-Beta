package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.y81;
public final class a extends y81 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(hs0 hs0Var, Context context, gs0 gs0Var) {
        super(context, null);
        this.V = hs0Var;
        this.U = gs0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((as0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                as0 as0Var = (as0) this.V;
                String currentLang = as0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    as0Var.G.L0();
                    return;
                }
                return;
            default:
                ((gs0) this.U).d.J0(((hs0) this.V).f37662n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                as0 as0Var = (as0) this.V;
                String currentLang = as0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    as0Var.G.L0();
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
                int i11 = ((hs0) this.V).f37662n.f30182b0.get(i10, -1);
                mv0 mv0Var = ((gs0) this.U).d;
                if (i11 <= 0) {
                    mv0.t(mv0Var, 8, z10);
                    return;
                } else {
                    mv0.t(mv0Var, mv0Var.i1(i11).f26126a, z10);
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
                as0 as0Var = (as0) this.V;
                String currentLang = as0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    as0Var.G.L0();
                    return;
                }
                return;
            default:
                ((hs0) this.V).f37662n.f30182b0.get(i10, -1);
                ((gs0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(as0 as0Var, Context context) {
        super(context, null);
        this.V = as0Var;
    }
}
