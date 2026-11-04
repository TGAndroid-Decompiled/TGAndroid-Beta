package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g1 implements u10 {
    public final int f22620a;
    public final Object f22621b;
    public final Object f22622c;

    public g1(int i3, Object obj, Object obj2) {
        this.f22620a = i3;
        this.f22621b = obj;
        this.f22622c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22620a) {
            case 0:
                g0.h3(new fg((h1) this.f22621b, (String) obj, (Runnable) this.f22622c, 7));
                return;
            case 1:
                e3 e3Var = (e3) this.f22621b;
                u10 u10Var = (u10) this.f22622c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f22303f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.f22300b = true;
                }
                e3Var.f22299a = false;
                u10Var.a(e3Var);
                return;
            default:
                yy yyVar = (yy) this.f22621b;
                wy wyVar = (wy) this.f22622c;
                yyVar.getClass();
                wyVar.Q = ((Long) obj).longValue();
                yyVar.r0(wyVar);
                return;
        }
    }
}
