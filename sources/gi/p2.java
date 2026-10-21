package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import ki.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.oq;
public final class p2 extends AnimatorListenerAdapter {
    public final int f11381a;
    public final int f11382b;
    public final Object f11383c;

    public p2(Object obj, int i10, int i11) {
        this.f11381a = i11;
        this.f11383c = obj;
        this.f11382b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f11381a) {
            case 0:
                d3 d3Var = (d3) this.f11383c;
                d3Var.P.setColor(this.f11382b);
                d3Var.B();
                d3Var.e.invalidate();
                org.telegram.ui.f3 f3Var = d3Var.U0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(d3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3Var.b(z10, false);
                    d3Var.U0.setBackgroundColor(d3Var.P.getColor());
                }
                d3Var.G();
                return;
            case 1:
                f4 f4Var = (f4) this.f11383c;
                v2 v2Var = f4Var.f11208n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(this.f11382b);
                }
                if (animator == f4Var.f11209r) {
                    f4Var.f11209r = null;
                    return;
                }
                return;
            case 2:
                u4 u4Var = (u4) this.f11383c;
                u4Var.W = this.f11382b;
                u4Var.f15545a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f11383c;
                if (!d4Var.c()) {
                    d4Var.b(this.f11382b);
                }
                d4Var.f22127d0 = null;
                return;
            case 4:
                ((p6) this.f11383c).u(this.f11382b);
                return;
            case 5:
                ((e8) this.f11383c).f25807a[this.f11382b].setVisibility(8);
                return;
            case 6:
                ((aq) this.f11383c).f24695a[this.f11382b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.f25022g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                jy jyVar = (jy) this.f11383c;
                sg.q0 q0Var = jyVar.h;
                int i12 = 8;
                int i13 = this.f11382b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q0Var.setVisibility(i10);
                TextView textView = jyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = jyVar.f27671f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                l60 l60Var = (l60) this.f11383c;
                if (this.f11382b == l60Var.f28051s0) {
                    l60Var.f28057x.setRotationY(0.0f);
                    l60Var.f28047q0 = true;
                    l60Var.f28031b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + l60.k(l60Var));
                    l60.l(l60Var);
                    return;
                }
                return;
            case 9:
                fi0 fi0Var = (fi0) this.f11383c;
                fi0Var.H = null;
                fi0Var.P.f28179d1.delete(this.f11382b);
                return;
            case 10:
                oq oqVar = (oq) this.f11383c;
                ((ol0) oqVar.d).f29066b.remove(this.f11382b);
                ol0 ol0Var = (ol0) oqVar.d;
                ol0Var.d = true;
                ol0Var.f29065a.invalidate();
                return;
            case 11:
                pt0 pt0Var = (pt0) this.f11383c;
                pt0Var.e.O1.remove(this.f11382b);
                pt0Var.f29392a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f11383c;
                b1Var.f31355x = -1;
                b1Var.v = this.f11382b;
                b1Var.f31353s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11381a) {
            case 7:
                jy jyVar = (jy) this.f11383c;
                jyVar.h.setVisibility(0);
                jyVar.e.setVisibility(0);
                jyVar.f27671f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
