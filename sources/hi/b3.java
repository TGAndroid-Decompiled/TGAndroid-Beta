package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.tu0;
public final class b3 extends AnimatorListenerAdapter {
    public final int f12892a;
    public final int f12893b;
    public final int f12894c;
    public final KeyEvent.Callback d;

    public b3(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f12892a = i12;
        this.d = callback;
        this.f12893b = i10;
        this.f12894c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        s4.h0 adapter;
        switch (this.f12892a) {
            case 0:
                m3 m3Var = (m3) this.d;
                m3Var.S = i0.a.f(1.0f, this.f12893b, this.f12894c);
                m3Var.h();
                return;
            case 1:
                b30 b30Var = (b30) this.d;
                b30Var.L = this.f12893b;
                b30Var.M = this.f12894c;
                b30Var.F.setColorFilter(new PorterDuffColorFilter(b30Var.L, PorterDuff.Mode.MULTIPLY));
                b30Var.E.setColor(b30Var.L);
                b30Var.f26735r.setColor(b30Var.M);
                b30Var.J.d(i0.a.o(b30Var.M, 38));
                return;
            case 2:
                aw0 aw0Var = (aw0) this.d;
                tu0[] tu0VarArr = aw0Var.m0;
                aw0Var.L1.unlock();
                aw0Var.f26686q1 = false;
                int[] iArr = aw0Var.f26681o1;
                int i11 = this.f12894c;
                int i12 = this.f12893b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < tu0VarArr.length; i13++) {
                    tu0 tu0Var = tu0VarArr[i13];
                    if (tu0Var != null && tu0Var.h != null && (((i10 = tu0Var.E) == 0 || aw0.w0(i10)) && (adapter = tu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            aw0Var.f26698v1[0].g(false);
                        }
                        tu0VarArr[i13].f33163w.z1(iArr[i12]);
                        tu0VarArr[i13].h.a0();
                        if (adapter.h() == h) {
                            AndroidUtilities.updateVisibleRows(tu0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        tu0VarArr[i13].f33160n.setVisibility(8);
                    }
                }
                aw0Var.d1();
                return;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f12893b;
                tVar.D0 = i14;
                tVar.E0 = i14;
                int i15 = this.f12894c;
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
