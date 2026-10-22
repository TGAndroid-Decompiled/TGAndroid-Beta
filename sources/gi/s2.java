package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.z20;
public final class s2 extends AnimatorListenerAdapter {
    public final int f11444a;
    public final int f11445b;
    public final int f11446c;
    public final KeyEvent.Callback d;

    public s2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f11444a = i12;
        this.d = callback;
        this.f11445b = i10;
        this.f11446c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f11444a) {
            case 0:
                d3 d3Var = (d3) this.d;
                d3Var.R = i0.a.f(1.0f, this.f11445b, this.f11446c);
                d3Var.h();
                return;
            case 1:
                z20 z20Var = (z20) this.d;
                z20Var.L = this.f11445b;
                z20Var.M = this.f11446c;
                z20Var.F.setColorFilter(new PorterDuffColorFilter(z20Var.L, PorterDuff.Mode.MULTIPLY));
                z20Var.E.setColor(z20Var.L);
                z20Var.f32816r.setColor(z20Var.M);
                z20Var.J.d(i0.a.o(z20Var.M, 38));
                return;
            case 2:
                uv0 uv0Var = (uv0) this.d;
                nu0[] nu0VarArr = uv0Var.f31050k0;
                uv0Var.I1.unlock();
                uv0Var.f31058o1 = false;
                int[] iArr = uv0Var.f31053m1;
                int i11 = this.f11446c;
                int i12 = this.f11445b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < nu0VarArr.length; i13++) {
                    nu0 nu0Var = nu0VarArr[i13];
                    if (nu0Var != null && nu0Var.h != null && (((i10 = nu0Var.F) == 0 || uv0.q0(i10)) && (adapter = nu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            uv0Var.f31070t1[0].g(false);
                        }
                        nu0VarArr[i13].f28887x.y1(iArr[i12]);
                        nu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(nu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        nu0VarArr[i13].f28884r.setVisibility(8);
                    }
                }
                uv0Var.Z0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f11445b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f11446c;
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
