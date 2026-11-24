package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class jt implements RequestDelegate {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final gk7 d;

    public jt(na7 na7Var, long j, int i) {
        this.d = na7Var;
        this.b = j;
        this.c = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                gl.d3(new o57((o) gk7Var, tLObject, this.c, this.b, (byte) 2));
                return;
            default:
                na7 na7Var = (na7) gk7Var;
                HashMap hashMap = na7Var.g5;
                hashMap.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
        }
    }

    public jt(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
