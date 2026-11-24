package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v11 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public v11(w11 w11Var, h19 h19Var, boolean z, int i, int i2) {
        this.e = w11Var;
        this.f = h19Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.run():void");
    }

    public v11(mu1 mu1Var, int i, int i2, boolean z, t09 t09Var) {
        this.e = mu1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = t09Var;
    }

    public v11(z3a z3aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = z3aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public v11(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
