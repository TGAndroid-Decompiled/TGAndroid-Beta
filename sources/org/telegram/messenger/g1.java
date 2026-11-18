package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements x10 {
    public final int f24132a;
    public final Object f24133b;
    public final Object f24134c;

    public g1(int i7, Object obj, Object obj2) {
        this.f24132a = i7;
        this.f24133b = obj;
        this.f24134c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f24132a) {
            case 0:
                g0.g3(new yf((h1) this.f24133b, (String) obj, (Runnable) this.f24134c, 7));
                return;
            case 1:
                g3 g3Var = (g3) this.f24133b;
                x10 x10Var = (x10) this.f24134c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f24156f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.f24153b = true;
                }
                g3Var.f24152a = false;
                x10Var.a(g3Var);
                return;
            default:
                zy zyVar = (zy) this.f24133b;
                xy xyVar = (xy) this.f24134c;
                zyVar.getClass();
                xyVar.Q = ((Long) obj).longValue();
                zyVar.r0(xyVar);
                return;
        }
    }
}
