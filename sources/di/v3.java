package di;

import org.telegram.messenger.z10;
import org.telegram.ui.Components.ch0;
public final class v3 implements z10 {
    public final int f9865a;
    public final z3 f9866b;
    public final f4 f9867c;

    public v3(z3 z3Var, f4 f4Var, int i7) {
        this.f9865a = i7;
        this.f9866b = z3Var;
        this.f9867c = f4Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f9865a) {
            case 0:
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                i4 i4Var = this.f9866b.f10013x;
                h4 h4Var = i4Var.f9206v2;
                o9 o9Var = (o9) h4Var.f9076c;
                if (o9Var == null) {
                    ((g9) i4Var.f9221z1).g(false);
                    i4Var.setActive(true);
                    i4Var.D3 = false;
                    i4Var.R0 = new d2(1, runnable);
                    if (bool.booleanValue()) {
                        i4Var.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable, 400L);
                    return;
                }
                o9Var.firstFrameRendered = false;
                h4Var.f9074a = false;
                o9Var.setOnReadyListener(new e2(1, currentTimeMillis, runnable));
                ((g9) i4Var.f9221z1).g(false);
                ch0 ch0Var = i4Var.f9156i0;
                if (ch0Var != null) {
                    ch0Var.setAnimation(this.f9867c.f8998u);
                }
                if (i4Var.A2 > 0 && l10.longValue() > i4Var.A2 - 1400) {
                    l10 = 0L;
                }
                i4Var.R0(l10.longValue(), true);
                i4Var.D3 = false;
                org.telegram.messenger.g0.i3(runnable, 400L);
                if (bool.booleanValue()) {
                    i4Var.d1(false);
                    return;
                }
                return;
            default:
                Long l12 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l13 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                i4 i4Var2 = this.f9866b.f10013x;
                h4 h4Var2 = i4Var2.f9206v2;
                o9 o9Var2 = (o9) h4Var2.f9076c;
                if (o9Var2 == null) {
                    ((g9) i4Var2.f9221z1).g(false);
                    i4Var2.setActive(true);
                    i4Var2.D3 = false;
                    i4Var2.R0 = new d2(2, runnable2);
                    if (bool2.booleanValue()) {
                        i4Var2.d1(false);
                    }
                    org.telegram.messenger.g0.i3(runnable2, 400L);
                    return;
                }
                o9Var2.firstFrameRendered = false;
                h4Var2.f9074a = false;
                o9Var2.setOnReadyListener(new e2(2, currentTimeMillis2, runnable2));
                ((g9) i4Var2.f9221z1).g(false);
                ch0 ch0Var2 = i4Var2.f9156i0;
                if (ch0Var2 != null) {
                    ch0Var2.setAnimation(this.f9867c.f8998u);
                }
                if (i4Var2.A2 > 0 && l12.longValue() > i4Var2.A2 - 1400) {
                    l12 = 0L;
                }
                i4Var2.R0(l12.longValue(), true);
                i4Var2.D3 = false;
                org.telegram.messenger.g0.i3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    i4Var2.d1(false);
                    return;
                }
                return;
        }
    }
}
