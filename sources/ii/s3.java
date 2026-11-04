package ii;

import org.telegram.messenger.hp;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s3 implements Runnable {
    public final int f15219a;
    public final d4 f15220b;

    public s3(d4 d4Var, int i3) {
        this.f15219a = i3;
        this.f15220b = d4Var;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull N0;
        TLRPC.Peer peer;
        switch (this.f15219a) {
            case 0:
                this.f15220b.f14898n.Q();
                return;
            case 1:
                this.f15220b.P();
                return;
            case 2:
                d4 d4Var = this.f15220b;
                if (!d4Var.U) {
                    TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
                    tL_messages_prolongWebView.bot = hp.s1(d4Var.G).o1(d4Var.f14901w);
                    tL_messages_prolongWebView.peer = hp.s1(d4Var.G).j1(d4Var.f14902x);
                    tL_messages_prolongWebView.query_id = d4Var.f14903y;
                    tL_messages_prolongWebView.silent = false;
                    if (d4Var.E != 0) {
                        yy.C(d4Var.G);
                        int i3 = d4Var.E;
                        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                        tL_inputReplyToMessage.reply_to_msg_id = i3;
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMessage;
                        if (d4Var.F != 0) {
                            tL_inputReplyToMessage.monoforum_peer_id = hp.s1(d4Var.G).j1(d4Var.F);
                            tL_messages_prolongWebView.reply_to.flags |= 32;
                        }
                        tL_messages_prolongWebView.flags |= 1;
                    } else if (d4Var.F != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
                        tL_inputReplyToMonoForum.monoforum_peer_id = hp.s1(d4Var.G).j1(d4Var.F);
                        tL_messages_prolongWebView.flags |= 1;
                    }
                    if (d4Var.f14902x < 0 && (N0 = hp.s1(d4Var.G).N0(-d4Var.f14902x)) != null && (peer = N0.default_send_as) != null) {
                        tL_messages_prolongWebView.send_as = hp.s1(d4Var.G).m1(peer);
                        tL_messages_prolongWebView.flags |= 8192;
                    }
                    ConnectionsManager.getInstance(d4Var.G).sendRequest(tL_messages_prolongWebView, new ci.d0(d4Var, 12));
                    return;
                }
                return;
            case 3:
                d4 d4Var2 = this.f15220b;
                d4Var2.f38416b.M1(d4Var2, 0);
                d4Var2.f14898n.n(false, false);
                System.currentTimeMillis();
                return;
            default:
                this.f15220b.f14898n.n(true, false);
                return;
        }
    }
}
