package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class tq5 implements e36 {
    public final uq5 a;

    public tq5(uq5 uq5Var) {
        this.a = uq5Var;
    }

    @Override
    public final void a() {
        zq5 zq5Var = this.a.c;
        d dVar = zq5Var.O1;
        if (dVar instanceof yh6) {
            yh6 yh6Var = (yh6) dVar;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = zq5Var.l1;
            s36 s36Var = new s36(1, yh6Var.n);
            s36Var.T = yh6Var.t0;
            s36Var.c0(tL_chatInviteExported);
            yh6Var.presentFragment(s36Var);
        } else {
            s36 s36Var2 = new s36(1, zq5Var.a2);
            s36Var2.c0(zq5Var.l1);
            s36Var2.T = new sq5(this);
            zq5Var.O1.presentFragment(s36Var2);
        }
        zq5Var.dismiss();
    }

    @Override
    public final void c() {
        zq5 zq5Var = this.a.c;
        d dVar = zq5Var.O1;
        if (dVar instanceof yh6) {
            ((yh6) dVar).i0(zq5Var.l1);
        } else {
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = zq5Var.l1.link;
            tL_messages_editExportedChatInvite.revoked = true;
            tL_messages_editExportedChatInvite.peer = na7.q1(zq5Var.a).h1(-zq5Var.a2);
            ConnectionsManager.getInstance(zq5Var.a).sendRequest(tL_messages_editExportedChatInvite, new rq5(this, (byte) 0));
        }
        zq5Var.dismiss();
    }

    @Override
    public final void k() {
        zq5 zq5Var = this.a.c;
        d dVar = zq5Var.O1;
        if (dVar instanceof yh6) {
            ((yh6) dVar).d0(zq5Var.l1);
        } else {
            TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
            tL_messages_deleteExportedChatInvite.link = zq5Var.l1.link;
            tL_messages_deleteExportedChatInvite.peer = na7.q1(zq5Var.a).h1(-zq5Var.a2);
            ConnectionsManager.getInstance(zq5Var.a).sendRequest(tL_messages_deleteExportedChatInvite, new rq5(this, (byte) 1));
        }
        zq5Var.dismiss();
    }

    @Override
    public final void i() {
    }
}
