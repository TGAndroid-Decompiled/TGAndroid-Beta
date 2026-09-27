package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.xq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8662a;
    public final int f8663b;
    public final Object f8664c;

    public v2(Object obj, int i10, int i11) {
        this.f8662a = i11;
        this.f8664c = obj;
        this.f8663b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8662a) {
            case 0:
                k3 k3Var = (k3) this.f8664c;
                k3Var.P.setColor(this.f8663b);
                k3Var.A();
                k3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = k3Var.U0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.F();
                return;
            case 1:
                q4 q4Var = (q4) this.f8664c;
                j4 j4Var = q4Var.f8555n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8663b);
                }
                if (animator == q4Var.f8556r) {
                    q4Var.f8556r = null;
                    return;
                }
                return;
            case 2:
                ii.v4 v4Var = (ii.v4) this.f8664c;
                v4Var.W = this.f8663b;
                v4Var.f11673a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f8664c;
                if (!e4Var.c()) {
                    e4Var.b(this.f8663b);
                }
                e4Var.f20233d0 = null;
                return;
            case 4:
                ((o6) this.f8664c).r(this.f8663b);
                return;
            case 5:
                ((d8) this.f8664c).f23586a[this.f8663b].setVisibility(8);
                return;
            case 6:
                ((sp) this.f8664c).f28348a[this.f8663b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(sr.f28360g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                dy dyVar = (dy) this.f8664c;
                rg.p0 p0Var = dyVar.h;
                int i12 = 8;
                int i13 = this.f8663b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = dyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = dyVar.f23761f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                vh0 vh0Var = (vh0) this.f8664c;
                vh0Var.H = null;
                vh0Var.P.f23033d1.delete(this.f8663b);
                return;
            case 9:
                xq xqVar = (xq) this.f8664c;
                ((dl0) xqVar.d).f23687b.remove(this.f8663b);
                dl0 dl0Var = (dl0) xqVar.d;
                dl0Var.d = true;
                dl0Var.f23686a.invalidate();
                return;
            case 10:
                gt0 gt0Var = (gt0) this.f8664c;
                gt0Var.e.O1.remove(this.f8663b);
                gt0Var.f24655a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8664c;
                d1Var.f29252x = -1;
                d1Var.v = this.f8663b;
                d1Var.f29250s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8662a) {
            case 7:
                dy dyVar = (dy) this.f8664c;
                dyVar.h.setVisibility(0);
                dyVar.e.setVisibility(0);
                dyVar.f23761f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
