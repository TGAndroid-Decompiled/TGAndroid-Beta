package defpackage;

import org.telegram.tgnet.TLRPC;
public final class zv5 implements Runnable {
    public final byte a;
    public final ew5 b;
    public final TLRPC.TL_chatInviteJoinResultWebView c;
    public final long d;

    public zv5(ew5 ew5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = ew5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        ew5 ew5Var = this.b;
        switch (b) {
            case 0:
                oc7.r1(ew5Var.a).d4(tL_chatInviteJoinResultWebView.users, false);
                br0.b(ew5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            default:
                oc7.r1(ew5Var.a).d4(tL_chatInviteJoinResultWebView.users, false);
                br0.b(ew5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
        }
    }
}
