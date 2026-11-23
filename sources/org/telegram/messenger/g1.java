package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements w10 {
    public final int f24237a;
    public final Object f24238b;
    public final Object f24239c;

    public g1(int i7, Object obj, Object obj2) {
        this.f24237a = i7;
        this.f24238b = obj;
        this.f24239c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f24237a) {
            case 0:
                g0.g3(new yf((h1) this.f24238b, (String) obj, (Runnable) this.f24239c, 7));
                return;
            case 1:
                g3 g3Var = (g3) this.f24238b;
                w10 w10Var = (w10) this.f24239c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f24258f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.f24255b = true;
                }
                g3Var.f24254a = false;
                w10Var.a(g3Var);
                return;
            default:
                zy zyVar = (zy) this.f24238b;
                xy xyVar = (xy) this.f24239c;
                zyVar.getClass();
                xyVar.Q = ((Long) obj).longValue();
                zyVar.r0(xyVar);
                return;
        }
    }
}
