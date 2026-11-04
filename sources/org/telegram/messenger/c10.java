package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c10 implements Runnable {
    public final int f21927a;
    public final d10 f21928b;
    public final TLObject f21929c;
    public final a10 d;
    public final TLRPC.TL_error f21930e;

    public c10(d10 d10Var, a10 a10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i3) {
        this.f21927a = i3;
        this.f21928b = d10Var;
        this.d = a10Var;
        this.f21929c = tLObject;
        this.f21930e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f21927a) {
            case 0:
                e10 e10Var = this.f21928b.f22126i;
                if ((this.f21929c instanceof TLRPC.TL_boolTrue) && this.f21930e == null) {
                    z10 = true;
                } else {
                    e10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                e10Var.getClass();
                return;
            case 1:
                e10 e10Var2 = this.f21928b.f22126i;
                TLObject tLObject = this.f21929c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    hp.s1(e10Var2.f22287a).O3((TLRPC.Updates) tLObject, false);
                }
                lg.f.a(e10Var2.f22287a).b();
                if (z12 && this.f21930e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                e10 e10Var3 = this.f21928b.f22126i;
                if ((this.f21929c instanceof TLRPC.TL_boolTrue) && this.f21930e == null) {
                    z11 = true;
                } else {
                    e10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                e10Var3.getClass();
                return;
        }
    }

    public c10(d10 d10Var, TLObject tLObject, a10 a10Var, TLRPC.TL_error tL_error) {
        this.f21927a = 1;
        this.f21928b = d10Var;
        this.f21929c = tLObject;
        this.d = a10Var;
        this.f21930e = tL_error;
    }
}
