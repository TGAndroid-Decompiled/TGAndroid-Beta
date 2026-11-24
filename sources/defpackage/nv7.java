package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
public final class nv7 extends px3 {
    public final int D1;
    public final xv7 E1;

    public nv7(xv7 xv7Var, Context context, rk5 rk5Var, int i) {
        super(rk5Var, context, false, false);
        this.E1 = xv7Var;
        this.D1 = i;
    }

    @Override
    public final boolean D0(Integer num) {
        tv7 tv7Var = this.E1.H0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < tv7Var.getChildCount(); i2++) {
                if (tv7Var.getChildAt(i2) instanceof g29) {
                    i++;
                }
            }
            int f = oc7.r1(this.a).l4.x1.f();
            dy0 dy0Var = this.c;
            if (i >= f && !z8c.h(this.a).p()) {
                String G = jb6.G(oc7.r1(this.a).l4.y1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    dy0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new c41(dy0Var, this.J0).I(2131624211, jb6.M0(2131748956, null), gm.N2(G, cmb.Wc, 0, new bi3(this, (byte) 24), this.J0)).k(true);
                return false;
            } else if (i >= oc7.r1(this.a).l4.y1.f()) {
                try {
                    dy0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new c41(dy0Var, this.J0).I(2131623982, jb6.M0(2131748735, "LimitReached"), jb6.G(oc7.r1(this.a).l4.y1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean E0(java.lang.Integer r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv7.E0(java.lang.Integer):boolean");
    }

    @Override
    public final boolean F0(Runnable runnable) {
        v9b v9bVar = ((z8b) this.E1).u2;
        Activity activity = v9bVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    v9bVar.z2 = (bm3) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                v9bVar.z2 = (bm3) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void k0() {
        this.E1.R0(this.D1);
    }
}
