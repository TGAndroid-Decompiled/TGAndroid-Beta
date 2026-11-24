package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class c45 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;

    public c45(k96 k96Var, boolean z, int i) {
        this.a = (byte) 1;
        this.d = k96Var;
        this.b = z;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                gl.c3(new bs1((h75) obj, tLObject, this.c, this.b, (byte) 4));
                return;
            case 1:
                k96 k96Var = (k96) obj;
                if (tLObject instanceof Vector) {
                    gl.c3(new bs1(k96Var, (Vector) tLObject, this.b, this.c, (byte) 6));
                    return;
                }
                return;
            default:
                ((VoIPService) obj).lambda$startGroupCall$32(this.c, this.b, tLObject, tL_error);
                return;
        }
    }

    public c45(gk7 gk7Var, int i, boolean z, byte b) {
        this.a = b;
        this.d = gk7Var;
        this.c = i;
        this.b = z;
    }
}
