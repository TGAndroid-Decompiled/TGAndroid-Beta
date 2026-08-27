package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.pq;

public final class n2 extends AnimatorListenerAdapter {

    public final int f18836a;

    public final int f18837b;

    public final Object f18838c;

    public n2(Object obj, int i10, int i11) {
        this.f18836a = i11;
        this.f18838c = obj;
        this.f18837b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18836a) {
            case 0:
                b3 b3Var = (b3) this.f18838c;
                b3Var.L.setColor(this.f18837b);
                b3Var.A();
                b3Var.f18575e.invalidate();
                org.telegram.ui.h3 h3Var = b3Var.Q0;
                if (h3Var != null) {
                    h3Var.b(AndroidUtilities.computePerceivedBrightness(b3Var.L.getColor()) <= 0.721f, false);
                    b3Var.Q0.setBackgroundColor(b3Var.L.getColor());
                }
                b3Var.F();
                break;
            case 1:
                e4 e4Var = (e4) this.f18838c;
                x3 x3Var = e4Var.f18669n;
                if (x3Var.getWebView() != null) {
                    x3Var.getWebView().setScrollY(this.f18837b);
                }
                if (animator == e4Var.f18670r) {
                    e4Var.f18670r = null;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) this.f18838c;
                if (!b4Var.c()) {
                    b4Var.b(this.f18837b);
                }
                b4Var.W = null;
                break;
            case 3:
                ((i6) this.f18838c).r(this.f18837b);
                break;
            case 4:
                ((v7) this.f18838c).f33282a[this.f18837b].setVisibility(8);
                break;
            case 5:
                ((ep) this.f18838c).f28110a[this.f18837b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.f28123g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 6:
                ox oxVar = (ox) this.f18838c;
                ag.s1 s1Var = oxVar.h;
                int i10 = this.f18837b;
                s1Var.setVisibility(i10 == 1 ? 0 : 8);
                oxVar.f31426e.setVisibility(i10 == 2 ? 0 : 8);
                oxVar.f31427f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 7:
                wg0 wg0Var = (wg0) this.f18838c;
                wg0Var.D = null;
                wg0Var.L.Z0.delete(this.f18837b);
                break;
            case 8:
                pq pqVar = (pq) this.f18838c;
                ((gk0) pqVar.d).f28738b.remove(this.f18837b);
                gk0 gk0Var = (gk0) pqVar.d;
                gk0Var.d = true;
                gk0Var.f28737a.invalidate();
                break;
            case 9:
                as0 as0Var = (as0) this.f18838c;
                as0Var.f26817e.K1.remove(this.f18837b);
                as0Var.f26814a.invalidate();
                break;
            case 10:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f18838c;
                a1Var.f33484x = -1;
                a1Var.v = this.f18837b;
                a1Var.f33482s = 0.0f;
                a1Var.Q = null;
                a1Var.e();
                break;
            default:
                rh.m4 m4Var = (rh.m4) this.f18838c;
                m4Var.S = this.f18837b;
                m4Var.T = 0.0f;
                m4Var.requestLayout();
                m4Var.invalidate();
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18836a) {
            case 6:
                ox oxVar = (ox) this.f18838c;
                oxVar.h.setVisibility(0);
                oxVar.f31426e.setVisibility(0);
                oxVar.f31427f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
