package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.KeyEvent;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.u10;
public final class h2 extends AnimatorListenerAdapter {
    public final int f18731a;
    public final int f18732b;
    public final int f18733c;
    public final KeyEvent.Callback d;

    public h2(KeyEvent.Callback callback, int i7, int i10, int i11) {
        this.f18731a = i11;
        this.d = callback;
        this.f18732b = i7;
        this.f18733c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        v4.i0 adapter;
        switch (this.f18731a) {
            case 0:
                s2 s2Var = (s2) this.d;
                s2Var.T = i0.a.f(1.0f, this.f18732b, this.f18733c);
                s2Var.l();
                return;
            case 1:
                u10 u10Var = (u10) this.d;
                u10Var.M = this.f18732b;
                u10Var.N = this.f18733c;
                u10Var.G.setColorFilter(new PorterDuffColorFilter(u10Var.M, PorterDuff.Mode.MULTIPLY));
                u10Var.F.setColor(u10Var.M);
                u10Var.f40198r.setColor(u10Var.N);
                u10Var.K.d(i0.a.o(u10Var.N, 38));
                return;
            case 2:
                jt0 jt0Var = (jt0) this.d;
                ds0[] ds0VarArr = jt0Var.f36650n0;
                jt0Var.M1.e();
                jt0Var.f36663r1 = false;
                int[] iArr = jt0Var.f36656p1;
                int i10 = this.f18733c;
                int i11 = this.f18732b;
                iArr[i11] = i10;
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || jt0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            jt0Var.f36677w1[0].g(false);
                        }
                        ds0VarArr[i12].f34565x.y1(iArr[i11]);
                        ds0VarArr[i12].h.a0();
                        if (adapter.b() == b10) {
                            org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                        } else {
                            adapter.f();
                        }
                        ds0VarArr[i12].f34561n.setVisibility(8);
                    }
                }
                jt0Var.j1();
                return;
            default:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                int i13 = this.f18732b;
                yVar.E0 = i13;
                yVar.F0 = i13;
                int i14 = this.f18733c;
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
