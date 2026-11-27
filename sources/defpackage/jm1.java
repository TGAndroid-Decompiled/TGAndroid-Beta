package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class jm1 implements n39, fd {
    public final byte a;
    public final zu1 b;
    public final r47 c;

    public jm1(zu1 zu1Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = r47Var;
    }

    @Override
    public final void g(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        byte b = this.a;
        r47 r47Var = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.getClass();
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", r47Var.e1());
                    bundle.putLong("report_reaction_from_dialog_id", zu1Var.l6);
                }
                zu1Var.presentFragment(new ProfileActivity(bundle, null));
                zu1Var.M5(true);
                return;
            default:
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", r47Var.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", zu1Var.l6);
                }
                zu1Var.presentFragment(new ProfileActivity(bundle2, null));
                zu1Var.M5(true);
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        zu1 zu1Var = this.b;
        id[] idVarArr = {new id(3, zu1Var.Ba, zu1Var.getParentActivity())};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        r47 r47Var = this.c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) r47Var.k.media).poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = zu1Var.getMessagesController().j1(zu1Var.l6);
        tL_messages_editMessage.id = r47Var.e1();
        tL_messages_editMessage.flags |= 16384;
        hl.d3(new zm1(zu1Var, idVarArr, zu1Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new fn0(zu1Var, idVarArr, tL_messages_editMessage, (byte) 16)), (byte) 2), 500L);
    }
}
