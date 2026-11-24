package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj6 implements Runnable {
    public final byte a;
    public final ak6 b;
    public final TLRPC.TL_chatInviteExported c;
    public final TLRPC.TL_error d;
    public final TLObject e;
    public final boolean f;

    public oj6(ak6 ak6Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, byte b) {
        this.a = b;
        this.b = ak6Var;
        this.c = tL_chatInviteExported;
        this.d = tL_error;
        this.e = tLObject;
        this.f = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ak6 ak6Var = this.b;
                ak6Var.getNotificationCenter().d(new oj6(ak6Var, this.c, this.d, this.e, this.f, (byte) 1));
                return;
            default:
                this.b.h0(this.c, this.d, this.e, this.f);
                return;
        }
    }
}
