package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hg6 implements RequestDelegate {
    public final byte a;
    public final rg6 b;
    public final Bundle c;

    public hg6(rg6 rg6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = rg6Var;
        this.c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                rg6 rg6Var = this.b;
                if (tLObject != null) {
                    gm.c3(new dt5(rg6Var, this.c, tLObject, (byte) 25));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    gm.c3(new k16(rg6Var, tL_error, (byte) 23));
                    return;
                } else {
                    return;
                }
            default:
                gm.c3(new d65(this.b, tL_error, this.c, tLObject, (byte) 18));
                return;
        }
    }
}
