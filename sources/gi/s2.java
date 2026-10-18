package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.z20;
public final class s2 extends AnimatorListenerAdapter {
    public final int f11447a;
    public final int f11448b;
    public final int f11449c;
    public final KeyEvent.Callback d;

    public s2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f11447a = i12;
        this.d = callback;
        this.f11448b = i10;
        this.f11449c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.g0 adapter;
        switch (this.f11447a) {
            case 0:
                d3 d3Var = (d3) this.d;
                d3Var.R = i0.a.f(1.0f, this.f11448b, this.f11449c);
                d3Var.h();
                return;
            case 1:
                z20 z20Var = (z20) this.d;
                z20Var.L = this.f11448b;
                z20Var.M = this.f11449c;
                z20Var.F.setColorFilter(new PorterDuffColorFilter(z20Var.L, PorterDuff.Mode.MULTIPLY));
                z20Var.E.setColor(z20Var.L);
                z20Var.f32821r.setColor(z20Var.M);
                z20Var.J.d(i0.a.o(z20Var.M, 38));
                return;
            case 2:
                sv0 sv0Var = (sv0) this.d;
                lu0[] lu0VarArr = sv0Var.f30371k0;
                sv0Var.I1.unlock();
                sv0Var.f30379o1 = false;
                int[] iArr = sv0Var.f30374m1;
                int i11 = this.f11449c;
                int i12 = this.f11448b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < lu0VarArr.length; i13++) {
                    lu0 lu0Var = lu0VarArr[i13];
                    if (lu0Var != null && lu0Var.h != null && (((i10 = lu0Var.F) == 0 || sv0.q0(i10)) && (adapter = lu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            sv0Var.f30391t1[0].g(false);
                        }
                        lu0VarArr[i13].f28342x.y1(iArr[i12]);
                        lu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(lu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        lu0VarArr[i13].f28339r.setVisibility(8);
                    }
                }
                sv0Var.Z0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f11448b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f11449c;
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
