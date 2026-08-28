package mh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w3 implements Runnable {
    public final int f18189a;
    public final g4 f18190b;

    public w3(g4 g4Var, int i9) {
        this.f18189a = i9;
        this.f18190b = g4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f18189a) {
            case 0:
                this.f18190b.f17861n.L();
                return;
            case 1:
                this.f18190b.K();
                return;
            case 2:
                g4 g4Var = this.f18190b;
                if (!g4Var.P) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(g4Var.B).getInputUser(g4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.f17864w);
                    tL_messages_prolongWebView.query_id = g4Var.f17865x;
                    tL_messages_prolongWebView.silent = false;
                    if (g4Var.f17866y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(g4Var.B).createReplyInput(g4Var.f17866y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (g4Var.A != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.A);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (g4Var.A != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(g4Var.B).getInputPeer(g4Var.A);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (g4Var.f17864w < 0 && (chatFull = MessagesController.getInstance(g4Var.B).getChatFull(-g4Var.f17864w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(g4Var.B).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(g4Var.B).sendRequest(tL_messages_prolongWebView, new bf.a(g4Var, 18));
                    return;
                }
                return;
            case 3:
                g4 g4Var2 = this.f18190b;
                g4Var2.f27493b.X1(g4Var2, 0);
                g4Var2.f17861n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f18190b.f17861n.n(true, false);
                return;
        }
    }
}
