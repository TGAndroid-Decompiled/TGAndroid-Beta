package dg;

import android.widget.FrameLayout;
import nh.a8;
import org.telegram.messenger.AndroidUtilities;
import ph.c5;
import ph.z4;
public final class y implements o1.g {
    public final int f4861a;
    public final FrameLayout f4862b;

    public y(int i10, FrameLayout frameLayout) {
        this.f4861a = i10;
        this.f4862b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f4861a) {
            case 0:
                e1 e1Var = (e1) this.f4862b;
                float f12 = f10 / 1000.0f;
                e1Var.A1 = f12;
                q2 q2Var = e1Var.f4491s1;
                q2Var.setAlpha(f12);
                q2Var.invalidate();
                e1Var.f4464a1.invalidate();
                e1Var.f4490r1.getTypefaceCell().setAlpha(1.0f - e1Var.A1);
                return;
            case 1:
                a8 a8Var = (a8) this.f4862b;
                a8Var.f15056a0 = f10;
                a8Var.f15058c0 = f11;
                return;
            case 2:
                c5 c5Var = (c5) this.f4862b;
                float f13 = f10 / 1000.0f;
                c5Var.f41396q1 = f13;
                q2 q2Var2 = c5Var.f41383j1;
                q2Var2.setAlpha(f13);
                q2Var2.invalidate();
                c5Var.R0.invalidate();
                c5Var.f41381i1.getTypefaceCell().setAlpha(1.0f - c5Var.f41396q1);
                return;
            default:
                zf.h hVar2 = (zf.h) this.f4862b;
                float f14 = f10 / 1000.0f;
                z4 z4Var = hVar2.f47494a;
                z4Var.setPivotX(AndroidUtilities.dp(28.0f));
                z4Var.setPivotY(AndroidUtilities.dp(28.0f));
                z4Var.setScaleX(f14);
                z4Var.setScaleY(f14);
                z4Var.setAlpha(k7.n.a(f14, 0.0f, 1.0f));
                hVar2.invalidate();
                return;
        }
    }
}
