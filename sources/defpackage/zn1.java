package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zn1 implements RequestDelegate {
    public final byte a;
    public final mu1 b;
    public final TLRPC.TL_attachMenuBot c;
    public final TLRPC.User d;

    public zn1(mu1 mu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.User user = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new co1(mu1Var, tL_attachMenuBot, tL_error, user));
                return;
            default:
                gl.c3(new co1(mu1Var, tL_error, tL_attachMenuBot, user));
                return;
        }
    }
}
