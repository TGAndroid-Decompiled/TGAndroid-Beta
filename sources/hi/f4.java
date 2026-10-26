package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f4 implements Runnable {
    public final int f12985a;
    public final o4 f12986b;

    public f4(o4 o4Var, int i10) {
        this.f12985a = i10;
        this.f12986b = o4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        switch (this.f12985a) {
            case 0:
                this.f12986b.f13180n.Q();
                return;
            case 1:
                this.f12986b.O();
                return;
            case 2:
                o4 o4Var = this.f12986b;
                if (!o4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = MessagesController.getInstance(o4Var.F).getInputUser(o4Var.v);
                    tL_messages_prolongWebView.peer = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.f13183w);
                    tL_messages_prolongWebView.query_id = o4Var.f13184x;
                    tL_messages_prolongWebView.silent = false;
                    if (o4Var.f13185y != 0) {
                        TLRPC.InputReplyTo createReplyInput = SendMessagesHelper.getInstance(o4Var.F).createReplyInput(o4Var.f13185y);
                        tL_messages_prolongWebView.reply_to = createReplyInput;
                        if (o4Var.E != 0) {
                            createReplyInput.monoforum_peer_id = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (o4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(o4Var.F).getInputPeer(o4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (o4Var.f13183w < 0 && (chatFull = MessagesController.getInstance(o4Var.F).getChatFull(-o4Var.f13183w)) != null && (peer = chatFull.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = MessagesController.getInstance(o4Var.F).getInputPeer(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(o4Var.F).sendRequest(tL_messages_prolongWebView, new bi.i0(o4Var, 12));
                    return;
                }
                return;
            case 3:
                o4 o4Var2 = this.f12986b;
                o4Var2.f30215b.e2(o4Var2, 0);
                o4Var2.f13180n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f12986b.f13180n.n(true, false);
                return;
        }
    }
}
