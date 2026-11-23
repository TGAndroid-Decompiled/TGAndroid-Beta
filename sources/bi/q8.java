package bi;

import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.x60;
public final class q8 extends ra implements fs {
    public final int T1;
    public final di.p8 U1;
    public final HashSet V1;
    public final ty W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public x60 Z1;
    public final ui.c f4007a2;
    public final ui.c f4008b2;
    public b51 f4009c2;
    public i0.b d2;
    public boolean f4010e2;
    public int f4011f2;

    public q8(org.telegram.ui.ActionBar.g2 r21, long r22, int r24, bi.j5 r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q8.<init>(org.telegram.ui.ActionBar.g2, long, int, bi.j5):void");
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, false, new b(this, 11), this.J0);
        this.f4009c2 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131750232, null);
    }

    @Override
    public final r0.l1 b0(r0.l1 l1Var) {
        this.d2 = org.telegram.messenger.g0.I0(l1Var, false);
        e1();
        return r0.l1.f56380b;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 == ks.I3 && (b51Var = this.f4009c2) != null) {
            b51Var.O(true);
            if (f1()) {
                this.U1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        ks.f(this.f30223a).n(this, ks.I3);
        super.dismiss();
    }

    public final void e1() {
        this.f39246o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.f15978a + this.f30261u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.f15980c + this.f30261u0, this.d2.d);
        i0.b bVar = this.d2;
        int i7 = bVar.f15978a;
        int i10 = this.f30261u0;
        this.X1.setPadding(i7 + i10, 0, bVar.f15980c + i10, bVar.d);
    }

    public final boolean f1() {
        ek0 ek0Var = this.f39246o1;
        if (ek0Var != null && ek0Var.H) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                if (ek0Var.getChildAt(i7) instanceof vz) {
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
            ui.c cVar = this.f4007a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.J0));
            }
            ui.c cVar2 = this.f4008b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.J0);
            if (this.f4010e2 && w02 == this.f4011f2) {
                return;
            }
            this.f4010e2 = true;
            this.f4011f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
