package bi;

import android.widget.FrameLayout;
import di.m8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class e6 extends ja implements is {
    public final int T1;
    public final m8 U1;
    public final HashSet V1;
    public final oy W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public m60 Z1;
    public final ui.c f3482a2;
    public final ui.c f3483b2;
    public p41 f3484c2;
    public i0.c d2;
    public boolean f3485e2;
    public int f3486f2;

    public e6(org.telegram.ui.ActionBar.e2 r21, long r22, int r24, bi.w2 r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e6.<init>(org.telegram.ui.ActionBar.e2, long, int, bi.w2):void");
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.f29679a, 0, false, new b(this, 9), this.J0);
        this.f3484c2 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131750249, null);
    }

    @Override
    public final r0.k1 b0(r0.k1 k1Var) {
        this.d2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.f55681b;
    }

    public final void d1() {
        this.f35936o1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.d2.f15574a + this.f29717u0, 0, org.telegram.messenger.g0.L(9.0f) + this.d2.f15576c + this.f29717u0, this.d2.d);
        i0.c cVar = this.d2;
        int i7 = cVar.f15574a;
        int i10 = this.f29717u0;
        this.X1.setPadding(i7 + i10, 0, cVar.f15576c + i10, cVar.d);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.G3 && (p41Var = this.f3484c2) != null) {
            p41Var.O(true);
            if (e1()) {
                this.U1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        ns.f(this.f29679a).n(this, ns.G3);
        super.dismiss();
    }

    public final boolean e1() {
        uj0 uj0Var = this.f35936o1;
        if (uj0Var != null && uj0Var.H) {
            for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
                if (uj0Var.getChildAt(i7) instanceof pz) {
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
            ui.c cVar = this.f3482a2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.J0));
            }
            ui.c cVar2 = this.f3483b2;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28792a7, this.J0);
            if (this.f3485e2 && w02 == this.f3486f2) {
                return;
            }
            this.f3485e2 = true;
            this.f3486f2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
