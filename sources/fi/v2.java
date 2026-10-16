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
    public final int f9610a;
    public final int f9611b;
    public final Object f9612c;

    public v2(Object obj, int i10, int i11) {
        this.f9610a = i11;
        this.f9612c = obj;
        this.f9611b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f9610a) {
            case 0:
                k3 k3Var = (k3) this.f9612c;
                k3Var.P.setColor(this.f9611b);
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
                q4 q4Var = (q4) this.f9612c;
                b3 b3Var = q4Var.f9498n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.f9611b);
                }
                if (animator == q4Var.f9499r) {
                    q4Var.f9499r = null;
                    return;
                }
                return;
            case 2:
                ji.y4 y4Var = (ji.y4) this.f9612c;
                y4Var.W = this.f9611b;
                y4Var.f13674a0 = 0.0f;
                y4Var.requestLayout();
                y4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9612c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9611b);
                }
                e4Var.f20816d0 = null;
                return;
            case 4:
                ((r6) this.f9612c).u(this.f9611b);
                return;
            case 5:
                ((g8) this.f9612c).f24899a[this.f9611b].setVisibility(8);
                return;
            case 6:
                ((dq) this.f9612c).f24162a[this.f9611b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(es.f24466g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                ny nyVar = (ny) this.f9612c;
                sg.q0 q0Var = nyVar.h;
                int i12 = 8;
                int i13 = this.f9611b;
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
                TextView textView2 = nyVar.f27440f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                o60 o60Var = (o60) this.f9612c;
                if (this.f9611b == o60Var.f27577s0) {
                    o60Var.f27583x.setRotationY(0.0f);
                    o60Var.f27573q0 = true;
                    o60Var.f27557b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + o60.k(o60Var));
                    o60.l(o60Var);
                    return;
                }
                return;
            case 9:
                ji0 ji0Var = (ji0) this.f9612c;
                ji0Var.H = null;
                ji0Var.P.f28010d1.delete(this.f9611b);
                return;
            case 10:
                fr frVar = (fr) this.f9612c;
                ((rl0) frVar.d).f28567b.remove(this.f9611b);
                rl0 rl0Var = (rl0) frVar.d;
                rl0Var.d = true;
                rl0Var.f28566a.invalidate();
                return;
            case 11:
                st0 st0Var = (st0) this.f9612c;
                st0Var.e.O1.remove(this.f9611b);
                st0Var.f28910a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f9612c;
                b1Var.f29782x = -1;
                b1Var.v = this.f9611b;
                b1Var.f29780s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9610a) {
            case 7:
                ny nyVar = (ny) this.f9612c;
                nyVar.h.setVisibility(0);
                nyVar.e.setVisibility(0);
                nyVar.f27440f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
