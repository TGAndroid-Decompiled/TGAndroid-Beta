package ai;

import android.widget.FrameLayout;
import ci.v8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class m6 extends ma implements cs {
    public final int Q1;
    public final v8 R1;
    public final HashSet S1;
    public final hy T1;
    public final FrameLayout U1;
    public final gi.d V1;
    public f60 W1;
    public final si.c X1;
    public final si.c Y1;
    public f41 Z1;
    public i0.b f826a2;
    public boolean f827b2;
    public int c2;

    public m6(org.telegram.ui.ActionBar.d2 r21, long r22, int r24, ai.g3 r25) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m6.<init>(org.telegram.ui.ActionBar.d2, long, int, ai.g3):void");
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, false, new c(this, 9), this.J0);
        this.Z1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131750257, null);
    }

    @Override
    public final r0.k1 b0(r0.k1 k1Var) {
        this.f826a2 = org.telegram.messenger.g0.I0(k1Var, false);
        d1();
        return r0.k1.f54025b;
    }

    public final void d1() {
        this.f36102l1.setPadding(org.telegram.messenger.g0.L(9.0f) + this.f826a2.f14495a + this.f28618u0, 0, org.telegram.messenger.g0.L(9.0f) + this.f826a2.f14497c + this.f28618u0, this.f826a2.d);
        i0.b bVar = this.f826a2;
        int i3 = bVar.f14495a;
        int i10 = this.f28618u0;
        this.U1.setPadding(i3 + i10, 0, bVar.f14497c + i10, bVar.d);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.G3 && (f41Var = this.Z1) != null) {
            f41Var.O(true);
            if (e1()) {
                this.R1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        hs.f(this.f28583a).n(this, hs.G3);
        super.dismiss();
    }

    public final boolean e1() {
        tj0 tj0Var = this.f36102l1;
        if (tj0Var != null && tj0Var.H) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                if (tj0Var.getChildAt(i3) instanceof iz) {
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
            si.c cVar = this.X1;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.J0));
            }
            si.c cVar2 = this.Y1;
            if (cVar2 != null) {
                cVar2.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0));
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.J0);
            if (this.f827b2 && w02 == this.c2) {
                return;
            }
            this.f827b2 = true;
            this.c2 = w02;
            v0(w02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
