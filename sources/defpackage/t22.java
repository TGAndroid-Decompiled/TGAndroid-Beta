package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t22 implements Runnable {
    public final byte a;
    public final e32 b;

    public t22(e32 e32Var, byte b) {
        this.a = b;
        this.b = e32Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.Peer peer;
        byte b = this.a;
        e32 e32Var = this.b;
        switch (b) {
            case 0:
                e32Var.n.O();
                return;
            case 1:
                e32Var.P();
                return;
            case 2:
                if (!e32Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = oc7.r1(e32Var.G).n1(e32Var.w);
                    tL_messages_prolongWebView.peer = oc7.r1(e32Var.G).i1(e32Var.x);
                    tL_messages_prolongWebView.query_id = e32Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (e32Var.E != 0) {
                        a6a.B(e32Var.G);
                        int i = e32Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (e32Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = oc7.r1(e32Var.G).i1(e32Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (e32Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = oc7.r1(e32Var.G).i1(e32Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (e32Var.x < 0 && (M0 = oc7.r1(e32Var.G).M0(-e32Var.x)) != null && (peer = M0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = oc7.r1(e32Var.G).l1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(e32Var.G).sendRequest(tL_messages_prolongWebView, new tg(e32Var, (byte) 11));
                    return;
                }
                return;
            case 3:
                e32Var.b.H1(e32Var, 0);
                e32Var.n.l(false, false);
                System.currentTimeMillis();
                return;
            default:
                e32Var.n.l(true, false);
                return;
        }
    }
}
