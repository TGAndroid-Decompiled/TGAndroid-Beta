package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.ha0;
public final class d5 implements q0.a {
    public final int f4907a;
    public final Object f4908b;

    public d5(Object obj, int i10) {
        this.f4907a = i10;
        this.f4908b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f4907a;
        boolean z10 = false;
        Object obj2 = this.f4908b;
        switch (i10) {
            case 0:
                q6.a0((mb) obj2, (Integer) obj);
                return;
            case 1:
                ei.l3 l3Var = (ei.l3) obj2;
                Float f7 = (Float) obj;
                l3Var.f9183y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(tr.f31147f);
                    duration.addUpdateListener(new ei.e2(l3Var, 1));
                    duration.addListener(new ai.b(l3Var, 21));
                    duration.start();
                    return;
                }
                return;
            case 2:
                ei.r4 r4Var = (ei.r4) obj2;
                Float f10 = (Float) obj;
                r4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(tr.f31147f);
                    duration2.addUpdateListener(new ei.i4(r4Var, 0));
                    duration2.addListener(new ai.b(r4Var, 22));
                    duration2.start();
                    r4Var.J();
                    return;
                }
                return;
            case 3:
                ((gg.m) obj2).R.I4(((Float) obj).floatValue());
                return;
            case 4:
                ((pg.u) obj2).h(((Integer) obj).intValue());
                return;
            case 5:
                xh.z4 z4Var = (xh.z4) obj2;
                if (((c5.h) obj).f4204a == 0) {
                    AndroidUtilities.runOnUIThread(new xh.p4(z4Var, 1));
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).f4204a;
                if (i11 == 0) {
                    z10 = true;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new ha0(callback2, z10, responseCodeString, 13));
                return;
        }
    }
}
