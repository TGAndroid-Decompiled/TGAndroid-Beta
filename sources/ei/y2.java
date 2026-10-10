package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.vu0;
public final class y2 extends AnimatorListenerAdapter {
    public final int f9507a;
    public final int f9508b;
    public final int f9509c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f9507a = i12;
        this.d = callback;
        this.f9508b = i10;
        this.f9509c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.i0 adapter;
        switch (this.f9507a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f9508b, this.f9509c);
                k3Var.h();
                return;
            case 1:
                j30 j30Var = (j30) this.d;
                j30Var.L = this.f9508b;
                j30Var.M = this.f9509c;
                j30Var.F.setColorFilter(new PorterDuffColorFilter(j30Var.L, PorterDuff.Mode.MULTIPLY));
                j30Var.E.setColor(j30Var.L);
                j30Var.f27520r.setColor(j30Var.M);
                j30Var.J.d(i0.a.k(j30Var.M, 38));
                return;
            case 2:
                cw0 cw0Var = (cw0) this.d;
                vu0[] vu0VarArr = cw0Var.f25450k0;
                cw0Var.I1.unlock();
                cw0Var.f25458o1 = false;
                int[] iArr = cw0Var.f25453m1;
                int i11 = this.f9509c;
                int i12 = this.f9508b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < vu0VarArr.length; i13++) {
                    vu0 vu0Var = vu0VarArr[i13];
                    if (vu0Var != null && vu0Var.h != null && (((i10 = vu0Var.F) == 0 || cw0.p0(i10)) && (adapter = vu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            cw0Var.f25470t1[0].g(false);
                        }
                        vu0VarArr[i13].f32522x.y1(iArr[i12]);
                        vu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(vu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        vu0VarArr[i13].f32519r.setVisibility(8);
                    }
                }
                cw0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f9508b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f9509c;
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
