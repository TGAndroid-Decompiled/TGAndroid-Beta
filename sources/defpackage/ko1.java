package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ko1 implements RequestDelegate {
    public final byte a;
    public final zu1 b;
    public final TLRPC.TL_attachMenuBot c;
    public final TLRPC.User d;

    public ko1(zu1 zu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.User user = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ro1(zu1Var, tL_error, tL_attachMenuBot, user));
                return;
            default:
                hl.c3(new ro1(zu1Var, tL_attachMenuBot, tL_error, user));
                return;
        }
    }
}
