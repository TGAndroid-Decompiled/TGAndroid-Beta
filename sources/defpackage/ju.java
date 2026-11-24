package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class ju implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final jm7 d;

    public ju(oc7 oc7Var, long j, int i) {
        this.d = oc7Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new o77((o) jm7Var, tLObject, this.c, this.b, (byte) 2));
                return;
            default:
                oc7 oc7Var = (oc7) jm7Var;
                HashMap hashMap = oc7Var.i5;
                hashMap.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
        }
    }

    public ju(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
