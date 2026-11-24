package defpackage;

import org.telegram.tgnet.TLRPC;
public final class me3 extends u2b {
    public final ue3 S;

    public me3(ue3 ue3Var) {
        super(null, false);
        this.S = ue3Var;
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
        ue3 ue3Var = this.S;
        cj3 cj3Var = ue3Var.E4;
        if (cj3Var != null && !ue3Var.P0) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i2 = ue3Var.G0;
            if (i > 0) {
                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                if (V1 != null && V1.linked_community_id != 0) {
                    cj3Var.showDialog(new eo2(cj3Var, V1.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
            if (K0 != null && K0.linked_community_id != 0) {
                cj3Var.showDialog(new eo2(cj3Var, K0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        ue3 ue3Var = this.S;
        qe3 qe3Var = ue3Var.e0;
        if (qe3Var == null) {
            return;
        }
        qe3Var.v(ue3Var);
    }

    @Override
    public final void f(long j) {
        ue3 ue3Var = this.S;
        qe3 qe3Var = ue3Var.e0;
        if (qe3Var == null) {
            return;
        }
        if (ue3Var.K0 != 0) {
            qe3Var.s();
        } else {
            qe3Var.k(ue3Var);
        }
    }
}
