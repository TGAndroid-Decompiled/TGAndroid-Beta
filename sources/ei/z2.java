package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.v20;
public final class z2 extends AnimatorListenerAdapter {
    public final int f9509a;
    public final int f9510b;
    public final int f9511c;
    public final KeyEvent.Callback d;

    public z2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f9509a = i12;
        this.d = callback;
        this.f9510b = i10;
        this.f9511c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f9509a) {
            case 0:
                l3 l3Var = (l3) this.d;
                l3Var.R = i0.a.d(1.0f, this.f9510b, this.f9511c);
                l3Var.h();
                return;
            case 1:
                v20 v20Var = (v20) this.d;
                v20Var.L = this.f9510b;
                v20Var.M = this.f9511c;
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f31617r.setColor(v20Var.M);
                v20Var.J.d(i0.a.k(v20Var.M, 38));
                return;
            case 2:
                qv0 qv0Var = (qv0) this.d;
                ju0[] ju0VarArr = qv0Var.f30239k0;
                qv0Var.I1.unlock();
                qv0Var.f30247o1 = false;
                int[] iArr = qv0Var.f30242m1;
                int i11 = this.f9511c;
                int i12 = this.f9510b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < ju0VarArr.length; i13++) {
                    ju0 ju0Var = ju0VarArr[i13];
                    if (ju0Var != null && ju0Var.h != null && (((i10 = ju0Var.F) == 0 || qv0.p0(i10)) && (adapter = ju0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qv0Var.f30259t1[0].g(false);
                        }
                        ju0VarArr[i13].f27980x.y1(iArr[i12]);
                        ju0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(ju0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        ju0VarArr[i13].f27977r.setVisibility(8);
                    }
                }
                qv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f9510b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f9511c;
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
