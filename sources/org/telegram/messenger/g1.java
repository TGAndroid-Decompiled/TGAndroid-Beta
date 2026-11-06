package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements c20 {
    public final int f22549a;
    public final Object f22550b;
    public final Object f22551c;

    public g1(int i7, Object obj, Object obj2) {
        this.f22549a = i7;
        this.f22550b = obj;
        this.f22551c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22549a) {
            case 0:
                g0.h3(new ng((h1) this.f22550b, (String) obj, (Runnable) this.f22551c, 7));
                return;
            case 1:
                e3 e3Var = (e3) this.f22550b;
                c20 c20Var = (c20) this.f22551c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f22144f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.f22141b = true;
                }
                e3Var.f22140a = false;
                c20Var.a(e3Var);
                return;
            default:
                gz gzVar = (gz) this.f22550b;
                ez ezVar = (ez) this.f22551c;
                gzVar.getClass();
                ezVar.Q = ((Long) obj).longValue();
                gzVar.r0(ezVar);
                return;
        }
    }
}
