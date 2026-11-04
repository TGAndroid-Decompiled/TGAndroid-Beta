package ei;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.fh0;
public final class x3 implements r10 {
    public final int f11201a;
    public final b4 f11202b;
    public final g4 f11203c;

    public x3(b4 b4Var, g4 g4Var, int i3) {
        this.f11201a = i3;
        this.f11202b = b4Var;
        this.f11203c = g4Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f11201a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                j4 j4Var = this.f11202b.f10126x;
                i4 i4Var = j4Var.f10520w2;
                q9 q9Var = (q9) i4Var.f10404c;
                if (q9Var == null) {
                    ((i9) j4Var.A1).g(false);
                    j4Var.setActive(true);
                    j4Var.E3 = false;
                    j4Var.S0 = new h2(1, runnable);
                    if (bool.booleanValue()) {
                        j4Var.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    return;
                }
                q9Var.firstFrameRendered = false;
                i4Var.f10402a = false;
                q9Var.setOnReadyListener(new i2(1, currentTimeMillis, runnable));
                ((i9) j4Var.A1).g(false);
                fh0 fh0Var = j4Var.f10469j0;
                if (fh0Var != null) {
                    fh0Var.setAnimation(this.f11203c.f10332u);
                }
                if (j4Var.B2 > 0 && l10.longValue() > j4Var.B2 - 1400) {
                    l10 = 0L;
                }
                j4Var.R0(l10.longValue(), true);
                j4Var.E3 = false;
                org.telegram.messenger.g0.i3(runnable, 400L);
                if (bool.booleanValue()) {
                    j4Var.d1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                j4 j4Var2 = this.f11202b.f10126x;
                i4 i4Var2 = j4Var2.f10520w2;
                q9 q9Var2 = (q9) i4Var2.f10404c;
                if (q9Var2 == null) {
                    ((i9) j4Var2.A1).g(false);
                    j4Var2.setActive(true);
                    j4Var2.E3 = false;
                    j4Var2.S0 = new h2(2, runnable2);
                    if (bool2.booleanValue()) {
                        j4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    return;
                }
                q9Var2.firstFrameRendered = false;
                i4Var2.f10402a = false;
                q9Var2.setOnReadyListener(new i2(2, currentTimeMillis2, runnable2));
                ((i9) j4Var2.A1).g(false);
                fh0 fh0Var2 = j4Var2.f10469j0;
                if (fh0Var2 != null) {
                    fh0Var2.setAnimation(this.f11203c.f10332u);
                }
                if (j4Var2.B2 > 0 && l12.longValue() > j4Var2.B2 - 1400) {
                    l12 = 0L;
                }
                j4Var2.R0(l12.longValue(), true);
                j4Var2.E3 = false;
                org.telegram.messenger.g0.i3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    j4Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
