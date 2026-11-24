package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class e55 extends l95 {
    public final h75 R0;

    public e55(h75 h75Var, LaunchActivity launchActivity, r65 r65Var, a55 a55Var, ArrayList arrayList, fc2 fc2Var, h75 h75Var2) {
        super(launchActivity, r65Var, a55Var, arrayList, fc2Var, h75Var2);
        this.R0 = h75Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.R0.O4) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void g(boolean z) {
        h75 h75Var = this.R0;
        c65 c65Var = h75Var.H1;
        r65 r65Var = h75Var.J1;
        n75 n75Var = h75Var.h4;
        e55 e55Var = h75Var.T3;
        a55 a55Var = h75Var.e4;
        h75Var.l2 = z;
        int i = 0;
        if (h75.v5) {
            if (!z && e55Var.b) {
                h75Var.g4.H(h75Var.f4, false, true);
                return;
            }
            return;
        }
        if (z) {
            h75Var.c2[0].d(1, false);
            e55Var.L0[0].d(2, false);
            if (!e55Var.b) {
                r65Var.setVisibility(0);
                c65Var.setVisibility(0);
            }
            h75Var.L1(true, false);
            h75Var.o1.requestLayout();
            if (a55Var.getVisibility() != 0) {
                a55Var.setVisibility(0);
                n75Var.F(a55Var, true);
                n75Var.G(a55Var, false);
            } else {
                n75Var.F(a55Var, true);
                h75Var.D0(true);
            }
        } else {
            if (!e55Var.b) {
                a55Var.setVisibility(8);
                n75Var.F(a55Var, false);
            } else {
                c65Var.setVisibility(8);
                r65Var.setVisibility(8);
            }
            if (a55Var.getVisibility() == 0) {
                for (int i2 = 0; i2 < a55Var.getChildCount(); i2++) {
                    View childAt = a55Var.getChildAt(i2);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((m75) childAt).setProgressToFullscreen(e55Var.c);
                }
            }
        }
        View view = h75Var.A4;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (!h75Var.l2) {
            h75Var.D0(true);
        }
    }

    @Override
    public final void j() {
        float f;
        invalidate();
        h75 h75Var = this.R0;
        float f2 = h75Var.N3;
        e55 e55Var = h75Var.T3;
        if (e55Var == null) {
            f = 0.0f;
        } else {
            f = e55Var.c;
        }
        h75Var.H0 = gl.R0(Math.max(f2, f), 1.0f, bkb.w0(null, bkb.Zg, false), bkb.w0(null, bkb.Wg, false));
        h75Var.b.invalidate();
        h75Var.u1(h75Var.N3);
    }
}
