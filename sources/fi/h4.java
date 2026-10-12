package fi;

import bi.z7;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Runnable {
    public final int f9309a;
    public final q4 f9310b;

    public h4(q4 q4Var, int i10) {
        this.f9309a = i10;
        this.f9310b = q4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f9309a) {
            case 0:
                this.f9310b.f9495n.Q();
                return;
            case 1:
                this.f9310b.O();
                return;
            case 2:
                q4 q4Var = this.f9310b;
                if (!q4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(q4Var.F).getInputUser(q4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.f9498w);
                    tL_messages_prolongWebView.query_id = q4Var.f9499x;
                    tL_messages_prolongWebView.silent = false;
                    if (q4Var.f9500y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(q4Var.F).createReplyInput(q4Var.f9500y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (q4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (q4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (q4Var.f9498w < 0 && (chatFull = MessagesController.getInstance(q4Var.F).getChatFull(-q4Var.f9498w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(q4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(q4Var.F).sendRequest(tL_messages_prolongWebView, new z7(q4Var, 7));
                    return;
                }
                return;
            case 3:
                q4 q4Var2 = this.f9310b;
                q4Var2.f27671b.b2(q4Var2, 0);
                q4Var2.f9495n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f9310b.f9495n.n(true, false);
                return;
        }
    }
}
