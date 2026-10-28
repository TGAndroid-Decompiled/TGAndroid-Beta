package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.uu0;
public final class b3 extends AnimatorListenerAdapter {
    public final int f12891a;
    public final int f12892b;
    public final int f12893c;
    public final KeyEvent.Callback d;

    public b3(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f12891a = i12;
        this.d = callback;
        this.f12892b = i10;
        this.f12893c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f12891a) {
            case 0:
                m3 m3Var = (m3) this.d;
                m3Var.S = i0.a.f(1.0f, this.f12892b, this.f12893c);
                m3Var.h();
                return;
            case 1:
                b30 b30Var = (b30) this.d;
                b30Var.L = this.f12892b;
                b30Var.M = this.f12893c;
                b30Var.F.setColorFilter(new PorterDuffColorFilter(b30Var.L, PorterDuff.Mode.MULTIPLY));
                b30Var.E.setColor(b30Var.L);
                b30Var.f26719r.setColor(b30Var.M);
                b30Var.J.d(i0.a.o(b30Var.M, 38));
                return;
            case 2:
                bw0 bw0Var = (bw0) this.d;
                uu0[] uu0VarArr = bw0Var.m0;
                bw0Var.L1.unlock();
                bw0Var.f26974q1 = false;
                int[] iArr = bw0Var.f26969o1;
                int i11 = this.f12893c;
                int i12 = this.f12892b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < uu0VarArr.length; i13++) {
                    uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var != null && uu0Var.h != null && (((i10 = uu0Var.E) == 0 || bw0.w0(i10)) && (adapter = uu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            bw0Var.f26986v1[0].g(false);
                        }
                        uu0VarArr[i13].f33471w.z1(iArr[i12]);
                        uu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(uu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        uu0VarArr[i13].f33468n.setVisibility(8);
                    }
                }
                bw0Var.d1();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f12892b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f12893c;
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
