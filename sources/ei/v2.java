package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.zq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f9427a;
    public final int f9428b;
    public final Object f9429c;

    public v2(Object obj, int i10, int i11) {
        this.f9427a = i11;
        this.f9429c = obj;
        this.f9428b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f9427a) {
            case 0:
                k3 k3Var = (k3) this.f9429c;
                k3Var.P.setColor(this.f9428b);
                k3Var.B();
                k3Var.f9158e.invalidate();
                org.telegram.ui.c3 c3Var = k3Var.U0;
                if (c3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.G();
                return;
            case 1:
                p4 p4Var = (p4) this.f9429c;
                b3 b3Var = p4Var.f9291n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.f9428b);
                }
                if (animator == p4Var.f9292r) {
                    p4Var.f9292r = null;
                    return;
                }
                return;
            case 2:
                ii.w4 w4Var = (ii.w4) this.f9429c;
                w4Var.W = this.f9428b;
                w4Var.f12771a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9429c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9428b);
                }
                e4Var.f22056d0 = null;
                return;
            case 4:
                ((q6) this.f9429c).u(this.f9428b);
                return;
            case 5:
                ((f8) this.f9429c).f26376a[this.f9428b].setVisibility(8);
                return;
            case 6:
                ((gq) this.f9429c).f26851a[this.f9428b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(is.f27501g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                sy syVar = (sy) this.f9429c;
                rg.p0 p0Var = syVar.h;
                int i12 = 8;
                int i13 = this.f9428b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = syVar.f30969e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = syVar.f30970f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                s60 s60Var = (s60) this.f9429c;
                if (this.f9428b == s60Var.f30771s0) {
                    s60Var.f30777x.setRotationY(0.0f);
                    s60Var.f30767q0 = true;
                    s60Var.f30751b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + s60.k(s60Var));
                    s60.l(s60Var);
                    return;
                }
                return;
            case 9:
                oi0 oi0Var = (oi0) this.f9429c;
                oi0Var.H = null;
                oi0Var.P.f31600d1.delete(this.f9428b);
                return;
            case 10:
                zq zqVar = (zq) this.f9429c;
                ((wl0) zqVar.d).f32730b.remove(this.f9428b);
                wl0 wl0Var = (wl0) zqVar.d;
                wl0Var.d = true;
                wl0Var.f32729a.invalidate();
                return;
            case 11:
                xt0 xt0Var = (xt0) this.f9429c;
                xt0Var.f33069e.O1.remove(this.f9428b);
                xt0Var.f33066a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.e1 e1Var = (org.telegram.ui.Components.voip.e1) this.f9429c;
                e1Var.f32031x = -1;
                e1Var.v = this.f9428b;
                e1Var.f32029s = 0.0f;
                e1Var.U = null;
                e1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9427a) {
            case 7:
                sy syVar = (sy) this.f9429c;
                syVar.h.setVisibility(0);
                syVar.f30969e.setVisibility(0);
                syVar.f30970f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
