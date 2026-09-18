package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lj0;
public final class q5 implements Utilities.Callback4 {
    public final int f1423a;
    public final w5 f1424b;
    public final c6 f1425c;

    public q5(w5 w5Var, c6 c6Var, int i10) {
        this.f1423a = i10;
        this.f1424b = w5Var;
        this.f1425c = c6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f1423a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                f6 f6Var = this.f1424b.f1658l;
                e6 e6Var = f6Var.M2;
                ic icVar = (ic) e6Var.f766c;
                if (icVar == null) {
                    ((ac) f6Var.Q1).g(false);
                    f6Var.setActive(true);
                    f6Var.U3 = false;
                    f6Var.f823i1 = new n3(1, runnable);
                    if (bool.booleanValue()) {
                        f6Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                icVar.firstFrameRendered = false;
                e6Var.f764a = false;
                icVar.setOnReadyListener(new o3(1, currentTimeMillis, runnable));
                ((ac) f6Var.Q1).g(false);
                lj0 lj0Var = f6Var.f874z0;
                if (lj0Var != null) {
                    lj0Var.setAnimation(this.f1425c.f644u);
                }
                if (f6Var.R2 > 0 && l4.longValue() > f6Var.R2 - 1400) {
                    l4 = 0L;
                }
                f6Var.T0(l4.longValue(), true);
                f6Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    f6Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                f6 f6Var2 = this.f1424b.f1658l;
                e6 e6Var2 = f6Var2.M2;
                ic icVar2 = (ic) e6Var2.f766c;
                if (icVar2 == null) {
                    ((ac) f6Var2.Q1).g(false);
                    f6Var2.setActive(true);
                    f6Var2.U3 = false;
                    f6Var2.f823i1 = new n3(2, runnable2);
                    if (bool2.booleanValue()) {
                        f6Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                icVar2.firstFrameRendered = false;
                e6Var2.f764a = false;
                icVar2.setOnReadyListener(new o3(2, currentTimeMillis2, runnable2));
                ((ac) f6Var2.Q1).g(false);
                lj0 lj0Var2 = f6Var2.f874z0;
                if (lj0Var2 != null) {
                    lj0Var2.setAnimation(this.f1425c.f644u);
                }
                if (f6Var2.R2 > 0 && l11.longValue() > f6Var2.R2 - 1400) {
                    l11 = 0L;
                }
                f6Var2.T0(l11.longValue(), true);
                f6Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    f6Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
