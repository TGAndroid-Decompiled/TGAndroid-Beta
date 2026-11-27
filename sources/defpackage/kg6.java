package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kg6 implements RequestDelegate {
    public final byte a;
    public final tg6 b;
    public final Bundle c;

    public kg6(tg6 tg6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                tg6 tg6Var = this.b;
                if (tLObject != null) {
                    hl.c3(new ls5(tg6Var, this.c, tLObject, (byte) 28));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    hl.c3(new z56(tg6Var, tL_error, (byte) 19));
                    return;
                } else {
                    return;
                }
            default:
                hl.c3(new g65(this.b, tL_error, this.c, tLObject, (byte) 18));
                return;
        }
    }
}
