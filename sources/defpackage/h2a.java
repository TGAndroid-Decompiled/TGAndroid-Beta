package defpackage;

import android.widget.FrameLayout;
import java.util.HashSet;
public final class h2a extends ny0 implements fn7 {
    public final int S1;
    public final axa T1;
    public final HashSet U1;
    public final q74 V1;
    public final FrameLayout W1;
    public final c51 X1;
    public fu5 Y1;
    public final oz4 Z1;
    public final oz4 a2;
    public l9c b2;
    public mq5 c2;
    public boolean d2;
    public int e2;

    public h2a(org.telegram.ui.ActionBar.e r20, long r21, int r23, defpackage.i61 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2a.<init>(org.telegram.ui.ActionBar.e, long, int, i61):void");
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, false, new hj8(this, (byte) 18), this.J0);
        this.b2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131750208, null);
    }

    @Override
    public final l2d Y(l2d l2dVar) {
        this.c2 = hl.H0(l2dVar, false);
        Z0();
        return l2d.b;
    }

    public final void Z0() {
        this.n1.setPadding(hl.L(9.0f) + this.c2.a + this.u0, 0, hl.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        mq5 mq5Var = this.c2;
        int i = mq5Var.a;
        int i2 = this.u0;
        int i3 = mq5Var.d;
        this.W1.setPadding(i + i2, 0, mq5Var.c + i2, i3);
    }

    public final boolean a1() {
        d79 d79Var = this.n1;
        if (d79Var != null && d79Var.H) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                if (d79Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.I3 && (l9cVar = this.b2) != null) {
            l9cVar.O(true);
            if (a1()) {
                this.T1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        jn7.f(this.a).n(this, jn7.I3);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            oz4 oz4Var = this.Z1;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.d6, this.J0));
            }
            oz4 oz4Var2 = this.a2;
            if (oz4Var2 != null) {
                oz4Var2.a(aob.v0(aob.a7, this.J0));
            }
            int v0 = aob.v0(aob.a7, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
