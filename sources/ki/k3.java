package ki;

import org.telegram.messenger.mp;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18757a;
    public final t3 f18758b;

    public k3(t3 t3Var, int i7) {
        this.f18757a = i7;
        this.f18758b = t3Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.Peer peer;
        switch (this.f18757a) {
            case 0:
                this.f18758b.f18958n.R();
                return;
            case 1:
                this.f18758b.Q();
                return;
            case 2:
                t3 t3Var = this.f18758b;
                if (!t3Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = mp.u1(t3Var.G).q1(t3Var.f18961w);
                    tL_messages_prolongWebView.peer = mp.u1(t3Var.G).l1(t3Var.f18962x);
                    tL_messages_prolongWebView.query_id = t3Var.f18963y;
                    tL_messages_prolongWebView.silent = false;
                    if (t3Var.E != 0) {
                        zy.C(t3Var.G);
                        int i7 = t3Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i7;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (t3Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = mp.u1(t3Var.G).l1(t3Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (t3Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = mp.u1(t3Var.G).l1(t3Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (t3Var.f18962x < 0 && (P0 = mp.u1(t3Var.G).P0(-t3Var.f18962x)) != null && (peer = P0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = mp.u1(t3Var.G).o1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(t3Var.G).sendRequest(tL_messages_prolongWebView, new ai.e1(t3Var, 22));
                    return;
                }
                return;
            case 3:
                t3 t3Var2 = this.f18758b;
                t3Var2.f36766b.N1(t3Var2, 0);
                t3Var2.f18958n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f18758b.f18958n.n(true, false);
                return;
        }
    }
}
