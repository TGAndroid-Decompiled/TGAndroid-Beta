package ki;

import org.telegram.messenger.mp;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18764a;
    public final s3 f18765b;

    public j3(s3 s3Var, int i7) {
        this.f18764a = i7;
        this.f18765b = s3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.Peer peer;
        switch (this.f18764a) {
            case 0:
                this.f18765b.f18965n.R();
                return;
            case 1:
                this.f18765b.Q();
                return;
            case 2:
                s3 s3Var = this.f18765b;
                if (!s3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = mp.u1(s3Var.G).q1(s3Var.f18968w);
                    tL_messages_prolongWebView.peer = mp.u1(s3Var.G).l1(s3Var.f18969x);
                    tL_messages_prolongWebView.query_id = s3Var.f18970y;
                    tL_messages_prolongWebView.silent = false;
                    if (s3Var.E != 0) {
                        zy.C(s3Var.G);
                        int i7 = s3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (s3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = mp.u1(s3Var.G).l1(s3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (s3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(s3Var.G).l1(s3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (s3Var.f18969x < 0 && (P0 = mp.u1(s3Var.G).P0(-s3Var.f18969x)) != null && (peer = P0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = mp.u1(s3Var.G).o1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(s3Var.G).sendRequest(tL_messages_prolongWebView, new ai.g1(s3Var, 22));
                    return;
                }
                return;
            case 3:
                s3 s3Var2 = this.f18765b;
                s3Var2.f37521b.N1(s3Var2, 0);
                s3Var2.f18965n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f18765b.f18965n.n(true, false);
                return;
        }
    }
}
