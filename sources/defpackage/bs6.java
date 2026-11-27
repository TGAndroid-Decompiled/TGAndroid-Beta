package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bs6 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final long c;
    public final rf0 d;

    public bs6(rf0 rf0Var, boolean z, long j, byte b) {
        this.a = b;
        this.d = rf0Var;
        this.b = z;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        rf0 rf0Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new j61((ls6) rf0Var, tLObject, this.b, this.c, (byte) 4));
                return;
            default:
                hl.c3(new j61((uc7) rf0Var, tLObject, this.b, this.c, (byte) 5));
                return;
        }
    }
}
