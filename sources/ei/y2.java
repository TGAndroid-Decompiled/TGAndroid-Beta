package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.l30;
public final class y2 extends AnimatorListenerAdapter {
    public final int f9504a;
    public final int f9505b;
    public final int f9506c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f9504a = i12;
        this.d = callback;
        this.f9505b = i10;
        this.f9506c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.i0 adapter;
        switch (this.f9504a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f9505b, this.f9506c);
                k3Var.h();
                return;
            case 1:
                l30 l30Var = (l30) this.d;
                l30Var.L = this.f9505b;
                l30Var.M = this.f9506c;
                l30Var.F.setColorFilter(new PorterDuffColorFilter(l30Var.L, PorterDuff.Mode.MULTIPLY));
                l30Var.E.setColor(l30Var.L);
                l30Var.f28016r.setColor(l30Var.M);
                l30Var.J.d(i0.a.k(l30Var.M, 38));
                return;
            case 2:
                hw0 hw0Var = (hw0) this.d;
                av0[] av0VarArr = hw0Var.f26948k0;
                hw0Var.I1.unlock();
                hw0Var.f26956o1 = false;
                int[] iArr = hw0Var.f26951m1;
                int i11 = this.f9506c;
                int i12 = this.f9505b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < av0VarArr.length; i13++) {
                    av0 av0Var = av0VarArr[i13];
                    if (av0Var != null && av0Var.h != null && (((i10 = av0Var.F) == 0 || hw0.p0(i10)) && (adapter = av0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            hw0Var.f26968t1[0].g(false);
                        }
                        av0VarArr[i13].f24503x.y1(iArr[i12]);
                        av0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(av0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        av0VarArr[i13].f24500r.setVisibility(8);
                    }
                }
                hw0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f9505b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f9506c;
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
