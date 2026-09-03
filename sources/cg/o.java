package cg;

import android.animation.ValueAnimator;
import kh.d6;
import kh.t5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
import ph.c5;
import ph.h9;
import ph.j2;
import rh.g3;
import rh.n3;
import rh.p2;
public final class o implements q0.a {
    public final int f2469a;
    public final Object f2470b;

    public o(Object obj, int i10) {
        this.f2469a = i10;
        this.f2470b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f2469a;
        boolean z4 = true;
        Object obj2 = this.f2470b;
        switch (i10) {
            case 0:
                ((y) obj2).h(((Integer) obj).intValue());
                return;
            case 1:
                d6 d6Var = (d6) obj2;
                if (((p2.h) obj).f41015a == 0) {
                    AndroidUtilities.runOnUIThread(new t5(d6Var, 1));
                    return;
                }
                return;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((p2.h) obj).f41015a;
                if (i11 != 0) {
                    z4 = false;
                }
                if (z4) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z4 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new r5(callback2, z4, responseCodeString, 0));
                return;
            case 3:
                c5.a0((h9) obj2, (Integer) obj);
                return;
            case 4:
                p2 p2Var = (p2) obj2;
                Float f10 = (Float) obj;
                p2Var.f43762y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(mr.f27122f);
                    duration.addUpdateListener(new rh.p1(p2Var, 1));
                    duration.addListener(new j2(p2Var, 9));
                    duration.start();
                    return;
                }
                return;
            case 5:
                n3 n3Var = (n3) obj2;
                Float f11 = (Float) obj;
                n3Var.F.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(mr.f27122f);
                    duration2.addUpdateListener(new g3(n3Var, 0));
                    duration2.addListener(new j2(n3Var, 10));
                    duration2.start();
                    n3Var.K();
                    return;
                }
                return;
            default:
                ((tf.k) obj2).O.z4(((Float) obj).floatValue());
                return;
        }
    }
}
