package defpackage;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class c75 extends jb5 {
    public final g95 R0;

    public c75(g95 g95Var, LaunchActivity launchActivity, p85 p85Var, y65 y65Var, ArrayList arrayList, qd2 qd2Var, g95 g95Var2) {
        super(launchActivity, p85Var, y65Var, arrayList, qd2Var, g95Var2);
        this.R0 = g95Var;
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
        g95 g95Var = this.R0;
        a85 a85Var = g95Var.H1;
        p85 p85Var = g95Var.J1;
        m95 m95Var = g95Var.h4;
        c75 c75Var = g95Var.T3;
        y65 y65Var = g95Var.e4;
        g95Var.l2 = z;
        int i = 0;
        if (g95.v5) {
            if (!z && c75Var.b) {
                g95Var.g4.H(g95Var.f4, false, true);
                return;
            }
            return;
        }
        if (z) {
            g95Var.c2[0].d(1, false);
            c75Var.L0[0].d(2, false);
            if (!c75Var.b) {
                p85Var.setVisibility(0);
                a85Var.setVisibility(0);
            }
            g95Var.L1(true, false);
            g95Var.o1.requestLayout();
            if (y65Var.getVisibility() != 0) {
                y65Var.setVisibility(0);
                m95Var.F(y65Var, true);
                m95Var.G(y65Var, false);
            } else {
                m95Var.F(y65Var, true);
                g95Var.D0(true);
            }
        } else {
            if (!c75Var.b) {
                y65Var.setVisibility(8);
                m95Var.F(y65Var, false);
            } else {
                a85Var.setVisibility(8);
                p85Var.setVisibility(8);
            }
            if (y65Var.getVisibility() == 0) {
                for (int i2 = 0; i2 < y65Var.getChildCount(); i2++) {
                    View childAt = y65Var.getChildAt(i2);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((l95) childAt).setProgressToFullscreen(c75Var.c);
                }
            }
        }
        View view = g95Var.A4;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (!g95Var.l2) {
            g95Var.D0(true);
        }
    }

    @Override
    public final void j() {
        float f;
        invalidate();
        g95 g95Var = this.R0;
        float f2 = g95Var.N3;
        c75 c75Var = g95Var.T3;
        if (c75Var == null) {
            f = 0.0f;
        } else {
            f = c75Var.c;
        }
        g95Var.H0 = gm.R0(Math.max(f2, f), 1.0f, cmb.w0(null, cmb.Zg, false), cmb.w0(null, cmb.Wg, false));
        g95Var.b.invalidate();
        g95Var.u1(g95Var.N3);
    }
}
