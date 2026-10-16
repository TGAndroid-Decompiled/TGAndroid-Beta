package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.xv0;
public final class y2 extends AnimatorListenerAdapter {
    public final int f9679a;
    public final int f9680b;
    public final int f9681c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f9679a = i12;
        this.d = callback;
        this.f9680b = i10;
        this.f9681c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f9679a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f9680b, this.f9681c);
                k3Var.h();
                return;
            case 1:
                e30 e30Var = (e30) this.d;
                e30Var.L = this.f9680b;
                e30Var.M = this.f9681c;
                e30Var.F.setColorFilter(new PorterDuffColorFilter(e30Var.L, PorterDuff.Mode.MULTIPLY));
                e30Var.E.setColor(e30Var.L);
                e30Var.f24276r.setColor(e30Var.M);
                e30Var.J.d(i0.a.k(e30Var.M, 38));
                return;
            case 2:
                xv0 xv0Var = (xv0) this.d;
                qu0[] qu0VarArr = xv0Var.f31045k0;
                xv0Var.I1.unlock();
                xv0Var.f31053o1 = false;
                int[] iArr = xv0Var.f31048m1;
                int i11 = this.f9681c;
                int i12 = this.f9680b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qu0VarArr.length; i13++) {
                    qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var != null && qu0Var.h != null && (((i10 = qu0Var.F) == 0 || xv0.p0(i10)) && (adapter = qu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xv0Var.f31065t1[0].g(false);
                        }
                        qu0VarArr[i13].f28369x.y1(iArr[i12]);
                        qu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qu0VarArr[i13].f28366r.setVisibility(8);
                    }
                }
                xv0Var.Y0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f9680b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f9681c;
                tVar.F0 = i15;
                tVar.T.setColor(i15);
                if (tVar.S > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
        }
    }
}
