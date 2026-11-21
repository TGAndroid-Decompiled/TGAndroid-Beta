package bi;

import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yz;
public final class o8 extends sa implements fs {
    public final int T1;
    public final di.p8 U1;
    public final HashSet V1;
    public final wy W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public a70 Z1;
    public final ui.c f3979a2;
    public final ui.c f3980b2;
    public c51 f3981c2;
    public i0.b d2;
    public boolean f3982e2;
    public int f3983f2;

    public o8(org.telegram.ui.ActionBar.g2 r21, long r22, int r24, bi.h5 r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o8.<init>(org.telegram.ui.ActionBar.g2, long, int, bi.h5):void");
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30170a, 0, false, new b(this, 11), this.J0);
        this.f3981c2 = c51Var;
        c51Var.f34068r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131750232, null);
    }

    @Override
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.f56298b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ks.I3 && (c51Var = this.f3981c2) != null) {
            c51Var.O(true);
            if (f1()) {
                this.U1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        ks.f(this.f30170a).n(this, ks.I3);
        super.dismiss();
    }

    public final void e1() {
        this.f39539o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.f15914a + this.f30208u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.f15916c + this.f30208u0, this.d2.d);
        i0.b bVar = this.d2;
        int i7 = bVar.f15914a;
        int i10 = this.f30208u0;
        this.X1.setPadding(i7 + i10, 0, bVar.f15916c + i10, bVar.d);
    }

    public final boolean f1() {
        ek0 ek0Var = this.f39539o1;
        if (ek0Var != null && ek0Var.H) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                if (ek0Var.getChildAt(i7) instanceof yz) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            ui.c cVar = this.f3979a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, this.J0));
            }
            ui.c cVar2 = this.f3980b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29321a7, this.J0);
            if (this.f3982e2 && w02 == this.f3983f2) {
                return;
            }
            this.f3982e2 = true;
            this.f3983f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
