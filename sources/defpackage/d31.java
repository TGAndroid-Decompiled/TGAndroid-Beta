package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d31 implements Runnable {
    public final byte a = 3;
    public final int b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public d31(e31 e31Var, k39 k39Var, boolean z, int i, int i2) {
        this.e = e31Var;
        this.f = k39Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d31.run():void");
    }

    public d31(yv1 yv1Var, int i, int i2, boolean z, v29 v29Var) {
        this.e = yv1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = v29Var;
    }

    public d31(a6a a6aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = a6aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public d31(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
