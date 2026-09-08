package ci;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xu0;
public final class a extends i81 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(sr0 sr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.V = sr0Var;
        this.U = rr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((lr0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((rr0) this.U).d.J0(((sr0) this.V).f35653n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
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
                int i11 = ((sr0) this.V).f35653n.f26662b0.get(i10, -1);
                xu0 xu0Var = ((rr0) this.U).d;
                if (i11 <= 0) {
                    xu0.t(xu0Var, 8, z10);
                    return;
                } else {
                    xu0.t(xu0Var, xu0Var.i1(i11).f32369a, z10);
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
                lr0 lr0Var = (lr0) this.V;
                String currentLang = lr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    lr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((sr0) this.V).f35653n.f26662b0.get(i10, -1);
                ((rr0) this.U).d.J0(1.0f);
                return;
        }
    }

    public a(lr0 lr0Var, Context context) {
        super(context, null);
        this.V = lr0Var;
    }
}
