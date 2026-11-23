package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements y10 {
    public final int f24022a;
    public final Object f24023b;
    public final Object f24024c;

    public g1(int i7, Object obj, Object obj2) {
        this.f24022a = i7;
        this.f24023b = obj;
        this.f24024c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f24022a) {
            case 0:
                g0.g3(new zf((h1) this.f24023b, (String) obj, (Runnable) this.f24024c, 7));
                return;
            case 1:
                g3 g3Var = (g3) this.f24023b;
                y10 y10Var = (y10) this.f24024c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f24042f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.f24039b = true;
                }
                g3Var.f24038a = false;
                y10Var.a(g3Var);
                return;
            default:
                az azVar = (az) this.f24023b;
                yy yyVar = (yy) this.f24024c;
                azVar.getClass();
                yyVar.Q = ((Long) obj).longValue();
                azVar.r0(yyVar);
                return;
        }
    }
}
