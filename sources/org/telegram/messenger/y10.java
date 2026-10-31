package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y10 implements Runnable {
    public final int f19325a;
    public final z10 f19326b;
    public final TLObject f19327c;
    public final w10 d;
    public final TLRPC.TL_error e;

    public y10(z10 z10Var, w10 w10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19325a = i10;
        this.f19326b = z10Var;
        this.d = w10Var;
        this.f19327c = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f19325a) {
            case 0:
                a20 a20Var = this.f19326b.f19474i;
                if ((this.f19327c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    a20Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                a20Var.getClass();
                return;
            case 1:
                a20 a20Var2 = this.f19326b.f19474i;
                TLObject tLObject = this.f19327c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    vp.r1(a20Var2.f14560a).L3((TLRPC.Updates) tLObject, false);
                }
                ag.k.a(a20Var2.f14560a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                a20 a20Var3 = this.f19326b.f19474i;
                if ((this.f19327c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    a20Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                a20Var3.getClass();
                return;
        }
    }

    public y10(z10 z10Var, TLObject tLObject, w10 w10Var, TLRPC.TL_error tL_error) {
        this.f19325a = 1;
        this.f19326b = z10Var;
        this.f19327c = tLObject;
        this.d = w10Var;
        this.e = tL_error;
    }
}
