package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y12 implements Runnable {
    public final byte a;
    public final j22 b;

    public y12(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                j22Var.n.O();
                return;
            case 1:
                j22Var.P();
                return;
            case 2:
                if (!j22Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = uc7.s1(j22Var.G).o1(j22Var.w);
                    tL_messages_prolongWebView.peer = uc7.s1(j22Var.G).j1(j22Var.x);
                    tL_messages_prolongWebView.query_id = j22Var.y;
                    tL_messages_prolongWebView.silent = false;
                    if (j22Var.E != 0) {
                        r7a.B(j22Var.G);
                        int i = j22Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (j22Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = uc7.s1(j22Var.G).j1(j22Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (j22Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = uc7.s1(j22Var.G).j1(j22Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (j22Var.x < 0 && (N0 = uc7.s1(j22Var.G).N0(-j22Var.x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = uc7.s1(j22Var.G).m1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(j22Var.G).sendRequest(tL_messages_prolongWebView, new ye(j22Var, (byte) 11));
                    return;
                }
                return;
            case 3:
                j22Var.b.I1(j22Var, 0);
                j22Var.n.l(false, false);
                System.currentTimeMillis();
                return;
            default:
                j22Var.n.l(true, false);
                return;
        }
    }
}
