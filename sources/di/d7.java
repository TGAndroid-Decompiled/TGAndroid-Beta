package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class d7 implements q0.a {
    public final int f8687a;
    public final Object f8688b;
    public final Object f8689c;

    public d7(int i7, Object obj, Object obj2) {
        this.f8687a = i7;
        this.f8688b = obj;
        this.f8689c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j3;
        boolean z11;
        String j10;
        switch (this.f8687a) {
            case 0:
                bi.e8 e8Var = (bi.e8) this.f8689c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f8688b).f11315a;
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
                org.telegram.messenger.g0.g3(new p6(e8Var, z10, j3, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f8689c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f8688b).f11315a;
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
                hi.k5.X((hi.u9) this.f8688b, (sg.k0) this.f8689c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f8688b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f8689c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f52970i;
                org.telegram.ui.y4 y4Var = w4Var.f52971j;
                if (!b5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f54038c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f54038c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                y10 y10Var = (y10) this.f8689c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f8688b).f11315a == 0) {
                    org.telegram.messenger.g0.g3(new hi.h9(y10Var, 2));
                    return;
                }
                return;
            default:
                wg.v vVar = (wg.v) this.f8689c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f8688b).f11315a == 0) {
                    org.telegram.messenger.g0.g3(new v4.p(vVar, 7));
                    return;
                }
                return;
        }
    }
}
