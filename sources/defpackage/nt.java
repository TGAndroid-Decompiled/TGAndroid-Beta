package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class nt implements RequestDelegate {
    public final byte a = 0;
    public final long b;
    public final int c;
    public final fn7 d;

    public nt(uc7 uc7Var, long j, int i) {
        this.d = uc7Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new r77((o) fn7Var, tLObject, this.c, this.b, (byte) 2));
                return;
            default:
                uc7 uc7Var = (uc7) fn7Var;
                HashMap hashMap = uc7Var.h5;
                hashMap.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
        }
    }

    public nt(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
