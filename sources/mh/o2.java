package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.nq;
public final class o2 extends AnimatorListenerAdapter {
    public final int f18016a;
    public final int f18017b;
    public final Object f18018c;

    public o2(Object obj, int i9, int i10) {
        this.f18016a = i10;
        this.f18018c = obj;
        this.f18017b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i9;
        int i10;
        switch (this.f18016a) {
            case 0:
                c3 c3Var = (c3) this.f18018c;
                c3Var.L.setColor(this.f18017b);
                c3Var.A();
                c3Var.f17754e.invalidate();
                org.telegram.ui.g3 g3Var = c3Var.Q0;
                if (g3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(c3Var.L.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g3Var.b(z10, false);
                    c3Var.Q0.setBackgroundColor(c3Var.L.getColor());
                }
                c3Var.F();
                return;
            case 1:
                g4 g4Var = (g4) this.f18018c;
                z3 z3Var = g4Var.f17861n;
                if (z3Var.getWebView() != null) {
                    z3Var.getWebView().setScrollY(this.f18017b);
                }
                if (animator == g4Var.f17862r) {
                    g4Var.f17862r = null;
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f18018c;
                if (!e4Var.c()) {
                    e4Var.b(this.f18017b);
                }
                e4Var.W = null;
                return;
            case 3:
                ((i6) this.f18018c).r(this.f18017b);
                return;
            case 4:
                ((w7) this.f18018c).f34125a[this.f18017b].setVisibility(8);
                return;
            case 5:
                ((gp) this.f18018c).f28831a[this.f18017b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.f28845g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 6:
                nx nxVar = (nx) this.f18018c;
                zf.p0 p0Var = nxVar.h;
                int i11 = 8;
                int i12 = this.f18017b;
                if (i12 == 1) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                p0Var.setVisibility(i9);
                TextView textView = nxVar.f31196e;
                if (i12 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = nxVar.f31197f;
                if (i12 == 3) {
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                return;
            case 7:
                ug0 ug0Var = (ug0) this.f18018c;
                ug0Var.D = null;
                ug0Var.L.Z0.delete(this.f18017b);
                return;
            case 8:
                nq nqVar = (nq) this.f18018c;
                ((dk0) nqVar.d).f27746b.remove(this.f18017b);
                dk0 dk0Var = (dk0) nqVar.d;
                dk0Var.d = true;
                dk0Var.f27745a.invalidate();
                return;
            case 9:
                zr0 zr0Var = (zr0) this.f18018c;
                zr0Var.f35368e.K1.remove(this.f18017b);
                zr0Var.f35365a.invalidate();
                return;
            case 10:
                org.telegram.ui.Components.voip.a1 a1Var = (org.telegram.ui.Components.voip.a1) this.f18018c;
                a1Var.f33434x = -1;
                a1Var.v = this.f18017b;
                a1Var.f33432s = 0.0f;
                a1Var.Q = null;
                a1Var.e();
                return;
            default:
                qh.l4 l4Var = (qh.l4) this.f18018c;
                l4Var.S = this.f18017b;
                l4Var.T = 0.0f;
                l4Var.requestLayout();
                l4Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18016a) {
            case 6:
                nx nxVar = (nx) this.f18018c;
                nxVar.h.setVisibility(0);
                nxVar.f31196e.setVisibility(0);
                nxVar.f31197f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
