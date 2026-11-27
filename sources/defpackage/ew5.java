package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ew5 implements Runnable {
    public final byte a;
    public final jw5 b;
    public final TLRPC.TL_chatInviteJoinResultWebView c;
    public final long d;

    public ew5(jw5 jw5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = jw5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        jw5 jw5Var = this.b;
        switch (b) {
            case 0:
                uc7.s1(jw5Var.a).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(jw5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                uc7.s1(jw5Var.a).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(jw5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
        }
    }
}
