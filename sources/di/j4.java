package di;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j4 implements Runnable {
    public final int f6703a;
    public final u4 f6704b;

    public j4(u4 u4Var, int i10) {
        this.f6703a = i10;
        this.f6704b = u4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f6703a) {
            case 0:
                this.f6704b.f6947n.R();
                return;
            case 1:
                this.f6704b.L();
                return;
            case 2:
                u4 u4Var = this.f6704b;
                if (!u4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(u4Var.F).getInputUser(u4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.f6950w);
                    tL_messages_prolongWebView.query_id = u4Var.f6951x;
                    tL_messages_prolongWebView.silent = false;
                    if (u4Var.f6952y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(u4Var.F).createReplyInput(u4Var.f6952y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (u4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (u4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(u4Var.F).getInputPeer(u4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (u4Var.f6950w < 0 && (chatFull = MessagesController.getInstance(u4Var.F).getChatFull(-u4Var.f6950w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(u4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(u4Var.F).sendRequest(tL_messages_prolongWebView, new bi.c2(u4Var, 4));
                    return;
                }
                return;
            case 3:
                u4 u4Var2 = this.f6704b;
                u4Var2.f26422b.X1(u4Var2, 0);
                u4Var2.f6947n.o(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f6704b.f6947n.o(true, false);
                return;
        }
    }
}
