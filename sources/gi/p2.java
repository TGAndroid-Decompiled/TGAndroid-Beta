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
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.qq;
public final class p2 extends AnimatorListenerAdapter {
    public final int f11384a;
    public final int f11385b;
    public final Object f11386c;

    public p2(Object obj, int i10, int i11) {
        this.f11384a = i11;
        this.f11386c = obj;
        this.f11385b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f11384a) {
            case 0:
                d3 d3Var = (d3) this.f11386c;
                d3Var.P.setColor(this.f11385b);
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
                f4 f4Var = (f4) this.f11386c;
                v2 v2Var = f4Var.f11211n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(this.f11385b);
                }
                if (animator == f4Var.f11212r) {
                    f4Var.f11212r = null;
                    return;
                }
                return;
            case 2:
                u4 u4Var = (u4) this.f11386c;
                u4Var.W = this.f11385b;
                u4Var.f15546a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f11386c;
                if (!d4Var.c()) {
                    d4Var.b(this.f11385b);
                }
                d4Var.f22130d0 = null;
                return;
            case 4:
                ((p6) this.f11386c).u(this.f11385b);
                return;
            case 5:
                ((e8) this.f11386c).f25867a[this.f11385b].setVisibility(8);
                return;
            case 6:
                ((aq) this.f11386c).f24697a[this.f11385b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.f25038g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                jy jyVar = (jy) this.f11386c;
                sg.p0 p0Var = jyVar.h;
                int i12 = 8;
                int i13 = this.f11385b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = jyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = jyVar.f27654f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                l60 l60Var = (l60) this.f11386c;
                if (this.f11385b == l60Var.f28108s0) {
                    l60Var.f28114x.setRotationY(0.0f);
                    l60Var.f28104q0 = true;
                    l60Var.f28088b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + l60.k(l60Var));
                    l60.l(l60Var);
                    return;
                }
                return;
            case 9:
                ei0 ei0Var = (ei0) this.f11386c;
                ei0Var.H = null;
                ei0Var.P.f27895d1.delete(this.f11385b);
                return;
            case 10:
                qq qqVar = (qq) this.f11386c;
                ((nl0) qqVar.d).f28797b.remove(this.f11385b);
                nl0 nl0Var = (nl0) qqVar.d;
                nl0Var.d = true;
                nl0Var.f28796a.invalidate();
                return;
            case 11:
                nt0 nt0Var = (nt0) this.f11386c;
                nt0Var.e.O1.remove(this.f11385b);
                nt0Var.f28823a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f11386c;
                b1Var.f31401x = -1;
                b1Var.v = this.f11385b;
                b1Var.f31399s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f11384a) {
            case 7:
                jy jyVar = (jy) this.f11386c;
                jyVar.h.setVisibility(0);
                jyVar.e.setVisibility(0);
                jyVar.f27654f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
