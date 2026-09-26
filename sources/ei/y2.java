package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.t20;
public final class y2 extends AnimatorListenerAdapter {
    public final int f8732a;
    public final int f8733b;
    public final int f8734c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f8732a = i12;
        this.d = callback;
        this.f8733b = i10;
        this.f8734c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f8732a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f8733b, this.f8734c);
                k3Var.h();
                return;
            case 1:
                t20 t20Var = (t20) this.d;
                t20Var.L = this.f8733b;
                t20Var.M = this.f8734c;
                t20Var.F.setColorFilter(new PorterDuffColorFilter(t20Var.L, PorterDuff.Mode.MULTIPLY));
                t20Var.E.setColor(t20Var.L);
                t20Var.f28421r.setColor(t20Var.M);
                t20Var.J.d(i0.a.k(t20Var.M, 38));
                return;
            case 2:
                kv0 kv0Var = (kv0) this.d;
                du0[] du0VarArr = kv0Var.f25842k0;
                kv0Var.I1.unlock();
                kv0Var.f25850o1 = false;
                int[] iArr = kv0Var.f25845m1;
                int i11 = this.f8734c;
                int i12 = this.f8733b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < du0VarArr.length; i13++) {
                    du0 du0Var = du0VarArr[i13];
                    if (du0Var != null && du0Var.h != null && (((i10 = du0Var.F) == 0 || kv0.p0(i10)) && (adapter = du0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            kv0Var.f25862t1[0].g(false);
                        }
                        du0VarArr[i13].f23760x.y1(iArr[i12]);
                        du0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(du0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        du0VarArr[i13].f23757r.setVisibility(8);
                    }
                }
                kv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f8733b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f8734c;
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
