package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class a7 implements q0.a {
    public final int f8199a;
    public final Object f8200b;
    public final Object f8201c;

    public a7(int i7, Object obj, Object obj2) {
        this.f8199a = i7;
        this.f8200b = obj;
        this.f8201c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j3;
        boolean z11;
        String j10;
        switch (this.f8199a) {
            case 0:
                bi.v5 v5Var = (bi.v5) this.f8201c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f8200b).f10978a;
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
                org.telegram.messenger.g0.h3(new m6(v5Var, z10, j3, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f8201c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f8200b).f10978a;
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
                org.telegram.messenger.g0.h3(new m6(t1Var, z11, j10, 1));
                return;
            case 2:
                hi.m5.X((hi.u9) this.f8200b, (sg.k0) this.f8201c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f8200b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f8201c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f52396i;
                org.telegram.ui.y4 y4Var = w4Var.f52397j;
                if (!b5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f53406c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f53406c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                z10 z10Var = (z10) this.f8201c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f8200b).f10978a == 0) {
                    org.telegram.messenger.g0.h3(new hi.h9(z10Var, 2));
                    return;
                }
                return;
            default:
                wg.t tVar = (wg.t) this.f8201c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f8200b).f10978a == 0) {
                    org.telegram.messenger.g0.h3(new vg.o(tVar, 5));
                    return;
                }
                return;
        }
    }
}
