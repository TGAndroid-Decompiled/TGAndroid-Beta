package ei;

import ai.o8;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g4 implements Runnable {
    public final int f9083a;
    public final p4 f9084b;

    public g4(p4 p4Var, int i10) {
        this.f9083a = i10;
        this.f9084b = p4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f9083a) {
            case 0:
                this.f9084b.f9291n.Q();
                return;
            case 1:
                this.f9084b.O();
                return;
            case 2:
                p4 p4Var = this.f9084b;
                if (!p4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(p4Var.F).getInputUser(p4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.f9294w);
                    tL_messages_prolongWebView.query_id = p4Var.f9295x;
                    tL_messages_prolongWebView.silent = false;
                    if (p4Var.f9296y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(p4Var.F).createReplyInput(p4Var.f9296y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (p4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (p4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(p4Var.F).getInputPeer(p4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (p4Var.f9294w < 0 && (chatFull = MessagesController.getInstance(p4Var.F).getChatFull(-p4Var.f9294w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(p4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(p4Var.F).sendRequest(tL_messages_prolongWebView, new o8(p4Var, 7));
                    return;
                }
                return;
            case 3:
                p4 p4Var2 = this.f9084b;
                p4Var2.f30245b.b2(p4Var2, 0);
                p4Var2.f9291n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f9084b.f9291n.n(true, false);
                return;
        }
    }
}
