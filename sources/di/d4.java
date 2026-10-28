package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bk0;
public final class d4 implements Utilities.Callback4 {
    public final int f8485a;
    public final h4 f8486b;
    public final n4 f8487c;

    public d4(h4 h4Var, n4 n4Var, int i10) {
        this.f8485a = i10;
        this.f8486b = h4Var;
        this.f8487c = n4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f8485a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                q4 q4Var = this.f8486b.f8625l;
                p4 p4Var = q4Var.B2;
                x9 x9Var = (x9) p4Var.f8901c;
                if (x9Var == null) {
                    ((p9) q4Var.F1).g(false);
                    q4Var.setActive(true);
                    q4Var.J3 = false;
                    q4Var.X0 = new j2(1, runnable);
                    if (bool.booleanValue()) {
                        q4Var.d1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                x9Var.firstFrameRendered = false;
                p4Var.f8899a = false;
                x9Var.setOnReadyListener(new k2(1, currentTimeMillis, runnable));
                ((p9) q4Var.F1).g(false);
                bk0 bk0Var = q4Var.f9006o0;
                if (bk0Var != null) {
                    bk0Var.setAnimation(this.f8487c.f8833u);
                }
                if (q4Var.G2 > 0 && l4.longValue() > q4Var.G2 - 1400) {
                    l4 = 0L;
                }
                q4Var.R0(l4.longValue(), true);
                q4Var.J3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    q4Var.d1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                q4 q4Var2 = this.f8486b.f8625l;
                p4 p4Var2 = q4Var2.B2;
                x9 x9Var2 = (x9) p4Var2.f8901c;
                if (x9Var2 == null) {
                    ((p9) q4Var2.F1).g(false);
                    q4Var2.setActive(true);
                    q4Var2.J3 = false;
                    q4Var2.X0 = new j2(2, runnable2);
                    if (bool2.booleanValue()) {
                        q4Var2.d1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                x9Var2.firstFrameRendered = false;
                p4Var2.f8899a = false;
                x9Var2.setOnReadyListener(new k2(2, currentTimeMillis2, runnable2));
                ((p9) q4Var2.F1).g(false);
                bk0 bk0Var2 = q4Var2.f9006o0;
                if (bk0Var2 != null) {
                    bk0Var2.setAnimation(this.f8487c.f8833u);
                }
                if (q4Var2.G2 > 0 && l11.longValue() > q4Var2.G2 - 1400) {
                    l11 = 0L;
                }
                q4Var2.R0(l11.longValue(), true);
                q4Var2.J3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    q4Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
