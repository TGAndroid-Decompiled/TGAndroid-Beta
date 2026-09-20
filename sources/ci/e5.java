package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.ka0;
public final class e5 implements q0.a {
    public final int f4598a;
    public final Object f4599b;

    public e5(Object obj, int i10) {
        this.f4598a = i10;
        this.f4599b = obj;
    }

    @Override
    public final void accept(Object obj) {
        String responseCodeString;
        int i10 = this.f4598a;
        boolean z10 = false;
        Object obj2 = this.f4599b;
        switch (i10) {
            case 0:
                r6.a0((qb) obj2, (Integer) obj);
                return;
            case 1:
                ei.k3 k3Var = (ei.k3) obj2;
                Float f7 = (Float) obj;
                k3Var.f8458y.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(qr.f27642f);
                    duration.addUpdateListener(new ei.d2(k3Var, 1));
                    duration.addListener(new ai.b(k3Var, 21));
                    duration.start();
                    return;
                }
                return;
            case 2:
                ei.q4 q4Var = (ei.q4) obj2;
                Float f10 = (Float) obj;
                q4Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(qr.f27642f);
                    duration2.addUpdateListener(new ei.h4(q4Var, 0));
                    duration2.addListener(new ai.b(q4Var, 22));
                    duration2.start();
                    q4Var.L();
                    return;
                }
                return;
            case 3:
                ((gg.m) obj2).R.z4(((Float) obj).floatValue());
                return;
            case 4:
                ((pg.u) obj2).h(((Integer) obj).intValue());
                return;
            case 5:
                xh.z4 z4Var = (xh.z4) obj2;
                if (((c5.h) obj).f3895a == 0) {
                    AndroidUtilities.runOnUIThread(new xh.p4(z4Var, 1));
                    return;
                }
                return;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj2;
                int i11 = ((c5.h) obj).f3895a;
                if (i11 == 0) {
                    z10 = true;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                FileLog.d("StarsController.buy onResult " + z10 + " " + responseCodeString);
                AndroidUtilities.runOnUIThread(new ka0(callback2, z10, responseCodeString, 13));
                return;
        }
    }
}
