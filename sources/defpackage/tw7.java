package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
public final class tw7 extends zw3 {
    public final int D1;
    public final dx7 E1;

    public tw7(dx7 dx7Var, Context context, uk5 uk5Var, int i) {
        super(uk5Var, context, false, false);
        this.E1 = dx7Var;
        this.D1 = i;
    }

    @Override
    public final boolean E0(Integer num) {
        zw7 zw7Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < zw7Var.getChildCount(); i2++) {
                if (zw7Var.getChildAt(i2) instanceof s39) {
                    i++;
                }
            }
            int f = uc7.s1(this.a).k4.F1.f();
            ex0 ex0Var = this.c;
            if (i >= f && !yac.h(this.a).p()) {
                String G = ob6.G(uc7.s1(this.a).k4.G1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    ex0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new d31(ex0Var, this.J0).I(2131624211, ob6.M0(2131748953, null), hl.N2(G, aob.Xc, 0, new zg3(this, (byte) 28), this.J0)).k(true);
                return false;
            } else if (i >= uc7.s1(this.a).k4.G1.f()) {
                try {
                    ex0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new d31(ex0Var, this.J0).I(2131623982, ob6.M0(2131748732, "LimitReached"), ob6.G(uc7.s1(this.a).k4.G1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean F0(java.lang.Integer r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw7.F0(java.lang.Integer):boolean");
    }

    @Override
    public final boolean G0(Runnable runnable) {
        rbb rbbVar = ((vab) this.E1).o2;
        Activity activity = rbbVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    rbbVar.z2 = (hl3) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                rbbVar.z2 = (hl3) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void k0() {
        this.E1.Q0(this.D1);
    }
}
