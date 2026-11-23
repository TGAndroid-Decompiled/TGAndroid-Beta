package ki;

import org.telegram.messenger.az;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18733a;
    public final s3 f18734b;

    public j3(s3 s3Var, int i7) {
        this.f18733a = i7;
        this.f18734b = s3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.Peer peer;
        switch (this.f18733a) {
            case 0:
                this.f18734b.f18934n.R();
                return;
            case 1:
                this.f18734b.Q();
                return;
            case 2:
                s3 s3Var = this.f18734b;
                if (!s3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = np.u1(s3Var.G).q1(s3Var.f18937w);
                    tL_messages_prolongWebView.peer = np.u1(s3Var.G).l1(s3Var.f18938x);
                    tL_messages_prolongWebView.query_id = s3Var.f18939y;
                    tL_messages_prolongWebView.silent = false;
                    if (s3Var.E != 0) {
                        az.C(s3Var.G);
                        int i7 = s3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (s3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = np.u1(s3Var.G).l1(s3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (s3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = np.u1(s3Var.G).l1(s3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (s3Var.f18938x < 0 && (P0 = np.u1(s3Var.G).P0(-s3Var.f18938x)) != null && (peer = P0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = np.u1(s3Var.G).o1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(s3Var.G).sendRequest(tL_messages_prolongWebView, new ai.a1(s3Var, 22));
                    return;
                }
                return;
            case 3:
                s3 s3Var2 = this.f18734b;
                s3Var2.f37477b.N1(s3Var2, 0);
                s3Var2.f18934n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f18734b.f18934n.n(true, false);
                return;
        }
    }
}
