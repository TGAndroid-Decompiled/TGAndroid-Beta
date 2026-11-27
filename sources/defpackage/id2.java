package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class id2 implements Runnable {
    public final byte a;
    public final pd2 b;

    public id2(pd2 pd2Var, byte b) {
        this.a = b;
        this.b = pd2Var;
    }

    @Override
    public final void run() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        byte b = this.a;
        pd2 pd2Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                TLRPC.User user = pd2Var.w;
                md2 md2Var = pd2Var.Y0;
                if (md2Var != null) {
                    if (pd2Var.L) {
                        tL_chatAdminRights = pd2Var.N;
                    } else {
                        tL_chatAdminRights = null;
                    }
                    md2Var.b(0, tL_chatAdminRights, null, pd2Var.T);
                }
                Bundle l = bs2.l("scrollToTopOnResume", true);
                l.putLong("chat_id", pd2Var.x.id);
                if (!pd2Var.getMessagesController().C(l, pd2Var, null, null)) {
                    pd2Var.p0(false);
                    return;
                }
                zu1 zu1Var = new zu1(l);
                pd2Var.presentFragment(zu1Var, true);
                if (d31.a(zu1Var)) {
                    if (pd2Var.a1) {
                        if (pd2Var.L) {
                            String str = user.first_name;
                            c21 c21Var = new c21(zu1Var.getParentActivity(), zu1Var.Ba);
                            c21Var.h(2131624049, "Shield");
                            uh9.r("UserAddedAsAdminHint", null, 2131743423, new Object[]{str}, c21Var.b);
                            v21.g(zu1Var, c21Var, 1500).j();
                            return;
                        }
                        return;
                    } else if (!pd2Var.M && pd2Var.L) {
                        d31.C(user.first_name, zu1Var).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                pd2Var.n0(false);
                return;
            default:
                if (pd2Var.r) {
                    long j = pd2Var.n;
                    id[] idVarArr = {new id(3, null, pd2Var.getParentActivity())};
                    pd2Var.getMessagesController().q5(pd2Var.s, j, true, false, true, new xh0(idVarArr, (byte) 4), new xh0(idVarArr, (byte) 5));
                    idVarArr[0].q(300L);
                }
                md2 md2Var2 = pd2Var.Y0;
                if (md2Var2 != null) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = pd2Var.N;
                    if (!tL_chatAdminRights2.change_info && !tL_chatAdminRights2.post_messages && !tL_chatAdminRights2.manage_direct_messages && !tL_chatAdminRights2.manage_welcome_messages && !tL_chatAdminRights2.edit_messages && !tL_chatAdminRights2.delete_messages && !tL_chatAdminRights2.ban_users && !tL_chatAdminRights2.invite_users && ((!pd2Var.H || !tL_chatAdminRights2.manage_topics) && !tL_chatAdminRights2.pin_messages && !tL_chatAdminRights2.manage_ranks && !tL_chatAdminRights2.add_admins && !tL_chatAdminRights2.anonymous && !tL_chatAdminRights2.manage_call && ((!pd2Var.F || (!tL_chatAdminRights2.post_stories && !tL_chatAdminRights2.edit_stories && !tL_chatAdminRights2.delete_stories)) && !tL_chatAdminRights2.other))) {
                        i = 0;
                    }
                    md2Var2.b(i, tL_chatAdminRights2, pd2Var.P, pd2Var.T);
                    pd2Var.finishFragment();
                    return;
                }
                return;
        }
    }
}
