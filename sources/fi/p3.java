package fi;

import org.telegram.messenger.w10;
import org.telegram.ui.Components.fh0;
public final class p3 implements w10 {
    public final int f12170a;
    public final t3 f12171b;
    public final y3 f12172c;

    public p3(t3 t3Var, y3 y3Var, int i7) {
        this.f12170a = i7;
        this.f12171b = t3Var;
        this.f12172c = y3Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f12170a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                b4 b4Var = this.f12171b.f12360x;
                a4 a4Var = b4Var.f11536w2;
                h9 h9Var = (h9) a4Var.f11407c;
                if (h9Var == null) {
                    ((z8) b4Var.A1).g(false);
                    b4Var.setActive(true);
                    b4Var.E3 = false;
                    b4Var.S0 = new ai.z0(2, runnable);
                    if (bool.booleanValue()) {
                        b4Var.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    return;
                }
                h9Var.firstFrameRendered = false;
                a4Var.f11405a = false;
                h9Var.setOnReadyListener(new a2(1, currentTimeMillis, runnable));
                ((z8) b4Var.A1).g(false);
                fh0 fh0Var = b4Var.f11486j0;
                if (fh0Var != null) {
                    fh0Var.setAnimation(this.f12172c.f12545u);
                }
                if (b4Var.B2 > 0 && l10.longValue() > b4Var.B2 - 1400) {
                    l10 = 0L;
                }
                b4Var.R0(l10.longValue(), true);
                b4Var.E3 = false;
                org.telegram.messenger.g0.i3(runnable, 400L);
                if (bool.booleanValue()) {
                    b4Var.d1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                b4 b4Var2 = this.f12171b.f12360x;
                a4 a4Var2 = b4Var2.f11536w2;
                h9 h9Var2 = (h9) a4Var2.f11407c;
                if (h9Var2 == null) {
                    ((z8) b4Var2.A1).g(false);
                    b4Var2.setActive(true);
                    b4Var2.E3 = false;
                    b4Var2.S0 = new ai.z0(3, runnable2);
                    if (bool2.booleanValue()) {
                        b4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    return;
                }
                h9Var2.firstFrameRendered = false;
                a4Var2.f11405a = false;
                h9Var2.setOnReadyListener(new a2(2, currentTimeMillis2, runnable2));
                ((z8) b4Var2.A1).g(false);
                fh0 fh0Var2 = b4Var2.f11486j0;
                if (fh0Var2 != null) {
                    fh0Var2.setAnimation(this.f12172c.f12545u);
                }
                if (b4Var2.B2 > 0 && l12.longValue() > b4Var2.B2 - 1400) {
                    l12 = 0L;
                }
                b4Var2.R0(l12.longValue(), true);
                b4Var2.E3 = false;
                org.telegram.messenger.g0.i3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    b4Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
