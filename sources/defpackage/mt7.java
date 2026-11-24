package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
public final class mt7 extends ew3 {
    public final int D1;
    public final wt7 E1;

    public mt7(wt7 wt7Var, Context context, si5 si5Var, int i) {
        super(si5Var, context, false, false);
        this.E1 = wt7Var;
        this.D1 = i;
    }

    @Override
    public final boolean D0(Integer num) {
        st7 st7Var = this.E1.H0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < st7Var.getChildCount(); i2++) {
                if (st7Var.getChildAt(i2) instanceof e09) {
                    i++;
                }
            }
            int f = na7.q1(this.a).k4.x1.f();
            ww0 ww0Var = this.c;
            if (i >= f && !y6c.h(this.a).p()) {
                String G = k96.G(na7.q1(this.a).k4.y1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    ww0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new u21(ww0Var, this.J0).I(2131624211, k96.M0(2131749007, null), gl.N2(G, bkb.Wc, 0, new li3(this, (byte) 19), this.J0)).k(true);
                return false;
            } else if (i >= na7.q1(this.a).k4.y1.f()) {
                try {
                    ww0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new u21(ww0Var, this.J0).I(2131623982, k96.M0(2131748786, "LimitReached"), k96.G(na7.q1(this.a).k4.y1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean E0(java.lang.Integer r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt7.E0(java.lang.Integer):boolean");
    }

    @Override
    public final boolean F0(Runnable runnable) {
        t7b t7bVar = ((x6b) this.E1).u2;
        Activity activity = t7bVar.b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    t7bVar.z2 = (sm3) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                t7bVar.z2 = (sm3) runnable;
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
