package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class i7 implements q0.a {
    public final int f5299a;
    public final Object f5300b;
    public final Object f5301c;

    public i7(int i3, Object obj, Object obj2) {
        this.f5299a = i3;
        this.f5300b = obj;
        this.f5301c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j10;
        boolean z11;
        String j11;
        switch (this.f5299a) {
            case 0:
                ai.d6 d6Var = (ai.d6) this.f5301c;
                e5.f fVar = (e5.f) obj;
                int i3 = ((e5.f) this.f5300b).f9593a;
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.r1.j(i3);
                }
                org.telegram.messenger.g0.h3(new v6(d6Var, z10, j10, 2));
                return;
            case 1:
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f5301c;
                e5.f fVar2 = (e5.f) obj;
                int i10 = ((e5.f) this.f5300b).f9593a;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j11 = null;
                } else {
                    j11 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new v6(s1Var, z11, j11, 1));
                return;
            case 2:
                gi.m5.X((gi.x9) this.f5300b, (tg.k0) this.f5301c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.f5300b;
                org.telegram.ui.y4 y4Var = (org.telegram.ui.y4) this.f5301c;
                org.telegram.ui.e5[] e5VarArr = y4Var.f52178i;
                org.telegram.ui.a5 a5Var = y4Var.f52179j;
                if (!d5Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        d5Var.a(org.telegram.ui.y4.c((TLRPC.User) a5Var.f43598c, (TLRPC.UserFull) obj, e5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        d5Var.a(org.telegram.ui.y4.a((TLRPC.Chat) a5Var.f43598c, (TLRPC.ChatFull) obj, e5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                u10 u10Var = (u10) this.f5301c;
                e5.f fVar3 = (e5.f) obj;
                if (((e5.f) this.f5300b).f9593a == 0) {
                    org.telegram.messenger.g0.h3(new gi.k9(u10Var, 2));
                    return;
                }
                return;
            default:
                xg.v vVar = (xg.v) this.f5301c;
                e5.f fVar4 = (e5.f) obj;
                if (((e5.f) this.f5300b).f9593a == 0) {
                    org.telegram.messenger.g0.h3(new xf.c(vVar, 4));
                    return;
                }
                return;
        }
    }
}
