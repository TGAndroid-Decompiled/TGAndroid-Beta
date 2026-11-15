package bi;

import di.l8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.m60;
public final class d6 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.q0 f3446a;
    public final long f3447b;
    public final e6 f3448c;

    public d6(e6 e6Var, org.telegram.ui.ActionBar.q0 q0Var, long j3) {
        this.f3448c = e6Var;
        this.f3446a = q0Var;
        this.f3447b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        e6 e6Var = this.f3448c;
        l8 l8Var = e6Var.U1;
        if (i7 == 1) {
            m60 m60Var = e6Var.Z1;
            if (m60Var != null) {
                m60Var.u();
            }
            m60 F = m60.F(e6Var.f29685c, e6Var.J0, this.f3446a);
            e6Var.Z1 = F;
            long e10 = m10.i(e6Var.f29679a).e();
            long j3 = this.f3447b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.t3.w(5, np.s1(e6Var.f29679a).M0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, F.f37086e, F.d, false, false);
            F.d(z0Var3);
            F.k();
            org.telegram.ui.ActionBar.z0 h = F.h();
            h.setText(hd.M0(2131750195, null));
            org.telegram.ui.ActionBar.z0 h7 = F.h();
            h7.setText(hd.M0(2131750199, null));
            org.telegram.ui.ActionBar.z0 h10 = F.h();
            h10.setText(hd.M0(2131750194, null));
            org.telegram.ui.ActionBar.z0 h11 = F.h();
            h11.setText(hd.M0(2131750196, null));
            if (w10) {
                F.k();
                org.telegram.ui.ActionBar.z0 h12 = F.h();
                h12.setText(hd.M0(2131750201, null));
                org.telegram.ui.ActionBar.z0 h13 = F.h();
                h13.setText(hd.M0(2131750200, null));
                z0Var2 = h13;
                z0Var = h12;
            } else {
                z0Var = null;
                z0Var2 = null;
            }
            c6 c6Var = new c6(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
            c6Var.run();
            z0Var3.setOnClickListener(new ai.v2(6, this, c6Var));
            i4.j(h, l8Var, c6Var, 1);
            i4.j(h7, l8Var, c6Var, 2);
            i4.j(h10, l8Var, c6Var, 4);
            i4.j(h11, l8Var, c6Var, 8);
            if (w10) {
                i4.j(z0Var, l8Var, c6Var, 256);
                i4.j(z0Var2, l8Var, c6Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f37111s = 0;
            F.Z();
        } else if (i7 == -1) {
            e6Var.dismiss();
        }
    }
}
