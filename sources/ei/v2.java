package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.zq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f9428a;
    public final int f9429b;
    public final Object f9430c;

    public v2(Object obj, int i10, int i11) {
        this.f9428a = i11;
        this.f9430c = obj;
        this.f9429b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f9428a) {
            case 0:
                k3 k3Var = (k3) this.f9430c;
                k3Var.P.setColor(this.f9429b);
                k3Var.B();
                k3Var.f9159e.invalidate();
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
                p4 p4Var = (p4) this.f9430c;
                b3 b3Var = p4Var.f9292n;
                if (b3Var.getWebView() != null) {
                    b3Var.getWebView().setScrollY(this.f9429b);
                }
                if (animator == p4Var.f9293r) {
                    p4Var.f9293r = null;
                    return;
                }
                return;
            case 2:
                ii.w4 w4Var = (ii.w4) this.f9430c;
                w4Var.W = this.f9429b;
                w4Var.f12772a0 = 0.0f;
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f9430c;
                if (!e4Var.c()) {
                    e4Var.b(this.f9429b);
                }
                e4Var.f22028d0 = null;
                return;
            case 4:
                ((q6) this.f9430c).u(this.f9429b);
                return;
            case 5:
                ((f8) this.f9430c).f26293a[this.f9429b].setVisibility(8);
                return;
            case 6:
                ((gq) this.f9430c).f26855a[this.f9429b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(hs.f27119g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                ry ryVar = (ry) this.f9430c;
                rg.p0 p0Var = ryVar.h;
                int i12 = 8;
                int i13 = this.f9429b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = ryVar.f30537e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = ryVar.f30538f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                s60 s60Var = (s60) this.f9430c;
                FrameLayout frameLayout = s60Var.f30700x;
                if (this.f9429b == s60Var.f30692r0) {
                    frameLayout.animate().setListener(null);
                    frameLayout.setRotationY(0.0f);
                    s60Var.m0 = false;
                    FileLog.d("RoundVideo camera flip completed: elapsedMs=" + s60.k(s60Var));
                    s60Var.x();
                    return;
                }
                return;
            case 9:
                ni0 ni0Var = (ni0) this.f9430c;
                ni0Var.H = null;
                ni0Var.P.f31193d1.delete(this.f9429b);
                return;
            case 10:
                zq zqVar = (zq) this.f9430c;
                ((vl0) zqVar.d).f31817b.remove(this.f9429b);
                vl0 vl0Var = (vl0) zqVar.d;
                vl0Var.d = true;
                vl0Var.f31816a.invalidate();
                return;
            case 11:
                wt0 wt0Var = (wt0) this.f9430c;
                wt0Var.f32676e.O1.remove(this.f9429b);
                wt0Var.f32673a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f9430c;
                d1Var.f31898x = -1;
                d1Var.v = this.f9429b;
                d1Var.f31896s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f9428a) {
            case 7:
                ry ryVar = (ry) this.f9430c;
                ryVar.h.setVisibility(0);
                ryVar.f30537e.setVisibility(0);
                ryVar.f30538f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
