package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class f65 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final int c;
    public final Object d;

    public f65(ob6 ob6Var, boolean z, int i) {
        this.a = (byte) 1;
        this.d = ob6Var;
        this.b = z;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                hl.c3(new ps1((j95) obj, tLObject, this.c, this.b, (byte) 4));
                return;
            case 1:
                ob6 ob6Var = (ob6) obj;
                if (tLObject instanceof Vector) {
                    hl.c3(new ps1(ob6Var, (Vector) tLObject, this.b, this.c, (byte) 6));
                    return;
                }
                return;
            default:
                ((VoIPService) obj).lambda$startGroupCall$32(this.c, this.b, tLObject, tL_error);
                return;
        }
    }

    public f65(fn7 fn7Var, int i, boolean z, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.c = i;
        this.b = z;
    }
}
