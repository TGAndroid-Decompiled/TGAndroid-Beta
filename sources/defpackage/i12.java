package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i12 implements Runnable {
    public final byte a;
    public final s12 b;

    public i12(s12 s12Var, byte b) {
        this.a = b;
        this.b = s12Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull L0;
        TLRPC.Peer peer;
        byte b = this.a;
        s12 s12Var = this.b;
        switch (b) {
            case 0:
                s12Var.n.O();
                return;
            case 1:
                s12Var.Q();
                return;
            case 2:
                if (!s12Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = na7.q1(s12Var.G).m1(s12Var.w);
                    tL_messages_prolongWebView.peer = na7.q1(s12Var.G).h1(s12Var.x);
                    tL_messages_prolongWebView.query_id = s12Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (s12Var.E != 0) {
                        z3a.B(s12Var.G);
                        int i = s12Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (s12Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = na7.q1(s12Var.G).h1(s12Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (s12Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = na7.q1(s12Var.G).h1(s12Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (s12Var.x < 0 && (L0 = na7.q1(s12Var.G).L0(-s12Var.x)) != null && (peer = L0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = na7.q1(s12Var.G).k1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(s12Var.G).sendRequest(tL_messages_prolongWebView, new uf(s12Var, (byte) 11));
                    return;
                }
                return;
            case 3:
                s12Var.b.H1(s12Var, 0);
                s12Var.n.l(false, false);
                System.currentTimeMillis();
                return;
            default:
                s12Var.n.l(true, false);
                return;
        }
    }
}
