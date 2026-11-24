package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.a;
public final class rp1 implements dw1, kk4, oc8, qq7, ee {
    public final byte a;
    public final yv1 b;

    public rp1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        yv1 yv1Var = this.b;
        wzc Q6 = yv1Var.Q6(wzcVar);
        iq5 H0 = gm.H0(Q6, false);
        int i = H0.a;
        int i2 = H0.c;
        if (yv1Var.zb != i || yv1Var.Ab != i2) {
            yv1Var.zb = i;
            yv1Var.Ab = i2;
            yv1Var.m1.requestLayout();
        }
        yv1Var.w.j(Q6);
        yd ydVar = yv1Var.Z3;
        if (ydVar != null) {
            ydVar.setPadding(i, 0, i2, 0);
        }
        yv1Var.A5();
        yv1Var.E5();
        yv1Var.P7();
        boolean p = Q6.a.p(8);
        if (yv1Var.yb != p) {
            yv1Var.yb = p;
            yv1Var.m1.R();
        }
        hs1 hs1Var = yv1Var.F1;
        if (hs1Var != null) {
            kfc.b(hs1Var, Q6);
        }
        return wzc.b;
    }

    @Override
    public final void a(float[] fArr) {
        yv1 yv1Var = this.b;
        fArr[1] = yv1Var.A0.getBottom() - yv1Var.Ya;
        fArr[0] = (yv1Var.A0.getTop() + yv1Var.P9) - gm.L(4.0f);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 4:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    yv1Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                yv1Var.presentFragment(new p5c(6, null));
                return;
        }
    }

    @Override
    public final boolean run() {
        yv1 yv1Var = this.b;
        if (yv1Var.h == null && !yv1Var.a8()) {
            return false;
        }
        return true;
    }
}
