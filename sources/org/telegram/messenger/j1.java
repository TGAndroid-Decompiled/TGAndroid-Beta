package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j1 implements q20 {
    public final int f16205a;
    public final Object f16206b;
    public final Object f16207c;

    public j1(int i10, Object obj, Object obj2) {
        this.f16205a = i10;
        this.f16206b = obj;
        this.f16207c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f16205a) {
            case 0:
                i0.g3(new mg((k1) this.f16206b, (String) obj, (Runnable) this.f16207c, 7));
                return;
            case 1:
                h3 h3Var = (h3) this.f16206b;
                q20 q20Var = (q20) this.f16207c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    h3Var.f15822f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    h3Var.f15820b = true;
                }
                h3Var.f15819a = false;
                q20Var.a(h3Var);
                return;
            default:
                qz qzVar = (qz) this.f16206b;
                oz ozVar = (oz) this.f16207c;
                qzVar.getClass();
                ozVar.Q = ((Long) obj).longValue();
                qzVar.r0(ozVar);
                return;
        }
    }
}
