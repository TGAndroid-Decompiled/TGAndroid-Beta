package cg;

import android.animation.ValueAnimator;
import kh.e6;
import kh.u5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import ph.c5;
import ph.h9;
import ph.j2;
import rh.h3;
import rh.o3;
import rh.q2;
public final class o implements q0.a {
    public final int f2486a;
    public final Object f2487b;

    public o(Object obj, int i10) {
        this.f2486a = i10;
        this.f2487b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f2486a;
        boolean z4 = true;
        Object obj2 = this.f2487b;
        switch (i10) {
            case 0:
                ((y) obj2).h(((Integer) obj).intValue());
                return;
            case 1:
                e6 e6Var = (e6) obj2;
                if (((p2.h) obj).f40993a == 0) {
                    AndroidUtilities.runOnUIThread(new u5(e6Var, 1));
                    return;
                }
                return;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((p2.h) obj).f40993a;
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
                q2 q2Var = (q2) obj2;
                Float f10 = (Float) obj;
                q2Var.f43710y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(nr.f27346f);
                    duration.addUpdateListener(new rh.q1(q2Var, 1));
                    duration.addListener(new j2(q2Var, 9));
                    duration.start();
                    return;
                }
                return;
            case 5:
                o3 o3Var = (o3) obj2;
                Float f11 = (Float) obj;
                o3Var.F.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(nr.f27346f);
                    duration2.addUpdateListener(new h3(o3Var, 0));
                    duration2.addListener(new j2(o3Var, 10));
                    duration2.start();
                    o3Var.K();
                    return;
                }
                return;
            default:
                ((tf.k) obj2).O.z4(((Float) obj).floatValue());
                return;
        }
    }
}
