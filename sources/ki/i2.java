package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.r10;
public final class i2 extends AnimatorListenerAdapter {
    public final int f18718a;
    public final int f18719b;
    public final int f18720c;
    public final KeyEvent.Callback d;

    public i2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.f18718a = i11;
        this.d = callback;
        this.f18719b = i7;
        this.f18720c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.i0 adapter;
        switch (this.f18718a) {
            case 0:
                t2 t2Var = (t2) this.d;
                t2Var.T = i0.a.f(1.0f, this.f18719b, this.f18720c);
                t2Var.l();
                return;
            case 1:
                r10 r10Var = (r10) this.d;
                r10Var.M = this.f18719b;
                r10Var.N = this.f18720c;
                r10Var.G.setColorFilter(new PorterDuffColorFilter(r10Var.M, PorterDuff.Mode.MULTIPLY));
                r10Var.F.setColor(r10Var.M);
                r10Var.f38977r.setColor(r10Var.N);
                r10Var.K.d(i0.a.o(r10Var.N, 38));
                return;
            case 2:
                gt0 gt0Var = (gt0) this.d;
                bs0[] bs0VarArr = gt0Var.f35609n0;
                gt0Var.M1.e();
                gt0Var.f35622r1 = false;
                int[] iArr = gt0Var.f35615p1;
                int i10 = this.f18720c;
                int i11 = this.f18719b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < bs0VarArr.length; i12++) {
                    bs0 bs0Var = bs0VarArr[i12];
                    if (bs0Var != null && bs0Var.h != null && (((i7 = bs0Var.F) == 0 || gt0.z0(i7)) && (adapter = bs0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            gt0Var.f35636w1[0].g(false);
                        }
                        bs0VarArr[i12].f33775x.y1(iArr[i11]);
                        bs0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(bs0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        bs0VarArr[i12].f33771n.setVisibility(8);
                    }
                }
                gt0Var.j1();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.f18719b;
                yVar.E0 = i13;
                yVar.F0 = i13;
                int i14 = this.f18720c;
                yVar.G0 = i14;
                yVar.U.setColor(i14);
                if (yVar.T > 0.0f) {
                    yVar.invalidate();
                    return;
                }
                return;
        }
    }
}
