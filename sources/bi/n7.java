package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
public final class n7 implements q0.a {
    public final int f5132a;
    public final Object f5133b;

    public n7(Object obj, int i10) {
        this.f5132a = i10;
        this.f5133b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f5132a;
        boolean z10 = true;
        Object obj2 = this.f5133b;
        switch (i10) {
            case 0:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((d5.i) obj).f7985a;
                if (i11 != 0) {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new u7(callback2, z10, responseCodeString, 0));
                return;
            case 1:
                fi.e6.Y((fi.ta) obj2, (Integer) obj);
                return;
            case 2:
                hi.m3 m3Var = (hi.m3) obj2;
                Float f7 = (Float) obj;
                m3Var.E.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(ds.f27586f);
                    duration.addUpdateListener(new hi.f2(m3Var, 1));
                    duration.addListener(new bh.b(m3Var, 28));
                    duration.start();
                    return;
                }
                return;
            case 3:
                hi.o4 o4Var = (hi.o4) obj2;
                Float f10 = (Float) obj;
                o4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(ds.f27586f);
                    duration2.addUpdateListener(new hi.g4(o4Var, 0));
                    duration2.addListener(new bh.b(o4Var, 29));
                    duration2.start();
                    o4Var.O();
                    return;
                }
                return;
            case 4:
                ((ig.n) obj2).R.H4(((Float) obj).floatValue());
                return;
            case 5:
                ((rg.v) obj2).h(((Integer) obj).intValue());
                return;
            default:
                zh.y4 y4Var = (zh.y4) obj2;
                if (((d5.i) obj).f7985a == 0) {
                    AndroidUtilities.runOnUIThread(new zh.o4(y4Var, 1));
                    return;
                }
                return;
        }
    }
}
