package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class b20 implements Runnable {
    public final byte a;
    public final i30 b;
    public final bu5 c;
    public final k47 d;

    public b20(i30 i30Var, bu5 bu5Var, k47 k47Var, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = bu5Var;
        this.d = k47Var;
    }

    @Override
    public final void run() {
        ArrayList u;
        TLRPC.TL_document tL_document;
        String a0;
        byte b = this.a;
        bu5 bu5Var = this.c;
        k47 k47Var = this.d;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                i30Var.G0(k47Var);
                return;
            case 1:
                bu5Var.u();
                i30Var.P0(k47Var);
                return;
            case 2:
                i30Var.L0(k47Var, false, new b20(i30Var, k47Var, bu5Var, (byte) 5), false);
                return;
            case 3:
                bu5Var.u();
                i30Var.G0(k47Var);
                return;
            case 4:
                bu5Var.u();
                i30Var.P0(k47Var);
                return;
            case 5:
                jc7 jc7Var = i30Var.p2;
                TLRPC.Document a = jc7Var.a();
                jc7Var.c.remove(k47Var);
                if (jc7Var.a() != a) {
                    jc7Var.e();
                }
                i30Var.q2.remove(k47Var);
                i30Var.t1.f();
                bu5Var.u();
                i30Var.O0(false);
                ts2.u(null, 2131753876, new c41((FrameLayout) i30Var.b, i30Var.J0), 2131624052, 36);
                return;
            case 6:
                i30Var.L0(k47Var, true, new d20(i30Var, bu5Var, (byte) 4), false);
                return;
            case 7:
                long e = z8c.h(i30Var.a).e();
                int i = z8c.t0;
                int i2 = i30Var.a;
                if (i != i2) {
                    i30Var.z2.N0(i2);
                }
                if (k47Var.e1() < 0) {
                    if (k47Var.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) k47Var.F0();
                        u = null;
                    }
                    bu5Var.u();
                    ts2.u(null, 2131753874, new c41((FrameLayout) i30Var.b, i30Var.J0), 2131624185, 36);
                    return;
                }
                u = td4.u(k47Var);
                tL_document = null;
                int i3 = i30Var.a;
                if (u != null) {
                    a6a.B(i3).p0(u, e, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    a6a B = a6a.B(i3);
                    y5a e2 = y5a.e(tL_document, null, k47Var.k.attachPath, e, null, null, null, null, null, true, 0, 0, 0, i30Var.p2, false);
                    e = e;
                    B.q0(e2);
                }
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    c41 b0 = c41.b0(Q);
                    if (e == z8c.h(i30Var.a).e()) {
                        a0 = jb6.M0(2131750431, null);
                    } else if (e > 0) {
                        a0 = jb6.a0(null, null, 2131750430, pg3.s(e));
                    } else {
                        a0 = jb6.a0(null, null, 2131750435, pg3.s(e));
                    }
                    b0.Q(2131624029, 36, a0).j();
                }
                bu5Var.u();
                ts2.u(null, 2131753874, new c41((FrameLayout) i30Var.b, i30Var.J0), 2131624185, 36);
                return;
            default:
                i30Var.K0(k47Var);
                bu5Var.u();
                return;
        }
    }

    public b20(i30 i30Var, k47 k47Var, bu5 bu5Var, byte b) {
        this.a = b;
        this.b = i30Var;
        this.d = k47Var;
        this.c = bu5Var;
    }
}
