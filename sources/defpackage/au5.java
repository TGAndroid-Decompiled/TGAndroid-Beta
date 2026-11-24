package defpackage;

import org.telegram.tgnet.TLRPC;
public final class au5 implements Runnable {
    public final byte a;
    public final fu5 b;
    public final TLRPC.TL_chatInviteJoinResultWebView c;
    public final long d;

    public au5(fu5 fu5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = fu5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                na7.q1(fu5Var.a).b4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(fu5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                na7.q1(fu5Var.a).b4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(fu5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
        }
    }
}
