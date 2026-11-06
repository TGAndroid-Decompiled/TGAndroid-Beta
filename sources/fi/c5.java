package fi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hc;
public final class c5 extends k2 {
    public final o5 A1;
    public final int f11730z1;

    public c5(o5 o5Var, Context context, g5 g5Var, int i7) {
        super(context, g5Var, false, false);
        this.A1 = o5Var;
        this.f11730z1 = i7;
    }

    @Override
    public final boolean I0(Integer num) {
        j5 j5Var = this.A1.A0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < j5Var.getChildCount(); i10++) {
                if (j5Var.getChildAt(i10) instanceof tg.q1) {
                    i7++;
                }
            }
            int i11 = qp.s1(this.f28613a).f24850o5;
            org.telegram.ui.ActionBar.l2 l2Var = this.f28619c;
            if (i7 >= i11 && !p10.i(this.f28613a).q()) {
                String G = hd.G(qp.s1(this.f28613a).f24859p5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    l2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new hc(l2Var, this.I0).I(2131624216, hd.M0(2131749198, null), org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.k6.Uc, 0, new di.s7(this, 17), this.I0)).k(true);
                return false;
            } else if (i7 >= qp.s1(this.f28613a).f24859p5) {
                try {
                    l2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new hc(l2Var, this.I0).I(2131623981, hd.M0(2131748977, "LimitReached"), hd.G(qp.s1(this.f28613a).f24859p5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean J0(Integer num) {
        o5 o5Var = this.A1;
        j5 j5Var = o5Var.A0;
        boolean z9 = false;
        if (o5Var.G1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= j5Var.getChildCount()) {
                    break;
                } else if (j5Var.getChildAt(i7) instanceof tg.l2) {
                    z9 = true;
                    break;
                } else {
                    i7++;
                }
            }
            return !z9;
        }
        return true;
    }

    @Override
    public final boolean K0(Runnable runnable) {
        va vaVar = ((x9) this.A1).f13102j2;
        Activity activity = vaVar.f12938b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    vaVar.f13015y2 = (bg.m0) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                vaVar.f13015y2 = (bg.m0) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void n0() {
        this.A1.O0(this.f11730z1);
    }
}
