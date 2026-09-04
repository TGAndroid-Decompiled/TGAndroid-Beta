package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.cr;
public final class v2 extends AnimatorListenerAdapter {
    public final int f10028a;
    public final int f10029b;
    public final Object f10030c;

    public v2(Object obj, int i10, int i11) {
        this.f10028a = i11;
        this.f10030c = obj;
        this.f10029b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f10028a) {
            case 0:
                k3 k3Var = (k3) this.f10030c;
                k3Var.P.setColor(this.f10029b);
                k3Var.A();
                k3Var.f9765e.invalidate();
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
                r4 r4Var = (r4) this.f10030c;
                k4 k4Var = r4Var.f9930n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(this.f10029b);
                }
                if (animator == r4Var.f9931r) {
                    r4Var.f9931r = null;
                    return;
                }
                return;
            case 2:
                ji.w4 w4Var = (ji.w4) this.f10030c;
                w4Var.W = this.f10029b;
                w4Var.f14293a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f10030c;
                if (!d4Var.c()) {
                    d4Var.b(this.f10029b);
                }
                d4Var.f21734d0 = null;
                return;
            case 4:
                ((p6) this.f10030c).r(this.f10029b);
                return;
            case 5:
                ((e8) this.f10030c).f25590a[this.f10029b].setVisibility(8);
                return;
            case 6:
                ((pp) this.f10030c).f29452a[this.f10029b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.f29467g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                cy cyVar = (cy) this.f10030c;
                sg.r0 r0Var = cyVar.h;
                int i12 = 8;
                int i13 = this.f10029b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r0Var.setVisibility(i10);
                TextView textView = cyVar.f25120e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = cyVar.f25121f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f10030c;
                ih0Var.H = null;
                ih0Var.P.f29057d1.delete(this.f10029b);
                return;
            case 9:
                cr crVar = (cr) this.f10030c;
                ((qk0) crVar.d).f29754b.remove(this.f10029b);
                qk0 qk0Var = (qk0) crVar.d;
                qk0Var.d = true;
                qk0Var.f29753a.invalidate();
                return;
            case 10:
                ss0 ss0Var = (ss0) this.f10030c;
                ss0Var.f30411e.O1.remove(this.f10029b);
                ss0Var.f30408a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f10030c;
                b1Var.f31423x = -1;
                b1Var.v = this.f10029b;
                b1Var.f31421s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10028a) {
            case 7:
                cy cyVar = (cy) this.f10030c;
                cyVar.h.setVisibility(0);
                cyVar.f25120e.setVisibility(0);
                cyVar.f25121f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
