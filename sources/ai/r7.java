package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
public final class r7 implements q0.a {
    public final int f2114a;
    public final Object f2115b;

    public r7(Object obj, int i10) {
        this.f2114a = i10;
        this.f2115b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f2114a;
        boolean z10 = true;
        Object obj2 = this.f2115b;
        switch (i10) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.i) obj).f4752a;
                if (i11 != 0) {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new y7(callback2, z10, responseCodeString, 0));
                return;
            case 1:
                ei.f6.a0((ei.xa) obj2, (Integer) obj);
                return;
            case 2:
                gi.d3 d3Var = (gi.d3) obj2;
                Float f7 = (Float) obj;
                d3Var.f11166y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(bs.f25025f);
                    duration.addUpdateListener(new gi.x1(d3Var, 1));
                    duration.addListener(new ah.b(d3Var, 26));
                    duration.start();
                    return;
                }
                return;
            case 3:
                gi.f4 f4Var = (gi.f4) obj2;
                Float f10 = (Float) obj;
                f4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(bs.f25025f);
                    duration2.addUpdateListener(new gi.x3(f4Var, 0));
                    duration2.addListener(new ah.b(f4Var, 27));
                    duration2.start();
                    f4Var.O();
                    return;
                }
                return;
            case 4:
                ((hg.m) obj2).R.x4(((Float) obj).floatValue());
                return;
            case 5:
                ((qg.v) obj2).h(((Integer) obj).intValue());
                return;
            default:
                yh.x4 x4Var = (yh.x4) obj2;
                if (((c5.i) obj).f4752a == 0) {
                    AndroidUtilities.runOnUIThread(new yh.n4(x4Var, 1));
                    return;
                }
                return;
        }
    }
}
