package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d10 implements Runnable {
    public final int f23581a;
    public final e10 f23582b;
    public final TLObject f23583c;
    public final b10 d;
    public final TLRPC.TL_error f23584e;

    public d10(e10 e10Var, b10 b10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f23581a = i7;
        this.f23582b = e10Var;
        this.d = b10Var;
        this.f23583c = tLObject;
        this.f23584e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f23581a) {
            case 0:
                f10 f10Var = this.f23582b.f23758i;
                if ((this.f23583c instanceof TLRPC.TL_boolTrue) && this.f23584e == null) {
                    z10 = true;
                } else {
                    f10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                f10Var.getClass();
                return;
            case 1:
                f10 f10Var2 = this.f23582b.f23758i;
                TLObject tLObject = this.f23583c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    mp.u1(f10Var2.f23922a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(f10Var2.f23922a).b();
                if (z12 && this.f23584e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                f10 f10Var3 = this.f23582b.f23758i;
                if ((this.f23583c instanceof TLRPC.TL_boolTrue) && this.f23584e == null) {
                    z11 = true;
                } else {
                    f10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                f10Var3.getClass();
                return;
        }
    }

    public d10(e10 e10Var, TLObject tLObject, b10 b10Var, TLRPC.TL_error tL_error) {
        this.f23581a = 1;
        this.f23582b = e10Var;
        this.f23583c = tLObject;
        this.d = b10Var;
        this.f23584e = tL_error;
    }
}
