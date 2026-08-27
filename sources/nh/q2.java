package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.zs0;

public final class q2 extends AnimatorListenerAdapter {

    public final int f18901a;

    public final int f18902b;

    public final int f18903c;
    public final KeyEvent.Callback d;

    public q2(KeyEvent.Callback callback, int i10, int i11, int i12) {
        this.f18901a = i12;
        this.d = callback;
        this.f18902b = i10;
        this.f18903c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        f2.q0 adapter;
        switch (this.f18901a) {
            case 0:
                b3 b3Var = (b3) this.d;
                b3Var.N = i0.b.d(1.0f, this.f18902b, this.f18903c);
                b3Var.h();
                break;
            case 1:
                e20 e20Var = (e20) this.d;
                e20Var.H = this.f18902b;
                e20Var.I = this.f18903c;
                e20Var.B.setColorFilter(new PorterDuffColorFilter(e20Var.H, PorterDuff.Mode.MULTIPLY));
                e20Var.A.setColor(e20Var.H);
                e20Var.f27937r.setColor(e20Var.I);
                e20Var.F.d(i0.b.k(e20Var.I, 38));
                break;
            case 2:
                hu0 hu0Var = (hu0) this.d;
                zs0[] zs0VarArr = hu0Var.f29122g0;
                hu0Var.E1.unlock();
                hu0Var.f29131k1 = false;
                int[] iArr = hu0Var.f29127i1;
                int i11 = this.f18903c;
                int i12 = this.f18902b;
                iArr[i12] = i11;
                for (int i13 = 0; i13 < zs0VarArr.length; i13++) {
                    zs0 zs0Var = zs0VarArr[i13];
                    if (zs0Var != null && zs0Var.h != null && (((i10 = zs0Var.B) == 0 || hu0.p0(i10)) && (adapter = zs0VarArr[i13].h.getAdapter()) != null)) {
                        int iH = adapter.h();
                        if (i13 == 0) {
                            hu0Var.f29140p1[0].g(false);
                        }
                        zs0VarArr[i13].f35343x.y1(iArr[i12]);
                        zs0VarArr[i13].h.a0();
                        if (adapter.h() == iH) {
                            AndroidUtilities.updateVisibleRows(zs0VarArr[i13].h);
                        } else {
                            adapter.l();
                        }
                        zs0VarArr[i13].f35340r.setVisibility(8);
                    }
                }
                hu0Var.X0();
                break;
            default:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                int i14 = this.f18902b;
                tVar.f33906z0 = i14;
                tVar.A0 = i14;
                int i15 = this.f18903c;
                tVar.B0 = i15;
                tVar.P.setColor(i15);
                if (tVar.O > 0.0f) {
                    tVar.invalidate();
                }
                break;
        }
    }
}
