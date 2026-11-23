package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
public final class j5 extends r2 {
    public final int E1;
    public final v5 F1;

    public j5(v5 v5Var, Context context, n5 n5Var, int i7) {
        super(context, n5Var, false, false);
        this.F1 = v5Var;
        this.E1 = i7;
    }

    @Override
    public final boolean J0(Integer num) {
        q5 q5Var = this.F1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < q5Var.getChildCount(); i10++) {
                if (q5Var.getChildAt(i10) instanceof tg.v1) {
                    i7++;
                }
            }
            int i11 = mp.u1(this.f30223a).f25845r5;
            org.telegram.ui.ActionBar.m2 m2Var = this.f30229c;
            if (i7 >= i11 && !i10.i(this.f30223a).q()) {
                String G = gd.G(mp.u1(this.f30223a).s5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.kc(m2Var, this.J0).I(2131624217, gd.N0(2131749006, null), org.telegram.messenger.g0.R2(G, org.telegram.ui.ActionBar.n6.Xc, 0, new w(this, 5), this.J0)).k(true);
                return false;
            } else if (i7 >= mp.u1(this.f30223a).s5) {
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.kc(m2Var, this.J0).I(2131623982, gd.N0(2131748785, "LimitReached"), gd.G(mp.u1(this.f30223a).s5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean K0(java.lang.Integer r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.j5.K0(java.lang.Integer):boolean");
    }

    @Override
    public final boolean L0(Runnable runnable) {
        nb nbVar = ((pa) this.F1).f15198o2;
        Activity activity = nbVar.f15058b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    nbVar.f15138z2 = (ai.u0) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                nbVar.f15138z2 = (ai.u0) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void n0() {
        this.F1.R0(this.E1);
    }
}
