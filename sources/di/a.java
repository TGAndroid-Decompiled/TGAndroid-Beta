package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sv0;
public final class a extends c91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(ns0 ns0Var, Context context, ms0 ms0Var) {
        super(context, null);
        this.V = ns0Var;
        this.U = ms0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((hs0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
                    return;
                }
                return;
            default:
                ((ms0) this.U).d.L0(((ns0) this.V).f37078n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
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
                int i11 = ((ns0) this.V).f37078n.f24855b0.get(i10, -1);
                sv0 sv0Var = ((ms0) this.U).d;
                if (i11 <= 0) {
                    sv0.u(sv0Var, 8, z10);
                    return;
                } else {
                    sv0.u(sv0Var, sv0Var.k1(i11).f30065a, z10);
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
                hs0 hs0Var = (hs0) this.V;
                String currentLang = hs0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    hs0Var.G.N0();
                    return;
                }
                return;
            default:
                ((ns0) this.V).f37078n.f24855b0.get(i10, -1);
                ((ms0) this.U).d.L0(1.0f);
                return;
        }
    }

    public a(hs0 hs0Var, Context context) {
        super(context, null);
        this.V = hs0Var;
    }
}
