package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h10 implements Runnable {
    public final int f24027a;
    public final i10 f24028b;
    public final TLObject f24029c;
    public final f10 d;
    public final TLRPC.TL_error f24030e;

    public h10(i10 i10Var, f10 f10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f24027a = i7;
        this.f24028b = i10Var;
        this.d = f10Var;
        this.f24029c = tLObject;
        this.f24030e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f24027a) {
            case 0:
                j10 j10Var = this.f24028b.f24269i;
                if ((this.f24029c instanceof TLRPC.TL_boolTrue) && this.f24030e == null) {
                    z10 = true;
                } else {
                    j10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                j10Var.getClass();
                return;
            case 1:
                j10 j10Var2 = this.f24028b.f24269i;
                TLObject tLObject = this.f24029c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    np.s1(j10Var2.f24506a).O3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(j10Var2.f24506a).b();
                if (z12 && this.f24030e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                j10 j10Var3 = this.f24028b.f24269i;
                if ((this.f24029c instanceof TLRPC.TL_boolTrue) && this.f24030e == null) {
                    z11 = true;
                } else {
                    j10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                j10Var3.getClass();
                return;
        }
    }

    public h10(i10 i10Var, TLObject tLObject, f10 f10Var, TLRPC.TL_error tL_error) {
        this.f24027a = 1;
        this.f24028b = i10Var;
        this.f24029c = tLObject;
        this.d = f10Var;
        this.f24030e = tL_error;
    }
}
