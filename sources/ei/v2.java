package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yt0;
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
                e4Var.f22020d0 = null;
                return;
            case 4:
                ((q6) this.f9429c).u(this.f9428b);
                return;
            case 5:
                ((f8) this.f9429c).f26280a[this.f9428b].setVisibility(8);
                return;
            case 6:
                ((gq) this.f9429c).f26800a[this.f9428b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(is.f27452g).setStartDelay(0L).setDuration(100L).start();
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
                TextView textView = syVar.f30898e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = syVar.f30899f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                t60 t60Var = (t60) this.f9429c;
                FrameLayout frameLayout = t60Var.f31033x;
                if (this.f9428b == t60Var.f31025r0) {
                    frameLayout.animate().setListener(null);
                    frameLayout.setRotationY(0.0f);
                    t60Var.m0 = false;
                    FileLog.d("RoundVideo camera flip completed: elapsedMs=" + t60.k(t60Var));
                    t60Var.x();
                    return;
                }
                return;
            case 9:
                pi0 pi0Var = (pi0) this.f9429c;
                pi0Var.H = null;
                pi0Var.P.f31806d1.delete(this.f9428b);
                return;
            case 10:
                zq zqVar = (zq) this.f9429c;
                ((xl0) zqVar.d).f32980b.remove(this.f9428b);
                xl0 xl0Var = (xl0) zqVar.d;
                xl0Var.d = true;
                xl0Var.f32979a.invalidate();
                return;
            case 11:
                yt0 yt0Var = (yt0) this.f9429c;
                yt0Var.f33335e.O1.remove(this.f9428b);
                yt0Var.f33332a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.e1 e1Var = (org.telegram.ui.Components.voip.e1) this.f9429c;
                e1Var.f31967x = -1;
                e1Var.v = this.f9428b;
                e1Var.f31965s = 0.0f;
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
                syVar.f30898e.setVisibility(0);
                syVar.f30899f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
