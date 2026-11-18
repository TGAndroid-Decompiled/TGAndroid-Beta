package bi;

import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.y60;
public final class j8 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.r0 f3767a;
    public final long f3768b;
    public final k8 f3769c;

    public j8(k8 k8Var, org.telegram.ui.ActionBar.r0 r0Var, long j3) {
        this.f3769c = k8Var;
        this.f3767a = r0Var;
        this.f3768b = j3;
    }

    @Override
    public final void b(int i7) {
        boolean w10;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.z0 z0Var2;
        k8 k8Var = this.f3769c;
        di.o8 o8Var = k8Var.U1;
        if (i7 == 1) {
            y60 y60Var = k8Var.Z1;
            if (y60Var != null) {
                y60Var.v();
            }
            y60 G = y60.G(k8Var.f30193c, k8Var.J0, this.f3767a);
            k8Var.Z1 = G;
            long e10 = j10.i(k8Var.f30187a).e();
            long j3 = this.f3768b;
            if (j3 == e10) {
                w10 = true;
            } else if (j3 >= 0) {
                w10 = false;
            } else {
                w10 = org.telegram.messenger.v3.w(5, mp.u1(k8Var.f30187a).O0(Long.valueOf(-j3)));
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, G.f42349e, G.d, false, false);
            G.d(z0Var3);
            G.k();
            org.telegram.ui.ActionBar.z0 h = G.h();
            h.setText(gd.M0(2131750179, null));
            org.telegram.ui.ActionBar.z0 h7 = G.h();
            h7.setText(gd.M0(2131750183, null));
            org.telegram.ui.ActionBar.z0 h10 = G.h();
            h10.setText(gd.M0(2131750178, null));
            org.telegram.ui.ActionBar.z0 h11 = G.h();
            h11.setText(gd.M0(2131750180, null));
            if (w10) {
                G.k();
                org.telegram.ui.ActionBar.z0 h12 = G.h();
                h12.setText(gd.M0(2131750185, null));
                org.telegram.ui.ActionBar.z0 h13 = G.h();
                h13.setText(gd.M0(2131750184, null));
                z0Var2 = h13;
                z0Var = h12;
            } else {
                z0Var = null;
                z0Var2 = null;
            }
            i8 i8Var = new i8(this, z0Var3, h, h7, h10, h11, w10, z0Var, z0Var2);
            i8Var.run();
            z0Var3.setOnClickListener(new ai.v2(9, this, i8Var));
            p6.j(h, o8Var, i8Var, 1);
            p6.j(h7, o8Var, i8Var, 2);
            p6.j(h10, o8Var, i8Var, 4);
            p6.j(h11, o8Var, i8Var, 8);
            if (w10) {
                p6.j(z0Var, o8Var, i8Var, 256);
                p6.j(z0Var2, o8Var, i8Var, 512);
            }
            G.f42345b0 = true;
            G.J = false;
            G.f42375s = 0;
            G.a0();
        } else if (i7 == -1) {
            k8Var.dismiss();
        }
    }
}
