package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.fr;
public final class v2 extends AnimatorListenerAdapter {
    public final int f9607a;
    public final int f9608b;
    public final Object f9609c;

    public v2(Object obj, int i10, int i11) {
        this.f9607a = i11;
        this.f9609c = obj;
        this.f9608b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f9607a) {
            case 0:
                k3 k3Var = (k3) this.f9609c;
                k3Var.P.setColor(this.f9608b);
                k3Var.B();
                k3Var.e.invalidate();
                org.telegram.ui.f3 f3Var = k3Var.U0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(k3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3Var.b(z10, false);
                    k3Var.U0.setBackgroundColor(k3Var.P.getColor());
                }
                k3Var.G();
                return;
            case 1:
                q4 q4Var = (q4) this.f9609c;
                b3 b3Var = q4Var.f9495n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.f9608b);
                }
                if (animator == q4Var.f9496r) {
                    q4Var.f9496r = null;
                    return;
                }
                return;
            case 2:
                ji.y4 y4Var = (ji.y4) this.f9609c;
                y4Var.W = this.f9608b;
                y4Var.f13671a0 = 0.0f;
                y4Var.requestLayout();
                y4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9609c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9608b);
                }
                e4Var.f21103d0 = null;
                return;
            case 4:
                ((r6) this.f9609c).u(this.f9608b);
                return;
            case 5:
                ((g8) this.f9609c).f25208a[this.f9608b].setVisibility(8);
                return;
            case 6:
                ((dq) this.f9609c).f24469a[this.f9608b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(es.f24772g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                ny nyVar = (ny) this.f9609c;
                sg.q0 q0Var = nyVar.h;
                int i12 = 8;
                int i13 = this.f9608b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q0Var.setVisibility(i10);
                TextView textView = nyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = nyVar.f27741f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                o60 o60Var = (o60) this.f9609c;
                if (this.f9608b == o60Var.f27881s0) {
                    o60Var.f27887x.setRotationY(0.0f);
                    o60Var.f27877q0 = true;
                    o60Var.f27861b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + o60.k(o60Var));
                    o60.l(o60Var);
                    return;
                }
                return;
            case 9:
                ji0 ji0Var = (ji0) this.f9609c;
                ji0Var.H = null;
                ji0Var.P.f28322d1.delete(this.f9608b);
                return;
            case 10:
                fr frVar = (fr) this.f9609c;
                ((rl0) frVar.d).f28866b.remove(this.f9608b);
                rl0 rl0Var = (rl0) frVar.d;
                rl0Var.d = true;
                rl0Var.f28865a.invalidate();
                return;
            case 11:
                st0 st0Var = (st0) this.f9609c;
                st0Var.e.O1.remove(this.f9608b);
                st0Var.f29210a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f9609c;
                b1Var.f30113x = -1;
                b1Var.v = this.f9608b;
                b1Var.f30111s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9607a) {
            case 7:
                ny nyVar = (ny) this.f9609c;
                nyVar.h.setVisibility(0);
                nyVar.e.setVisibility(0);
                nyVar.f27741f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
