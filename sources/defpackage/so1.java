package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class so1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final int c;
    public final TLObject d;
    public final TLRPC.TL_error e;
    public final int f;
    public final r47 h;
    public final TLRPC.TL_messages_getDiscussionMessage n;
    public final TLRPC.Chat r;
    public final int s;
    public final r47 w;

    public so1(zu1 zu1Var, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, r47 r47Var, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, r47 r47Var2, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i2;
        this.h = r47Var;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i3;
        this.w = r47Var2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                zu1 zu1Var = this.b;
                zu1Var.z6(new so1(zu1Var, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                return;
            default:
                zu1 zu1Var2 = this.b;
                if (this.c == zu1Var2.ad) {
                    zu1Var2.cd = -1;
                    TLObject tLObject = this.d;
                    if (tLObject != null) {
                        zu1Var2.hd = (TLRPC.messages_Messages) tLObject;
                    } else if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                        uc7.f5(ob6.M0(2131752419, null), zu1Var2);
                        zu1Var2.dd = 0;
                        zu1Var2.ed = false;
                        zu1Var2.A0.i1();
                        return;
                    }
                    zu1Var2.Qa(zu1Var2.gd, zu1Var2.hd, this.f, this.h, this.n, this.r, this.s, this.w);
                    return;
                }
                return;
        }
    }
}
