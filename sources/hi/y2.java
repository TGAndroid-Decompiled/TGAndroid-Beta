package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.tq;
public final class y2 extends AnimatorListenerAdapter {
    public final int f13378a;
    public final int f13379b;
    public final Object f13380c;

    public y2(Object obj, int i10, int i11) {
        this.f13378a = i11;
        this.f13380c = obj;
        this.f13379b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        int i11;
        switch (this.f13378a) {
            case 0:
                m3 m3Var = (m3) this.f13380c;
                m3Var.Q.setColor(this.f13379b);
                m3Var.B();
                m3Var.f13108f.invalidate();
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
                o4 o4Var = (o4) this.f13380c;
                e3 e3Var = o4Var.f13179n;
                if (e3Var.getWebView() != null) {
                    e3Var.getWebView().setScrollY(this.f13379b);
                }
                if (animator == o4Var.f13180r) {
                    o4Var.f13180r = null;
                    return;
                }
                return;
            case 2:
                li.u4 u4Var = (li.u4) this.f13380c;
                u4Var.W = this.f13379b;
                u4Var.f17515a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            case 3:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) this.f13380c;
                if (!i4Var.c()) {
                    i4Var.b(this.f13379b);
                }
                i4Var.f24229d0 = null;
                return;
            case 4:
                ((r6) this.f13380c).u(this.f13379b);
                return;
            case 5:
                ((g8) this.f13380c).f28453a[this.f13379b].setVisibility(8);
                return;
            case 6:
                ((dq) this.f13380c).f27517a[this.f13379b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(ds.f27531g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 7:
                iy iyVar = (iy) this.f13380c;
                tg.p0 p0Var = iyVar.f29439r;
                int i12 = 8;
                int i13 = this.f13379b;
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
                TextView textView2 = iyVar.f29438n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 8:
                o60 o60Var = (o60) this.f13380c;
                if (this.f13379b == o60Var.f31193s0) {
                    o60Var.f31197w.setRotationY(0.0f);
                    o60Var.f31189q0 = true;
                    o60Var.f31173b0 = null;
                    FileLog.d("RoundVideo camera flip visual animation completed: elapsedMs=" + o60.l(o60Var));
                    o60.m(o60Var);
                    return;
                }
                return;
            case 9:
                ii0 ii0Var = (ii0) this.f13380c;
                ii0Var.H = null;
                ii0Var.P.f31298d1.delete(this.f13379b);
                return;
            case 10:
                tq tqVar = (tq) this.f13380c;
                ((rl0) tqVar.d).f32275b.remove(this.f13379b);
                rl0 rl0Var = (rl0) tqVar.d;
                rl0Var.d = true;
                rl0Var.f32274a.invalidate();
                return;
            case 11:
                au0 au0Var = (au0) this.f13380c;
                au0Var.e.R1.remove(this.f13379b);
                au0Var.f26665a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.f13380c;
                b1Var.f33847x = -1;
                b1Var.v = this.f13379b;
                b1Var.f33845s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f13378a) {
            case 7:
                iy iyVar = (iy) this.f13380c;
                iyVar.f29439r.setVisibility(0);
                iyVar.h.setVisibility(0);
                iyVar.f29438n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
