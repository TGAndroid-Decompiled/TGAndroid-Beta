package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f10 implements Runnable {
    public final int f23817a;
    public final g10 f23818b;
    public final TLObject f23819c;
    public final d10 d;
    public final TLRPC.TL_error f23820e;

    public f10(g10 g10Var, d10 d10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f23817a = i7;
        this.f23818b = g10Var;
        this.d = d10Var;
        this.f23819c = tLObject;
        this.f23820e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f23817a) {
            case 0:
                h10 h10Var = this.f23818b.f24066i;
                if ((this.f23819c instanceof TLRPC.TL_boolTrue) && this.f23820e == null) {
                    z10 = true;
                } else {
                    h10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                h10Var.getClass();
                return;
            case 1:
                h10 h10Var2 = this.f23818b.f24066i;
                TLObject tLObject = this.f23819c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    np.u1(h10Var2.f24358a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(h10Var2.f24358a).b();
                if (z12 && this.f23820e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                h10 h10Var3 = this.f23818b.f24066i;
                if ((this.f23819c instanceof TLRPC.TL_boolTrue) && this.f23820e == null) {
                    z11 = true;
                } else {
                    h10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                h10Var3.getClass();
                return;
        }
    }

    public f10(g10 g10Var, TLObject tLObject, d10 d10Var, TLRPC.TL_error tL_error) {
        this.f23817a = 1;
        this.f23818b = g10Var;
        this.f23819c = tLObject;
        this.d = d10Var;
        this.f23820e = tL_error;
    }
}
