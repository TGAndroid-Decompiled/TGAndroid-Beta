package hi;

import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s3 implements Runnable {
    public final int f14946a;
    public final c4 f14947b;

    public s3(c4 c4Var, int i7) {
        this.f14946a = i7;
        this.f14947b = c4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        switch (this.f14946a) {
            case 0:
                this.f14947b.f14592n.R();
                return;
            case 1:
                this.f14947b.P();
                return;
            case 2:
                c4 c4Var = this.f14947b;
                if (!c4Var.T) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = qp.s1(c4Var.F).o1(c4Var.f14595w);
                    tL_messages_prolongWebView.peer = qp.s1(c4Var.F).j1(c4Var.f14596x);
                    tL_messages_prolongWebView.query_id = c4Var.f14597y;
                    tL_messages_prolongWebView.silent = false;
                    if (c4Var.D != 0) {
                        gz.C(c4Var.F);
                        int i7 = c4Var.D;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (c4Var.E != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = qp.s1(c4Var.F).j1(c4Var.E);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (c4Var.E != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = qp.s1(c4Var.F).j1(c4Var.E);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (c4Var.f14596x < 0 && (N0 = qp.s1(c4Var.F).N0(-c4Var.f14596x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = qp.s1(c4Var.F).m1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(c4Var.F).sendRequest(tL_messages_prolongWebView, new bi.j0(c4Var, 12));
                    return;
                }
                return;
            case 3:
                c4 c4Var2 = this.f14947b;
                c4Var2.f39004b.M1(c4Var2, 0);
                c4Var2.f14592n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f14947b.f14592n.n(true, false);
                return;
        }
    }
}
