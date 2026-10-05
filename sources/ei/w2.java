package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.yq;
public final class w2 extends AnimatorListenerAdapter {
    public final int f9425a;
    public final int f9426b;
    public final Object f9427c;

    public w2(Object obj, int i10, int i11) {
        this.f9425a = i11;
        this.f9427c = obj;
        this.f9426b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f9425a) {
            case 0:
                l3 l3Var = (l3) this.f9427c;
                l3Var.P.setColor(this.f9426b);
                l3Var.A();
                l3Var.f9157e.invalidate();
                org.telegram.ui.d3 d3Var = l3Var.U0;
                if (d3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(l3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d3Var.b(z10, false);
                    l3Var.U0.setBackgroundColor(l3Var.P.getColor());
                }
                l3Var.F();
                return;
            case 1:
                r4 r4Var = (r4) this.f9427c;
                k4 k4Var = r4Var.f9307n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(this.f9426b);
                }
                if (animator == r4Var.f9308r) {
                    r4Var.f9308r = null;
                    return;
                }
                return;
            case 2:
                ii.w4 w4Var = (ii.w4) this.f9427c;
                w4Var.W = this.f9426b;
                w4Var.f12725a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9427c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9426b);
                }
                e4Var.f22030d0 = null;
                return;
            case 4:
                ((o6) this.f9427c).r(this.f9426b);
                return;
            case 5:
                ((d8) this.f9427c).f25699a[this.f9426b].setVisibility(8);
                return;
            case 6:
                ((tp) this.f9427c).f31201a[this.f9426b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(tr.f31216g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                fy fyVar = (fy) this.f9427c;
                rg.q0 q0Var = fyVar.h;
                int i12 = 8;
                int i13 = this.f9426b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q0Var.setVisibility(i10);
                TextView textView = fyVar.f26628e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = fyVar.f26629f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                vh0 vh0Var = (vh0) this.f9427c;
                vh0Var.H = null;
                vh0Var.P.f24983d1.delete(this.f9426b);
                return;
            case 9:
                yq yqVar = (yq) this.f9427c;
                ((dl0) yqVar.d).f25818b.remove(this.f9426b);
                dl0 dl0Var = (dl0) yqVar.d;
                dl0Var.d = true;
                dl0Var.f25817a.invalidate();
                return;
            case 10:
                lt0 lt0Var = (lt0) this.f9427c;
                lt0Var.f28539e.O1.remove(this.f9426b);
                lt0Var.f28536a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f9427c;
                d1Var.f31885x = -1;
                d1Var.v = this.f9426b;
                d1Var.f31883s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9425a) {
            case 7:
                fy fyVar = (fy) this.f9427c;
                fyVar.h.setVisibility(0);
                fyVar.f26628e.setVisibility(0);
                fyVar.f26629f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
