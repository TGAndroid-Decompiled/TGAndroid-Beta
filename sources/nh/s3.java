package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jj0;
public final class s3 implements Utilities.Callback4 {
    public final int f15855a;
    public final w3 f15856b;
    public final a4 f15857c;

    public s3(w3 w3Var, a4 a4Var, int i10) {
        this.f15855a = i10;
        this.f15856b = w3Var;
        this.f15857c = a4Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f15855a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                d4 d4Var = this.f15856b.f16007l;
                c4 c4Var = d4Var.J2;
                h9 h9Var = c4Var.f15122b;
                if (h9Var == null) {
                    ((z8) d4Var.N1).g(false);
                    d4Var.setActive(true);
                    d4Var.R3 = false;
                    d4Var.f15176f1 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        d4Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                h9Var.firstFrameRendered = false;
                c4Var.f15124f = false;
                h9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                ((z8) d4Var.N1).g(false);
                jj0 jj0Var = d4Var.f15229w0;
                if (jj0Var != null) {
                    jj0Var.setAnimation(this.f15857c.f15049u);
                }
                if (d4Var.O2 > 0 && l10.longValue() > d4Var.O2 - 1400) {
                    l10 = 0L;
                }
                d4Var.T0(l10.longValue(), true);
                d4Var.R3 = false;
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
                d4 d4Var2 = this.f15856b.f16007l;
                c4 c4Var2 = d4Var2.J2;
                h9 h9Var2 = c4Var2.f15122b;
                if (h9Var2 == null) {
                    ((z8) d4Var2.N1).g(false);
                    d4Var2.setActive(true);
                    d4Var2.R3 = false;
                    d4Var2.f15176f1 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        d4Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                h9Var2.firstFrameRendered = false;
                c4Var2.f15124f = false;
                h9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                ((z8) d4Var2.N1).g(false);
                jj0 jj0Var2 = d4Var2.f15229w0;
                if (jj0Var2 != null) {
                    jj0Var2.setAnimation(this.f15857c.f15049u);
                }
                if (d4Var2.O2 > 0 && l12.longValue() > d4Var2.O2 - 1400) {
                    l12 = 0L;
                }
                d4Var2.T0(l12.longValue(), true);
                d4Var2.R3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    d4Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
