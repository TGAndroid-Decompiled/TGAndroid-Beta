package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.xu0;
public final class y2 extends AnimatorListenerAdapter {
    public final int f10140a;
    public final int f10141b;
    public final int f10142c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f10140a = i12;
        this.d = callback;
        this.f10141b = i10;
        this.f10142c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f10140a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f10141b, this.f10142c);
                k3Var.h();
                return;
            case 1:
                r20 r20Var = (r20) this.d;
                r20Var.L = this.f10141b;
                r20Var.M = this.f10142c;
                r20Var.F.setColorFilter(new PorterDuffColorFilter(r20Var.L, PorterDuff.Mode.MULTIPLY));
                r20Var.E.setColor(r20Var.L);
                r20Var.f29919r.setColor(r20Var.M);
                r20Var.J.d(i0.a.k(r20Var.M, 38));
                return;
            case 2:
                xu0 xu0Var = (xu0) this.d;
                qt0[] qt0VarArr = xu0Var.f32729k0;
                xu0Var.I1.unlock();
                xu0Var.f32737o1 = false;
                int[] iArr = xu0Var.f32732m1;
                int i11 = this.f10142c;
                int i12 = this.f10141b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.F) == 0 || xu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xu0Var.f32749t1[0].g(false);
                        }
                        qt0VarArr[i13].f29851x.y1(iArr[i12]);
                        qt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        qt0VarArr[i13].f29848r.setVisibility(8);
                    }
                }
                xu0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f10141b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f10142c;
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
