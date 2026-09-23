package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.yu0;
public final class y2 extends AnimatorListenerAdapter {
    public final int f8733a;
    public final int f8734b;
    public final int f8735c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f8733a = i12;
        this.d = callback;
        this.f8734b = i10;
        this.f8735c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f8733a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f8734b, this.f8735c);
                k3Var.h();
                return;
            case 1:
                s20 s20Var = (s20) this.d;
                s20Var.L = this.f8734b;
                s20Var.M = this.f8735c;
                s20Var.F.setColorFilter(new PorterDuffColorFilter(s20Var.L, PorterDuff.Mode.MULTIPLY));
                s20Var.E.setColor(s20Var.L);
                s20Var.f27795r.setColor(s20Var.M);
                s20Var.J.d(i0.a.k(s20Var.M, 38));
                return;
            case 2:
                yu0 yu0Var = (yu0) this.d;
                rt0[] rt0VarArr = yu0Var.f30426k0;
                yu0Var.I1.unlock();
                yu0Var.f30434o1 = false;
                int[] iArr = yu0Var.f30429m1;
                int i11 = this.f8735c;
                int i12 = this.f8734b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.F) == 0 || yu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.f30446t1[0].g(false);
                        }
                        rt0VarArr[i13].f27731x.y1(iArr[i12]);
                        rt0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        rt0VarArr[i13].f27728r.setVisibility(8);
                    }
                }
                yu0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f8734b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f8735c;
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
