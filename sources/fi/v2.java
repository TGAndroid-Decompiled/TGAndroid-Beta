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
    public final int f10056a;
    public final int f10057b;
    public final Object f10058c;

    public v2(Object obj, int i10, int i11) {
        this.f10056a = i11;
        this.f10058c = obj;
        this.f10057b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f10056a) {
            case 0:
                k3 k3Var = (k3) this.f10058c;
                k3Var.P.setColor(this.f10057b);
                k3Var.A();
                k3Var.f9793e.invalidate();
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
                r4 r4Var = (r4) this.f10058c;
                k4 k4Var = r4Var.f9958n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(this.f10057b);
                }
                if (animator == r4Var.f9959r) {
                    r4Var.f9959r = null;
                    return;
                }
                return;
            case 2:
                ji.w4 w4Var = (ji.w4) this.f10058c;
                w4Var.W = this.f10057b;
                w4Var.f14319a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f10058c;
                if (!d4Var.c()) {
                    d4Var.b(this.f10057b);
                }
                d4Var.f21761d0 = null;
                return;
            case 4:
                ((p6) this.f10058c).r(this.f10057b);
                return;
            case 5:
                ((e8) this.f10058c).f25617a[this.f10057b].setVisibility(8);
                return;
            case 6:
                ((pp) this.f10058c).f29479a[this.f10057b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.f29494g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                cy cyVar = (cy) this.f10058c;
                sg.r0 r0Var = cyVar.h;
                int i12 = 8;
                int i13 = this.f10057b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r0Var.setVisibility(i10);
                TextView textView = cyVar.f25147e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = cyVar.f25148f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f10058c;
                ih0Var.H = null;
                ih0Var.P.f29084d1.delete(this.f10057b);
                return;
            case 9:
                cr crVar = (cr) this.f10058c;
                ((qk0) crVar.d).f29781b.remove(this.f10057b);
                qk0 qk0Var = (qk0) crVar.d;
                qk0Var.d = true;
                qk0Var.f29780a.invalidate();
                return;
            case 10:
                ss0 ss0Var = (ss0) this.f10058c;
                ss0Var.f30438e.O1.remove(this.f10057b);
                ss0Var.f30435a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f10058c;
                b1Var.f31450x = -1;
                b1Var.v = this.f10057b;
                b1Var.f31448s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10056a) {
            case 7:
                cy cyVar = (cy) this.f10058c;
                cyVar.h.setVisibility(0);
                cyVar.f25147e.setVisibility(0);
                cyVar.f25148f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
