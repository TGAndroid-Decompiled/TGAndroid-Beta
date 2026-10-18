package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xj0;
public final class c4 implements Utilities.Callback4 {
    public final int f5215a;
    public final g4 f5216b;
    public final m4 f5217c;

    public c4(g4 g4Var, m4 m4Var, int i10) {
        this.f5215a = i10;
        this.f5216b = g4Var;
        this.f5217c = m4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5215a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                p4 p4Var = this.f5216b.f5357l;
                o4 o4Var = p4Var.M2;
                y9 y9Var = (y9) o4Var.f5629c;
                if (y9Var == null) {
                    ((q9) p4Var.Q1).g(false);
                    p4Var.setActive(true);
                    p4Var.U3 = false;
                    p4Var.f5672i1 = new j2(1, runnable);
                    if (bool.booleanValue()) {
                        p4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                y9Var.firstFrameRendered = false;
                o4Var.f5627a = false;
                y9Var.setOnReadyListener(new k2(1, currentTimeMillis, runnable));
                ((q9) p4Var.Q1).g(false);
                xj0 xj0Var = p4Var.f5724z0;
                if (xj0Var != null) {
                    xj0Var.setAnimation(this.f5217c.f5549u);
                }
                if (p4Var.R2 > 0 && l4.longValue() > p4Var.R2 - 1400) {
                    l4 = 0L;
                }
                p4Var.T0(l4.longValue(), true);
                p4Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    p4Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                p4 p4Var2 = this.f5216b.f5357l;
                o4 o4Var2 = p4Var2.M2;
                y9 y9Var2 = (y9) o4Var2.f5629c;
                if (y9Var2 == null) {
                    ((q9) p4Var2.Q1).g(false);
                    p4Var2.setActive(true);
                    p4Var2.U3 = false;
                    p4Var2.f5672i1 = new j2(2, runnable2);
                    if (bool2.booleanValue()) {
                        p4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                y9Var2.firstFrameRendered = false;
                o4Var2.f5627a = false;
                y9Var2.setOnReadyListener(new k2(2, currentTimeMillis2, runnable2));
                ((q9) p4Var2.Q1).g(false);
                xj0 xj0Var2 = p4Var2.f5724z0;
                if (xj0Var2 != null) {
                    xj0Var2.setAnimation(this.f5217c.f5549u);
                }
                if (p4Var2.R2 > 0 && l11.longValue() > p4Var2.R2 - 1400) {
                    l11 = 0L;
                }
                p4Var2.T0(l11.longValue(), true);
                p4Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    p4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
