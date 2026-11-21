package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements x10 {
    public final int f24160a;
    public final Object f24161b;
    public final Object f24162c;

    public g1(int i7, Object obj, Object obj2) {
        this.f24160a = i7;
        this.f24161b = obj;
        this.f24162c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f24160a) {
            case 0:
                g0.g3(new yf((h1) this.f24161b, (String) obj, (Runnable) this.f24162c, 7));
                return;
            case 1:
                g3 g3Var = (g3) this.f24161b;
                x10 x10Var = (x10) this.f24162c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f24184f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.f24181b = true;
                }
                g3Var.f24180a = false;
                x10Var.a(g3Var);
                return;
            default:
                zy zyVar = (zy) this.f24161b;
                xy xyVar = (xy) this.f24162c;
                zyVar.getClass();
                xyVar.Q = ((Long) obj).longValue();
                zyVar.r0(xyVar);
                return;
        }
    }
}
