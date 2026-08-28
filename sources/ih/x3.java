package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pi0;
public final class x3 implements Utilities.Callback4 {
    public final int f12316a;
    public final b4 f12317b;
    public final f4 f12318c;

    public x3(b4 b4Var, f4 f4Var, int i9) {
        this.f12316a = i9;
        this.f12317b = b4Var;
        this.f12318c = f4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f12316a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                i4 i4Var = this.f12317b.f11268l;
                h4 h4Var = i4Var.I2;
                l9 l9Var = h4Var.f11501b;
                if (l9Var == null) {
                    ((d9) i4Var.M1).g(false);
                    i4Var.setActive(true);
                    i4Var.Q3 = false;
                    i4Var.f11542e1 = new e2(1, runnable);
                    if (bool.booleanValue()) {
                        i4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                l9Var.firstFrameRendered = false;
                h4Var.f11504f = false;
                l9Var.setOnReadyListener(new f2(1, currentTimeMillis, runnable));
                ((d9) i4Var.M1).g(false);
                pi0 pi0Var = i4Var.f11595v0;
                if (pi0Var != null) {
                    pi0Var.setAnimation(this.f12318c.f11431u);
                }
                if (i4Var.N2 > 0 && l10.longValue() > i4Var.N2 - 1400) {
                    l10 = 0L;
                }
                i4Var.T0(l10.longValue(), true);
                i4Var.Q3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    i4Var.f1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                i4 i4Var2 = this.f12317b.f11268l;
                h4 h4Var2 = i4Var2.I2;
                l9 l9Var2 = h4Var2.f11501b;
                if (l9Var2 == null) {
                    ((d9) i4Var2.M1).g(false);
                    i4Var2.setActive(true);
                    i4Var2.Q3 = false;
                    i4Var2.f11542e1 = new e2(2, runnable2);
                    if (bool2.booleanValue()) {
                        i4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                l9Var2.firstFrameRendered = false;
                h4Var2.f11504f = false;
                l9Var2.setOnReadyListener(new f2(2, currentTimeMillis2, runnable2));
                ((d9) i4Var2.M1).g(false);
                pi0 pi0Var2 = i4Var2.f11595v0;
                if (pi0Var2 != null) {
                    pi0Var2.setAnimation(this.f12318c.f11431u);
                }
                if (i4Var2.N2 > 0 && l12.longValue() > i4Var2.N2 - 1400) {
                    l12 = 0L;
                }
                i4Var2.T0(l12.longValue(), true);
                i4Var2.Q3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    i4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
