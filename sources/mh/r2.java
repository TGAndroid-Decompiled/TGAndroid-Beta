package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.xs0;
public final class r2 extends AnimatorListenerAdapter {
    public final int f18075a;
    public final int f18076b;
    public final int f18077c;
    public final KeyEvent.Callback d;

    public r2(KeyEvent.Callback callback, int i9, int i10, int i11) {
        this.f18075a = i11;
        this.d = callback;
        this.f18076b = i9;
        this.f18077c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        f2.r0 adapter;
        switch (this.f18075a) {
            case 0:
                c3 c3Var = (c3) this.d;
                c3Var.N = i0.a.d(1.0f, this.f18076b, this.f18077c);
                c3Var.h();
                return;
            case 1:
                b20 b20Var = (b20) this.d;
                b20Var.H = this.f18076b;
                b20Var.I = this.f18077c;
                b20Var.B.setColorFilter(new PorterDuffColorFilter(b20Var.H, PorterDuff.Mode.MULTIPLY));
                b20Var.A.setColor(b20Var.H);
                b20Var.f26993r.setColor(b20Var.I);
                b20Var.F.d(i0.a.k(b20Var.I, 38));
                return;
            case 2:
                eu0 eu0Var = (eu0) this.d;
                xs0[] xs0VarArr = eu0Var.f28137g0;
                eu0Var.E1.unlock();
                eu0Var.f28146k1 = false;
                int[] iArr = eu0Var.f28142i1;
                int i10 = this.f18077c;
                int i11 = this.f18076b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < xs0VarArr.length; i12++) {
                    xs0 xs0Var = xs0VarArr[i12];
                    if (xs0Var != null && xs0Var.h != null && (((i9 = xs0Var.B) == 0 || eu0.p0(i9)) && (adapter = xs0VarArr[i12].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i12 == 0) {
                            eu0Var.f28155p1[0].g(false);
                        }
                        xs0VarArr[i12].f34764x.y1(iArr[i11]);
                        xs0VarArr[i12].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(xs0VarArr[i12].h);
                        } else {
                            adapter.l();
                        }
                        xs0VarArr[i12].f34761r.setVisibility(8);
                    }
                }
                eu0Var.X0();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i13 = this.f18076b;
                tVar.f33856z0 = i13;
                tVar.A0 = i13;
                int i14 = this.f18077c;
                tVar.B0 = i14;
                tVar.P.setColor(i14);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                    return;
                }
                return;
        }
    }
}
