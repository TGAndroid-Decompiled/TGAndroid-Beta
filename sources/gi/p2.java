package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import ki.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.st0;
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
                d4Var.f22264d0 = null;
                return;
            case 4:
                ((p6) this.f11408c).u(this.f11407b);
                return;
            case 5:
                ((e8) this.f11408c).f25910a[this.f11407b].setVisibility(8);
                return;
            case 6:
                ((bq) this.f11408c).f25123a[this.f11407b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.f25134g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                jy jyVar = (jy) this.f11408c;
                sg.p0 p0Var = jyVar.f27782r;
                int i12 = 8;
                int i13 = this.f11407b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = jyVar.h;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = jyVar.f27781n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                m60 m60Var = (m60) this.f11408c;
                if (this.f11407b == m60Var.f28542s0) {
                    m60Var.f28548x.setRotationY(0.0f);
                    m60Var.f28538q0 = true;
                    m60Var.f28522b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + m60.k(m60Var));
                    m60.l(m60Var);
                    return;
                }
                return;
            case 9:
                ii0 ii0Var = (ii0) this.f11408c;
                ii0Var.H = null;
                ii0Var.P.f29188d1.delete(this.f11407b);
                return;
            case 10:
                qq qqVar = (qq) this.f11408c;
                ((rl0) qqVar.d).f30222b.remove(this.f11407b);
                rl0 rl0Var = (rl0) qqVar.d;
                rl0Var.d = true;
                rl0Var.f30221a.invalidate();
                return;
            case 11:
                st0 st0Var = (st0) this.f11408c;
                st0Var.e.P1.remove(this.f11407b);
                st0Var.f30551a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f11408c;
                b1Var.f31540x = -1;
                b1Var.v = this.f11407b;
                b1Var.f31538s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11406a) {
            case 7:
                jy jyVar = (jy) this.f11408c;
                jyVar.f27782r.setVisibility(0);
                jyVar.h.setVisibility(0);
                jyVar.f27781n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
