package fi;

import org.telegram.messenger.t10;
import org.telegram.ui.Components.qh0;
public final class n3 implements t10 {
    public final int f12299a;
    public final r3 f12300b;
    public final w3 f12301c;

    public n3(r3 r3Var, w3 w3Var, int i7) {
        this.f12299a = i7;
        this.f12300b = r3Var;
        this.f12301c = w3Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f12299a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                z3 z3Var = this.f12300b.f12494x;
                y3 y3Var = z3Var.f12892w2;
                e9 e9Var = (e9) y3Var.f12777c;
                if (e9Var == null) {
                    ((w8) z3Var.A1).g(false);
                    z3Var.setActive(true);
                    z3Var.E3 = false;
                    z3Var.S0 = new ai.w0(2, runnable);
                    if (bool.booleanValue()) {
                        z3Var.d1(false);
                    }
                    org.telegram.messenger.g0.h3(runnable, 400L);
                    return;
                }
                e9Var.firstFrameRendered = false;
                y3Var.f12775a = false;
                e9Var.setOnReadyListener(new y1(1, currentTimeMillis, runnable));
                ((w8) z3Var.A1).g(false);
                qh0 qh0Var = z3Var.f12842j0;
                if (qh0Var != null) {
                    qh0Var.setAnimation(this.f12301c.f12702u);
                }
                if (z3Var.B2 > 0 && l10.longValue() > z3Var.B2 - 1400) {
                    l10 = 0L;
                }
                z3Var.R0(l10.longValue(), true);
                z3Var.E3 = false;
                org.telegram.messenger.g0.h3(runnable, 400L);
                if (bool.booleanValue()) {
                    z3Var.d1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                z3 z3Var2 = this.f12300b.f12494x;
                y3 y3Var2 = z3Var2.f12892w2;
                e9 e9Var2 = (e9) y3Var2.f12777c;
                if (e9Var2 == null) {
                    ((w8) z3Var2.A1).g(false);
                    z3Var2.setActive(true);
                    z3Var2.E3 = false;
                    z3Var2.S0 = new ai.w0(3, runnable2);
                    if (bool2.booleanValue()) {
                        z3Var2.d1(false);
                    }
                    org.telegram.messenger.g0.h3(runnable2, 400L);
                    return;
                }
                e9Var2.firstFrameRendered = false;
                y3Var2.f12775a = false;
                e9Var2.setOnReadyListener(new y1(2, currentTimeMillis2, runnable2));
                ((w8) z3Var2.A1).g(false);
                qh0 qh0Var2 = z3Var2.f12842j0;
                if (qh0Var2 != null) {
                    qh0Var2.setAnimation(this.f12301c.f12702u);
                }
                if (z3Var2.B2 > 0 && l12.longValue() > z3Var2.B2 - 1400) {
                    l12 = 0L;
                }
                z3Var2.R0(l12.longValue(), true);
                z3Var2.E3 = false;
                org.telegram.messenger.g0.h3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    z3Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
