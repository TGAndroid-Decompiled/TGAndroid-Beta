package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lj0;
public final class u3 implements Utilities.Callback4 {
    public final int f17806a;
    public final y3 f17807b;
    public final c4 f17808c;

    public u3(y3 y3Var, c4 c4Var, int i10) {
        this.f17806a = i10;
        this.f17807b = y3Var;
        this.f17808c = c4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f17806a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                f4 f4Var = this.f17807b.f17950l;
                e4 e4Var = f4Var.J2;
                h9 h9Var = e4Var.f17020b;
                if (h9Var == null) {
                    ((z8) f4Var.N1).g(false);
                    f4Var.setActive(true);
                    f4Var.R3 = false;
                    f4Var.f17066f1 = new e2(1, runnable);
                    if (bool.booleanValue()) {
                        f4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                h9Var.firstFrameRendered = false;
                e4Var.f17023f = false;
                h9Var.setOnReadyListener(new f2(1, currentTimeMillis, runnable));
                ((z8) f4Var.N1).g(false);
                lj0 lj0Var = f4Var.f17119w0;
                if (lj0Var != null) {
                    lj0Var.setAnimation(this.f17808c.f16935u);
                }
                if (f4Var.O2 > 0 && l10.longValue() > f4Var.O2 - 1400) {
                    l10 = 0L;
                }
                f4Var.T0(l10.longValue(), true);
                f4Var.R3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    f4Var.f1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                f4 f4Var2 = this.f17807b.f17950l;
                e4 e4Var2 = f4Var2.J2;
                h9 h9Var2 = e4Var2.f17020b;
                if (h9Var2 == null) {
                    ((z8) f4Var2.N1).g(false);
                    f4Var2.setActive(true);
                    f4Var2.R3 = false;
                    f4Var2.f17066f1 = new e2(2, runnable2);
                    if (bool2.booleanValue()) {
                        f4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                h9Var2.firstFrameRendered = false;
                e4Var2.f17023f = false;
                h9Var2.setOnReadyListener(new f2(2, currentTimeMillis2, runnable2));
                ((z8) f4Var2.N1).g(false);
                lj0 lj0Var2 = f4Var2.f17119w0;
                if (lj0Var2 != null) {
                    lj0Var2.setAnimation(this.f17808c.f16935u);
                }
                if (f4Var2.O2 > 0 && l12.longValue() > f4Var2.O2 - 1400) {
                    l12 = 0L;
                }
                f4Var2.T0(l12.longValue(), true);
                f4Var2.R3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    f4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
