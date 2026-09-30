package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.v20;
public final class y2 extends AnimatorListenerAdapter {
    public final int f8744a;
    public final int f8745b;
    public final int f8746c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f8744a = i12;
        this.d = callback;
        this.f8745b = i10;
        this.f8746c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f8744a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f8745b, this.f8746c);
                k3Var.h();
                return;
            case 1:
                v20 v20Var = (v20) this.d;
                v20Var.L = this.f8745b;
                v20Var.M = this.f8746c;
                v20Var.F.setColorFilter(new PorterDuffColorFilter(v20Var.L, PorterDuff.Mode.MULTIPLY));
                v20Var.E.setColor(v20Var.L);
                v20Var.f28999r.setColor(v20Var.M);
                v20Var.J.d(i0.a.k(v20Var.M, 38));
                return;
            case 2:
                mv0 mv0Var = (mv0) this.d;
                fu0[] fu0VarArr = mv0Var.f26425k0;
                mv0Var.I1.unlock();
                mv0Var.f26433o1 = false;
                int[] iArr = mv0Var.f26428m1;
                int i11 = this.f8746c;
                int i12 = this.f8745b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < fu0VarArr.length; i13++) {
                    fu0 fu0Var = fu0VarArr[i13];
                    if (fu0Var != null && fu0Var.h != null && (((i10 = fu0Var.F) == 0 || mv0.p0(i10)) && (adapter = fu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            mv0Var.f26445t1[0].g(false);
                        }
                        fu0VarArr[i13].f24359x.y1(iArr[i12]);
                        fu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(fu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        fu0VarArr[i13].f24356r.setVisibility(8);
                    }
                }
                mv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f8745b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f8746c;
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
