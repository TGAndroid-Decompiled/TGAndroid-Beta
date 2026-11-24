package defpackage;

import android.widget.FrameLayout;
import java.util.HashSet;
public final class p0a extends mz0 implements jm7 {
    public final int S1;
    public final ava T1;
    public final HashSet U1;
    public final f84 V1;
    public final FrameLayout W1;
    public final b61 X1;
    public bu5 Y1;
    public final kz4 Z1;
    public final kz4 a2;
    public l7c b2;
    public iq5 c2;
    public boolean d2;
    public int e2;

    public p0a(org.telegram.ui.ActionBar.d r20, long r21, int r23, defpackage.h71 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0a.<init>(org.telegram.ui.ActionBar.d, long, int, h71):void");
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 18), this.J0);
        this.b2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131750182, null);
    }

    @Override
    public final wzc Y(wzc wzcVar) {
        this.c2 = gm.H0(wzcVar, false);
        Y0();
        return wzc.b;
    }

    public final void Y0() {
        this.n1.setPadding(gm.L(9.0f) + this.c2.a + this.u0, 0, gm.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        iq5 iq5Var = this.c2;
        int i = iq5Var.a;
        int i2 = this.u0;
        int i3 = iq5Var.d;
        this.W1.setPadding(i + i2, 0, iq5Var.c + i2, i3);
    }

    public final boolean Z0() {
        r59 r59Var = this.n1;
        if (r59Var != null && r59Var.H) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                if (r59Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.I3 && (l7cVar = this.b2) != null) {
            l7cVar.O(true);
            if (Z0()) {
                this.T1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.I3);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            kz4 kz4Var = this.Z1;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.c6, this.J0));
            }
            kz4 kz4Var2 = this.a2;
            if (kz4Var2 != null) {
                kz4Var2.a(cmb.v0(cmb.Z6, this.J0));
            }
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
