package gh;

import android.animation.ValueAnimator;
import lh.h9;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

public final class c6 implements q0.a {

    public final int f7186a;

    public final Object f7187b;

    public c6(Object obj, int i10) {
        this.f7186a = i10;
        this.f7187b = obj;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f7186a;
        int i11 = 0;
        Object obj2 = this.f7187b;
        switch (i10) {
            case 0:
                m6 m6Var = (m6) obj2;
                if (((n2.g) obj).f18147a == 0) {
                    AndroidUtilities.runOnUIThread(new b6(m6Var, 1));
                }
                break;
            case 1:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i12 = ((n2.g) obj).f18147a;
                boolean z10 = i12 == 0;
                String responseCodeString = z10 ? null : BillingController.getResponseCodeString(i12);
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new hh.t5(callback2, z10, responseCodeString, i11));
                break;
            case 2:
                lh.f6.a0((va) obj2, (Integer) obj);
                break;
            case 3:
                nh.b3 b3Var = (nh.b3) obj2;
                Float f10 = (Float) obj;
                b3Var.f18601y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(er.f28122f);
                    duration.addUpdateListener(new nh.w1(b3Var, 1));
                    duration.addListener(new h9(b3Var, 3));
                    duration.start();
                }
                break;
            case 4:
                nh.e4 e4Var = (nh.e4) obj2;
                Float f11 = (Float) obj;
                e4Var.E.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(er.f28122f);
                    duration2.addUpdateListener(new nh.v3(e4Var, 0));
                    duration2.addListener(new h9(e4Var, 4));
                    duration2.start();
                    e4Var.L();
                }
                break;
            case 5:
                ((pf.k) obj2).N.z4(((Float) obj).floatValue());
                break;
            default:
                ((yf.u) obj2).h(((Integer) obj).intValue());
                break;
        }
    }
}
