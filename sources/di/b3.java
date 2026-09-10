package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.iv0;
public final class b3 extends AnimatorListenerAdapter {
    public final int f6542a;
    public final int f6543b;
    public final int f6544c;
    public final KeyEvent.Callback d;

    public b3(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f6542a = i12;
        this.d = callback;
        this.f6543b = i10;
        this.f6544c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f6542a) {
            case 0:
                n3 n3Var = (n3) this.d;
                n3Var.R = i0.a.d(1.0f, this.f6543b, this.f6544c);
                n3Var.h();
                return;
            case 1:
                a30 a30Var = (a30) this.d;
                a30Var.L = this.f6543b;
                a30Var.M = this.f6544c;
                a30Var.F.setColorFilter(new PorterDuffColorFilter(a30Var.L, PorterDuff.Mode.MULTIPLY));
                a30Var.E.setColor(a30Var.L);
                a30Var.f21371r.setColor(a30Var.M);
                a30Var.J.d(i0.a.k(a30Var.M, 38));
                return;
            case 2:
                iv0 iv0Var = (iv0) this.d;
                au0[] au0VarArr = iv0Var.f24107k0;
                iv0Var.I1.unlock();
                iv0Var.f24115o1 = false;
                int[] iArr = iv0Var.f24110m1;
                int i11 = this.f6544c;
                int i12 = this.f6543b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < au0VarArr.length; i13++) {
                    au0 au0Var = au0VarArr[i13];
                    if (au0Var != null && au0Var.h != null && (((i10 = au0Var.F) == 0 || iv0.p0(i10)) && (adapter = au0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            iv0Var.f24127t1[0].g(false);
                        }
                        au0VarArr[i13].f21598x.y1(iArr[i12]);
                        au0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(au0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        au0VarArr[i13].f21595r.setVisibility(8);
                    }
                }
                iv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f6543b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f6544c;
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
