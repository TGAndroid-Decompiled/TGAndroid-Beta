package defpackage;

import org.telegram.tgnet.TLRPC;
public final class gf3 extends q6b {
    public final of3 S;

    public gf3(of3 of3Var) {
        super(null, false);
        this.S = of3Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.P0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j) {
        of3 of3Var = this.S;
        uj3 uj3Var = of3Var.E4;
        if (uj3Var != null && !of3Var.P0) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i2 = of3Var.G0;
            if (i > 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                if (X1 != null && X1.linked_community_id != 0) {
                    uj3Var.showDialog(new xo2(uj3Var, X1.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
            if (M0 != null && M0.linked_community_id != 0) {
                uj3Var.showDialog(new xo2(uj3Var, M0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        of3 of3Var = this.S;
        kf3 kf3Var = of3Var.e0;
        if (kf3Var == null) {
            return;
        }
        kf3Var.v(of3Var);
    }

    @Override
    public final void f(long j) {
        of3 of3Var = this.S;
        kf3 kf3Var = of3Var.e0;
        if (kf3Var == null) {
            return;
        }
        if (of3Var.K0 != 0) {
            kf3Var.r();
        } else {
            kf3Var.k(of3Var);
        }
    }
}
