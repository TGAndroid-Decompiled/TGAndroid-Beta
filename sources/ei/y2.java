package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.yu0;
public final class y2 extends AnimatorListenerAdapter {
    public final int f8747a;
    public final int f8748b;
    public final int f8749c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f8747a = i12;
        this.d = callback;
        this.f8748b = i10;
        this.f8749c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f8747a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f8748b, this.f8749c);
                k3Var.h();
                return;
            case 1:
                r20 r20Var = (r20) this.d;
                r20Var.L = this.f8748b;
                r20Var.M = this.f8749c;
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.f27517r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                return;
            case 2:
                yu0 yu0Var = (yu0) this.d;
                rt0[] rt0VarArr = yu0Var.f30365k0;
                yu0Var.I1.unlock();
                yu0Var.f30373o1 = false;
                int[] iArr = yu0Var.f30368m1;
                int i11 = this.f8749c;
                int i12 = this.f8748b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.F) == 0 || yu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f30385t1[0].g(false);
                        }
                        rt0VarArr[i13].f27688x.y1(iArr[i12]);
                        rt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        rt0VarArr[i13].f27685r.setVisibility(8);
                    }
                }
                yu0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f8748b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f8749c;
                uVar.F0 = i15;
                uVar.T.setColor(i15);
                if (uVar.S > 0.0f) {
                    uVar.invalidate();
                    return;
                }
                return;
        }
    }
}
