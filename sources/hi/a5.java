package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.cc;
public final class a5 extends i2 {
    public final int D1;
    public final m5 E1;

    public a5(m5 m5Var, Context context, e5 e5Var, int i7) {
        super(context, e5Var, false, false);
        this.E1 = m5Var;
        this.D1 = i7;
    }

    @Override
    public final boolean I0(Integer num) {
        h5 h5Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < h5Var.getChildCount(); i10++) {
                if (h5Var.getChildAt(i10) instanceof tg.q1) {
                    i7++;
                }
            }
            int i11 = np.s1(this.f29679a).f25365p5;
            org.telegram.ui.ActionBar.k2 k2Var = this.f29685c;
            if (i7 >= i11 && !m10.i(this.f29679a).q()) {
                String G = hd.G(np.s1(this.f29679a).f25374q5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    k2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new cc(k2Var, this.J0).I(2131624217, hd.M0(2131749199, null), org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.j6.Xc, 0, new e1(this, 0), this.J0)).k(true);
                return false;
            } else if (i7 >= np.s1(this.f29679a).f25374q5) {
                try {
                    k2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new cc(k2Var, this.J0).I(2131623982, hd.M0(2131748978, "LimitReached"), hd.G(np.s1(this.f29679a).f25374q5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean J0(Integer num) {
        m5 m5Var = this.E1;
        h5 h5Var = m5Var.B0;
        boolean z10 = false;
        if (m5Var.H1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= h5Var.getChildCount()) {
                    break;
                } else if (h5Var.getChildAt(i7) instanceof tg.o2) {
                    z10 = true;
                    break;
                } else {
                    i7++;
                }
            }
            return !z10;
        }
        return true;
    }

    @Override
    public final boolean K0(Runnable runnable) {
        sa saVar = ((u9) this.E1).f15200k2;
        Activity activity = saVar.f15039b;
        if (activity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    saVar.f15119z2 = (ai.w0) runnable;
                    return false;
                }
                return true;
            } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                saVar.f15119z2 = (ai.w0) runnable;
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override
    public final void n0() {
        this.E1.O0(this.D1);
    }
}
