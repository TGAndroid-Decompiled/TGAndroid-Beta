package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class rs5 implements e56 {
    public final ss5 a;

    public rs5(ss5 ss5Var) {
        this.a = ss5Var;
    }

    @Override
    public final void a() {
        xs5 xs5Var = this.a.c;
        d dVar = xs5Var.O1;
        if (dVar instanceof ak6) {
            ak6 ak6Var = (ak6) dVar;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = xs5Var.l1;
            s56 s56Var = new s56(1, ak6Var.n);
            s56Var.T = ak6Var.t0;
            s56Var.d0(tL_chatInviteExported);
            ak6Var.presentFragment(s56Var);
        } else {
            s56 s56Var2 = new s56(1, xs5Var.a2);
            s56Var2.d0(xs5Var.l1);
            s56Var2.T = new qs5(this);
            xs5Var.O1.presentFragment(s56Var2);
        }
        xs5Var.dismiss();
    }

    @Override
    public final void c() {
        xs5 xs5Var = this.a.c;
        d dVar = xs5Var.O1;
        if (dVar instanceof ak6) {
            ((ak6) dVar).j0(xs5Var.l1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = xs5Var.l1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = oc7.r1(xs5Var.a).i1(-xs5Var.a2);
            ConnectionsManager.getInstance(xs5Var.a).sendRequest(tL_messages_editExportedChatInvite, new ps5(this, (byte) 0));
        }
        xs5Var.dismiss();
    }

    @Override
    public final void m() {
        xs5 xs5Var = this.a.c;
        d dVar = xs5Var.O1;
        if (dVar instanceof ak6) {
            ((ak6) dVar).e0(xs5Var.l1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = xs5Var.l1.link;
            tL_messages_deleteExportedChatInvite.peer = oc7.r1(xs5Var.a).i1(-xs5Var.a2);
            ConnectionsManager.getInstance(xs5Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new ps5(this, (byte) 1));
        }
        xs5Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
