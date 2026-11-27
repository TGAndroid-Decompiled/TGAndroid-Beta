package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class e10 implements Runnable {
    public final byte a;
    public final j20 b;
    public final r47 c;
    public final fu5 d;

    public e10(j20 j20Var, fu5 fu5Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.d = fu5Var;
        this.c = r47Var;
    }

    @Override
    public final void run() {
        ArrayList t;
        TLRPC.TL_document tL_document;
        String a0;
        byte b = this.a;
        fu5 fu5Var = this.d;
        r47 r47Var = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.M0(r47Var, true, new d10(j20Var, fu5Var, (byte) 4), false);
                return;
            case 1:
                long e = yac.h(j20Var.a).e();
                int i = yac.t0;
                int i2 = j20Var.a;
                if (i != i2) {
                    j20Var.z2.N0(i2);
                }
                if (r47Var.e1() < 0) {
                    if (r47Var.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) r47Var.F0();
                        t = null;
                    }
                    fu5Var.u();
                    bs2.v(null, 2131753902, new d31((FrameLayout) j20Var.b, j20Var.J0), 2131624185, 36);
                    return;
                }
                t = qd4.t(r47Var);
                tL_document = null;
                int i3 = j20Var.a;
                if (t != null) {
                    r7a.B(i3).p0(t, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    r7a B = r7a.B(i3);
                    p7a e2 = p7a.e(tL_document, null, r47Var.k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, j20Var.p2, false);
                    e = e;
                    B.q0(e2);
                }
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    d31 b0 = d31.b0(Q);
                    if (e == yac.h(j20Var.a).e()) {
                        a0 = ob6.M0(2131750459, null);
                    } else if (e > 0) {
                        a0 = ob6.a0(null, null, 2131750458, wf3.s(e));
                    } else {
                        a0 = ob6.a0(null, null, 2131750463, wf3.s(e));
                    }
                    b0.Q(2131624029, 36, a0).j();
                }
                fu5Var.u();
                bs2.v(null, 2131753902, new d31((FrameLayout) j20Var.b, j20Var.J0), 2131624185, 36);
                return;
            case 2:
                j20Var.L0(r47Var);
                fu5Var.u();
                return;
            case 3:
                fu5Var.u();
                j20Var.H0(r47Var);
                return;
            case 4:
                fu5Var.u();
                j20Var.Q0(r47Var);
                return;
            case 5:
                j20Var.M0(r47Var, false, new e10(j20Var, r47Var, fu5Var, (byte) 8), false);
                return;
            case 6:
                fu5Var.u();
                j20Var.H0(r47Var);
                return;
            case 7:
                fu5Var.u();
                j20Var.Q0(r47Var);
                return;
            default:
                pc7 pc7Var = j20Var.p2;
                TLRPC.Document a = pc7Var.a();
                pc7Var.c.remove(r47Var);
                if (pc7Var.a() != a) {
                    pc7Var.e();
                }
                j20Var.q2.remove(r47Var);
                j20Var.t1.f();
                fu5Var.u();
                j20Var.P0(false);
                bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, j20Var.J0), 2131624052, 36);
                return;
        }
    }

    public e10(j20 j20Var, r47 r47Var, fu5 fu5Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = r47Var;
        this.d = fu5Var;
    }
}
