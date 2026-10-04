package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.v20;
public final class z2 extends AnimatorListenerAdapter {
    public final int f9508a;
    public final int f9509b;
    public final int f9510c;
    public final KeyEvent.Callback d;

    public z2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f9508a = i12;
        this.d = callback;
        this.f9509b = i10;
        this.f9510c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f9508a) {
            case 0:
                l3 l3Var = (l3) this.d;
                l3Var.R = i0.a.d(1.0f, this.f9509b, this.f9510c);
                l3Var.h();
                return;
            case 1:
                v20 v20Var = (v20) this.d;
                v20Var.L = this.f9509b;
                v20Var.M = this.f9510c;
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f31515r.setColor(v20Var.M);
                v20Var.J.d(i0.a.k(v20Var.M, 38));
                return;
            case 2:
                pv0 pv0Var = (pv0) this.d;
                iu0[] iu0VarArr = pv0Var.f29777k0;
                pv0Var.I1.unlock();
                pv0Var.f29785o1 = false;
                int[] iArr = pv0Var.f29780m1;
                int i11 = this.f9510c;
                int i12 = this.f9509b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < iu0VarArr.length; i13++) {
                    iu0 iu0Var = iu0VarArr[i13];
                    if (iu0Var != null && iu0Var.h != null && (((i10 = iu0Var.F) == 0 || pv0.p0(i10)) && (adapter = iu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            pv0Var.f29797t1[0].g(false);
                        }
                        iu0VarArr[i13].f27505x.y1(iArr[i12]);
                        iu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(iu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        iu0VarArr[i13].f27502r.setVisibility(8);
                    }
                }
                pv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f9509b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f9510c;
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
