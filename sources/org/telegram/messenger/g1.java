package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements z10 {
    public final int f23623a;
    public final Object f23624b;
    public final Object f23625c;

    public g1(int i7, Object obj, Object obj2) {
        this.f23623a = i7;
        this.f23624b = obj;
        this.f23625c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f23623a) {
            case 0:
                g0.h3(new mg((h1) this.f23624b, (String) obj, (Runnable) this.f23625c, 7));
                return;
            case 1:
                e3 e3Var = (e3) this.f23624b;
                z10 z10Var = (z10) this.f23625c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f23258f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.f23255b = true;
                }
                e3Var.f23254a = false;
                z10Var.a(e3Var);
                return;
            default:
                ez ezVar = (ez) this.f23624b;
                cz czVar = (cz) this.f23625c;
                ezVar.getClass();
                czVar.Q = ((Long) obj).longValue();
                ezVar.r0(czVar);
                return;
        }
    }
}
