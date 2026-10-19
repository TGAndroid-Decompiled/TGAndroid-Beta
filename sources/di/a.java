package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.tv0;
public final class a extends d91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(os0 os0Var, Context context, ns0 ns0Var) {
        super(context, null);
        this.V = os0Var;
        this.U = ns0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((is0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
                    return;
                }
                return;
            default:
                ((ns0) this.U).d.L0(((os0) this.V).f36512n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
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
                int i11 = ((os0) this.V).f36512n.f25128b0.get(i10, -1);
                tv0 tv0Var = ((ns0) this.U).d;
                if (i11 <= 0) {
                    tv0.u(tv0Var, 8, z10);
                    return;
                } else {
                    tv0.u(tv0Var, tv0Var.k1(i11).f30335a, z10);
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
                is0 is0Var = (is0) this.V;
                String currentLang = is0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    is0Var.G.N0();
                    return;
                }
                return;
            default:
                ((os0) this.V).f36512n.f25128b0.get(i10, -1);
                ((ns0) this.U).d.L0(1.0f);
                return;
        }
    }

    public a(is0 is0Var, Context context) {
        super(context, null);
        this.V = is0Var;
    }
}
