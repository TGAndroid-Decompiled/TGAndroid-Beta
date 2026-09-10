package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dr;
public final class y2 extends AnimatorListenerAdapter {
    public final int f7029a;
    public final int f7030b;
    public final Object f7031c;

    public y2(Object obj, int i10, int i11) {
        this.f7029a = i11;
        this.f7031c = obj;
        this.f7030b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f7029a) {
            case 0:
                n3 n3Var = (n3) this.f7031c;
                n3Var.P.setColor(this.f7030b);
                n3Var.A();
                n3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = n3Var.U0;
                if (e3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(n3Var.P.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e3Var.b(z10, false);
                    n3Var.U0.setBackgroundColor(n3Var.P.getColor());
                }
                n3Var.F();
                return;
            case 1:
                u4 u4Var = (u4) this.f7031c;
                n4 n4Var = u4Var.f6947n;
                if (n4Var.getWebView() != null) {
                    n4Var.getWebView().setScrollY(this.f7030b);
                }
                if (animator == u4Var.f6948r) {
                    u4Var.f6948r = null;
                    return;
                }
                return;
            case 2:
                hi.x4 x4Var = (hi.x4) this.f7031c;
                x4Var.W = this.f7030b;
                x4Var.f9945a0 = 0.0f;
                x4Var.requestLayout();
                x4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f7031c;
                if (!d4Var.c()) {
                    d4Var.b(this.f7030b);
                }
                d4Var.f18988d0 = null;
                return;
            case 4:
                ((n6) this.f7031c).r(this.f7030b);
                return;
            case 5:
                ((d8) this.f7031c).f22314a[this.f7030b].setVisibility(8);
                return;
            case 6:
                ((wp) this.f7031c).f28809a[this.f7030b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(wr.f28820g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                iy iyVar = (iy) this.f7031c;
                qg.s0 s0Var = iyVar.h;
                int i12 = 8;
                int i13 = this.f7030b;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                s0Var.setVisibility(i10);
                TextView textView = iyVar.e;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = iyVar.f24161f;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                sh0 sh0Var = (sh0) this.f7031c;
                sh0Var.H = null;
                sh0Var.P.f29332d1.delete(this.f7030b);
                return;
            case 9:
                dr drVar = (dr) this.f7031c;
                ((zk0) drVar.d).f29713b.remove(this.f7030b);
                zk0 zk0Var = (zk0) drVar.d;
                zk0Var.d = true;
                zk0Var.f29712a.invalidate();
                return;
            case 10:
                ct0 ct0Var = (ct0) this.f7031c;
                ct0Var.e.O1.remove(this.f7030b);
                ct0Var.f22221a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.f7031c;
                c1Var.f28074x = -1;
                c1Var.v = this.f7030b;
                c1Var.f28072s = 0.0f;
                c1Var.U = null;
                c1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f7029a) {
            case 7:
                iy iyVar = (iy) this.f7031c;
                iyVar.h.setVisibility(0);
                iyVar.e.setVisibility(0);
                iyVar.f24161f.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
