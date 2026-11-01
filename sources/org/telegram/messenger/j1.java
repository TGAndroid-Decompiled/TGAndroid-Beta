package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j1 implements r20 {
    public final int f16399a;
    public final Object f16400b;
    public final Object f16401c;

    public j1(int i10, Object obj, Object obj2) {
        this.f16399a = i10;
        this.f16400b = obj;
        this.f16401c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f16399a) {
            case 0:
                i0.g3(new ng((k1) this.f16400b, (String) obj, (Runnable) this.f16401c, 7));
                return;
            case 1:
                h3 h3Var = (h3) this.f16400b;
                r20 r20Var = (r20) this.f16401c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    h3Var.f16008f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    h3Var.f16006b = true;
                }
                h3Var.f16005a = false;
                r20Var.a(h3Var);
                return;
            default:
                rz rzVar = (rz) this.f16400b;
                pz pzVar = (pz) this.f16401c;
                rzVar.getClass();
                pzVar.Q = ((Long) obj).longValue();
                rzVar.r0(pzVar);
                return;
        }
    }
}
