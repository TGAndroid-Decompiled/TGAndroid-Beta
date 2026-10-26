package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.rq;
public final class y2 extends AnimatorListenerAdapter {
    public final int f13379a;
    public final int f13380b;
    public final Object f13381c;

    public y2(Object obj, int i10, int i11) {
        this.f13379a = i11;
        this.f13381c = obj;
        this.f13380b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f13379a) {
            case 0:
                m3 m3Var = (m3) this.f13381c;
                m3Var.Q.setColor(this.f13380b);
                m3Var.B();
                m3Var.f13109f.invalidate();
                org.telegram.ui.c3 c3Var = m3Var.Y0;
                if (c3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(m3Var.Q.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    m3Var.Y0.setBackgroundColor(m3Var.Q.getColor());
                }
                m3Var.G();
                return;
            case 1:
                o4 o4Var = (o4) this.f13381c;
                e3 e3Var = o4Var.f13180n;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().setScrollY(this.f13380b);
                }
                if (animator == o4Var.f13181r) {
                    o4Var.f13181r = null;
                    return;
                }
                return;
            case 2:
                li.u4 u4Var = (li.u4) this.f13381c;
                u4Var.W = this.f13380b;
                u4Var.f17516a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) this.f13381c;
                if (!i4Var.c()) {
                    i4Var.b(this.f13380b);
                }
                i4Var.f24227d0 = null;
                return;
            case 4:
                ((r6) this.f13381c).u(this.f13380b);
                return;
            case 5:
                ((g8) this.f13381c).f28476a[this.f13380b].setVisibility(8);
                return;
            case 6:
                ((dq) this.f13381c).f27578a[this.f13380b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(ds.f27587g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                iy iyVar = (iy) this.f13381c;
                tg.p0 p0Var = iyVar.f29399r;
                int i12 = 8;
                int i13 = this.f13380b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = iyVar.h;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = iyVar.f29398n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                n60 n60Var = (n60) this.f13381c;
                if (this.f13380b == n60Var.f30870s0) {
                    n60Var.f30876x.setRotationY(0.0f);
                    n60Var.f30866q0 = true;
                    n60Var.f30850b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + n60.k(n60Var));
                    n60.l(n60Var);
                    return;
                }
                return;
            case 9:
                hi0 hi0Var = (hi0) this.f13381c;
                hi0Var.H = null;
                hi0Var.P.f30989d1.delete(this.f13380b);
                return;
            case 10:
                rq rqVar = (rq) this.f13381c;
                ((ql0) rqVar.d).f31953b.remove(this.f13380b);
                ql0 ql0Var = (ql0) rqVar.d;
                ql0Var.d = true;
                ql0Var.f31952a.invalidate();
                return;
            case 11:
                zt0 zt0Var = (zt0) this.f13381c;
                zt0Var.e.R1.remove(this.f13380b);
                zt0Var.f35405a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f13381c;
                b1Var.f33742x = -1;
                b1Var.v = this.f13380b;
                b1Var.f33740s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f13379a) {
            case 7:
                iy iyVar = (iy) this.f13381c;
                iyVar.f29399r.setVisibility(0);
                iyVar.h.setVisibility(0);
                iyVar.f29398n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
