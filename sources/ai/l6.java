package ai;

import ci.v8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.f60;
public final class l6 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.q0 f786a;
    public final long f787b;
    public final m6 f788c;

    public l6(m6 m6Var, org.telegram.ui.ActionBar.q0 q0Var, long j10) {
        this.f788c = m6Var;
        this.f786a = q0Var;
        this.f787b = j10;
    }

    @Override
    public final void b(int i3) {
        boolean w10;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.y0 y0Var2;
        m6 m6Var = this.f788c;
        v8 v8Var = m6Var.R1;
        if (i3 == 1) {
            f60 f60Var = m6Var.W1;
            if (f60Var != null) {
                f60Var.u();
            }
            f60 F = f60.F(m6Var.f28589c, m6Var.J0, this.f786a);
            m6Var.W1 = F;
            long e10 = h10.i(m6Var.f28583a).e();
            long j10 = this.f787b;
            if (j10 == e10) {
                w10 = true;
            } else if (j10 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.t3.w(5, hp.s1(m6Var.f28583a).M0(Long.valueOf(-j10)));
            }
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, F.f33722e, F.d, false, false);
            F.d(y0Var3);
            F.k();
            org.telegram.ui.ActionBar.y0 h = F.h();
            h.setText(bd.M0(2131750203, null));
            org.telegram.ui.ActionBar.y0 h7 = F.h();
            h7.setText(bd.M0(2131750207, null));
            org.telegram.ui.ActionBar.y0 h10 = F.h();
            h10.setText(bd.M0(2131750202, null));
            org.telegram.ui.ActionBar.y0 h11 = F.h();
            h11.setText(bd.M0(2131750204, null));
            if (w10) {
                F.k();
                org.telegram.ui.ActionBar.y0 h12 = F.h();
                h12.setText(bd.M0(2131750209, null));
                org.telegram.ui.ActionBar.y0 h13 = F.h();
                h13.setText(bd.M0(2131750208, null));
                y0Var2 = h13;
                y0Var = h12;
            } else {
                y0Var = null;
                y0Var2 = null;
            }
            k6 k6Var = new k6(this, y0Var3, h, h7, h10, h11, w10, y0Var, y0Var2);
            k6Var.run();
            y0Var3.setOnClickListener(new d(4, this, k6Var));
            u4.j(h, v8Var, k6Var, 1);
            u4.j(h7, v8Var, k6Var, 2);
            u4.j(h10, v8Var, k6Var, 4);
            u4.j(h11, v8Var, k6Var, 8);
            if (w10) {
                u4.j(y0Var, v8Var, k6Var, 256);
                u4.j(y0Var2, v8Var, k6Var, 512);
            }
            F.Y = true;
            F.J = false;
            F.f33747s = 0;
            F.Z();
        } else if (i3 == -1) {
            m6Var.dismiss();
        }
    }
}
