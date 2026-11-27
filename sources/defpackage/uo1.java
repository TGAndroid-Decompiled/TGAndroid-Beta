package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.a;
public final class uo1 implements ce8, nr7, fd {
    public final byte a;
    public final zu1 b;

    public uo1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        zu1 zu1Var = this.b;
        l2d Q6 = zu1Var.Q6(l2dVar);
        mq5 H0 = hl.H0(Q6, false);
        int i = H0.a;
        int i2 = H0.c;
        if (zu1Var.Cb != i || zu1Var.Db != i2) {
            zu1Var.Cb = i;
            zu1Var.Db = i2;
            zu1Var.m1.requestLayout();
        }
        zu1Var.w.j(Q6);
        zc zcVar = zu1Var.Z3;
        if (zcVar != null) {
            zcVar.setPadding(i, 0, i2, 0);
        }
        zu1Var.z5();
        zu1Var.D5();
        zu1Var.P7();
        boolean p = Q6.a.p(8);
        if (zu1Var.Bb != p) {
            zu1Var.Bb = p;
            zu1Var.m1.R();
        }
        ir1 ir1Var = zu1Var.F1;
        if (ir1Var != null) {
            ihc.b(ir1Var, Q6);
        }
        return l2d.b;
    }

    @Override
    public final void a(float[] fArr) {
        zu1 zu1Var = this.b;
        fArr[1] = zu1Var.A0.getBottom() - zu1Var.Ya;
        fArr[0] = (zu1Var.A0.getTop() + zu1Var.P9) - hl.L(4.0f);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 2:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    zu1Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                sr1 sr1Var = zu1Var.E0;
                if (sr1Var != null) {
                    sr1Var.callOnClick();
                    return;
                }
                return;
            case 4:
                zu1Var.finishFragment();
                return;
            default:
                zu1Var.presentFragment(new o7c(6, null));
                return;
        }
    }
}
