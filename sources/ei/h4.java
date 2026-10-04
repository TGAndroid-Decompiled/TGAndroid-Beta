package ei;

import ai.n8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h4 implements Runnable {
    public final int f9084a;
    public final r4 f9085b;

    public h4(r4 r4Var, int i10) {
        this.f9084a = i10;
        this.f9085b = r4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f9084a) {
            case 0:
                this.f9085b.f9306n.R();
                return;
            case 1:
                this.f9085b.J();
                return;
            case 2:
                r4 r4Var = this.f9085b;
                if (!r4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(r4Var.F).getInputUser(r4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.f9309w);
                    tL_messages_prolongWebView.query_id = r4Var.f9310x;
                    tL_messages_prolongWebView.silent = false;
                    if (r4Var.f9311y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(r4Var.F).createReplyInput(r4Var.f9311y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (r4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (r4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(r4Var.F).getInputPeer(r4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (r4Var.f9309w < 0 && (chatFull = MessagesController.getInstance(r4Var.F).getChatFull(-r4Var.f9309w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(r4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(r4Var.F).sendRequest(tL_messages_prolongWebView, new n8(r4Var, 7));
                    return;
                }
                return;
            case 3:
                r4 r4Var2 = this.f9085b;
                r4Var2.f29642b.U1(r4Var2, 0);
                r4Var2.f9306n.o(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f9085b.f9306n.o(true, false);
                return;
        }
    }
}
