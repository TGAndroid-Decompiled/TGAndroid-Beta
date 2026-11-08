package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xs0;
public final class p2 extends AnimatorListenerAdapter {
    public final int f14867a;
    public final int f14868b;
    public final int f14869c;
    public final KeyEvent.Callback d;

    public p2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.f14867a = i11;
        this.d = callback;
        this.f14868b = i7;
        this.f14869c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.g0 adapter;
        switch (this.f14867a) {
            case 0:
                a3 a3Var = (a3) this.d;
                a3Var.S = i0.a.f(1.0f, this.f14868b, this.f14869c);
                a3Var.l();
                return;
            case 1:
                h10 h10Var = (h10) this.d;
                h10Var.L = this.f14868b;
                h10Var.M = this.f14869c;
                h10Var.F.setColorFilter(new PorterDuffColorFilter(h10Var.L, PorterDuff.Mode.MULTIPLY));
                h10Var.E.setColor(h10Var.L);
                h10Var.f34076r.setColor(h10Var.M);
                h10Var.J.d(i0.a.o(h10Var.M, 38));
                return;
            case 2:
                xs0 xs0Var = (xs0) this.d;
                sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.L1.e();
                xs0Var.f40441q1 = false;
                int[] iArr = xs0Var.f40435o1;
                int i10 = this.f14869c;
                int i11 = this.f14868b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < sr0VarArr.length; i12++) {
                    sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var != null && sr0Var.h != null && (((i7 = sr0Var.E) == 0 || xs0.z0(i7)) && (adapter = sr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            xs0Var.f40455v1[0].g(false);
                        }
                        sr0VarArr[i12].f38130x.y1(iArr[i11]);
                        sr0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(sr0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        sr0VarArr[i12].f38126n.setVisibility(8);
                    }
                }
                xs0Var.h1();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.f14868b;
                yVar.D0 = i13;
                yVar.E0 = i13;
                int i14 = this.f14869c;
                yVar.F0 = i14;
                yVar.T.setColor(i14);
                if (yVar.S > 0.0f) {
                    yVar.invalidate();
                    return;
                }
                return;
        }
    }
}
