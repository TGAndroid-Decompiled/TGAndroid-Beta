package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements z10 {
    public final int f23621a;
    public final Object f23622b;
    public final Object f23623c;

    public g1(int i7, Object obj, Object obj2) {
        this.f23621a = i7;
        this.f23622b = obj;
        this.f23623c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f23621a) {
            case 0:
                g0.h3(new mg((h1) this.f23622b, (String) obj, (Runnable) this.f23623c, 7));
                return;
            case 1:
                e3 e3Var = (e3) this.f23622b;
                z10 z10Var = (z10) this.f23623c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f23251f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.f23248b = true;
                }
                e3Var.f23247a = false;
                z10Var.a(e3Var);
                return;
            default:
                ez ezVar = (ez) this.f23622b;
                cz czVar = (cz) this.f23623c;
                ezVar.getClass();
                czVar.Q = ((Long) obj).longValue();
                ezVar.r0(czVar);
                return;
        }
    }
}
