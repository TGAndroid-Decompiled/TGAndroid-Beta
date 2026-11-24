package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t4c implements Runnable {
    public final byte a;
    public final u4c b;
    public final TLObject c;
    public final a61 d;
    public final TLRPC.TL_error e;

    public t4c(u4c u4cVar, TLObject tLObject, a61 a61Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = u4cVar;
        this.c = tLObject;
        this.d = a61Var;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        a61 a61Var = this.d;
        u4c u4cVar = this.b;
        switch (b) {
            case 0:
                v4c v4cVar = u4cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v4cVar.getClass();
                    z = false;
                }
                a61Var.a(Boolean.valueOf(z));
                v4cVar.getClass();
                return;
            case 1:
                v4c v4cVar2 = u4cVar.i;
                boolean z2 = tLObject instanceof TLRPC.Updates;
                if (z2) {
                    na7.q1(v4cVar2.a).Q3((TLRPC.Updates) tLObject, false);
                }
                p31.a(v4cVar2.a).b();
                if (!z2 || tL_error != null) {
                    z = false;
                }
                a61Var.a(Boolean.valueOf(z));
                return;
            default:
                v4c v4cVar3 = u4cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v4cVar3.getClass();
                    z = false;
                }
                a61Var.a(Boolean.valueOf(z));
                v4cVar3.getClass();
                return;
        }
    }

    public t4c(u4c u4cVar, a61 a61Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = u4cVar;
        this.d = a61Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
