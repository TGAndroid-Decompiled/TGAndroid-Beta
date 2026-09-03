package dg;

import android.animation.ValueAnimator;
import lh.e6;
import lh.u5;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import qh.a5;
import qh.e9;
import qh.i2;
import sh.g3;
import sh.n3;
import sh.p2;
public final class o implements q0.a {
    public final int f4621a;
    public final Object f4622b;

    public o(Object obj, int i10) {
        this.f4621a = i10;
        this.f4622b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f4621a;
        boolean z4 = true;
        Object obj2 = this.f4622b;
        switch (i10) {
            case 0:
                ((y) obj2).h(((Integer) obj).intValue());
                return;
            case 1:
                e6 e6Var = (e6) obj2;
                if (((p2.h) obj).f44176a == 0) {
                    AndroidUtilities.runOnUIThread(new u5(e6Var, 1));
                    return;
                }
                return;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((p2.h) obj).f44176a;
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
                a5.a0((e9) obj2, (Integer) obj);
                return;
            case 4:
                p2 p2Var = (p2) obj2;
                Float f10 = (Float) obj;
                p2Var.f47650y.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(pr.f30168f);
                    duration.addUpdateListener(new sh.p1(p2Var, 1));
                    duration.addListener(new i2(p2Var, 9));
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
                    duration2.setInterpolator(pr.f30168f);
                    duration2.addUpdateListener(new g3(n3Var, 0));
                    duration2.addListener(new i2(n3Var, 10));
                    duration2.start();
                    n3Var.K();
                    return;
                }
                return;
            default:
                ((uf.k) obj2).O.z4(((Float) obj).floatValue());
                return;
        }
    }
}
