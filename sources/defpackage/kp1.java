package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kp1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final int c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f;
    public final k47 h;
    public final TLRPC.TL_messages_getDiscussionMessage n;
    public final TLRPC.Chat r;
    public final int s;
    public final k47 w;

    public kp1(yv1 yv1Var, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, k47 k47Var, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, k47 k47Var2, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = i;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i2;
        this.h = k47Var;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i3;
        this.w = k47Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                yv1 yv1Var = this.b;
                yv1Var.z6(new kp1(yv1Var, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                return;
            default:
                yv1 yv1Var2 = this.b;
                if (this.c == yv1Var2.Xc) {
                    yv1Var2.Zc = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        yv1Var2.ed = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        oc7.Z4(jb6.M0(2131752391, null), yv1Var2);
                        yv1Var2.ad = 0;
                        yv1Var2.bd = false;
                        yv1Var2.A0.h1();
                        return;
                    }
                    yv1Var2.Pa(yv1Var2.dd, yv1Var2.ed, this.f, this.h, this.n, this.r, this.s, this.w);
                    return;
                }
                return;
        }
    }
}
