package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.wq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8671a;
    public final int f8672b;
    public final Object f8673c;

    public v2(Object obj, int i10, int i11) {
        this.f8671a = i11;
        this.f8673c = obj;
        this.f8672b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8671a) {
            case 0:
                k3 k3Var = (k3) this.f8673c;
                k3Var.P.setColor(this.f8672b);
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
                q4 q4Var = (q4) this.f8673c;
                j4 j4Var = q4Var.f8564n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8672b);
                }
                if (animator == q4Var.f8565r) {
                    q4Var.f8565r = null;
                    return;
                }
                return;
            case 2:
                ii.v4 v4Var = (ii.v4) this.f8673c;
                v4Var.W = this.f8672b;
                v4Var.f11684a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f8673c;
                if (!e4Var.c()) {
                    e4Var.b(this.f8672b);
                }
                e4Var.f20248d0 = null;
                return;
            case 4:
                ((o6) this.f8673c).r(this.f8672b);
                return;
            case 5:
                ((d8) this.f8673c).f23566a[this.f8672b].setVisibility(8);
                return;
            case 6:
                ((tp) this.f8673c).f28619a[this.f8672b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(tr.f28637g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                fy fyVar = (fy) this.f8673c;
                rg.p0 p0Var = fyVar.h;
                int i12 = 8;
                int i13 = this.f8672b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = fyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = fyVar.f24381f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                wh0 wh0Var = (wh0) this.f8673c;
                wh0Var.H = null;
                wh0Var.P.f23325d1.delete(this.f8672b);
                return;
            case 9:
                wq wqVar = (wq) this.f8673c;
                ((el0) wqVar.d).f24005b.remove(this.f8672b);
                el0 el0Var = (el0) wqVar.d;
                el0Var.d = true;
                el0Var.f24004a.invalidate();
                return;
            case 10:
                ht0 ht0Var = (ht0) this.f8673c;
                ht0Var.e.O1.remove(this.f8672b);
                ht0Var.f24940a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8673c;
                d1Var.f29227x = -1;
                d1Var.v = this.f8672b;
                d1Var.f29225s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8671a) {
            case 7:
                fy fyVar = (fy) this.f8673c;
                fyVar.h.setVisibility(0);
                fyVar.e.setVisibility(0);
                fyVar.f24381f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
