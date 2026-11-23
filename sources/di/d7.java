package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class d7 implements q0.a {
    public final int f8648a;
    public final Object f8649b;
    public final Object f8650c;

    public d7(int i7, Object obj, Object obj2) {
        this.f8648a = i7;
        this.f8649b = obj;
        this.f8650c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j3;
        boolean z11;
        String j10;
        switch (this.f8648a) {
            case 0:
                bi.h8 h8Var = (bi.h8) this.f8650c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f8649b).f11277a;
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
                org.telegram.messenger.g0.g3(new p6(h8Var, z10, j3, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f8650c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f8649b).f11277a;
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
                org.telegram.messenger.g0.g3(new p6(f0Var, z11, j10, 1));
                return;
            case 2:
                hi.v5.Y((hi.pa) this.f8649b, (sg.j0) this.f8650c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f8649b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f8650c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f53108i;
                org.telegram.ui.y4 y4Var = w4Var.f53109j;
                if (!b5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f54186c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f54186c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                w10 w10Var = (w10) this.f8650c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f8649b).f11277a == 0) {
                    org.telegram.messenger.g0.g3(new hi.ca(w10Var, 2));
                    return;
                }
                return;
            default:
                wg.u uVar = (wg.u) this.f8650c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f8649b).f11277a == 0) {
                    org.telegram.messenger.g0.g3(new ug.u1(uVar, 8));
                    return;
                }
                return;
        }
    }
}
