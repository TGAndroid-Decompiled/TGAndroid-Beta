package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.u20;
public final class y2 extends AnimatorListenerAdapter {
    public final int f8735a;
    public final int f8736b;
    public final int f8737c;
    public final KeyEvent.Callback d;

    public y2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f8735a = i12;
        this.d = callback;
        this.f8736b = i10;
        this.f8737c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f8735a) {
            case 0:
                k3 k3Var = (k3) this.d;
                k3Var.R = i0.a.d(1.0f, this.f8736b, this.f8737c);
                k3Var.h();
                return;
            case 1:
                u20 u20Var = (u20) this.d;
                u20Var.L = this.f8736b;
                u20Var.M = this.f8737c;
                u20Var.F.setColorFilter(new PorterDuffColorFilter(u20Var.L, PorterDuff.Mode.MULTIPLY));
                u20Var.E.setColor(u20Var.L);
                u20Var.f28761r.setColor(u20Var.M);
                u20Var.J.d(i0.a.k(u20Var.M, 38));
                return;
            case 2:
                lv0 lv0Var = (lv0) this.d;
                eu0[] eu0VarArr = lv0Var.f26188k0;
                lv0Var.I1.unlock();
                lv0Var.f26196o1 = false;
                int[] iArr = lv0Var.f26191m1;
                int i11 = this.f8737c;
                int i12 = this.f8736b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < eu0VarArr.length; i13++) {
                    eu0 eu0Var = eu0VarArr[i13];
                    if (eu0Var != null && eu0Var.h != null && (((i10 = eu0Var.F) == 0 || lv0.p0(i10)) && (adapter = eu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            lv0Var.f26208t1[0].g(false);
                        }
                        eu0VarArr[i13].f24132x.y1(iArr[i12]);
                        eu0VarArr[i13].h.b0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(eu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        eu0VarArr[i13].f24129r.setVisibility(8);
                    }
                }
                lv0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                int i14 = this.f8736b;
                uVar.D0 = i14;
                uVar.E0 = i14;
                int i15 = this.f8737c;
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
