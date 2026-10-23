package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.z20;
public final class s2 extends AnimatorListenerAdapter {
    public final int f11470a;
    public final int f11471b;
    public final int f11472c;
    public final KeyEvent.Callback d;

    public s2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f11470a = i12;
        this.d = callback;
        this.f11471b = i10;
        this.f11472c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f11470a) {
            case 0:
                d3 d3Var = (d3) this.d;
                d3Var.S = i0.a.f(1.0f, this.f11471b, this.f11472c);
                d3Var.h();
                return;
            case 1:
                z20 z20Var = (z20) this.d;
                z20Var.L = this.f11471b;
                z20Var.M = this.f11472c;
                z20Var.F.setColorFilter(new PorterDuffColorFilter(z20Var.L, PorterDuff.Mode.MULTIPLY));
                z20Var.E.setColor(z20Var.L);
                z20Var.f33123r.setColor(z20Var.M);
                z20Var.J.d(i0.a.o(z20Var.M, 38));
                return;
            case 2:
                xv0 xv0Var = (xv0) this.d;
                qu0[] qu0VarArr = xv0Var.f32687k0;
                xv0Var.J1.unlock();
                xv0Var.f32695o1 = false;
                int[] iArr = xv0Var.f32690m1;
                int i11 = this.f11472c;
                int i12 = this.f11471b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qu0VarArr.length; i13++) {
                    qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var != null && qu0Var.h != null && (((i10 = qu0Var.F) == 0 || xv0.r0(i10)) && (adapter = qu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xv0Var.f32707t1[0].g(false);
                        }
                        qu0VarArr[i13].f30007x.y1(iArr[i12]);
                        qu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qu0VarArr[i13].f30004r.setVisibility(8);
                    }
                }
                xv0Var.a1();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f11471b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f11472c;
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
