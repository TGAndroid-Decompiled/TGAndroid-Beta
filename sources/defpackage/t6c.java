package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t6c implements Runnable {
    public final byte a;
    public final u6c b;
    public final TLObject c;
    public final h71 d;
    public final TLRPC.TL_error e;

    public t6c(u6c u6cVar, TLObject tLObject, h71 h71Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = u6cVar;
        this.c = tLObject;
        this.d = h71Var;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        h71 h71Var = this.d;
        u6c u6cVar = this.b;
        switch (b) {
            case 0:
                v6c v6cVar = u6cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v6cVar.getClass();
                    z = false;
                }
                h71Var.a(Boolean.valueOf(z));
                v6cVar.getClass();
                return;
            case 1:
                v6c v6cVar2 = u6cVar.i;
                boolean z2 = tLObject instanceof TLRPC.Updates;
                if (z2) {
                    oc7.r1(v6cVar2.a).T3((TLRPC.Updates) tLObject, false);
                }
                x41.a(v6cVar2.a).b();
                if (!z2 || tL_error != null) {
                    z = false;
                }
                h71Var.a(Boolean.valueOf(z));
                return;
            default:
                v6c v6cVar3 = u6cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v6cVar3.getClass();
                    z = false;
                }
                h71Var.a(Boolean.valueOf(z));
                v6cVar3.getClass();
                return;
        }
    }

    public t6c(u6c u6cVar, h71 h71Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = u6cVar;
        this.d = h71Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
