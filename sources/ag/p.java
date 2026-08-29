package ag;

import android.animation.ValueAnimator;
import ih.e6;
import ih.u5;
import jh.r5;
import nh.ja;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.cc1;
import ph.g3;
import ph.n3;
import ph.p2;
public final class p implements q0.a {
    public final int f625a;
    public final Object f626b;

    public p(Object obj, int i10) {
        this.f625a = i10;
        this.f626b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f625a;
        boolean z10 = true;
        Object obj2 = this.f626b;
        switch (i10) {
            case 0:
                ((z) obj2).h(((Integer) obj).intValue());
                return;
            case 1:
                e6 e6Var = (e6) obj2;
                if (((p2.g) obj).f45457a == 0) {
                    AndroidUtilities.runOnUIThread(new u5(e6Var, 1));
                    return;
                }
                return;
            case 2:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((p2.g) obj).f45457a;
                if (i11 != 0) {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new r5(callback2, z10, responseCodeString, 0));
                return;
            case 3:
                t5.a0((ja) obj2, (Integer) obj);
                return;
            case 4:
                p2 p2Var = (p2) obj2;
                Float f9 = (Float) obj;
                p2Var.f45989y.setLoadProgressAnimated(f9.floatValue());
                if (f9.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(jr.f29800f);
                    duration.addUpdateListener(new ph.p1(p2Var, 1));
                    duration.addListener(new cc1(p2Var, 8));
                    duration.start();
                    return;
                }
                return;
            case 5:
                n3 n3Var = (n3) obj2;
                Float f10 = (Float) obj;
                n3Var.E.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(jr.f29800f);
                    duration2.addUpdateListener(new g3(n3Var, 0));
                    duration2.addListener(new cc1(n3Var, 9));
                    duration2.start();
                    n3Var.K();
                    return;
                }
                return;
            default:
                ((rf.l) obj2).N.z4(((Float) obj).floatValue());
                return;
        }
    }
}
