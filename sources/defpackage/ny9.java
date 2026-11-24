package defpackage;

import android.widget.FrameLayout;
import java.util.HashSet;
public final class ny9 extends fy0 implements gk7 {
    public final int S1;
    public final xsa T1;
    public final HashSet U1;
    public final w64 V1;
    public final FrameLayout W1;
    public final u41 X1;
    public cs5 Y1;
    public final ix4 Z1;
    public final ix4 a2;
    public l5c b2;
    public io5 c2;
    public boolean d2;
    public int e2;

    public ny9(org.telegram.ui.ActionBar.d r20, long r21, int r23, defpackage.a61 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny9.<init>(org.telegram.ui.ActionBar.d, long, int, a61):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 18), this.J0);
        this.b2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131750233, null);
    }

    @Override
    public final vxc Y(vxc vxcVar) {
        this.c2 = gl.H0(vxcVar, false);
        Y0();
        return vxc.b;
    }

    public final void Y0() {
        this.n1.setPadding(gl.L(9.0f) + this.c2.a + this.u0, 0, gl.L(9.0f) + this.c2.c + this.u0, this.c2.d);
        io5 io5Var = this.c2;
        int i = io5Var.a;
        int i2 = this.u0;
        int i3 = io5Var.d;
        this.W1.setPadding(i + i2, 0, io5Var.c + i2, i3);
    }

    public final boolean Z0() {
        o39 o39Var = this.n1;
        if (o39Var != null && o39Var.H) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                if (o39Var.getChildAt(i) instanceof pi4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i == kk7.H3 && (l5cVar = this.b2) != null) {
            l5cVar.O(true);
            if (Z0()) {
                this.T1.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        kk7.f(this.a).n(this, kk7.H3);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            ix4 ix4Var = this.Z1;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.c6, this.J0));
            }
            ix4 ix4Var2 = this.a2;
            if (ix4Var2 != null) {
                ix4Var2.a(bkb.v0(bkb.Z6, this.J0));
            }
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (this.d2 && v0 == this.e2) {
                return;
            }
            this.d2 = true;
            this.e2 = v0;
            s0(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
