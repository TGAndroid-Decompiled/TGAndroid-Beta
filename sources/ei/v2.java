package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.v60;
import org.telegram.ui.cr;
public final class v2 extends AnimatorListenerAdapter {
    public final int f9425a;
    public final int f9426b;
    public final Object f9427c;

    public v2(Object obj, int i10, int i11) {
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
                k3 k3Var = (k3) this.f9427c;
                k3Var.P.setColor(this.f9426b);
                k3Var.B();
                k3Var.f9156e.invalidate();
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
                k3Var.G();
                return;
            case 1:
                p4 p4Var = (p4) this.f9427c;
                b3 b3Var = p4Var.f9289n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.f9426b);
                }
                if (animator == p4Var.f9290r) {
                    p4Var.f9290r = null;
                    return;
                }
                return;
            case 2:
                ii.v4 v4Var = (ii.v4) this.f9427c;
                v4Var.W = this.f9426b;
                v4Var.f12750a0 = 0.0f;
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9427c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9426b);
                }
                e4Var.f21790d0 = null;
                return;
            case 4:
                ((q6) this.f9427c).u(this.f9426b);
                return;
            case 5:
                ((f8) this.f9427c).f25951a[this.f9426b].setVisibility(8);
                return;
            case 6:
                ((iq) this.f9427c).f27254a[this.f9426b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(js.f27635g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                uy uyVar = (uy) this.f9427c;
                rg.q0 q0Var = uyVar.h;
                int i12 = 8;
                int i13 = this.f9426b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q0Var.setVisibility(i10);
                TextView textView = uyVar.f31282e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = uyVar.f31283f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                v60 v60Var = (v60) this.f9427c;
                if (this.f9426b == v60Var.f31433s0) {
                    v60Var.f31439x.setRotationY(0.0f);
                    v60Var.f31429q0 = true;
                    v60Var.f31413b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + v60.k(v60Var));
                    v60.l(v60Var);
                    return;
                }
                return;
            case 9:
                qi0 qi0Var = (qi0) this.f9427c;
                qi0Var.H = null;
                qi0Var.P.f32406d1.delete(this.f9426b);
                return;
            case 10:
                cr crVar = (cr) this.f9427c;
                ((bm0) crVar.d).f24680b.remove(this.f9426b);
                bm0 bm0Var = (bm0) crVar.d;
                bm0Var.d = true;
                bm0Var.f24679a.invalidate();
                return;
            case 11:
                cu0 cu0Var = (cu0) this.f9427c;
                cu0Var.f25014e.O1.remove(this.f9426b);
                cu0Var.f25011a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.e1 e1Var = (org.telegram.ui.Components.voip.e1) this.f9427c;
                e1Var.f31653x = -1;
                e1Var.v = this.f9426b;
                e1Var.f31651s = 0.0f;
                e1Var.U = null;
                e1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9425a) {
            case 7:
                uy uyVar = (uy) this.f9427c;
                uyVar.h.setVisibility(0);
                uyVar.f31282e.setVisibility(0);
                uyVar.f31283f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
