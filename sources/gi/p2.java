package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import ki.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zr;
import org.telegram.ui.qq;
public final class p2 extends AnimatorListenerAdapter {
    public final int f11406a;
    public final int f11407b;
    public final Object f11408c;

    public p2(Object obj, int i10, int i11) {
        this.f11406a = i11;
        this.f11408c = obj;
        this.f11407b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f11406a) {
            case 0:
                d3 d3Var = (d3) this.f11408c;
                d3Var.Q.setColor(this.f11407b);
                d3Var.B();
                d3Var.f11164f.invalidate();
                org.telegram.ui.e3 e3Var = d3Var.Y0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(d3Var.Q.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    d3Var.Y0.setBackgroundColor(d3Var.Q.getColor());
                }
                d3Var.G();
                return;
            case 1:
                f4 f4Var = (f4) this.f11408c;
                v2 v2Var = f4Var.f11230n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(this.f11407b);
                }
                if (animator == f4Var.f11231r) {
                    f4Var.f11231r = null;
                    return;
                }
                return;
            case 2:
                u4 u4Var = (u4) this.f11408c;
                u4Var.W = this.f11407b;
                u4Var.f15604a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f11408c;
                if (!d4Var.c()) {
                    d4Var.b(this.f11407b);
                }
                d4Var.f22265d0 = null;
                return;
            case 4:
                ((n6) this.f11408c).u(this.f11407b);
                return;
            case 5:
                ((c8) this.f11408c).f25243a[this.f11407b].setVisibility(8);
                return;
            case 6:
                ((zp) this.f11408c).f33327a[this.f11407b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(zr.f33338g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                hy hyVar = (hy) this.f11408c;
                sg.p0 p0Var = hyVar.f27199r;
                int i12 = 8;
                int i13 = this.f11407b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = hyVar.h;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = hyVar.f27198n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                k60 k60Var = (k60) this.f11408c;
                if (this.f11407b == k60Var.f27896s0) {
                    k60Var.f27902x.setRotationY(0.0f);
                    k60Var.f27892q0 = true;
                    k60Var.f27876b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + k60.k(k60Var));
                    k60.l(k60Var);
                    return;
                }
                return;
            case 9:
                hi0 hi0Var = (hi0) this.f11408c;
                hi0Var.H = null;
                hi0Var.P.f28922d1.delete(this.f11407b);
                return;
            case 10:
                qq qqVar = (qq) this.f11408c;
                ((ql0) qqVar.d).f29949b.remove(this.f11407b);
                ql0 ql0Var = (ql0) qqVar.d;
                ql0Var.d = true;
                ql0Var.f29948a.invalidate();
                return;
            case 11:
                rt0 rt0Var = (rt0) this.f11408c;
                rt0Var.e.P1.remove(this.f11407b);
                rt0Var.f30270a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f11408c;
                b1Var.f31510x = -1;
                b1Var.v = this.f11407b;
                b1Var.f31508s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11406a) {
            case 7:
                hy hyVar = (hy) this.f11408c;
                hyVar.f27199r.setVisibility(0);
                hyVar.h.setVisibility(0);
                hyVar.f27198n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
