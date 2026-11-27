package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e21 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final int c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public e21(f21 f21Var, w49 w49Var, boolean z, int i, int i2) {
        this.e = f21Var;
        this.f = w49Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.run():void");
    }

    public e21(zu1 zu1Var, int i, int i2, boolean z, i49 i49Var) {
        this.e = zu1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = i49Var;
    }

    public e21(r7a r7aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = r7aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public e21(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
