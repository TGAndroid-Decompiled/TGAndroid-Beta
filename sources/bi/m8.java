package bi;

import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.a70;
public final class m8 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.q0 f3908a;
    public final long f3909b;
    public final n8 f3910c;

    public m8(n8 n8Var, org.telegram.ui.ActionBar.q0 q0Var, long j3) {
        this.f3910c = n8Var;
        this.f3908a = q0Var;
        this.f3909b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.y0 y0Var2;
        n8 n8Var = this.f3910c;
        di.p8 p8Var = n8Var.U1;
        if (i7 == 1) {
            a70 a70Var = n8Var.Z1;
            if (a70Var != null) {
                a70Var.v();
            }
            a70 G = a70.G(n8Var.f30179c, n8Var.J0, this.f3908a);
            n8Var.Z1 = G;
            long e10 = k10.i(n8Var.f30173a).e();
            long j3 = this.f3909b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.v3.w(5, np.u1(n8Var.f30173a).O0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, G.f33371e, G.d, false, false);
            G.d(y0Var3);
            G.k();
            org.telegram.ui.ActionBar.y0 h = G.h();
            h.setText(hd.N0(2131750178, null));
            org.telegram.ui.ActionBar.y0 h7 = G.h();
            h7.setText(hd.N0(2131750182, null));
            org.telegram.ui.ActionBar.y0 h10 = G.h();
            h10.setText(hd.N0(2131750177, null));
            org.telegram.ui.ActionBar.y0 h11 = G.h();
            h11.setText(hd.N0(2131750179, null));
            if (w10) {
                G.k();
                org.telegram.ui.ActionBar.y0 h12 = G.h();
                h12.setText(hd.N0(2131750184, null));
                org.telegram.ui.ActionBar.y0 h13 = G.h();
                h13.setText(hd.N0(2131750183, null));
                y0Var2 = h13;
                y0Var = h12;
            } else {
                y0Var = null;
                y0Var2 = null;
            }
            l8 l8Var = new l8(this, y0Var3, h, h7, h10, h11, w10, y0Var, y0Var2);
            l8Var.run();
            y0Var3.setOnClickListener(new ai.y2(8, this, l8Var));
            s6.j(h, p8Var, l8Var, 1);
            s6.j(h7, p8Var, l8Var, 2);
            s6.j(h10, p8Var, l8Var, 4);
            s6.j(h11, p8Var, l8Var, 8);
            if (w10) {
                s6.j(y0Var, p8Var, l8Var, 256);
                s6.j(y0Var2, p8Var, l8Var, 512);
            }
            G.f33367b0 = true;
            G.J = false;
            G.f33397s = 0;
            G.a0();
        } else if (i7 == -1) {
            n8Var.dismiss();
        }
    }
}
