package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.x20;
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
                x20 x20Var = (x20) this.d;
                x20Var.L = this.f11471b;
                x20Var.M = this.f11472c;
                x20Var.F.setColorFilter(new PorterDuffColorFilter(x20Var.L, PorterDuff.Mode.MULTIPLY));
                x20Var.E.setColor(x20Var.L);
                x20Var.f32489r.setColor(x20Var.M);
                x20Var.J.d(i0.a.o(x20Var.M, 38));
                return;
            case 2:
                wv0 wv0Var = (wv0) this.d;
                pu0[] pu0VarArr = wv0Var.f32386k0;
                wv0Var.J1.unlock();
                wv0Var.f32394o1 = false;
                int[] iArr = wv0Var.f32389m1;
                int i11 = this.f11472c;
                int i12 = this.f11471b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < pu0VarArr.length; i13++) {
                    pu0 pu0Var = pu0VarArr[i13];
                    if (pu0Var != null && pu0Var.h != null && (((i10 = pu0Var.F) == 0 || wv0.r0(i10)) && (adapter = pu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            wv0Var.f32406t1[0].g(false);
                        }
                        pu0VarArr[i13].f29680x.y1(iArr[i12]);
                        pu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(pu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        pu0VarArr[i13].f29677r.setVisibility(8);
                    }
                }
                wv0Var.a1();
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
