package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k10 implements Runnable {
    public final int f23651a;
    public final l10 f23652b;
    public final TLObject f23653c;
    public final i10 d;
    public final TLRPC.TL_error f23654e;

    public k10(l10 l10Var, i10 i10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f23651a = i7;
        this.f23652b = l10Var;
        this.d = i10Var;
        this.f23653c = tLObject;
        this.f23654e = tL_error;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.f23651a) {
            case 0:
                m10 m10Var = this.f23652b.f23836i;
                if ((this.f23653c instanceof TLRPC.TL_boolTrue) && this.f23654e == null) {
                    z9 = true;
                } else {
                    m10Var.getClass();
                    z9 = false;
                }
                this.d.a(Boolean.valueOf(z9));
                m10Var.getClass();
                return;
            case 1:
                m10 m10Var2 = this.f23652b.f23836i;
                TLObject tLObject = this.f23653c;
                boolean z11 = tLObject instanceof TLRPC.Updates;
                boolean z12 = false;
                if (z11) {
                    qp.s1(m10Var2.f23973a).O3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(m10Var2.f23973a).b();
                if (z11 && this.f23654e == null) {
                    z12 = true;
                }
                this.d.a(Boolean.valueOf(z12));
                return;
            default:
                m10 m10Var3 = this.f23652b.f23836i;
                if ((this.f23653c instanceof TLRPC.TL_boolTrue) && this.f23654e == null) {
                    z10 = true;
                } else {
                    m10Var3.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                m10Var3.getClass();
                return;
        }
    }

    public k10(l10 l10Var, TLObject tLObject, i10 i10Var, TLRPC.TL_error tL_error) {
        this.f23651a = 1;
        this.f23652b = l10Var;
        this.f23653c = tLObject;
        this.d = i10Var;
        this.f23654e = tL_error;
    }
}
