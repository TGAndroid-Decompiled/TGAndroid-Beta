package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.ma0;
public final class c5 implements q0.a {
    public final int f6704a;
    public final Object f6705b;

    public c5(Object obj, int i10) {
        this.f6704a = i10;
        this.f6705b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f6704a;
        boolean z10 = false;
        Object obj2 = this.f6705b;
        switch (i10) {
            case 0:
                o6.a0((mb) obj2, (Integer) obj);
                return;
            case 1:
                fi.k3 k3Var = (fi.k3) obj2;
                Float f7 = (Float) obj;
                k3Var.f9383y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(es.f24771f);
                    duration.addUpdateListener(new fi.d2(k3Var, 1));
                    duration.addListener(new ah.b(k3Var, 24));
                    duration.start();
                    return;
                }
                return;
            case 2:
                fi.q4 q4Var = (fi.q4) obj2;
                Float f10 = (Float) obj;
                q4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(es.f24771f);
                    duration2.addUpdateListener(new fi.i4(q4Var, 0));
                    duration2.addListener(new ah.b(q4Var, 25));
                    duration2.start();
                    q4Var.O();
                    return;
                }
                return;
            case 3:
                ((hg.m) obj2).R.w4(((Float) obj).floatValue());
                return;
            case 4:
                ((qg.u) obj2).h(((Integer) obj).intValue());
                return;
            case 5:
                yh.x4 x4Var = (yh.x4) obj2;
                if (((c5.i) obj).f4381a == 0) {
                    AndroidUtilities.runOnUIThread(new yh.n4(x4Var, 1));
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.i) obj).f4381a;
                if (i11 == 0) {
                    z10 = true;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new ma0(callback2, z10, responseCodeString, 16));
                return;
        }
    }
}
