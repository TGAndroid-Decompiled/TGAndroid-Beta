package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w3 implements Runnable {
    public final int f11533a;
    public final f4 f11534b;

    public w3(f4 f4Var, int i10) {
        this.f11533a = i10;
        this.f11534b = f4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f11533a) {
            case 0:
                this.f11534b.f11211n.Q();
                return;
            case 1:
                this.f11534b.O();
                return;
            case 2:
                f4 f4Var = this.f11534b;
                if (!f4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(f4Var.F).getInputUser(f4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.f11214w);
                    tL_messages_prolongWebView.query_id = f4Var.f11215x;
                    tL_messages_prolongWebView.silent = false;
                    if (f4Var.f11216y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(f4Var.F).createReplyInput(f4Var.f11216y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (f4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (f4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(f4Var.F).getInputPeer(f4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (f4Var.f11214w < 0 && (chatFull = MessagesController.getInstance(f4Var.F).getChatFull(-f4Var.f11214w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(f4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(f4Var.F).sendRequest(tL_messages_prolongWebView, new ai.h(f4Var, 13));
                    return;
                }
                return;
            case 3:
                f4 f4Var2 = this.f11534b;
                f4Var2.f28245b.b2(f4Var2, 0);
                f4Var2.f11211n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f11534b.f11211n.n(true, false);
                return;
        }
    }
}
