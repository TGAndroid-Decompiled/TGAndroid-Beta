package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aj0;
public final class s3 implements Utilities.Callback4 {
    public final int f16202a;
    public final w3 f16203b;
    public final a4 f16204c;

    public s3(w3 w3Var, a4 a4Var, int i10) {
        this.f16202a = i10;
        this.f16203b = w3Var;
        this.f16204c = a4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16202a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                d4 d4Var = this.f16203b.f16362l;
                c4 c4Var = d4Var.I2;
                h9 h9Var = c4Var.f15427b;
                if (h9Var == null) {
                    ((z8) d4Var.M1).g(false);
                    d4Var.setActive(true);
                    d4Var.Q3 = false;
                    d4Var.f15478e1 = new c2(1, runnable);
                    if (bool.booleanValue()) {
                        d4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                h9Var.firstFrameRendered = false;
                c4Var.f15430f = false;
                h9Var.setOnReadyListener(new d2(1, currentTimeMillis, runnable));
                ((z8) d4Var.M1).g(false);
                aj0 aj0Var = d4Var.f15531v0;
                if (aj0Var != null) {
                    aj0Var.setAnimation(this.f16204c.f15332u);
                }
                if (d4Var.N2 > 0 && l10.longValue() > d4Var.N2 - 1400) {
                    l10 = 0L;
                }
                d4Var.T0(l10.longValue(), true);
                d4Var.Q3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    d4Var.f1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                d4 d4Var2 = this.f16203b.f16362l;
                c4 c4Var2 = d4Var2.I2;
                h9 h9Var2 = c4Var2.f15427b;
                if (h9Var2 == null) {
                    ((z8) d4Var2.M1).g(false);
                    d4Var2.setActive(true);
                    d4Var2.Q3 = false;
                    d4Var2.f15478e1 = new c2(2, runnable2);
                    if (bool2.booleanValue()) {
                        d4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                h9Var2.firstFrameRendered = false;
                c4Var2.f15430f = false;
                h9Var2.setOnReadyListener(new d2(2, currentTimeMillis2, runnable2));
                ((z8) d4Var2.M1).g(false);
                aj0 aj0Var2 = d4Var2.f15531v0;
                if (aj0Var2 != null) {
                    aj0Var2.setAnimation(this.f16204c.f15332u);
                }
                if (d4Var2.N2 > 0 && l12.longValue() > d4Var2.N2 - 1400) {
                    l12 = 0L;
                }
                d4Var2.T0(l12.longValue(), true);
                d4Var2.Q3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    d4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
