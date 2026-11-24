package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.a;
public final class eo1 implements ru1, fi4, la8, no7, ed {
    public final byte a;
    public final mu1 b;

    public eo1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        mu1 mu1Var = this.b;
        vxc H6 = mu1Var.H6(vxcVar);
        io5 H0 = gl.H0(H6, false);
        int i = H0.a;
        int i2 = H0.c;
        if (mu1Var.rb != i || mu1Var.sb != i2) {
            mu1Var.rb = i;
            mu1Var.sb = i2;
            mu1Var.m1.requestLayout();
        }
        mu1Var.w.j(H6);
        yc ycVar = mu1Var.Z3;
        if (ycVar != null) {
            ycVar.setPadding(i, 0, i2, 0);
        }
        mu1Var.s5();
        mu1Var.w5();
        mu1Var.F7();
        boolean p = H6.a.p(8);
        if (mu1Var.qb != p) {
            mu1Var.qb = p;
            mu1Var.m1.R();
        }
        vq1 vq1Var = mu1Var.F1;
        if (vq1Var != null) {
            jdc.b(vq1Var, H6);
        }
        return vxc.b;
    }

    @Override
    public final void a(float[] fArr) {
        mu1 mu1Var = this.b;
        fArr[1] = mu1Var.A0.getBottom() - mu1Var.Ya;
        fArr[0] = (mu1Var.A0.getTop() + mu1Var.P9) - gl.L(4.0f);
    }

    @Override
    public final boolean run() {
        mu1 mu1Var = this.b;
        if (mu1Var.h == null && !mu1Var.P7()) {
            return false;
        }
        return true;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 4:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    mu1Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                mu1Var.presentFragment(new p3c(6, null));
                return;
        }
    }
}
