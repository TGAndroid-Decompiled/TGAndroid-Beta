package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.ys0;
public final class p2 extends AnimatorListenerAdapter {
    public final int f14869a;
    public final int f14870b;
    public final int f14871c;
    public final KeyEvent.Callback d;

    public p2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.f14869a = i11;
        this.d = callback;
        this.f14870b = i7;
        this.f14871c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.g0 adapter;
        switch (this.f14869a) {
            case 0:
                a3 a3Var = (a3) this.d;
                a3Var.S = i0.a.f(1.0f, this.f14870b, this.f14871c);
                a3Var.l();
                return;
            case 1:
                g10 g10Var = (g10) this.d;
                g10Var.L = this.f14870b;
                g10Var.M = this.f14871c;
                g10Var.F.setColorFilter(new PorterDuffColorFilter(g10Var.L, PorterDuff.Mode.MULTIPLY));
                g10Var.E.setColor(g10Var.L);
                g10Var.f33739r.setColor(g10Var.M);
                g10Var.J.d(i0.a.o(g10Var.M, 38));
                return;
            case 2:
                ys0 ys0Var = (ys0) this.d;
                tr0[] tr0VarArr = ys0Var.m0;
                ys0Var.L1.e();
                ys0Var.f40699q1 = false;
                int[] iArr = ys0Var.f40693o1;
                int i10 = this.f14871c;
                int i11 = this.f14870b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.E) == 0 || ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.f40713v1[0].g(false);
                        }
                        tr0VarArr[i12].f38390x.y1(iArr[i11]);
                        tr0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(tr0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        tr0VarArr[i12].f38386n.setVisibility(8);
                    }
                }
                ys0Var.j1();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.f14870b;
                yVar.D0 = i13;
                yVar.E0 = i13;
                int i14 = this.f14871c;
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
