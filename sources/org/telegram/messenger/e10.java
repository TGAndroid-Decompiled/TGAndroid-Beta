package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e10 implements Runnable {
    public final int f23630a;
    public final f10 f23631b;
    public final TLObject f23632c;
    public final c10 d;
    public final TLRPC.TL_error f23633e;

    public e10(f10 f10Var, c10 c10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f23630a = i7;
        this.f23631b = f10Var;
        this.d = c10Var;
        this.f23632c = tLObject;
        this.f23633e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f23630a) {
            case 0:
                g10 g10Var = this.f23631b.f23820i;
                if ((this.f23632c instanceof TLRPC.TL_boolTrue) && this.f23633e == null) {
                    z10 = true;
                } else {
                    g10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                g10Var.getClass();
                return;
            case 1:
                g10 g10Var2 = this.f23631b.f23820i;
                TLObject tLObject = this.f23632c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    mp.u1(g10Var2.f24135a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(g10Var2.f24135a).b();
                if (z12 && this.f23633e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                g10 g10Var3 = this.f23631b.f23820i;
                if ((this.f23632c instanceof TLRPC.TL_boolTrue) && this.f23633e == null) {
                    z11 = true;
                } else {
                    g10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                g10Var3.getClass();
                return;
        }
    }

    public e10(f10 f10Var, TLObject tLObject, c10 c10Var, TLRPC.TL_error tL_error) {
        this.f23630a = 1;
        this.f23631b = f10Var;
        this.f23632c = tLObject;
        this.d = c10Var;
        this.f23633e = tL_error;
    }
}
