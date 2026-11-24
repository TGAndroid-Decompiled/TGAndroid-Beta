package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ie6 implements RequestDelegate {
    public final byte a;
    public final qe6 b;
    public final Bundle c;

    public ie6(qe6 qe6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = qe6Var;
        this.c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qe6 qe6Var = this.b;
                if (tLObject != null) {
                    gl.d3(new sx5(qe6Var, this.c, tLObject, (byte) 23));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    gl.d3(new kz5(qe6Var, tL_error, (byte) 22));
                    return;
                } else {
                    return;
                }
            default:
                gl.d3(new e45(this.b, tL_error, this.c, tLObject, (byte) 18));
                return;
        }
    }
}
