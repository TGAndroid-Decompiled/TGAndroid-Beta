package mg;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.a5;
import org.telegram.ui.b5;
import org.telegram.ui.bk0;
import org.telegram.ui.v4;
import org.telegram.ui.x4;
import vh.b4;
import vh.s7;
public final class f0 implements q0.a {
    public final int f13114a;
    public final Object f13115b;
    public final Object f13116c;

    public f0(int i10, Object obj, Object obj2) {
        this.f13114a = i10;
        this.f13115b = obj;
        this.f13116c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String j10;
        boolean z11;
        String j11;
        switch (this.f13114a) {
            case 0:
                q20 q20Var = (q20) this.f13116c;
                c5.g gVar = (c5.g) obj;
                if (((c5.g) this.f13115b).f3785a == 0) {
                    org.telegram.messenger.i0.g3(new g0(q20Var, 1));
                    return;
                }
                return;
            case 1:
                o0 o0Var = (o0) this.f13116c;
                c5.g gVar2 = (c5.g) obj;
                if (((c5.g) this.f13115b).f3785a == 0) {
                    org.telegram.messenger.i0.g3(new lg.s(o0Var, 8));
                    return;
                }
                return;
            case 2:
                a5 a5Var = (a5) this.f13115b;
                v4 v4Var = (v4) this.f13116c;
                b5[] b5VarArr = v4Var.f42595i;
                x4 x4Var = v4Var.f42596j;
                if (!a5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        a5Var.a(v4.c((TLRPC.User) x4Var.f43436c, (TLRPC.UserFull) obj, b5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        a5Var.a(v4.a((TLRPC.Chat) x4Var.f43436c, (TLRPC.ChatFull) obj, b5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                q70 q70Var = (q70) this.f13116c;
                c5.g gVar3 = (c5.g) obj;
                int i10 = ((c5.g) this.f13115b).f3785a;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.u1.j(i10);
                }
                org.telegram.messenger.i0.g3(new bk0(q70Var, z10, j10, 16));
                return;
            case 4:
                ih.s sVar = (ih.s) this.f13116c;
                c5.g gVar4 = (c5.g) obj;
                int i11 = ((c5.g) this.f13115b).f3785a;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j11 = null;
                } else {
                    j11 = org.telegram.messenger.u1.j(i11);
                }
                org.telegram.messenger.i0.g3(new bk0(sVar, z11, j11, 15));
                return;
            default:
                b4.X((s7) this.f13115b, (ig.s0) this.f13116c, (Integer) obj);
                return;
        }
    }
}
