package defpackage;

import org.telegram.tgnet.TLRPC;
public final class zf3 extends v4b {
    public final hg3 S;

    public zf3(hg3 hg3Var) {
        super(null, false);
        this.S = hg3Var;
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
        hg3 hg3Var = this.S;
        nk3 nk3Var = hg3Var.E4;
        if (nk3Var != null && !hg3Var.P0) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i2 = hg3Var.G0;
            if (i > 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                if (W1 != null && W1.linked_community_id != 0) {
                    nk3Var.showDialog(new pp2(nk3Var, W1.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
            if (L0 != null && L0.linked_community_id != 0) {
                nk3Var.showDialog(new pp2(nk3Var, L0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        hg3 hg3Var = this.S;
        dg3 dg3Var = hg3Var.e0;
        if (dg3Var == null) {
            return;
        }
        dg3Var.u(hg3Var);
    }

    @Override
    public final void f(long j) {
        hg3 hg3Var = this.S;
        dg3 dg3Var = hg3Var.e0;
        if (dg3Var == null) {
            return;
        }
        if (hg3Var.K0 != 0) {
            dg3Var.r();
        } else {
            dg3Var.k(hg3Var);
        }
    }
}
