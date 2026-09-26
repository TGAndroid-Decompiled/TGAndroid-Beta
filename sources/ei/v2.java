package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.wq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8659a;
    public final int f8660b;
    public final Object f8661c;

    public v2(Object obj, int i10, int i11) {
        this.f8659a = i11;
        this.f8661c = obj;
        this.f8660b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8659a) {
            case 0:
                k3 k3Var = (k3) this.f8661c;
                k3Var.P.setColor(this.f8660b);
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
                q4 q4Var = (q4) this.f8661c;
                j4 j4Var = q4Var.f8552n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8660b);
                }
                if (animator == q4Var.f8553r) {
                    q4Var.f8553r = null;
                    return;
                }
                return;
            case 2:
                ii.v4 v4Var = (ii.v4) this.f8661c;
                v4Var.W = this.f8660b;
                v4Var.f11670a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f8661c;
                if (!e4Var.c()) {
                    e4Var.b(this.f8660b);
                }
                e4Var.f20231d0 = null;
                return;
            case 4:
                ((o6) this.f8661c).r(this.f8660b);
                return;
            case 5:
                ((d8) this.f8661c).f23614a[this.f8660b].setVisibility(8);
                return;
            case 6:
                ((sp) this.f8661c).f28328a[this.f8660b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(sr.f28340g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                ey eyVar = (ey) this.f8661c;
                rg.p0 p0Var = eyVar.h;
                int i12 = 8;
                int i13 = this.f8660b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = eyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = eyVar.f24078f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                uh0 uh0Var = (uh0) this.f8661c;
                uh0Var.H = null;
                uh0Var.P.f22654d1.delete(this.f8660b);
                return;
            case 9:
                wq wqVar = (wq) this.f8661c;
                ((cl0) wqVar.d).f23350b.remove(this.f8660b);
                cl0 cl0Var = (cl0) wqVar.d;
                cl0Var.d = true;
                cl0Var.f23349a.invalidate();
                return;
            case 10:
                ft0 ft0Var = (ft0) this.f8661c;
                ft0Var.e.O1.remove(this.f8660b);
                ft0Var.f24313a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8661c;
                d1Var.f29226x = -1;
                d1Var.v = this.f8660b;
                d1Var.f29224s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8659a) {
            case 7:
                ey eyVar = (ey) this.f8661c;
                eyVar.h.setVisibility(0);
                eyVar.e.setVisibility(0);
                eyVar.f24078f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
