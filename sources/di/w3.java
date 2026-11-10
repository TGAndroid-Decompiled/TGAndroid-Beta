package di;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.ch0;
public final class w3 implements z10 {
    public final int f9898a;
    public final a4 f9899b;
    public final g4 f9900c;

    public w3(a4 a4Var, g4 g4Var, int i7) {
        this.f9898a = i7;
        this.f9899b = a4Var;
        this.f9900c = g4Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f9898a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                j4 j4Var = this.f9899b.f8813x;
                i4 i4Var = j4Var.f9243v2;
                p9 p9Var = (p9) i4Var.f9111c;
                if (p9Var == null) {
                    ((h9) j4Var.f9258z1).g(false);
                    j4Var.setActive(true);
                    j4Var.D3 = false;
                    j4Var.R0 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        j4Var.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    return;
                }
                p9Var.firstFrameRendered = false;
                i4Var.f9109a = false;
                p9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                ((h9) j4Var.f9258z1).g(false);
                ch0 ch0Var = j4Var.f9193i0;
                if (ch0Var != null) {
                    ch0Var.setAnimation(this.f9900c.f9036u);
                }
                if (j4Var.A2 > 0 && l10.longValue() > j4Var.A2 - 1400) {
                    l10 = 0L;
                }
                j4Var.R0(l10.longValue(), true);
                j4Var.D3 = false;
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
                j4 j4Var2 = this.f9899b.f8813x;
                i4 i4Var2 = j4Var2.f9243v2;
                p9 p9Var2 = (p9) i4Var2.f9111c;
                if (p9Var2 == null) {
                    ((h9) j4Var2.f9258z1).g(false);
                    j4Var2.setActive(true);
                    j4Var2.D3 = false;
                    j4Var2.R0 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        j4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    return;
                }
                p9Var2.firstFrameRendered = false;
                i4Var2.f9109a = false;
                p9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                ((h9) j4Var2.f9258z1).g(false);
                ch0 ch0Var2 = j4Var2.f9193i0;
                if (ch0Var2 != null) {
                    ch0Var2.setAnimation(this.f9900c.f9036u);
                }
                if (j4Var2.A2 > 0 && l12.longValue() > j4Var2.A2 - 1400) {
                    l12 = 0L;
                }
                j4Var2.R0(l12.longValue(), true);
                j4Var2.D3 = false;
                org.telegram.messenger.g0.i3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    j4Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
