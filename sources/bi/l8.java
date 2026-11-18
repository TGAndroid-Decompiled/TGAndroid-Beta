package bi;

import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
public final class l8 extends sa implements fs {
    public final int T1;
    public final di.o8 U1;
    public final HashSet V1;
    public final uy W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public y60 Z1;
    public final ui.c f3850a2;
    public final ui.c f3851b2;
    public z41 f3852c2;
    public i0.b d2;
    public boolean f3853e2;
    public int f3854f2;

    public l8(org.telegram.ui.ActionBar.h2 r21, long r22, int r24, bi.e5 r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.l8.<init>(org.telegram.ui.ActionBar.h2, long, int, bi.e5):void");
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, 0, false, new b(this, 11), this.J0);
        this.f3852c2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131750233, null);
    }

    @Override
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.f56257b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 == ks.I3 && (z41Var = this.f3852c2) != null) {
            z41Var.O(true);
            if (f1()) {
                this.U1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        ks.f(this.f30189a).n(this, ks.I3);
        super.dismiss();
    }

    public final void e1() {
        this.f39534o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.f15892a + this.f30227u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.f15894c + this.f30227u0, this.d2.d);
        i0.b bVar = this.d2;
        int i7 = bVar.f15892a;
        int i10 = this.f30227u0;
        this.X1.setPadding(i7 + i10, 0, bVar.f15894c + i10, bVar.d);
    }

    public final boolean f1() {
        ck0 ck0Var = this.f39534o1;
        if (ck0Var != null && ck0Var.H) {
            for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
                if (ck0Var.getChildAt(i7) instanceof wz) {
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
            ui.c cVar = this.f3850a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, this.J0));
            }
            ui.c cVar2 = this.f3851b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29339a7, this.J0);
            if (this.f3853e2 && w02 == this.f3854f2) {
                return;
            }
            this.f3853e2 = true;
            this.f3854f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
