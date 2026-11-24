package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class de2 implements Runnable {
    public final byte a;
    public final ke2 b;

    public de2(ke2 ke2Var, byte b) {
        this.a = b;
        this.b = ke2Var;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        byte b = this.a;
        ke2 ke2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = ke2Var.w;
                he2 he2Var = ke2Var.Y0;
                if (he2Var != null) {
                    if (ke2Var.L) {
                        tL_chatAdminRights = ke2Var.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    he2Var.b(0, tL_chatAdminRights, null, ke2Var.T);
                }
                Bundle l = ts2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", ke2Var.x.id);
                if (!ke2Var.getMessagesController().A(l, ke2Var, null, null)) {
                    ke2Var.q0(false);
                    return;
                }
                yv1 yv1Var = new yv1(l);
                ke2Var.presentFragment(yv1Var, true);
                if (c41.a(yv1Var)) {
                    if (ke2Var.a1) {
                        if (ke2Var.L) {
                            String str = user.first_name;
                            b31 b31Var = new b31(yv1Var.getParentActivity(), yv1Var.Ba);
                            b31Var.d(2131624049, "Shield");
                            hg9.q("UserAddedAsAdminHint", null, 2131743455, new Object[]{str}, b31Var.b);
                            u31.g(yv1Var, b31Var, 1500).j();
                            return;
                        }
                        return;
                    } else if (!ke2Var.M && ke2Var.L) {
                        c41.C(user.first_name, yv1Var).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ke2Var.o0(false);
                return;
            default:
                if (ke2Var.r) {
                    long j = ke2Var.n;
                    he[] heVarArr = {new he(3, null, ke2Var.getParentActivity())};
                    ke2Var.getMessagesController().k5(ke2Var.s, j, true, false, true, new wi0(heVarArr, (byte) 4), new wi0(heVarArr, (byte) 5));
                    heVarArr[0].q(300L);
                }
                he2 he2Var2 = ke2Var.Y0;
                if (he2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = ke2Var.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!ke2Var.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!ke2Var.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i = 0;
                    }
                    he2Var2.b(i, tL_chatAdminRights2, ke2Var.P, ke2Var.T);
                    ke2Var.finishFragment();
                    return;
                }
                return;
        }
    }
}
