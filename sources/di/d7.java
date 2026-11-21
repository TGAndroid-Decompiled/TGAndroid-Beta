package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class d7 implements q0.a {
    public final int f8684a;
    public final Object f8685b;
    public final Object f8686c;

    public d7(int i7, Object obj, Object obj2) {
        this.f8684a = i7;
        this.f8685b = obj;
        this.f8686c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j3;
        boolean z11;
        String j10;
        switch (this.f8684a) {
            case 0:
                bi.f8 f8Var = (bi.f8) this.f8686c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f8685b).f11312a;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i7);
                }
                org.telegram.messenger.g0.g3(new p6(f8Var, z10, j3, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f8686c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f8685b).f11312a;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.g3(new p6(e0Var, z11, j10, 1));
                return;
            case 2:
                hi.k5.X((hi.u9) this.f8685b, (sg.k0) this.f8686c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f8685b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f8686c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f52966i;
                org.telegram.ui.y4 y4Var = w4Var.f52967j;
                if (!b5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f54034c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f54034c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                x10 x10Var = (x10) this.f8686c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f8685b).f11312a == 0) {
                    org.telegram.messenger.g0.g3(new hi.h9(x10Var, 2));
                    return;
                }
                return;
            default:
                wg.v vVar = (wg.v) this.f8686c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f8685b).f11312a == 0) {
                    org.telegram.messenger.g0.g3(new v4.p(vVar, 7));
                    return;
                }
                return;
        }
    }
}
