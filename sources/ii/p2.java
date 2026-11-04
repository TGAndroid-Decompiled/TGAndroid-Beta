package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.ws0;
public final class p2 extends AnimatorListenerAdapter {
    public final int f15141a;
    public final int f15142b;
    public final int f15143c;
    public final KeyEvent.Callback d;

    public p2(KeyEvent.Callback callback, int i3, int i10, int i11) {
        this.f15141a = i11;
        this.d = callback;
        this.f15142b = i3;
        this.f15143c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        u4.h0 adapter;
        switch (this.f15141a) {
            case 0:
                a3 a3Var = (a3) this.d;
                a3Var.T = i0.a.f(1.0f, this.f15142b, this.f15143c);
                a3Var.l();
                return;
            case 1:
                d10 d10Var = (d10) this.d;
                d10Var.M = this.f15142b;
                d10Var.N = this.f15143c;
                d10Var.G.setColorFilter(new PorterDuffColorFilter(d10Var.M, PorterDuff.Mode.MULTIPLY));
                d10Var.F.setColor(d10Var.M);
                d10Var.f32898r.setColor(d10Var.N);
                d10Var.K.d(i0.a.o(d10Var.N, 38));
                return;
            case 2:
                ws0 ws0Var = (ws0) this.d;
                rr0[] rr0VarArr = ws0Var.f40108n0;
                ws0Var.M1.e();
                ws0Var.f40122r1 = false;
                int[] iArr = ws0Var.f40115p1;
                int i10 = this.f15143c;
                int i11 = this.f15142b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < rr0VarArr.length; i12++) {
                    rr0 rr0Var = rr0VarArr[i12];
                    if (rr0Var != null && rr0Var.h != null && (((i3 = rr0Var.F) == 0 || ws0.z0(i3)) && (adapter = rr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ws0Var.f40136w1[0].g(false);
                        }
                        rr0VarArr[i12].f37791x.y1(iArr[i11]);
                        rr0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.b4(rr0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        rr0VarArr[i12].f37787n.setVisibility(8);
                    }
                }
                ws0Var.h1();
                return;
            default:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.d;
                int i13 = this.f15142b;
                rVar.E0 = i13;
                rVar.F0 = i13;
                int i14 = this.f15143c;
                rVar.G0 = i14;
                rVar.U.setColor(i14);
                if (rVar.T > 0.0f) {
                    rVar.invalidate();
                    return;
                }
                return;
        }
    }
}
