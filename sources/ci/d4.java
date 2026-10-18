package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xj0;
public final class d4 implements Utilities.Callback4 {
    public final int f5318a;
    public final h4 f5319b;
    public final n4 f5320c;

    public d4(h4 h4Var, n4 n4Var, int i10) {
        this.f5318a = i10;
        this.f5319b = h4Var;
        this.f5320c = n4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5318a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                q4 q4Var = this.f5319b.f5464l;
                p4 p4Var = q4Var.M2;
                z9 z9Var = (z9) p4Var.f5730c;
                if (z9Var == null) {
                    ((r9) q4Var.Q1).g(false);
                    q4Var.setActive(true);
                    q4Var.U3 = false;
                    q4Var.f5792i1 = new k2(1, runnable);
                    if (bool.booleanValue()) {
                        q4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                z9Var.firstFrameRendered = false;
                p4Var.f5728a = false;
                z9Var.setOnReadyListener(new l2(1, currentTimeMillis, runnable));
                ((r9) q4Var.Q1).g(false);
                xj0 xj0Var = q4Var.f5844z0;
                if (xj0Var != null) {
                    xj0Var.setAnimation(this.f5320c.f5650u);
                }
                if (q4Var.R2 > 0 && l4.longValue() > q4Var.R2 - 1400) {
                    l4 = 0L;
                }
                q4Var.T0(l4.longValue(), true);
                q4Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    q4Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                q4 q4Var2 = this.f5319b.f5464l;
                p4 p4Var2 = q4Var2.M2;
                z9 z9Var2 = (z9) p4Var2.f5730c;
                if (z9Var2 == null) {
                    ((r9) q4Var2.Q1).g(false);
                    q4Var2.setActive(true);
                    q4Var2.U3 = false;
                    q4Var2.f5792i1 = new k2(2, runnable2);
                    if (bool2.booleanValue()) {
                        q4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                z9Var2.firstFrameRendered = false;
                p4Var2.f5728a = false;
                z9Var2.setOnReadyListener(new l2(2, currentTimeMillis2, runnable2));
                ((r9) q4Var2.Q1).g(false);
                xj0 xj0Var2 = q4Var2.f5844z0;
                if (xj0Var2 != null) {
                    xj0Var2.setAnimation(this.f5320c.f5650u);
                }
                if (q4Var2.R2 > 0 && l11.longValue() > q4Var2.R2 - 1400) {
                    l11 = 0L;
                }
                q4Var2.T0(l11.longValue(), true);
                q4Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    q4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
