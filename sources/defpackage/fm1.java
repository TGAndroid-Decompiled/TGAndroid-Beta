package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class fm1 implements zz8, ed {
    public final byte a;
    public final mu1 b;
    public final k27 c;

    public fm1(mu1 mu1Var, k27 k27Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = k27Var;
    }

    @Override
    public final void l(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        k27 k27Var = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", k27Var.e1());
                    bundle.putLong("report_reaction_from_dialog_id", mu1Var.l6);
                }
                mu1Var.presentFragment(new ProfileActivity(bundle, null));
                mu1Var.F5(true);
                return;
            default:
                mu1Var.getClass();
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", k27Var.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", mu1Var.l6);
                }
                mu1Var.presentFragment(new ProfileActivity(bundle2, null));
                mu1Var.F5(true);
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        mu1 mu1Var = this.b;
        hd[] hdVarArr = {new hd(3, mu1Var.Ba, mu1Var.getParentActivity())};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        k27 k27Var = this.c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) k27Var.k.media).poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = mu1Var.getMessagesController().h1(mu1Var.l6);
        tL_messages_editMessage.id = k27Var.e1();
        tL_messages_editMessage.flags |= 16384;
        gl.e3(new xm1(mu1Var, hdVarArr, mu1Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new en0(mu1Var, hdVarArr, tL_messages_editMessage, (byte) 17)), (byte) 2), 500L);
    }
}
