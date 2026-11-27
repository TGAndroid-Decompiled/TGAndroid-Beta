package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8c implements Runnable {
    public final byte a;
    public final t8c b;
    public final TLObject c;
    public final i61 d;
    public final TLRPC.TL_error e;

    public s8c(t8c t8cVar, TLObject tLObject, i61 i61Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = t8cVar;
        this.c = tLObject;
        this.d = i61Var;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        i61 i61Var = this.d;
        t8c t8cVar = this.b;
        switch (b) {
            case 0:
                u8c u8cVar = t8cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    u8cVar.getClass();
                    z = false;
                }
                i61Var.a(Boolean.valueOf(z));
                u8cVar.getClass();
                return;
            case 1:
                u8c u8cVar2 = t8cVar.i;
                boolean z2 = tLObject instanceof TLRPC.Updates;
                if (z2) {
                    uc7.s1(u8cVar2.a).Y3((TLRPC.Updates) tLObject, false);
                }
                y31.a(u8cVar2.a).b();
                if (!z2 || tL_error != null) {
                    z = false;
                }
                i61Var.a(Boolean.valueOf(z));
                return;
            default:
                u8c u8cVar3 = t8cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    u8cVar3.getClass();
                    z = false;
                }
                i61Var.a(Boolean.valueOf(z));
                u8cVar3.getClass();
                return;
        }
    }

    public s8c(t8c t8cVar, i61 i61Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = t8cVar;
        this.d = i61Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
