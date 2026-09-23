package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bj0;
public final class p5 implements Utilities.Callback4 {
    public final int f1389a;
    public final v5 f1390b;
    public final b6 f1391c;

    public p5(v5 v5Var, b6 b6Var, int i10) {
        this.f1389a = i10;
        this.f1390b = v5Var;
        this.f1391c = b6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f1389a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                e6 e6Var = this.f1390b.f1612l;
                d6 d6Var = e6Var.M2;
                ic icVar = (ic) d6Var.f713c;
                if (icVar == null) {
                    ((ac) e6Var.Q1).g(false);
                    e6Var.setActive(true);
                    e6Var.U3 = false;
                    e6Var.f796i1 = new n3(1, runnable);
                    if (bool.booleanValue()) {
                        e6Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                icVar.firstFrameRendered = false;
                d6Var.f711a = false;
                icVar.setOnReadyListener(new o3(1, currentTimeMillis, runnable));
                ((ac) e6Var.Q1).g(false);
                bj0 bj0Var = e6Var.f847z0;
                if (bj0Var != null) {
                    bj0Var.setAnimation(this.f1391c.f603u);
                }
                if (e6Var.R2 > 0 && l4.longValue() > e6Var.R2 - 1400) {
                    l4 = 0L;
                }
                e6Var.T0(l4.longValue(), true);
                e6Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    e6Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                e6 e6Var2 = this.f1390b.f1612l;
                d6 d6Var2 = e6Var2.M2;
                ic icVar2 = (ic) d6Var2.f713c;
                if (icVar2 == null) {
                    ((ac) e6Var2.Q1).g(false);
                    e6Var2.setActive(true);
                    e6Var2.U3 = false;
                    e6Var2.f796i1 = new n3(2, runnable2);
                    if (bool2.booleanValue()) {
                        e6Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                icVar2.firstFrameRendered = false;
                d6Var2.f711a = false;
                icVar2.setOnReadyListener(new o3(2, currentTimeMillis2, runnable2));
                ((ac) e6Var2.Q1).g(false);
                bj0 bj0Var2 = e6Var2.f847z0;
                if (bj0Var2 != null) {
                    bj0Var2.setAnimation(this.f1391c.f603u);
                }
                if (e6Var2.R2 > 0 && l11.longValue() > e6Var2.R2 - 1400) {
                    l11 = 0L;
                }
                e6Var2.T0(l11.longValue(), true);
                e6Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    e6Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
