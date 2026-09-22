package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.zq;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8676a;
    public final int f8677b;
    public final Object f8678c;

    public v2(Object obj, int i10, int i11) {
        this.f8676a = i11;
        this.f8678c = obj;
        this.f8677b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8676a) {
            case 0:
                k3 k3Var = (k3) this.f8678c;
                k3Var.P.setColor(this.f8677b);
                k3Var.A();
                k3Var.e.invalidate();
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
                k3Var.F();
                return;
            case 1:
                q4 q4Var = (q4) this.f8678c;
                j4 j4Var = q4Var.f8569n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8677b);
                }
                if (animator == q4Var.f8570r) {
                    q4Var.f8570r = null;
                    return;
                }
                return;
            case 2:
                ii.u4 u4Var = (ii.u4) this.f8678c;
                u4Var.W = this.f8677b;
                u4Var.f11664a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f8678c;
                if (!f4Var.c()) {
                    f4Var.b(this.f8677b);
                }
                f4Var.f20292d0 = null;
                return;
            case 4:
                ((n6) this.f8678c).r(this.f8677b);
                return;
            case 5:
                ((c8) this.f8678c).f23291a[this.f8677b].setVisibility(8);
                return;
            case 6:
                ((qp) this.f8678c).f27644a[this.f8677b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.f27654g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                cy cyVar = (cy) this.f8678c;
                rg.p0 p0Var = cyVar.h;
                int i12 = 8;
                int i13 = this.f8677b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = cyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = cyVar.f23493f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                vh0 vh0Var = (vh0) this.f8678c;
                vh0Var.H = null;
                vh0Var.P.f23003d1.delete(this.f8677b);
                return;
            case 9:
                zq zqVar = (zq) this.f8678c;
                ((dl0) zqVar.d).f23710b.remove(this.f8677b);
                dl0 dl0Var = (dl0) zqVar.d;
                dl0Var.d = true;
                dl0Var.f23709a.invalidate();
                return;
            case 10:
                gt0 gt0Var = (gt0) this.f8678c;
                gt0Var.e.O1.remove(this.f8677b);
                gt0Var.f24619a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8678c;
                d1Var.f29278x = -1;
                d1Var.v = this.f8677b;
                d1Var.f29276s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8676a) {
            case 7:
                cy cyVar = (cy) this.f8678c;
                cyVar.h.setVisibility(0);
                cyVar.e.setVisibility(0);
                cyVar.f23493f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
