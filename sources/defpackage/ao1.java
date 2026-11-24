package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ao1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final int c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f;
    public final k27 h;
    public final TLRPC.TL_messages_getDiscussionMessage n;
    public final TLRPC.Chat r;
    public final int s;
    public final k27 w;

    public ao1(mu1 mu1Var, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, k27 k27Var, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, k27 k27Var2, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = i;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i2;
        this.h = k27Var;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i3;
        this.w = k27Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                mu1 mu1Var = this.b;
                mu1Var.q6(new ao1(mu1Var, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                return;
            default:
                mu1 mu1Var2 = this.b;
                if (this.c == mu1Var2.Mc) {
                    mu1Var2.Oc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        mu1Var2.Tc = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        na7.W4(k96.M0(2131752433, null), mu1Var2);
                        mu1Var2.Pc = 0;
                        mu1Var2.Qc = false;
                        mu1Var2.A0.h1();
                        return;
                    }
                    mu1Var2.Da(mu1Var2.Sc, mu1Var2.Tc, this.f, this.h, this.n, this.r, this.s, this.w);
                    return;
                }
                return;
        }
    }
}
