package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.z20;
public final class s2 extends AnimatorListenerAdapter {
    public final int f11446a;
    public final int f11447b;
    public final int f11448c;
    public final KeyEvent.Callback d;

    public s2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f11446a = i12;
        this.d = callback;
        this.f11447b = i10;
        this.f11448c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f11446a) {
            case 0:
                d3 d3Var = (d3) this.d;
                d3Var.R = i0.a.f(1.0f, this.f11447b, this.f11448c);
                d3Var.h();
                return;
            case 1:
                z20 z20Var = (z20) this.d;
                z20Var.L = this.f11447b;
                z20Var.M = this.f11448c;
                z20Var.F.setColorFilter(new PorterDuffColorFilter(z20Var.L, PorterDuff.Mode.MULTIPLY));
                z20Var.E.setColor(z20Var.L);
                z20Var.f32818r.setColor(z20Var.M);
                z20Var.J.d(i0.a.o(z20Var.M, 38));
                return;
            case 2:
                tv0 tv0Var = (tv0) this.d;
                mu0[] mu0VarArr = tv0Var.f30710k0;
                tv0Var.I1.unlock();
                tv0Var.f30718o1 = false;
                int[] iArr = tv0Var.f30713m1;
                int i11 = this.f11448c;
                int i12 = this.f11447b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < mu0VarArr.length; i13++) {
                    mu0 mu0Var = mu0VarArr[i13];
                    if (mu0Var != null && mu0Var.h != null && (((i10 = mu0Var.F) == 0 || tv0.q0(i10)) && (adapter = mu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            tv0Var.f30730t1[0].g(false);
                        }
                        mu0VarArr[i13].f28614x.y1(iArr[i12]);
                        mu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(mu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        mu0VarArr[i13].f28611r.setVisibility(8);
                    }
                }
                tv0Var.Z0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f11447b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f11448c;
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
