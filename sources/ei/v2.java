package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.br;
public final class v2 extends AnimatorListenerAdapter {
    public final int f8674a;
    public final int f8675b;
    public final Object f8676c;

    public v2(Object obj, int i10, int i11) {
        this.f8674a = i11;
        this.f8676c = obj;
        this.f8675b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f8674a) {
            case 0:
                k3 k3Var = (k3) this.f8676c;
                k3Var.P.setColor(this.f8675b);
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
                q4 q4Var = (q4) this.f8676c;
                j4 j4Var = q4Var.f8567n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(this.f8675b);
                }
                if (animator == q4Var.f8568r) {
                    q4Var.f8568r = null;
                    return;
                }
                return;
            case 2:
                ii.u4 u4Var = (ii.u4) this.f8676c;
                u4Var.W = this.f8675b;
                u4Var.f11662a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f8676c;
                if (!e4Var.c()) {
                    e4Var.b(this.f8675b);
                }
                e4Var.f20010d0 = null;
                return;
            case 4:
                ((m6) this.f8676c).r(this.f8675b);
                return;
            case 5:
                ((b8) this.f8676c).f22694a[this.f8675b].setVisibility(8);
                return;
            case 6:
                ((qp) this.f8676c).f27408a[this.f8675b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.f27421g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                ay ayVar = (ay) this.f8676c;
                rg.p0 p0Var = ayVar.h;
                int i12 = 8;
                int i13 = this.f8675b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p0Var.setVisibility(i10);
                TextView textView = ayVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = ayVar.f22505f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f8676c;
                ih0Var.H = null;
                ih0Var.P.f26787d1.delete(this.f8675b);
                return;
            case 9:
                br brVar = (br) this.f8676c;
                ((qk0) brVar.d).f27371b.remove(this.f8675b);
                qk0 qk0Var = (qk0) brVar.d;
                qk0Var.d = true;
                qk0Var.f27370a.invalidate();
                return;
            case 10:
                ts0 ts0Var = (ts0) this.f8676c;
                ts0Var.e.O1.remove(this.f8675b);
                ts0Var.f28178a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) this.f8676c;
                d1Var.f28910x = -1;
                d1Var.v = this.f8675b;
                d1Var.f28908s = 0.0f;
                d1Var.U = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f8674a) {
            case 7:
                ay ayVar = (ay) this.f8676c;
                ayVar.h.setVisibility(0);
                ayVar.e.setVisibility(0);
                ayVar.f22505f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
