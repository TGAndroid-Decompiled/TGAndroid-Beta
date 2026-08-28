package fh;

import android.animation.ValueAnimator;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
public final class k6 implements q0.a {
    public final int f6591a;
    public final Object f6592b;

    public k6(Object obj, int i9) {
        this.f6591a = i9;
        this.f6592b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i9 = this.f6591a;
        boolean z10 = true;
        Object obj2 = this.f6592b;
        switch (i9) {
            case 0:
                u6 u6Var = (u6) obj2;
                if (((n2.g) obj).f18319a == 0) {
                    AndroidUtilities.runOnUIThread(new j6(u6Var, 1));
                    return;
                }
                return;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i10 = ((n2.g) obj).f18319a;
                if (i10 != 0) {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new gh.u5(callback2, z10, responseCodeString, 0));
                return;
            case 2:
                kh.g6.a0((ya) obj2, (Integer) obj);
                return;
            case 3:
                mh.c3 c3Var = (mh.c3) obj2;
                Float f10 = (Float) obj;
                c3Var.f17780y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(gr.f28844f);
                    duration.addUpdateListener(new mh.x1(c3Var, 1));
                    duration.addListener(new mh.x(c3Var, 1));
                    duration.start();
                    return;
                }
                return;
            case 4:
                mh.g4 g4Var = (mh.g4) obj2;
                Float f11 = (Float) obj;
                g4Var.E.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(gr.f28844f);
                    duration2.addUpdateListener(new mh.x3(g4Var, 0));
                    duration2.addListener(new mh.x(g4Var, 2));
                    duration2.start();
                    g4Var.K();
                    return;
                }
                return;
            case 5:
                ((of.m) obj2).N.z4(((Float) obj).floatValue());
                return;
            default:
                ((xf.u) obj2).h(((Integer) obj).intValue());
                return;
        }
    }
}
