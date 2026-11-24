package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class sc2 implements Runnable {
    public final byte a;
    public final zc2 b;

    public sc2(zc2 zc2Var, byte b) {
        this.a = b;
        this.b = zc2Var;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        byte b = this.a;
        zc2 zc2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = zc2Var.w;
                wc2 wc2Var = zc2Var.Y0;
                if (wc2Var != null) {
                    if (zc2Var.L) {
                        tL_chatAdminRights = zc2Var.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    wc2Var.b(0, tL_chatAdminRights, null, zc2Var.T);
                }
                Bundle l = ir2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", zc2Var.x.id);
                if (!zc2Var.getMessagesController().A(l, zc2Var, null, null)) {
                    zc2Var.p0(false);
                    return;
                }
                mu1 mu1Var = new mu1(l);
                zc2Var.presentFragment(mu1Var, true);
                if (u21.a(mu1Var)) {
                    if (zc2Var.a1) {
                        if (zc2Var.L) {
                            String str = user.first_name;
                            t11 t11Var = new t11(mu1Var.getParentActivity(), mu1Var.Ba);
                            t11Var.d(2131624049, "Shield");
                            de9.r("UserAddedAsAdminHint", null, 2131743529, new Object[]{str}, t11Var.b);
                            m21.g(mu1Var, t11Var, 1500).j();
                            return;
                        }
                        return;
                    } else if (!zc2Var.M && zc2Var.L) {
                        u21.C(user.first_name, mu1Var).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                zc2Var.n0(false);
                return;
            default:
                if (zc2Var.r) {
                    long j = zc2Var.n;
                    hd[] hdVarArr = {new hd(3, null, zc2Var.getParentActivity())};
                    zc2Var.getMessagesController().i5(zc2Var.s, j, true, false, true, new wh0(hdVarArr, (byte) 4), new wh0(hdVarArr, (byte) 5));
                    hdVarArr[0].q(300L);
                }
                wc2 wc2Var2 = zc2Var.Y0;
                if (wc2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = zc2Var.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!zc2Var.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!zc2Var.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i = 0;
                    }
                    wc2Var2.b(i, tL_chatAdminRights2, zc2Var.P, zc2Var.T);
                    zc2Var.finishFragment();
                    return;
                }
                return;
        }
    }
}
