package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements y10 {
    public final int f24058a;
    public final Object f24059b;
    public final Object f24060c;

    public g1(int i7, Object obj, Object obj2) {
        this.f24058a = i7;
        this.f24059b = obj;
        this.f24060c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f24058a) {
            case 0:
                g0.g3(new zf((h1) this.f24059b, (String) obj, (Runnable) this.f24060c, 7));
                return;
            case 1:
                g3 g3Var = (g3) this.f24059b;
                y10 y10Var = (y10) this.f24060c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f24078f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.f24075b = true;
                }
                g3Var.f24074a = false;
                y10Var.a(g3Var);
                return;
            default:
                az azVar = (az) this.f24059b;
                yy yyVar = (yy) this.f24060c;
                azVar.getClass();
                yyVar.Q = ((Long) obj).longValue();
                azVar.r0(yyVar);
                return;
        }
    }
}
