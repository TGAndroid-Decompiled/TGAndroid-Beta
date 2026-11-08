package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k10 implements Runnable {
    public final int f23647a;
    public final l10 f23648b;
    public final TLObject f23649c;
    public final i10 d;
    public final TLRPC.TL_error f23650e;

    public k10(l10 l10Var, i10 i10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f23647a = i7;
        this.f23648b = l10Var;
        this.d = i10Var;
        this.f23649c = tLObject;
        this.f23650e = tL_error;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.f23647a) {
            case 0:
                m10 m10Var = this.f23648b.f23832i;
                if ((this.f23649c instanceof TLRPC.TL_boolTrue) && this.f23650e == null) {
                    z9 = true;
                } else {
                    m10Var.getClass();
                    z9 = false;
                }
                this.d.a(Boolean.valueOf(z9));
                m10Var.getClass();
                return;
            case 1:
                m10 m10Var2 = this.f23648b.f23832i;
                TLObject tLObject = this.f23649c;
                boolean z11 = tLObject instanceof TLRPC.Updates;
                boolean z12 = false;
                if (z11) {
                    qp.s1(m10Var2.f23969a).O3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(m10Var2.f23969a).b();
                if (z11 && this.f23650e == null) {
                    z12 = true;
                }
                this.d.a(Boolean.valueOf(z12));
                return;
            default:
                m10 m10Var3 = this.f23648b.f23832i;
                if ((this.f23649c instanceof TLRPC.TL_boolTrue) && this.f23650e == null) {
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
        this.f23647a = 1;
        this.f23648b = l10Var;
        this.f23649c = tLObject;
        this.d = i10Var;
        this.f23650e = tL_error;
    }
}
