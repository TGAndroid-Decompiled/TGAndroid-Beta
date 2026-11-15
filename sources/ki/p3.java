package ki;

import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f18493a;
    public final y3 f18494b;

    public p3(y3 y3Var, int i7) {
        this.f18493a = i7;
        this.f18494b = y3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        switch (this.f18493a) {
            case 0:
                this.f18494b.f18715n.R();
                return;
            case 1:
                this.f18494b.Q();
                return;
            case 2:
                y3 y3Var = this.f18494b;
                if (!y3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = np.s1(y3Var.G).o1(y3Var.f18718w);
                    tL_messages_prolongWebView.peer = np.s1(y3Var.G).j1(y3Var.f18719x);
                    tL_messages_prolongWebView.query_id = y3Var.f18720y;
                    tL_messages_prolongWebView.silent = false;
                    if (y3Var.E != 0) {
                        ez.C(y3Var.G);
                        int i7 = y3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (y3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = np.s1(y3Var.G).j1(y3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (y3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = np.s1(y3Var.G).j1(y3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (y3Var.f18719x < 0 && (N0 = np.s1(y3Var.G).N0(-y3Var.f18719x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = np.s1(y3Var.G).m1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(y3Var.G).sendRequest(tL_messages_prolongWebView, new ai.d1(y3Var, 20));
                    return;
                }
                return;
            case 3:
                y3 y3Var2 = this.f18494b;
                y3Var2.f33607b.M1(y3Var2, 0);
                y3Var2.f18715n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f18494b.f18715n.n(true, false);
                return;
        }
    }
}
