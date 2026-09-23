package ei;

import ai.n8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g4 implements Runnable {
    public final int f8350a;
    public final q4 f8351b;

    public g4(q4 q4Var, int i10) {
        this.f8350a = i10;
        this.f8351b = q4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f8350a) {
            case 0:
                this.f8351b.f8553n.R();
                return;
            case 1:
                this.f8351b.L();
                return;
            case 2:
                q4 q4Var = this.f8351b;
                if (!q4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(q4Var.F).getInputUser(q4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(q4Var.F).getInputPeer(q4Var.f8556w);
                    tL_messages_prolongWebView.query_id = q4Var.f8557x;
                    tL_messages_prolongWebView.silent = false;
                    if (q4Var.f8558y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(q4Var.F).createReplyInput(q4Var.f8558y);
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
                    if (q4Var.f8556w < 0 && (chatFull = MessagesController.getInstance(q4Var.F).getChatFull(-q4Var.f8556w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(q4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(q4Var.F).sendRequest(tL_messages_prolongWebView, new n8(q4Var, 7));
                    return;
                }
                return;
            case 3:
                q4 q4Var2 = this.f8351b;
                q4Var2.f26744b.X1(q4Var2, 0);
                q4Var2.f8553n.o(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f8351b.f8553n.o(true, false);
                return;
        }
    }
}
