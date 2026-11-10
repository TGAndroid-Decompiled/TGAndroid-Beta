package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class h8 implements q0.a {
    public final int f4000a;
    public final Object f4001b;
    public final Object f4002c;

    public h8(int i7, Object obj, Object obj2) {
        this.f4000a = i7;
        this.f4001b = obj;
        this.f4002c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z9;
        String j3;
        boolean z10;
        String j10;
        switch (this.f4000a) {
            case 0:
                mc mcVar = (mc) this.f4002c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f4001b).f11156a;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i7);
                }
                org.telegram.messenger.g0.h3(new u7(mcVar, z9, j3, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f4002c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f4001b).f11156a;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new u7(t1Var, z10, j10, 1));
                return;
            case 2:
                fi.o5.X((fi.x9) this.f4001b, (sg.l0) this.f4002c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f4001b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f4002c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f50899i;
                org.telegram.ui.y4 y4Var = w4Var.f50900j;
                if (!b5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f51887c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f51887c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                c20 c20Var = (c20) this.f4002c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f4001b).f11156a == 0) {
                    org.telegram.messenger.g0.h3(new fi.j9(c20Var, 2));
                    return;
                }
                return;
            default:
                wg.u uVar = (wg.u) this.f4002c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f4001b).f11156a == 0) {
                    org.telegram.messenger.g0.h3(new sh.b(uVar, 29));
                    return;
                }
                return;
        }
    }
}
