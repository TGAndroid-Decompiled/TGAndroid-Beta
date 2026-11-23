package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class d7 implements q0.a {
    public final int f8650a;
    public final Object f8651b;
    public final Object f8652c;

    public d7(int i7, Object obj, Object obj2) {
        this.f8650a = i7;
        this.f8651b = obj;
        this.f8652c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j3;
        boolean z11;
        String j10;
        switch (this.f8650a) {
            case 0:
                bi.h8 h8Var = (bi.h8) this.f8652c;
                f5.f fVar = (f5.f) obj;
                int i7 = ((f5.f) this.f8651b).f11278a;
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
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f8652c;
                f5.f fVar2 = (f5.f) obj;
                int i10 = ((f5.f) this.f8651b).f11278a;
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
                hi.l5.X((hi.v9) this.f8651b, (sg.k0) this.f8652c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f8651b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f8652c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f52933i;
                org.telegram.ui.y4 y4Var = w4Var.f52934j;
                if (!b5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f54012c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f54012c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                y10 y10Var = (y10) this.f8652c;
                f5.f fVar3 = (f5.f) obj;
                if (((f5.f) this.f8651b).f11278a == 0) {
                    org.telegram.messenger.g0.g3(new hi.i9(y10Var, 2));
                    return;
                }
                return;
            default:
                wg.v vVar = (wg.v) this.f8652c;
                f5.f fVar4 = (f5.f) obj;
                if (((f5.f) this.f8651b).f11278a == 0) {
                    org.telegram.messenger.g0.g3(new vg.d(vVar, 6));
                    return;
                }
                return;
        }
    }
}
