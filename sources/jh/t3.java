package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ri0;

public final class t3 implements Utilities.Callback4 {

    public final int f13993a;

    public final x3 f13994b;

    public final b4 f13995c;

    public t3(x3 x3Var, b4 b4Var, int i10) {
        this.f13993a = i10;
        this.f13994b = x3Var;
        this.f13995c = b4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f13993a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long jCurrentTimeMillis = System.currentTimeMillis();
                e4 e4Var = this.f13994b.f14128l;
                d4 d4Var = e4Var.I2;
                h9 h9Var = d4Var.f13192b;
                if (h9Var != null) {
                    h9Var.firstFrameRendered = false;
                    d4Var.f13195f = false;
                    h9Var.setOnReadyListener(new e2(1, jCurrentTimeMillis, runnable));
                    ((z8) e4Var.M1).g(false);
                    ri0 ri0Var = e4Var.f13282v0;
                    if (ri0Var != null) {
                        ri0Var.setAnimation(this.f13995c.f13100u);
                    }
                    if (e4Var.N2 > 0 && l10.longValue() > e4Var.N2 - 1400) {
                        l10 = 0L;
                    }
                    e4Var.T0(l10.longValue(), true);
                    e4Var.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    if (bool.booleanValue()) {
                        e4Var.f1(false);
                    }
                } else {
                    ((z8) e4Var.M1).g(false);
                    e4Var.setActive(true);
                    e4Var.Q3 = false;
                    e4Var.f13229e1 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        e4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                }
                break;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                e4 e4Var2 = this.f13994b.f14128l;
                d4 d4Var2 = e4Var2.I2;
                h9 h9Var2 = d4Var2.f13192b;
                if (h9Var2 != null) {
                    h9Var2.firstFrameRendered = false;
                    d4Var2.f13195f = false;
                    h9Var2.setOnReadyListener(new e2(2, jCurrentTimeMillis2, runnable2));
                    ((z8) e4Var2.M1).g(false);
                    ri0 ri0Var2 = e4Var2.f13282v0;
                    if (ri0Var2 != null) {
                        ri0Var2.setAnimation(this.f13995c.f13100u);
                    }
                    if (e4Var2.N2 > 0 && l11.longValue() > e4Var2.N2 - 1400) {
                        l11 = 0L;
                    }
                    e4Var2.T0(l11.longValue(), true);
                    e4Var2.Q3 = false;
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        e4Var2.f1(false);
                    }
                } else {
                    ((z8) e4Var2.M1).g(false);
                    e4Var2.setActive(true);
                    e4Var2.Q3 = false;
                    e4Var2.f13229e1 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        e4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                }
                break;
        }
    }
}
