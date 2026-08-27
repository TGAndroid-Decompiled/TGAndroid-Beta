package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class u3 implements Runnable {

    public final int f18989a;

    public final e4 f18990b;

    public u3(e4 e4Var, int i10) {
        this.f18989a = i10;
        this.f18990b = e4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f18989a) {
            case 0:
                this.f18990b.f18669n.L();
                break;
            case 1:
                this.f18990b.L();
                break;
            case 2:
                e4 e4Var = this.f18990b;
                if (!e4Var.P) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(e4Var.B).getInputUser(e4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.f18672w);
                    tL_messages_prolongWebView.query_id = e4Var.f18673x;
                    tL_messages_prolongWebView.silent = false;
                    if (e4Var.f18674y != 0) {
                        TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(e4Var.B).createReplyInput(e4Var.f18674y);
                        tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
                        if (e4Var.A != 0) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.A);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (e4Var.A != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(e4Var.B).getInputPeer(e4Var.A);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (e4Var.f18672w < 0 && (chatFull = MessagesController.getInstance(e4Var.B).getChatFull(-e4Var.f18672w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(e4Var.B).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(e4Var.B).sendRequest(tL_messages_prolongWebView, new cf.a(e4Var, 18));
                }
                break;
            case 3:
                e4 e4Var2 = this.f18990b;
                e4Var2.f34900b.X1(e4Var2, 0);
                e4Var2.f18669n.n(false, false);
                System.currentTimeMillis();
                break;
            default:
                this.f18990b.f18669n.n(true, false);
                break;
        }
    }
}
