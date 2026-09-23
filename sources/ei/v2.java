package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.xq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8660a;
    public final int f8661b;
    public final Object f8662c;

    public v2(Object obj, int i10, int i11) {
        this.f8660a = i11;
        this.f8662c = obj;
        this.f8661b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8660a) {
            case 0:
                k3 k3Var = (k3) this.f8662c;
                k3Var.P.setColor(this.f8661b);
                k3Var.A();
                k3Var.e.invalidate();
                org.telegram.ui.d3 d3Var = k3Var.U0;
                if (d3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.F();
                return;
            case 1:
                q4 q4Var = (q4) this.f8662c;
                j4 j4Var = q4Var.f8553n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8661b);
                }
                if (animator == q4Var.f8554r) {
                    q4Var.f8554r = null;
                    return;
                }
                return;
            case 2:
                ii.v4 v4Var = (ii.v4) this.f8662c;
                v4Var.W = this.f8661b;
                v4Var.f11670a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f8662c;
                if (!e4Var.c()) {
                    e4Var.b(this.f8661b);
                }
                e4Var.f19949d0 = null;
                return;
            case 4:
                ((o6) this.f8662c).r(this.f8661b);
                return;
            case 5:
                ((d8) this.f8662c).f23310a[this.f8661b].setVisibility(8);
                return;
            case 6:
                ((rp) this.f8662c).f27692a[this.f8661b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(rr.f27702g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                cy cyVar = (cy) this.f8662c;
                rg.p0 p0Var = cyVar.h;
                int i12 = 8;
                int i13 = this.f8661b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = cyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = cyVar.f23130f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                jh0 jh0Var = (jh0) this.f8662c;
                jh0Var.H = null;
                jh0Var.P.f27034d1.delete(this.f8661b);
                return;
            case 9:
                xq xqVar = (xq) this.f8662c;
                ((rk0) xqVar.d).f27658b.remove(this.f8661b);
                rk0 rk0Var = (rk0) xqVar.d;
                rk0Var.d = true;
                rk0Var.f27657a.invalidate();
                return;
            case 10:
                ts0 ts0Var = (ts0) this.f8662c;
                ts0Var.e.O1.remove(this.f8661b);
                ts0Var.f28299a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8662c;
                d1Var.f28884x = -1;
                d1Var.v = this.f8661b;
                d1Var.f28882s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8660a) {
            case 7:
                cy cyVar = (cy) this.f8662c;
                cyVar.h.setVisibility(0);
                cyVar.e.setVisibility(0);
                cyVar.f23130f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
